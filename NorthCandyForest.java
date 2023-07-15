import java.util.Scanner;
import java.util.Random;
class NorthCandyForest
{
  private Typing typer;
  private SouthCandyForest southCandyForest;
  private CandyCastle candyCastle;
  //private IceKingdom iceKingdom;

  public NorthCandyForest()
  {
    typer = new Typing();
  }

  public void setSouthCandyForest()
  {
    southCandyForest = new SouthCandyForest();
    southCandyForest.SouthCandyForestMain();
  }
  public void setCandyCastle()
  {
    candyCastle = new CandyCastle();
    candyCastle.OuterCity();
  }
  /*public void setIceKingdom()
  {
    iceKingdom = new IceKingdom();
    iceKingdom.IceKingdomMain();
  }*/
  
  public void NorthCandyForestMain()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("The trees are made of cotton candy.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Cross the Northern River");
    System.out.println("2 - Go to the Candy Castle");
    //System.out.println("3 - Go to the Ice Kingdom");
    System.out.println("4 - Go to the Mountains");
    System.out.println("5 - Go to Tree Trunk's House");
    System.out.println("6 - Travel Deeper");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      setSouthCandyForest();
    }
    if(input.equals("2"))
    {
      setCandyCastle();
    }
    if(input.equals("3"))
    {
      //setIceKingdom();
    }
    if(input.equals("4"))
    {
      System.out.println("test");
      //mountains
      NorthCandyForestMain();
    }
    if(input.equals("5"))
    {
      System.out.println("test");
      //tree trunks
      NorthCandyForestMain();
    }
    if(input.equals("6"))
    {
      int rand = new Random().nextInt(11);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
         CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest5();
      }
      if(rand == 6)
      {
        CandyForest6();
      }
      if(rand == 7)
      {
        CandyForest7();
      }
      if(rand == 8)
      {
        CandyForest8();
      }
      if(rand == 9)
      {
        CandyForest9();
      }
      if(rand == 10)
      {
        CandyForest10();
      }
    }
    else
    {
      System.out.println("error ");
      NorthCandyForestMain();
    }
    sc.close();
    return;
  }
  public void CandyForest1()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest2();
      }
      if(rand == 2)
      {
        CandyForest3();
      }
      if(rand == 3)
      {
        CandyForest4();
      }
      if(rand == 4)
      {
        CandyForest5();
      }
      if(rand == 5)
      {
        CandyForest6();
      }
      if(rand == 6)
      {
        CandyForest7();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 10");
        CandyForest1();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest1();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest2()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest3();
      }
      if(rand == 3)
      {
        CandyForest4();
      }
      if(rand == 4)
      {
        CandyForest5();
      }
      if(rand == 5)
      {
        CandyForest6();
      }
      if(rand == 6)
      {
        CandyForest7();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 11");
        CandyForest2();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest2();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest3()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest4();
      }
      if(rand == 4)
      {
        CandyForest5();
      }
      if(rand == 5)
      {
        CandyForest6();
      }
      if(rand == 6)
      {
        CandyForest7();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 12");
        CandyForest3();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest3();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest4()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest5();
      }
      if(rand == 5)
      {
        CandyForest6();
      }
      if(rand == 6)
      {
        CandyForest7();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 13");
        CandyForest4();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest4();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest5()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest6();
      }
      if(rand == 6)
      {
        CandyForest7();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 14");
        CandyForest5();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest5();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest6()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest5();
      }
      if(rand == 6)
      {
        CandyForest7();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 15");
        CandyForest6();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest6();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest7()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest5();
      }
      if(rand == 6)
      {
        CandyForest6();
      }
      if(rand == 7)
      {
        CandyForest8();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 16");
        CandyForest7();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest7();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest8()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest5();
      }
      if(rand == 6)
      {
        CandyForest6();
      }
      if(rand == 7)
      {
        CandyForest7();
      }
      if(rand == 8)
      {
        CandyForest9();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 17");
        CandyForest8();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest8();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest9()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest5();
      }
      if(rand == 6)
      {
        CandyForest6();
      }
      if(rand == 7)
      {
        CandyForest7();
      }
      if(rand == 8)
      {
        CandyForest8();
      }
      if(rand == 9)
      {
        CandyForest10();
      }
      else
      {
        System.out.println("error 18");
        CandyForest9();
      }
    }
    if(input.equals("2"))
    {
    
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest9();
      }
    }
    sc.close();
    return;
  }
  public void CandyForest10()
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Candy Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
    
      int rand = new Random().nextInt(10);
      if(rand == 1)
      {
        CandyForest1();
      }
      if(rand == 2)
      {
        CandyForest2();
      }
      if(rand == 3)
      {
        CandyForest3();
      }
      if(rand == 4)
      {
        CandyForest4();
      }
      if(rand == 5)
      {
        CandyForest5();
      }
      if(rand == 6)
      {
        CandyForest6();
      }
      if(rand == 7)
      {
        CandyForest7();
      }
      if(rand == 8)
      {
        CandyForest8();
      }
      if(rand == 9)
      {
        CandyForest9();
      }
      else
      {
        System.out.println("error 19");
        CandyForest10();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        NorthCandyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        CandyForest10();
      }
    }
    sc.close();
    return;
  }
}