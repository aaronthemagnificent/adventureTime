import java.util.Scanner;
class CandyCastle
{
  private Typing typer;
  private Rainicorn rainicorn;
  private Marceline marceline;
  private NorthCandyForest northCandyForest;

  public CandyCastle()
  {
    typer = new Typing();
  }

  public void setRainicorn()
  {
    rainicorn = new Rainicorn();
    rainicorn.OutsideRainicorn();
  }
  public void setMarceline()
  {
    marceline = new Marceline();
    marceline.OutsideMarcelines();
  }
  public void setNorthCandyForest()
  {
    northCandyForest = new NorthCandyForest();
    northCandyForest.NorthCandyForestMain();
  }
  
  public void OuterCity()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("The jawbreaker wall of the Candy Kingdom is in front of you. The Candy Castle towers in the center.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Enter the Candy Kingdom");
    System.out.println("2 - Visit Lady Rainicorn");
    System.out.println("3 - Visit Marceline");
    System.out.println("4 - Enter the Northern Candy Forest");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    if(input.equals("2"))
    {
      setRainicorn();
    }
    if(input.equals("3"))
    {
      setMarceline();
    }
    if(input.equals("4"))
    {
      setNorthCandyForest();
    }
    else
    {
      System.out.println("error");
      OuterCity();
    }
    sc.close();
    return;
  }
  public void CandyCity()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the Candy Square");
    System.out.println("A fountain spitting candy is in the center of the square.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Visit the Castle");
    System.out.println("2 - Go to the Drugstore");
    System.out.println("3 - Go to the Hospital");
    System.out.println("4 - Go to the 'Coolest Hotel'");
    System.out.println("5 - Go to 'Pizza Sassy's");
    System.out.println("6 - Go to the 'Candy Tavern'");
    System.out.println("7 - Talk to some candy citizens");
    System.out.println("8 - Leave the city");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      Castle();
    }
    if(input.equals("2"))
    {
      Drugstore();
    }
    if(input.equals("3"))
    {
      Hospital();
    }
    if(input.equals("4"))
    {
      Hotel();
    }
    if(input.equals("5"))
    {
      Pizza();
    }
    if(input.equals("6"))
    {
      Tavern();
    }
    if(input.equals("7"))
    {
      System.out.println("test");
      //RandomCandyTalk();
      CandyCity();
    }
    if(input.equals("8"))
    {
      OuterCity();
    }
    else
    {
      System.out.println("error");
      CandyCity();
    }
    sc.close();
    return;
  }
  public void Drugstore()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the Drugstore");
    System.out.println("It smells like baking powder.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back to Candy Square");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    sc.close();
    return;
  }
  public void Hospital()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the Hospital");
    System.out.println("description");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back to Candy Square");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    sc.close();
    return;
  }
  public void Hotel()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the Hotel");
    System.out.println("The cure-all seems to be band-aids.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back to Candy Square");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    sc.close();
    return;
  }
  public void Pizza()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are at Pizza Sassy's");
    System.out.println("The atmospher is sarcastic.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back to Candy Square");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    sc.close();
    return;
  }
  public void Tavern()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the candy tavern");
    System.out.println("You feel like Jake used to hang out here.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back to Candy Square");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    sc.close();
    return;
  }
////////////////////////////////////////////////////////
  public void Castle()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("A bananna guard stops you.");
    typer.KeyByKey100("\nSorry, no visitors allowed right now. Maybe come back later, *Rubbing his back with his spear* I don't know.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      CandyCity();
    }
    else
    {
      System.out.println("error");
      Castle();
    }
    sc.close();
  }
}