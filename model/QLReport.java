/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/



// line 95 "model.ump"
// line 142 "model.ump"
public class QLReport extends Report
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //QLReport Attributes
  private int evaluationLevel;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public QLReport(String aId, String aTitle, int aQLReportRank, int aQNReportRank, int aTotalRank, boolean aIsSatisfied, int aEvaluationLevel)
  {
    super(aId, aTitle, aQLReportRank, aQNReportRank, aTotalRank, aIsSatisfied);
    evaluationLevel = aEvaluationLevel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEvaluationLevel(int aEvaluationLevel)
  {
    boolean wasSet = false;
    evaluationLevel = aEvaluationLevel;
    wasSet = true;
    return wasSet;
  }

  public int getEvaluationLevel()
  {
    return evaluationLevel;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "evaluationLevel" + ":" + getEvaluationLevel()+ "]";
  }
}