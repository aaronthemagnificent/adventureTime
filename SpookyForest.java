import java.util.Scanner;
import java.util.Random;
class SpookyForest
{
  private Typing typer;
  private Treehouse treehouse;
  private FarmersMarket farmersMarket;
  private BananaMan bananaMan;
  private WitchsGarden witchsGarden;

  public SpookyForest()
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
  public void setBananaMan()
  {
    bananaMan = new BananaMan();
    bananaMan.BananaMansHouse();
  }
  public void setWitchsGarden()
  {
    witchsGarden = new WitchsGarden();
    witchsGarden.WitchsGardenMain();
  }
  
  public void SpookyForestMain()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou come across a dark and spooky forest, the sun barely makes it past the trees that seem to have faces that follow you. It looks very easy to get lost.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go to the Treehouse");
    System.out.println("2 - Go to the Farmer's Market");
    System.out.println("3 - Go to Banana Man's House");
    System.out.println("4 - Go to the Witch's Garden");
    System.out.println("5 - Go to the Desert");
    System.out.println("6 - Travel Deeper");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      setTreehouse();
    }
    if(input.equals("2"))
    {
      setFarmersMarket(); 
    }
    if(input.equals("3"))
    {
      setBananaMan();
    }
    if(input.equals("4"))
    {
      setWitchsGarden();
    }
    if(input.equals("5"))
    {
      System.out.println("test");
      SpookyForestMain();
      //Desert();
    }
    if(input.equals("6"))
    {
      int rand = new Random().nextInt(11);
      if(rand == 1)
      {
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3(); 
      }
      if(rand == 4)
      {
        SpookyForest4(); 
      }
      if(rand == 5)
      {
        SpookyForest5();
      }
      if(rand == 6)
      {
        SpookyForest6();
      }
      if(rand == 7)
      {
        SpookyForest7();
      }
      if(rand == 8)
      {
        SpookyForest8();
      }
      if(rand == 9)
      {
        SpookyForest9();
      }
      if(rand == 10)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 8");
        SpookyForestMain();
      }
    }
    else
    {
      System.out.println("error 9");
      SpookyForestMain();
    }
    sc.close();
    return;
  }
  public void SpookyForest1()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest2();
      }
      if(rand == 2)
      {
        SpookyForest3();
      }
      if(rand == 3)
      {
        SpookyForest4();
      }
      if(rand == 4)
      {
        SpookyForest5();
      }
      if(rand == 5)
      {
        SpookyForest6();
      }
      if(rand == 6)
      {
        SpookyForest7();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 10");
        SpookyForest1();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest1();
      }
    }
    sc.close();
    return;
  }
  public void SpookyForest2()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest3();
      }
      if(rand == 3)
      {
        SpookyForest4();
      }
      if(rand == 4)
      {
        SpookyForest5();
      }
      if(rand == 5)
      {
        SpookyForest6();
      }
      if(rand == 6)
      {
        SpookyForest7();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 11");
        SpookyForest2();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest2();
      }
    }
    sc.close();
    return;
  }
  public void SpookyForest3()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest4();
      }
      if(rand == 4)
      {
        SpookyForest5();
      }
      if(rand == 5)
      {
        SpookyForest6();
      }
      if(rand == 6)
      {
        SpookyForest7();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 12");
        SpookyForest3();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest3();
      }
    }
    sc.close();
    return;
  }
  public void SpookyForest4()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Travel Deeper");
    System.out.println("2 - Try to head back");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      int rand = new Random().nextInt(9);
      if(rand == 1)
      {
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest5();
      }
      if(rand == 5)
      {
        SpookyForest6();
      }
      if(rand == 6)
      {
        SpookyForest7();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 13");
        SpookyForest4();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest4();
      }
    }
    sc.close();
    return;
  }
   public void SpookyForest5()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest4();
      }
      if(rand == 5)
      {
        SpookyForest6();
      }
      if(rand == 6)
      {
        SpookyForest7();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 14");
        SpookyForest5();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest5();
      }
    }
    sc.close();
    return;
  }
   public void SpookyForest6()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest4();
      }
      if(rand == 5)
      {
        SpookyForest5();
      }
      if(rand == 6)
      {
        SpookyForest7();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 15");
        SpookyForest6();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest6();
      }
    }
    sc.close();
    return;
  }
   public void SpookyForest7()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest4();
      }
      if(rand == 5)
      {
        SpookyForest5();
      }
      if(rand == 6)
      {
        SpookyForest6();
      }
      if(rand == 7)
      {
        SpookyForest8();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 16");
        SpookyForest7();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest7();
      }
    }
    sc.close();
    return;
  }
   public void SpookyForest8()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest4();
      }
      if(rand == 5)
      {
        SpookyForest5();
      }
      if(rand == 6)
      {
        SpookyForest6();
      }
      if(rand == 7)
      {
        SpookyForest7();
      }
      if(rand == 8)
      {
        SpookyForest9();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 17");
        SpookyForest8();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest8();
      }
    }
    sc.close();
    return;
  }
   public void SpookyForest9()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest4();
      }
      if(rand == 5)
      {
        SpookyForest5();
      }
      if(rand == 6)
      {
        SpookyForest6();
      }
      if(rand == 7)
      {
        SpookyForest7();
      }
      if(rand == 8)
      {
        SpookyForest8();
      }
      if(rand == 9)
      {
        SpookyForest10();
      }
      else
      {
        System.out.println("error 18");
        SpookyForest9();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest9();
      }
    }
    sc.close();
    return;
  }
   public void SpookyForest10()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are in the Spooky Forest");
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
        SpookyForest1();
      }
      if(rand == 2)
      {
        SpookyForest2();
      }
      if(rand == 3)
      {
        SpookyForest3();
      }
      if(rand == 4)
      {
        SpookyForest4();
      }
      if(rand == 5)
      {
        SpookyForest5();
      }
      if(rand == 6)
      {
        SpookyForest6();
      }
      if(rand == 7)
      {
        SpookyForest7();
      }
      if(rand == 8)
      {
        SpookyForest8();
      }
      if(rand == 9)
      {
        SpookyForest9();
      }
      else
      {
        System.out.println("error 19");
        SpookyForest10();
      }
    }
    if(input.equals("2"))
    {
      int rand = new Random().nextInt(6);
      if(rand == 1)
      {
        System.out.println("You manage to find your way back out");
        SpookyForestMain();
      }
      else
      {
        System.out.println("You can't find your way back");
        SpookyForest10();
      }
    }
    sc.close();
    return;
  }
}