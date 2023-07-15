//from classmate(Andrew)
import java.time.ZonedDateTime;
class Typing
{
  public Typing()
  {
    //
  }
  public void Clear() 
  {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
/////////////////////////////////////////////////////
  public void KeyByKey200(String print)
  {
    double time = ZonedDateTime.now().toInstant().toEpochMilli();
    for(int counter = 0; counter<print.length(); counter++)
    {
    while(ZonedDateTime.now().toInstant().toEpochMilli() - time < 200)
    {
      
    }
      System.out.print(print.charAt(counter));
      time = ZonedDateTime.now().toInstant().toEpochMilli();
    }
    return;
  }
  
  public void KeyByKey150(String print)
  {
    double time = ZonedDateTime.now().toInstant().toEpochMilli();
    for(int counter = 0; counter<print.length(); counter++)
    {
    while(ZonedDateTime.now().toInstant().toEpochMilli() - time < 150)
    {
      
    }
      System.out.print(print.charAt(counter));
      time = ZonedDateTime.now().toInstant().toEpochMilli();
    }
    return;
  }
  
  public void KeyByKey100(String print)
  {
    double time = ZonedDateTime.now().toInstant().toEpochMilli();
    for(int counter = 0; counter<print.length(); counter++)
    {
    while(ZonedDateTime.now().toInstant().toEpochMilli() - time < 100)
    {
      
    }
      System.out.print(print.charAt(counter));
      time = ZonedDateTime.now().toInstant().toEpochMilli();
    }
    return;
  }
  
  public void KeyByKey50(String print)
  {
    double time = ZonedDateTime.now().toInstant().toEpochMilli();
    for(int counter = 0; counter<print.length(); counter++)
    {
    while(ZonedDateTime.now().toInstant().toEpochMilli() - time < 50)
    {
      
    }
      System.out.print(print.charAt(counter));
      time = ZonedDateTime.now().toInstant().toEpochMilli();
    }
    return;
  }
  
  public void KeyByKey35(String print)
  {
    double time = ZonedDateTime.now().toInstant().toEpochMilli();
    for(int counter = 0; counter<print.length(); counter++)
    {
    while(ZonedDateTime.now().toInstant().toEpochMilli() - time < 35)
    {
      
    }
      System.out.print(print.charAt(counter));
      time = ZonedDateTime.now().toInstant().toEpochMilli();
    }
    return;
  }
  
  public void KeyByKey25(String print)
  {
    double time = ZonedDateTime.now().toInstant().toEpochMilli();
    for(int counter = 0; counter<print.length(); counter++)
    {
    while(ZonedDateTime.now().toInstant().toEpochMilli() - time < 25)
    {
      
    }
      System.out.print(print.charAt(counter));
      time = ZonedDateTime.now().toInstant().toEpochMilli();
    }
    return;
  }
/////////////////////////////////////////////////////
  public void Wait(int ms)
  {
    try
    {
      Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
      Thread.currentThread().interrupt();
    }
    return;
  }
}