public class Character
{
  private int sci;
  private double sciProggress;
  private int tinker;
  private double tinkerProggress;
  private String type;
  private String name;

  public Character()
  {
    sci = 0;
    sciProggress = 0;
    tinker = 0;
    tinkerProggress = 0;
    type = "";
    name = "";
  }
  
  //@param character specifications imported
  public Character(int Sci, double sciProg, int Tinker, double tinkerProg, String Type, String Name)
  {
    sci = Sci;
    sciProggress = sciProg;
    tinker = Tinker;
    tinkerProggress = tinkerProg;
    type = Type;
    name = Name;
  }
  
  /* Set Methods */
  
  public void setSci(int Sci)
  {
    sci = Sci;
  }
  public void setTinker(int Tinker)
  {
    tinker = Tinker;
  }
  public void setType(String Type)
  {
    type = Type;
  }
  public void setName(String Name)
  {
    name = Name;
  }

  /* Get Methods */
  
  public int getSci()
  {
    return sci;
  }
  public int getTinker()
  {
    return tinker;
  }
  public String getType()
  {
    return type;
  }
  public String getName()
  {
    return name;
  }

  /* Behavioural Methods */

  public void tinkerWork(String location)
  {
    if(location.equalsIgnoreCase("Treehouse"))
    {
      tinkerProggress += 0.2;
    }
    else if(location.equalsIgnoreCase("BMO"))
    {
      tinkerProggress += 0.4;
    }
    else //BananaMan
    {
      tinkerProggress += 0.5;
    }

    if(tinkerProggress >= 1)
    {
      tinker++;
      tinkerProggress -= 1;
    }
  }

  public void sciWork(String location)
  {
    if(location.equalsIgnoreCase("Treehouse"))
    {
      sciProggress += 0.2;
    }
    else if(location.equalsIgnoreCase("CandyKingdom"))
    {
      sciProggress += 0.4;
    }
    else //PB
    {
      sciProggress += 0.5;
    }

    if(sciProggress >= 1)
    {
      sciProggress++;
      sciProggress -= 1;
    }
  }
  
  /* To String Method*/
  
  public String toString()
  {
    return "You are talking to: " + name;
  }
  
}