/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/



// line 103 "model.ump"
// line 147 "model.ump"
public class QNReport extends Report
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QNReport Attributes
  private int satisfactionLevel;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QNReport(String aId, String aTitle, int aQLReportRank, int aQNReportRank, int aTotalRank, boolean aIsSatisfied, int aSatisfactionLevel)
  {
    super(aId, aTitle, aQLReportRank, aQNReportRank, aTotalRank, aIsSatisfied);
    satisfactionLevel = aSatisfactionLevel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSatisfactionLevel(int aSatisfactionLevel)
  {
    boolean wasSet = false;
    satisfactionLevel = aSatisfactionLevel;
    wasSet = true;
    return wasSet;
  }

  public int getSatisfactionLevel()
  {
    return satisfactionLevel;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "satisfactionLevel" + ":" + getSatisfactionLevel()+ "]";
  }
}