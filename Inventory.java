/*
 * Programmer: Aaron Hodson
 * Date: 3/1/23
 * Purpose: Create an Inventory class for the Adventure Time text-based adventure
 */

import java.util.*;

public class Inventory
{
  private int inventorySize;
  private Treehouse tree;

  public Inventory()
  {
    inventorySize = 30;
  }
  public Inventory(int size)
  {
    inventorySize = size;//saved file inventory size stored
  }

  public int getSize()
  {
    return inventorySize;
  }
  
  public void setSize(int size)
  {
    inventorySize = size;
  }
  public void setTreehouse()
  {
    tree = new Treehouse();
  }

  //Primary input method
  public void Menu(ArrayList<Item> inventory, Item weapon, Item armour) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nPlease select one");
    System.out.println("----------------------------");
    System.out.println("1) Display your inventory");
    System.out.println("2) Equip an item");
    System.out.println("3) Drop an item");
    System.out.println("4) Find an item");
    String input = sc.nextLine();
    //Display
    if (input.equals("1"))
    {
      Display(inventory, weapon, armour);
    }
    //Equip
    else if (input.equals("2"))
    {
      Equip(sc, inventory, weapon, armour);
    }
    //Remove
    else if (input.equals("3"))
    {
      Remove(sc, inventory, weapon, armour);
    }
    //Search
    else if (input.equals("4"))
    {
      Find(sc, inventory, weapon, armour);
    }
    else
    {
      System.out.println("Error\n");
      Menu(inventory, weapon, armour);
    }
    sc.close();
  }

    // Display method
    public void Display(ArrayList<Item> inventory, Item weapon, Item armour) 
    {
      System.out.println("\n");
      for (int i = 0; i < inventory.size(); i++)
      {
        System.out.println(inventory.get(i).toString() + "\n");
      }
      System.out.println("\nCurrently Equiped: ");
      System.out.println("Weapon: " + weapon);
      System.out.println("Armour: " + armour);
      System.out.println("");
      Menu(inventory, weapon, armour);
    }

  //Equip method
  public void Equip(Scanner reader, ArrayList<Item> inventory, Item weapon, Item armour)
  {
    boolean isWeapon = false;
    Scanner sc2 = new Scanner(System.in);
    System.out.println("\nWould you like to equip 1) Weapon or 2) Armour");
    int input1 = sc2.nextInt();
    if(input1 == 1)
    {
      isWeapon = true;
    }
    else if(input1 == 2)
    {
      isWeapon = false;
    }
    else
    {
      System.out.println("error");
      Menu(inventory, weapon, armour);
    }
    System.out.print("Select the weapon or armour by entering it's name below. ");
    System.out.print("If you do not know the name of the item, then return to the Menu by typing 'Menu' and select 'Display your Inventory'.");
    String input = reader.nextLine();
    if(input.equalsIgnoreCase("menu"))
    {
      Menu(inventory, weapon, armour);
    }
    else if(!(returnFind(inventory, input)))
    {
      Menu(inventory, weapon, armour);
    }
    else
    {
      for(int i = 0; i < inventory.size(); i++)
      {
        if(inventory.get(i).getName().equalsIgnoreCase(input))
        {
          if(isWeapon)
          {
            weapon = new Item(inventory.get(i).getName(), inventory.get(i).getType(), inventory.get(i).getDamage(), inventory.get(i).getArmour(), inventory.get(i).getTooltip(), inventory.get(i).getSell(), inventory.get(i).getBuy());
            tree.getPlayer().setWeapon(weapon);
          }
          else
          {
            armour = new Item(inventory.get(i).getName(), inventory.get(i).getType(), inventory.get(i).getDamage(), inventory.get(i).getArmour(), inventory.get(i).getTooltip(), inventory.get(i).getSell(), inventory.get(i).getBuy());
            tree.getPlayer().setArmour(armour);
          }
        }
      }
    }
    sc2.close();
    reader.close();
  }

    //Remove method
    public void Remove(Scanner reader, ArrayList<Item> inventory, Item weapon, Item armour) 
    {
        boolean removed = false;
        System.out.println("Enter the name of the item you'd like to remove.");
        String inputRemove = reader.nextLine();
        for (int i = 0; i < inventory.size(); i++)
        {
            if (inventory.get(i).getName().equalsIgnoreCase(inputRemove))
            {
                removed = true;
                inventory.remove(i);
                i = inventory.size();
            }
        }
        if (removed)
            System.out.println("Item removed successfully");
        else
            System.out.println("Item could not be found");
      Menu(inventory, weapon, armour);
    }

    //Search method
    public void Find(Scanner reader, ArrayList<Item> inventory, Item weapon, Item armour) 
    {
      boolean found = false;
      System.out.print("Enter the name of the item you'd like to find. ");
      String inputSearch = reader.nextLine();
      for (int i = 0; i < inventory.size(); i++)
      {
          if (inventory.get(i).getName().equalsIgnoreCase(inputSearch))
          {
              System.out.println(inventory.get(i).toString() + "\n");
              found = true;
              i = inventory.size();
          }
      }
      if (found != true)
      {
        System.out.println("Item could not be found.");
      }
      Menu(inventory, weapon, armour);
    }

  public boolean returnFind(ArrayList<Item> inventory, String name) 
  {
    for (int i = 0; i < inventory.size(); i++)
    {
      if (inventory.get(i).getName().equalsIgnoreCase(name))
      {
        if(inventory.get(i).getType() == "weapon" || inventory.get(i).getType() == "armour")
        {
          return true;
        }
      }
    }
    return false;
  }
  
}