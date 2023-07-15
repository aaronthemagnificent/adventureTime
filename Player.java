import java.util.*;

public class Player extends Killable
{
  private Inventory inv;
  private Typing typer;
  private ArrayList<Item> inventory;
  private Item weapon;
  private Item armour;

  public Player()
  {
    inv = new Inventory();
    typer = new Typing();
    inventory = new ArrayList<>();
  }

  /* Get Methods */
  
  public Item getWeapon()
  {
    return weapon;
  }
  public Item getArmour()
  {
    return armour;
  }

  /* Set Methods */
  
  public void setWeapon(Item Weapon)
  {
    weapon = Weapon;
  }
  public void setArmour(Item Armour)
  {
    armour = Armour;
  }

  /* Behavioural Methods */
  
  public void respawn()
  {
    if(!super.getAlive())
    {
      super.setAlive(true);
      Random random = new Random();
      int rand = random.nextInt(inventory.size()/2);
      for(int i = rand; i > 0; i++)
      {
        inventory.remove(i);
      }
      System.out.println("You fall unconscious...");
      System.out.println("You wake back up in the treehouse with a bump on your head.\n");
      System.out.print("Jake: ");
      typer.KeyByKey100("You okay there? ");
      typer.KeyByKey100("I found you passed out. You should really be more careful, dude. ");
      typer.KeyByKey100("I think you lost some of your stuff, sorry I couldn't get it.");
      Treehouse tree = new Treehouse();
      tree.TreehouseMulti();
    }
  }

  public void menu()
  {
    //inventory access option included in menu
    //call on inventory method Menu
    //Have inventory method Menu call back to player menu

    //Inclue NPC, Quest & Skill Logs

    //Add SAVE function
    //Add MENU function
    //RETURN FROM CALL LOCATION
  }

  public void add(String name, String type, int damage, int armour, String tooltip, int sell, int buy)
  {
    if(canAdd())
    {
      inventory.add(new Item(name, type, damage, armour, tooltip, sell, buy));
    }
  }

  public boolean canAdd()
  {
    if(inv.getSize() < inventory.size())
    {
      return true;
    }
    return false;
  }
  
}