import java.util.Scanner;

public class Jake extends NPC
{
  private Treehouse tree;

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
    //System.out.println("\n" + character.toStringNPC(getJake()));
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Say hi");
    System.out.println("2 - Ask abou Ooo");
    System.out.println("3 - Ask about the grass lands");
    //System.out.println("4 - Ask for some supplies");
    System.out.println("5 - Done");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
        super.getTyper().KeyByKey100("Sup, dude.");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    if(input.equals("2"))
    {
        super.getTyper().KeyByKey100("\nWell I wouldn't do that much adventuring unless you were ready for something strange to happen, that's about all the advice ol' Jakey has for you. Sorry I couldn't be more help, dude.");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    if(input.equals("3"))
    {
        super.getTyper().KeyByKey100("\nWell, theres the Farmer's Market, and Banana Man's house. Oh, theres also this spooky forest but its pretty freaky, dude, it gives me the creeps.");
        super.getTyper().KeyByKey100("\nThe only other thing is the witch's garden, that butt took away my stretchy powers, I got'em back though, good donuts though.");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    if(input.equals("4"))
    {
        //Typing.KeyByKey100("\nWell Finn really handles the supplies for when we go out, but I can make you some bacon pancakes!");
        //food
        super.getTyper().Wait(800);
        treeInteraction();
    }
    if(input.equals("5"))
    {
        setTree();
        tree.TreehouseMulti();
    }
    else
    {
        System.out.println("error 31");
        super.getTyper().Wait(800);
        treeInteraction();
    }
    sc.close();
    return;
  }
}