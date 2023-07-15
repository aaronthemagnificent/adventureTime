//Created Feb. 8, 2022
//Create a text adventure game, based on the TV show, Adventure Time!
//Debug help from Jace, Andrew, Danny & Theo
//Code imported from Andrew under Class Typing
import java.util.Scanner;
class Main
{
  //NOTE TO SELF: MAINTAIN ONLY ONE INSTANCE OF THE PLAYER CLASS
  //THERE IS ONLY ONE PLAYER AT ALL TIMES

  private Treehouse game;
  private static String userName;
  
  public Main()
  {
    game = new Treehouse();
    userName = "";
  }

  public static void main(String[] args) 
  {
    Main main = new Main();
    Typing typer = new Typing();
    typer.Clear();
      //main.name(typer);
    typer.Wait(100);
    typer.Clear();
    Scanner sc = new Scanner(System.in);
    typer.KeyByKey150("What time is it?\n");
    String input = sc.nextLine();
    if(input.equals("Adventure Time!"))
    {
      typer.KeyByKey100("\nIt's time to journey to distant lands...");
      typer.Wait(750);
      main.Start();
    }
    else if(input.equals("tree"))
    {
      main.test();
    }
    else
    {
      typer.KeyByKey25("\nWell... it's Adventure Time! \nbut... okay.");
      typer.Wait(750);
      main.Start();
    }
    //String[] QuestList = new String[1];//debugged by classmate
    sc.close();
    typer.Clear();
    typer.Wait(125);
  }
  
  public void test()
  {
    Treehouse tree = new Treehouse();
    tree.TreehouseMulti();
  }

  public String name(Typing typer)
  {
    Scanner sc = new Scanner(System.in);
    typer.KeyByKey150("What's your name? ");
    String UserName = sc.nextLine();
    userName = UserName;
    return userName;
  }

  public void Start()
  {
    Typing typer = new Typing();
    typer.Clear();
    typer.KeyByKey35("You awake in a large room, it appears to be a huge treehouse.");
    typer.Wait(150);
    typer.KeyByKey35(" A kitchen and dining area are laid out before you, as you awaken on a large couch.");
    typer.Wait(150);
    typer.KeyByKey35(" Two figures are standing over you, a human, and a dog on two legs, they introduce themselves as Finn and Jake, respectively.");
    typer.Wait(150);
    typer.KeyByKey100("\nFinn: Hey, look! He's awake! We found you on the beach, how'd you get there?");
    typer.Wait(300);
    typer.KeyByKey100("\n" + userName + ": I... I don't remember.");
    typer.Wait(300);
    typer.KeyByKey100("\nJake: Well that's a bummer, dude.");
    typer.Wait(300);
    typer.KeyByKey100("\nFinn: Yeah, it is....");
    typer.Wait(300);
    typer.KeyByKey100("\nJake: Well, anyways, welcome to the Land of Ooo.");
    typer.Wait(300);
    typer.KeyByKey100("\nFinn here was hoping you could tell us a little more about where you came from, him being the only human on Ooo and all.");
    typer.Wait(300);
    typer.KeyByKey100("\n" + userName + ": Ooo?");
    typer.Wait(300);
    typer.KeyByKey100("\nJake: Yeah, dude. It's a crazy land with crazy creatures!");
    typer.Wait(300);
    typer.KeyByKey100("\nSome of them friendly, some of them not, but don't worry, bro, we'll get you through. ");
    typer.Wait(175);
    typer.KeyByKey100("Why don't you start by having a look around? Come talk to us if you need anything.");
    typer.Wait(500);
    Scanner sc = new Scanner(System.in);
    System.out.println("\nType 'continue' when you feel ready to have a look around.");
    String input = sc.nextLine();
    if(input.equals("continue"))
    {
      game.TreehouseMulti();//first location
    }
    else
    {
      System.out.println("error 1");
      Start();
    }
    sc.close();
    return;
  }
}