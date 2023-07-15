import java.util.Scanner;
class Rainicorn
{
  private Typing typer;
  private Marceline marceline;
  private CandyCastle candyCastle;

  public Rainicorn()
  {
    typer = new Typing();
  }

  public void setMarceline()
  {
    marceline = new Marceline();
    marceline.OutsideMarcelines();
  }
  public void setCandyCastle()
  {
    candyCastle = new CandyCastle();
    candyCastle.OuterCity();
  }
  
  public void OutsideRainicorn()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("There's a small cottage surrounded by nature. Everything's a weird colour around here.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Talk to Lady");
    System.out.println("2 - Go to Marcelines");
    System.out.println("3 - Go to the Candy City");
    //System.out.prtinln("4 - Go to the Goblin Kingdom");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      Lady();
    }
    if(input.equals("2"))
    {
      setMarceline();
    }
    if(input.equals("3"))
    {
      setCandyCastle();
    }
    /*
    if(input.equals("4"))
    {
      GoblinKingdom
    }
    */
    else
    {
      System.out.println("error");
      OutsideRainicorn();
    }
    sc.close();
    return;
  }
  public void Lady()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are talking to Lady");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("As you approach she starts talking to you, but in Korean.");
    System.out.println("You don't understand a word. You need to find some sort of translator.");
    System.out.println("1 - Go back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      OutsideRainicorn();
    }
    else
    {
      System.out.println("error");
      Lady();
    }
    sc.close();
    return;
  }
}