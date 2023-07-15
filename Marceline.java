import java.util.Scanner;
class Marceline
{
  private Typing typer;
  private CandyCastle candyCastle;
  private Rainicorn rainicorn;

  public Marceline()
  {
    typer = new Typing();
  }

  public void setCandyCastle()
  {
    candyCastle = new CandyCastle();
    candyCastle.OuterCity();
  }
  public void setRainicorn()
  {
    rainicorn = new Rainicorn();
    rainicorn.OutsideRainicorn();
  }
  
  public void OutsideMarcelines()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("There's a small house in a cave.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Approach the house");
    System.out.println("1 - Visit Lady");
    System.out.println("2 - Go to the Candy City");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      MarcelinesHouse();
    }
    if(input.equals("2"))
    {
      setCandyCastle();
    }
    if(input.equals("3"))
    {
      setRainicorn();
    }
    else
    {
      System.out.println("error");
      OutsideMarcelines();
    }
    sc.close();
    return;
  }
  public void MarcelinesHouse()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.print("There's a sign on the door, it reads: ");
    System.out.print("Had to go out. DON'T GO IN MY HOUSE.");
    System.out.println("It's written in blood...");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Enter");
    System.out.println("2 - Go back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      Locked();
    }
    if(input.equals("2"))
    {
      OutsideMarcelines();
    }
    else
    {
      System.out.println("error");
      MarcelinesHouse();
    }
    sc.close();
    return;
  }
  public void Locked()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("It's locked. You feel like Marceline might kill you.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      MarcelinesHouse();
    }
    else
    {
      System.out.println("error");
      Locked();
    }
    sc.close();
    return;
  }
}