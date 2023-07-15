public class NPC extends Character
{
  
  //To ensure one instance of each character remains at a time use this class to create them in a constructor at the start of the game, then use getter methods

  /* Instance Variables */

  private Typing typer;
  //private int interactionCount;//how?
  private Finn finn;
  private Jake jake;
  private BMO bmo;
  private NEPTR nep;

  public NPC()
  {
    typer = new Typing();
    //interactionCount = 0;
  }
  /*public NPC(int count)
  {
    interactionCount = count;
  }*/

  /* Setter Methods */

  public void setCharacters()
  {
    finn = new Finn();
    jake = new Jake();
    bmo = new BMO();
    nep = new NEPTR();
  }

  /* Getter Methods */

  public Typing getTyper()
  {
    return typer;
  }
  
  public Finn getFinn()
  {
    return finn;
  }
  public Jake getJake()
  {
    return jake;
  }
  public BMO getBMO()
  {
    return bmo;
  }
  public NEPTR getNEPTR()
  {
    return nep;
  }

}