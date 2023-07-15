import java.util.Scanner;
class Treehouse
{
  private Typing typer;
  private BananaMan bananaMan;
  private FarmersMarket farmersMarket;
  private SpookyForest spookyForest;
  private WitchsGarden witchsGarden;
  private SouthCandyForest southCandyForest;
  //private IceKingdom iceKingdom;
  private NPC npc;
  private Player player;

  public Treehouse()
  {
    typer = new Typing();
    npc = new NPC();
  }

  public void setPlayer()
  {
    player = new Player();
  }
  public Player getPlayer()
  {
    return player;
  }

  public void npcSet()
  {
    npc.setCharacters();
  }
  public void setBananaMan()
  {
    bananaMan = new BananaMan();
    bananaMan.BananaMansHouse();
  }
  public void setFarmersMarket()
  {
    farmersMarket = new FarmersMarket();
    farmersMarket.FarmersMarketMain();
  }
  public void setSpookyForest()
  {
    spookyForest = new SpookyForest();
    spookyForest.SpookyForestMain();
  }
  public void setWitchsGarden()
  {
    witchsGarden = new WitchsGarden();
    witchsGarden.WitchsGardenMain();
  }
  public void setSouthCandyForest()
  {
    southCandyForest = new SouthCandyForest();
    southCandyForest.SouthCandyForestMain();
  }
  
  public void TreehouseMulti()
  {
    setPlayer();
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the 'multi-room'. ");
    System.out.print("There's a ladder going up and one going down. ");
    System.out.print("What appears to be a trapdoor of some kind, and a door off to the side. ");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Look around");
    System.out.println("2 - Go downstairs");
    System.out.println("3 - Go upstairs");
    System.out.println("4 - Go down the trapdoor");
    System.out.println("5 - Go out the door");
    System.out.println("6 - Talk to Finn");
    System.out.println("7 - Talk to Jake");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      typer.KeyByKey50("\nYou see: ");
      typer.KeyByKey50("\nA large couch, with an even larger table.");
      typer.KeyByKey50(" A cooler.");
      typer.KeyByKey50(" And a bathroom.");
      typer.Wait(800);
      TreehouseMulti();
    }
    if(input.equals("2"))
    {
      TreehouseTreasure();
    }
    if(input.equals("3"))
    {
      TreehouseCommonroom();
    }
    if(input.equals("4"))
    {
      TreehouseScienceTower();
    }
    if(input.equals("5"))
    {   
      TreehouseStorageTower();
    }
    if(input.equals("6"))
    {
      npc.setCharacters();
      Finn finn = npc.getFinn();
      finn.treeInteraction();
    }
    if(input.equals("7"))
    {
      npc.setCharacters();
      Jake jake = npc.getJake();
      jake.treeInteraction();
    }
    else
    {
      System.out.println("error 20");
      TreehouseMulti();
    }
    sc.close();
    return;
  }
  public void TreehouseCommonroom()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the 'Commonroom'");
    System.out.print("There's a robot with BMO written on the side of it.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Look around");
    System.out.println("2 - Talk to BMO");
    System.out.println("3 - Go upstairs");
    System.out.println("4 - Go downstairs");
    System.out.println("5 - Go through the right door");
    System.out.println("6 - Go through the left foor");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      typer.KeyByKey50("\nYou see: ");
      typer.KeyByKey50("\nYou see a big chair with a coffee table, ");
      typer.KeyByKey50("as well as a furnace, with many other items displayed on various shelves.");
      typer.Wait(800);
      TreehouseCommonroom();
    }
    if(input.equals("2"))
    {
      npc.setCharacters();
      BMO bmo = npc.getBMO();
      bmo.treeInteraction();
    }
    if(input.equals("3"))
    {
      TreehouseBedroom();
    }
    if(input.equals("4"))
    {
      TreehouseMulti();
    }
    if(input.equals("5"))
    {
      TreehouseFlagTower();
    }
    if(input.equals("6"))
    {
      TreehouseBoatDeck();
    }
    else
    {
      System.out.println("error 21");
      TreehouseCommonroom();
    }
    sc.close();
    return;
  }
  public void TreehouseTreasure()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the treasure room.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Look around");
    System.out.println("2 - Go upstairs");
    System.out.println("3 - Go outside");
    //System.out.println("4 - Mutliroom Override");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      typer.KeyByKey50("\nYou see: ");
      typer.KeyByKey50("\nA  huge room filled to the brim with various treasures and trinkets.");
      typer.Wait(800);
      TreehouseTreasure();
    }
    if(input.equals("2"))
    {
      TreehouseMulti();
    }
    if(input.equals("3"))
    {
      TreehouseOutside();
    }
    if(input.equals("4"))
    {
      TreehouseMulti();
    }
    else
    {
      System.out.println("error 22");
      TreehouseTreasure();
    }
    sc.close();
    return;
  }
  public void TreehouseScienceTower()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You drop down a small ladder to a few planks set out that act as an observation deck.");
    System.out.println("You see a large grassy plateau, and to the North large cotton-candy forests.");
    System.out.println("The planks go across the Treehouse into a smaller sub-section.");
    System.out.println("You are in the Science Tower.\n There are various books and ingredients for different experiments.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - SCIENCE!");
    System.out.println("2 - Go to the Multi-Room");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("You work on science");
      player.sciWork("Treehouse");
      typer.Wait(225);
      TreehouseScienceTower();
    }
    if(input.equals("2"))
    {
      TreehouseMulti();
    }
    else
    {
      System.out.println("error 23");
      TreehouseScienceTower();
    }
    sc.close();
    return;
  }
  public void TreehouseStorageTower()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the Storage Tower.");
    System.out.println("It seems to be a storage room of some kind, although its mostly broken junk.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Tinker");
    System.out.println("2 - Go to the Multi-Room");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("You work on tinkering");
      player.tinkerWork("Treehouse");
      typer.Wait(225);
      TreehouseStorageTower();
    }
    if(input.equals("2"))
    {
      TreehouseMulti();
    }
    else
    {
      System.out.println("error 24");
      TreehouseStorageTower();
    }
    sc.close();
    return;
  }
  public void TreehouseBedroom()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the bedroom. There are two beds and scattered clothes.");
    System.out.println("\n\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Take a nap");
    System.out.println("2 - Go downtairs");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("Nap Time!");
      typer.Wait(1000);
      System.out.println("Nap Time over.");
      typer.Wait(500);
      TreehouseBedroom();
    }
    if(input.equals("2"))
    {
      TreehouseCommonroom();
    }
    else
    {
      System.out.println("error 25");
      TreehouseBedroom();
    }
    sc.close();
    return;
  }
  public void TreehouseFlagTower()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in a small tower, there are some windows looking out, and a couple boxes of stale chocolate.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Eat stale chocolate");
    System.out.println("2 - Go to the Common-Room");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("...yum");
      typer.Wait(1500);
      TreehouseFlagTower();
    }
    if(input.equals("2"))
    {
      TreehouseCommonroom();
    }
    else
    {
      System.out.println("error 26");
      TreehouseFlagTower();
    }
    sc.close();
    return;
  }
  public void TreehouseBoatDeck()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in a small boat atop a branch of the Treehouse.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Observe");
    System.out.println("2 - Go to the Common-Room");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("Observe Time!");
      typer.Wait(1000);
      System.out.println("Observe time over.");
      typer.Wait(200);
      TreehouseBoatDeck();
    }
    if(input.equals("2"))
    {
      TreehouseCommonroom();
    }
    else
    {
      System.out.println("error 27");
      TreehouseBoatDeck();
    }
    sc.close();
    return;
  }
  public void TreehouseOutside()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are outside the treehouse.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back inside");
    System.out.println("2 - Go to the garage");
    System.out.println("3 - Go to Banana Man's house");
    System.out.println("4 - Go to the Farmer's Market");
    System.out.println("5 - Go to the Spooky Forest");
    System.out.println("6 - Go to the Witch's Garden");
    System.out.println("7 - Go to the Candy Kingdom");
    //System.out.println("8 - Go the the Desert");
    //System.out.println("9 - Go to the Ice Kingdom");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      TreehouseTreasure();
    }
    if(input.equals("2"))
    {
      TreehouseGarage();
    }
    if(input.equals("3"))
    {
      setBananaMan();
    }
    if(input.equals("4"))
    {
      setFarmersMarket();
    }
    if(input.equals("5"))
    {
      setSpookyForest();
    }
    if(input.equals("6"))
    {
      setWitchsGarden();
    }
    if(input.equals("7"))
    {
      setSouthCandyForest();
    }
    if(input.equals("8"))
    {
      //Desert();
    }
    if(input.equals("9"))
    {
      //setIceKingdom();
    }
    else
    {
      System.out.println("error 28");
      TreehouseOutside();
    }
    sc.close();
    return;
  }
  public void TreehouseGarage()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in a small garage, theres random electronic parts everywhere, and a strange looking robot called, N.E.P.T.R..");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Go back outside");
    //System.out.println("2 - Talk to N.E.P.T.R.");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      TreehouseOutside();
    }
    if(input.equals("2"))
    {
      npc.setCharacters();
      NEPTR nep = npc.getNEPTR();
      if(nep.getFix())
      {
        nep.fixedInteraction();
      }
      else
      {
        nep.brokenInteraction();
      }
    }
    else
    {
      System.out.println("error 29");
      TreehouseGarage();
    }
    sc.close();
    return;
  }
  
}