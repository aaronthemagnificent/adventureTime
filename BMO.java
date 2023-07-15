import java.util.Scanner;

public class BMO extends NPC
{

  private Treehouse tree;

  /* Location Methods */
  public void setTree()
  {
    tree = new Treehouse();
  }

  public void treeInteraction()
  {
    super.getTyper().Clear();
    toString();
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are talking to BMO.");
    System.out.println("Choose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Say hi");
    System.out.println("2 - Ask about Ooo");
    System.out.println("3 - Ask about tinkering");
    System.out.println("4 - Ask about MO's");
    System.out.println("5 - Done");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      super.getTyper().KeyByKey100("\nHi, I'm BMO.");
      super.getTyper().Wait(800);
      treeInteraction();
    }
    if(input.equals("2"))
    {
      super.getTyper().KeyByKey100("\nOoo is a pretty crazy place! It's far too dangerous for someone like me, that's why I spend so much time in the Treehouse.") ;
      super.getTyper().KeyByKey100("\nIt's okay, though, I like this place. Anyways, Ooo has five main parts.");
      super.getTyper().KeyByKey100("\nThe grass lands, where we are now, the Candy Kingdom, the Desert, the Mountains, and the Ice Kingdom. You'll have to talk to Finn and Jake for more information.");
      super.getTyper().Wait(800);
      treeInteraction();
    }
    if(input.equals("3"))
    {
      super.getTyper().KeyByKey100("\nWhen you tinker, you can make new stuff! It's pretty difficult and takes a lot of practice, but maybe one day you can make your own BMO.");
      System.out.println("You work on tinkering");
      tree.getPlayer().tinkerWork("BMO");//
      super.getTyper().Wait(800);
      treeInteraction();
    }
    if(input.equals("4"))
    {
      super.getTyper().KeyByKey100("\nWell... I don't really know that much. I do know there's an old factory where all the MO bots where made, its past the desert and into the Bad Lands. It's pretty dangerous though.");
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
      System.out.println("error 32");
      super.getTyper().Wait(100);
      treeInteraction();
    }
    sc.close();
    return;
  }
}