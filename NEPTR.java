import java.util.Scanner;

public class NEPTR extends NPC
{
    private Treehouse tree;
    private boolean isFixed;

    public void setTree()
    {
        tree = new Treehouse();
    }

    public void setFix(boolean fix)
    {
        isFixed = fix;
    }

    public boolean getFix()
    {
        return isFixed;
    }

    public void brokenInteraction()
    {
        super.getTyper().Clear();
        toString();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nYou are talking to NEPTR.");
        System.out.println("Choose from the following: ");
        System.out.println("------------------------");
        System.out.println("1 - Say hi");
        System.out.println("2 - Ask what N.E.P.T.R. stands for");
        System.out.println("3 - Offer to fix");
        System.out.println("4 - Why haven't Finn and Jake fixed you?");
        System.out.println("5 - Done");
        String input= sc.nextLine();
        if(input.equals("1"))
        {
            super.getTyper().KeyByKey100("Hi, I'm N-N-N-NEpTTTr");
            super.getTyper().Wait(800);
            brokenInteraction();
        }
        if(input.equals("2"))
        {
            super.getTyper().KeyByKey100("It stands ---- Never Ending Piiiiee Throwing R----obot.");
            super.getTyper().Wait(800);
            brokenInteraction();
        }
        if(input.equals("3"))
        {
            super.getTyper().KeyByKey100("R-really? Gee— th-th-th-th- thanks, mister!");
            if(tree.getPlayer().getTinker() >= 5)
            {
                super.getTyper().KeyByKey25("Tinker... tinker... tinker");
                super.getTyper().Wait(100);
                System.out.println("\nYou fixed NEPTR!\n");
                super.getTyper().Wait(100);
                super.getTyper().KeyByKey100("\nThanks so much!");
                setFix(true);
                super.getTyper().Wait(125);
                fixedInteraction();
            }
            else
            {
                super.getTyper().KeyByKey25("Thanks bu - I don - you can yet.");
                super.getTyper().Wait(800);
                brokenInteraction();
            }
        }
        if(input.equals("4"))
        {
            super.getTyper().KeyByKey100("Because they don't k--know where --- am. We've been playing Hide 'n' S---ek. I've been hiding for o- 12 months!");
            super.getTyper().Wait(800);
            brokenInteraction();
        }
        if(input.equals("5"))
        {
            tree.TreehouseGarage();
        }
        else
        {
            System.out.println("error 33");
            super.getTyper().Wait(800);
            brokenInteraction();
        }
        sc.close();
        return;
    }

    public void fixedInteraction()
    {
        super.getTyper().Clear();
        toString();
        //Scanner sc = new Scanner(System.in);
        System.out.println("\nYou are talking to NEPTR.");
        System.out.println("Choose from the following: ");
        System.out.println("------------------------");

        System.out.println("Test");

        //String input= sc.nextLine();
        /*
        else
        {
            System.out.println("error 33");
            super.getTyper().Wait(800);
            fixedInteraction();
        }*/
        //sc.close();
        return;
    }

}