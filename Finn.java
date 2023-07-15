import java.util.Scanner;

public class Finn extends NPC
{
  private String ANSI_RED;
  private String ANSI_BLUE;
  private String ANSI_YELLOW;
  private String ANSI_RESET;
  private Treehouse tree;

  //add interactionCount to constructor and use additional method if maintaing only one instance of a character at a time
  public Finn()
  {
    ANSI_RED = "\u001B[31m";
    ANSI_BLUE = "\u001B[34m";
    ANSI_YELLOW = "\u001B[33m";
    ANSI_RESET = "\u001B[0m";
  }

  /* Location Methods */
  public void setTree()
  {
    tree = new Treehouse();
  }

  /* Behavioural Methods */

  public void treeInteraction()
  {
    super.getTyper().Clear();
    toString();
    //super.setInteractionCount(super.getInteractionCount()+1);
    Scanner sc = new Scanner(System.in);
    //System.out.println("\n" + character.toStringNPC(getFinn()));
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Say hi");
    System.out.println("2 - Ask about Ooo");
    System.out.println("3 - Ask about the grass lands");
    System.out.println("4 - So you're the only human?");
    //System.out.println("5 - Ask for some supplies");
    System.out.println("6 - Done");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
        super.getTyper().KeyByKey100("Oh, hey dude.");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    else if(input.equals("2"))
    {
        super.getTyper().KeyByKey100("\nIt's mathematical! All over the place is another monster, another person to save, another dungeon to crawl!");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    else if(input.equals("3"))
    {
        super.getTyper().KeyByKey100("\nThe Farmer's Market is nearby, talk to Choose Goose, he's pretty cool. ");
        super.getTyper().KeyByKey100("The spooky forest isn't far from here, but unless you got some tricks up your sleeve I wouldn't bother with it.");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    else if(input.equals("4"))
    {
        super.getTyper().KeyByKey100("\nYeah, I don't really like to think about it.");
        super.getTyper().KeyByKey100(" I get all " + ANSI_BLUE +  "exestensial " + ANSI_RESET + ANSI_YELLOW + "and " + ANSI_RESET + ANSI_RED + "WEIRD." + ANSI_RESET);
        super.getTyper().Wait(875);
        treeInteraction();
    }
    else if(input.equals("5"))
    {
        //supplies
    }
    else if(input.equals("6"))
    {
        setTree();
        tree.TreehouseMulti();
    }
    else
    {
        System.out.println("error 30");
        super.getTyper().Wait(100);
        treeInteraction();
    }
    sc.close();
    return;
  }
  
}