import java.util.Scanner;
class Lemongrab
{
  private Typing typer;
  private CandyCastle candyCastle;
  private SouthCandyForest southCandyForest;

  public Lemongrab()
  {
    typer = new Typing();
  }

  public void setCandyCastle()
  {
    candyCastle = new CandyCastle();
    candyCastle.OuterCity();
  }
  public void setSouthCandyForest()
  {
    southCandyForest = new SouthCandyForest();
    southCandyForest.SouthCandyForestMain();
  }
  
  public void OutsideLemongrab()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You see the tall and rectangular walls of Lemongrab Castle not far from here.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Approach the Castle");
    System.out.println("2 - Cross the Northern River");
    System.out.println("3 - Go to the Southern Candy Forest");
    System.out.println("4 - Go to the Mountains");
    System.out.println("5 - Go to the Desert");
    System.out.println("6 - Go to the Fire Kingdom");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      LemonGuard();
    }
    if(input.equals("2"))
    {
      setCandyCastle();
    }
    if(input.equals("3"))
    {
      setSouthCandyForest();
    }
    if(input.equals("4"))
    {
      System.out.println("test");
      //mountains
      OutsideLemongrab();
    }
    if(input.equals("5"))
    {
      System.out.println("test");
      //desert
      OutsideLemongrab();
    }
    if(input.equals("6"))
    {
      System.out.println("test");
      //fire kingdom
      OutsideLemongrab();
    }
    else
    {
      System.out.println("error ");
      OutsideLemongrab();
    }
    sc.close();
    return;
  }
  public void LemonGuard()
  {
    typer.Clear();
    System.out.println("There's a guard blocking the gates");
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are talking to Lemon Guard #1.");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Say hi");
    System.out.println("2 - Ask to enter");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      typer.KeyByKey150("Hmmmmmmm");
      typer.Wait(50);
      typer.KeyByKey100("\n\nhi...");
      typer.Wait(25);
      LemonGuard();
    }
    if(input.equals("2"))
    {
      typer.KeyByKey100("No. Only lemons allowed.");
      LemonGuard();
    }
    else
    {
      System.out.println("error");
      LemonGuard();
    }
    sc.close();
    return;
  }
}