import java.util.*;

public class Monster extends Killable
{
  private int damage;
  //private ArrayList<Monster> monsters;
  private ArrayList<Item> randomItems;

  public Monster()
  {
    damage = 0;
    //monsters = new ArrayList<>();
    randomItems = new ArrayList<>();
  }
  public Monster(int Damage)
  {
    damage = Damage;
  }

  public void setDamage(int Damage)
  {
    damage = Damage;
  }

  public int getDamage()
  {
    return damage;
  }

  /* Behavioural Methods */

  public void loot(Player player)
  {
    Scanner sc = new Scanner(System.in);
    Item item = getRandomItem();
    int i = 0;
    while(i == 0)
    {
      System.out.println("You found: " + item.toString());
      System.out.println("Do you take it? Type Yes or No");
      String input = sc.nextLine();
      if(input.equalsIgnoreCase("yes"))
      {
        player.add(item.getName(), item.getType(), item.getDamage(), item.getArmour(), item.getTooltip(), item.getSell(), item.getBuy());
        i = -1;
      }
      else if(input.equalsIgnoreCase("no"))
      {
        System.out.println("You move on.");
        i = -1;
      }
      else
      {
        System.out.println("error");
      }
    }
    sc.close();
  }

  //Returns randomly found index positon of an item in randomItems
  public Item getRandomItem()
  {
    Random rand = new Random(); 
    int random = rand.nextInt(randomItems.size()+1); 
    return randomItems.get(random);
  }
  
}