import java.util.Scanner;
class BananaMan
{
  private Typing typer;
  private Treehouse treehouse;
  private FarmersMarket farmersMarket;
  //private IceKingdom iceKingdom;

  public BananaMan()
  {
    typer = new Typing();
  }

  public void setTreehouse()
  {
    treehouse = new Treehouse();
    treehouse.TreehouseOutside();
  }
  public void setFarmersMarket()
  {
    farmersMarket = new FarmersMarket();
    farmersMarket.FarmersMarketMain();
  }
  /*public void setIceKingdom()
  {
    iceKingdom = new IceKingdom();
    iceKingdom.IceKingdomMain();
  }*/
  
  public void BananaMansHouse()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You come across a small, futuristic-looking, dome shaped building.");
    System.out.print("It looks like it was built on the sun. ");
    System.out.print("There's a rocket being built in the backyard.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Knock");
    System.out.println("2 - Check out the rocket");
    System.out.println("3 - Go to the Treehouse");
    System.out.println("4 - Go to the Farmer's Market");
    //System.out.println("5 - Go to the Ice Kingdom");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("You knock on the door... there is no response.");
      BananaMansHouse();
    }
    if(input.equals("2"))
    {
      System.out.println("You head around the back to check out the rocket. You see Banana Man working on it.");
      BananaBackyard();
    }
    if(input.equals("3"))
    {
      setTreehouse();
    }
    if(input.equals("4"))
    {
      setFarmersMarket();
    }
    if(input.equals("5"))
    {
      //setIceKingdom();
    }
    else
    {
      System.out.println("error 2");
      BananaMansHouse();
    }
    sc.close();
    return;
  } 
  public void BananaBackyard()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou see a large rocket, with Banana Man working on it.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    //System.out.println("1 - Talk to Banana Man");
    System.out.println("2 - Go back to the front yard");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      //BananaMan();
    }
    if(input.equals("2"))
    {
      BananaMansHouse();
    }
    sc.close();
    return;
  }
  
}