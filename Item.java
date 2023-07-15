/*
* Programmer: Aaron Hodson
* Date: 3/1/23
* Purpose: Create an Item class to work with the Inventory class for the Adventure Time text-based adventure
 */

public class Item
{
    private String name;
    private String type;
    private int damage;
    private int armour;
    private String tooltip;
    private int sell;
    private int buy;

    /* Constructors */
    public Item()
    {
        name = "";
        type = "";
        damage = 0;
        armour = 0;
        tooltip = "";
        sell = 0;
        buy = 0;
    }

    //@param item specifications imported
    public Item(String Name, String Type, int Damage, int Armour, String Tooltip, int Sell, int Buy)
    {
        name = Name;
        type = Type;
        damage = Damage;
        armour = Armour;
        tooltip = Tooltip;
        sell = Sell;
        buy = Buy;
    }

    /* Set Methods */
  
    public void setName(String Name)
    {
        name = Name;
    }

    public void setDamage(int Damage)
    {
        damage = Damage;
    }

    public void setTooltip(String Tooltip)
    {
        tooltip = Tooltip;
    }

    public void setSell(int Sell)
    {
        sell = Sell;
    }

    public void setBuy(int Buy)
    {
        buy = Buy;
    }

  public void setType(String Type)
  {
    type = Type;
  }
  public void setArmour(int Armour)
  {
    armour = Armour;
  }

    /* Get Methods */
  
    public String getName()
    {
        return name;
    }

    public int getDamage()
    {
        return damage;
    }

    public String getTooltip()
    {
        return tooltip;
    }

    public int getSell()
    {
        return sell;
    }

    public int getBuy()
    {
        return buy;
    }

  public String getType()
  {
    return type;
  }

  public int getArmour()
  {
    return armour;
  }

    public String toString()
    {
        return "\n" + name + "\n" + type + "\n" + damage + "\n" + armour + "\n" + tooltip + "\n" + sell + "\n" + buy + "\n";
    }
  
}