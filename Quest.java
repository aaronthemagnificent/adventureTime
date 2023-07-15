public class Quest
{
  private String questGiver;
  private String questType;
  private boolean isCompleted;

  public Quest()
  {
    questGiver = "";
    questType = "";
    isCompleted = false;
  }
  public Quest(String QuestGiver, String QuestType, boolean IsCompleted)
  {
    questGiver = QuestGiver;
    questType = QuestType;
    isCompleted = IsCompleted;
  }

  /* Get Methods */

  public String getQuestGiver()
  {
    return questGiver;
  }

  public String getQuestType()
  {
    return questType;
  }

  public boolean getIsCompleted()
  {
    return isCompleted;
  }

  /* Set Methods */

  public void setQuestGiver(String QuestGiver)
  {
    questGiver = QuestGiver;
  }

  public void setQuestType(String QuestType)
  {
    questType = QuestType;
  }

  public void setIsCompleted(boolean IsCompleted)
  {
    isCompleted = IsCompleted;
  }
  
}