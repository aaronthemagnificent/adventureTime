import java.util.*;

public class Killable extends Character
{
  private int maxHealth;
  private int currentHealth;
  private ArrayList<Item> inventory;
  private boolean isAlive;

  private Typing typer;
  
  public Killable()
  {
    typer = new Typing();
    maxHealth = 0;
    currentHealth = 0;
    inventory = new ArrayList<>();
    isAlive = true;
  }
  //@param character specifications imported
  public Killable(int MaxHealth, ArrayList<Item> Inventory, boolean IsAlive)
  {
    maxHealth = MaxHealth;
    currentHealth = maxHealth;
    for(int i = 0; i < Inventory.size(); i++)
    {
      inventory.add(Inventory.get(i));
    }
    isAlive = IsAlive;
  }
  
  /* Set Methods */
  
  public void setMaxHealth(int Health)
  {
    maxHealth = Health;
  }
  public void setCurrentHealth(int CurrentHealth)
  {
    currentHealth = CurrentHealth;
  }
  public void setInventory(ArrayList<Item> Inventory)
  {
    for(int i = 0; i < Inventory.size(); i++)
    {
      inventory.add(Inventory.get(i));
    }
  }
  public void setAlive(boolean IsAlive)
  {
    isAlive = IsAlive;
  }

  /* Get Methods */
  
  public int getMaxHealth()
  {
    return maxHealth;
  }
  public int getCurrentHealth()
  {
    return currentHealth;
  }
  public ArrayList<Item> getInventory()
  {
    return inventory;
  }
  public boolean getAlive()
  {
    return isAlive;
  }

  /* Behavioural Methods */

  public void encounter(Player player, Monster monster)
  {
    typer.Clear();
    boolean fight = false;
    boolean run = false;
    Scanner sc = new Scanner(System.in);
    //System.out.println(super.toStringMonster(monster));
    System.out.println("What do you do?");
    System.out.println("1 - FIGHT");
    System.out.println("2 - USE ITEM");
    System.out.println("3 - RUN");
    int input = sc.nextInt();
    int i = 0;
    while(i == 0)
    {
      if(input == 1)
      {
        fight = true;
        i = -1;
      }
      if(input == 2)
      {
        i = -1;
      }
      if(input == 3)
      {
        run = true;
        i = -1;
      }
      else
      {
        System.out.println("error");
      }
    }
    if(fight)
    {
      Random rand = new Random(); 
      int random = rand.nextInt(2);
      if(random == 0)
      {
        System.out.println("You hit!");
        int playerdmg = damage(true, player, monster);
        System.out.println("You deal " + playerdmg + "points of damage!\n");
      }
      else
      {
        System.out.println("You miss!");
      }
      if(random == 1)
      {
        System.out.println("It hits!");
        int monsterdmg = damage(false, player, monster);
        System.out.println("You take " + monsterdmg + "points of damage!");
      }
      else
      {
        System.out.println("It misses!");
      }
      if(player.alive() && monster.alive())
      {
        encounter(player, monster);
      }
      else if(!player.alive())
      {
        player.setAlive(false);
        System.out.println("You lose!");
        player.respawn();
      }
      else
      {
        monster.setAlive(false);
        System.out.println("You win!");
      }
    }
    else if(run)
    {
      Random rand = new Random(); 
      int random = rand.nextInt(3);
      if(random == 3)
      {
        System.out.println("You get away.");
        typer.Wait(100);
        typer.KeyByKey150("...coward");
        typer.Wait(400);
      }
    }
    else
    {
      System.out.println("You cannot change your equiped items in combat; however, you can eat food.");//and use potions - when added
      for (int j = 0; j < inventory.size(); j++)
      {
        if(inventory.get(j).getType().equalsIgnoreCase("food"))
        {
          System.out.println("\n");
          for (int k = 0; i < inventory.size(); k++)
          {
            System.out.println(inventory.get(k).toString() + "\n");
          }
          System.out.println("");
        }
      }
    }
    sc.close();
    typer.Wait(500);
    //return to world location
  }

  public int damage(boolean isFromPlayer, Player player, Monster monster)
  {
    if(isFromPlayer)
    {
      int hold = monster.getCurrentHealth();
      hold -= player.getWeapon().getDamage();
      monster.setCurrentHealth(hold);
      return player.getWeapon().getDamage();
    }
    else
    {
      int hold = player.getCurrentHealth();
      hold -= monster.getDamage();
      player.setCurrentHealth(hold);
    }
    return monster.getDamage();
  }

  public boolean alive()
  {
    if(getCurrentHealth() <= 0)
    {
      return false;
    }
    return true;
  }
  
}