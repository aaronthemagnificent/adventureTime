import java.util.Scanner;
class WitchsGarden
{
  private Typing typer;
  private Treehouse treehouse;
  private SpookyForest spookyForest;
  
  public WitchsGarden()
  {
    typer = new Typing();
  }

  public void setTreehouse()
  {
    treehouse = new Treehouse();
    treehouse.TreehouseOutside();
  }
  public void setSpookyForest()
  {
    spookyForest = new SpookyForest();
    spookyForest.SpookyForestMain();
  }
  
  public void WitchsGardenMain()
  {
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou come across a huge hedge wall with a gate of thorns.");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Knock");
    System.out.println("2 - Go to the Spooky Forest");
    System.out.println("3 - Go to the Treehouse");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("Go away!");
      //Witch();
    }
    if(input.equals("2"))
    {
      setSpookyForest();
    }
    if(input.equals("3"))
    {
      setTreehouse();
    }
    else
    {
      System.out.println("error 34");
      WitchsGardenMain();
    }
    sc.close();
    return;
  }
  /*
  public void Witch()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nYou are talking to the Witch.");
    System.out.println("\nChoose from the follow: ");
    System.out.println("------------------------");
    System.out.println("1 - No");
    System.out.println("2 - Why");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("Wha-well that's just rude!");
      Witch1();
    }
    if(input.equals("2"))
    {
      System.out.println("Because I said so!");
      WitchsGarden();
    }
    else
    {
      
    }
    sc.close();
    return;
  }
  public void Witch1()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("1 - What are you gonna do about it?");
    System.out.println("2 - Tough");
    System.out.println("3 - You were rude first!");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("I-I'm gonna stop talking to you!");
      WitchsGarden();
    }
    if(input.equals("2"))
    {
      System.out.println("Wow... you're hardcore. I like that. Tell you what, find me a donut, not just any donut, a perfect donut, and bring it back to me. Then I'll let you into my garden.");
      WitchsQuest();
    }
    if(input.equals("3"))
    {
      System.out.println("Well... that's fair. But still, go away!");
      WitchsGarden();
    }
    else
    {
      System.out.println("error 35");
      Witch1();
    }
    sc.close();
    return;
  }
  public void WitchsQuest()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nThe Witch has a quest!");
    System.out.println("\nChoose from the following: ");
    System.out.println("------------------------");
    System.out.println("1 - Accept");
    System.out.println("2 - Decline");
    System.out.println("3 - Give her the Perfect Donut");
    String input= sc.nextLine();
    if(input.equals("1"))
    {
      System.out.println("Great!");
      WitchsGarden();
    }
    if(input.equals("2"))
    {
      System.out.println("Then go away!");
      WitchsGarden();
    }
    if(input.equals("3"))
    {
      System.out.println("test");
      //if item in list then complete, else, back to function
    }
    else
    {
      System.out.println("error 36");
      WitchsQuest();
    }
    sc.close();
    return;
  }
  */
}