import java.util.Scanner;
class FarmersMarket
{
  private Typing typer;
  private Treehouse treehouse;
  private BananaMan bananaMan;
  private SpookyForest spookyForest;

  public FarmersMarket()
  {
    typer = new Typing();
  }

  public void setTreehouse()
  {
    treehouse = new Treehouse();
    treehouse.TreehouseMulti();
  }
  public void setBananaMan()
  {
    bananaMan = new BananaMan();
    bananaMan.BananaMansHouse();
  }
  public void setSpookyForest()
  {
    spookyForest = new SpookyForest();
    spookyForest.SpookyForestMain();
  }
  
  public void FarmersMarketMain()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou come across an outing of various stalls and vendors.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    //System.out.println("1 - Talk to Choose Goose");
    //System.out.println("2 - Talk to the Grassy Wizard");
    System.out.println("3 - Go to the Treehouse");
    System.out.println("4 - Go to Banana Man's House");
    System.out.println("5 - Go to the Spooky Forest");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      typer.KeyByKey100("\nGreetings adventurer, if supplies you need, don't come to me. I'm out of stock, what a mock. But if you find a music box, come back to my shop!");
      ChooseGooseQuest();
    }
    if(input.equals("2"))
    {
      //GrassyWizard();
    }
    if(input.equals("3"))
    {
      setTreehouse();
    }
    if(input.equals("4"))
    {
      setBananaMan();
    }
    if(input.equals("5"))
    {
      setSpookyForest();
    }
    else
    {
      System.out.println("error 5");
      FarmersMarketMain();
    }
    sc.close();
    return;
  }
  
  public void ChooseGooseQuest()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nBanana Man has a quest!");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Hand him the music box");
    System.out.println("2 - Done");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("test");
      ChooseGooseQuest();
      //if item in list then complete, else, back to function
    }
    if(input.equals("2"))
    {
      FarmersMarketMain();
    }
    else
    {
      System.out.println("error 7");
      ChooseGooseQuest();
    }
    sc.close();
    return;
  }
}