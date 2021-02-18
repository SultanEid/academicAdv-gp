/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/



// line 81 "model.ump"
// line 137 "model.ump"
public class Report
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Report Attributes
  private String id;
  private String title;
  private int qLReportRank;
  private int qNReportRank;
  private int totalRank;
  private boolean isSatisfied;

  //Report Associations
  private Student student;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Report(String aId, String aTitle, int aQLReportRank, int aQNReportRank, int aTotalRank, boolean aIsSatisfied)
  {
    id = aId;
    title = aTitle;
    qLReportRank = aQLReportRank;
    qNReportRank = aQNReportRank;
    totalRank = aTotalRank;
    isSatisfied = aIsSatisfied;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setTitle(String aTitle)
  {
    boolean wasSet = false;
    title = aTitle;
    wasSet = true;
    return wasSet;
  }

  public boolean setQLReportRank(int aQLReportRank)
  {
    boolean wasSet = false;
    qLReportRank = aQLReportRank;
    wasSet = true;
    return wasSet;
  }

  public boolean setQNReportRank(int aQNReportRank)
  {
    boolean wasSet = false;
    qNReportRank = aQNReportRank;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalRank(int aTotalRank)
  {
    boolean wasSet = false;
    totalRank = aTotalRank;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSatisfied(boolean aIsSatisfied)
  {
    boolean wasSet = false;
    isSatisfied = aIsSatisfied;
    wasSet = true;
    return wasSet;
  }

  public String getId()
  {
    return id;
  }

  public String getTitle()
  {
    return title;
  }

  public int getQLReportRank()
  {
    return qLReportRank;
  }

  public int getQNReportRank()
  {
    return qNReportRank;
  }

  public int getTotalRank()
  {
    return totalRank;
  }

  public boolean getIsSatisfied()
  {
    return isSatisfied;
  }
  /* Code from template association_GetOne */
  public Student getStudent()
  {
    return student;
  }

  public boolean hasStudent()
  {
    boolean has = student != null;
    return has;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setStudent(Student aNewStudent)
  {
    boolean wasSet = false;
    if (student != null && !student.equals(aNewStudent) && equals(student.getReport()))
    {
      //Unable to setStudent, as existing student would become an orphan
      return wasSet;
    }

    student = aNewStudent;
    Report anOldReport = aNewStudent != null ? aNewStudent.getReport() : null;

    if (!this.equals(anOldReport))
    {
      if (anOldReport != null)
      {
        anOldReport.student = null;
      }
      if (student != null)
      {
        student.setReport(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Student existingStudent = student;
    student = null;
    if (existingStudent != null)
    {
      existingStudent.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "title" + ":" + getTitle()+ "," +
            "qLReportRank" + ":" + getQLReportRank()+ "," +
            "qNReportRank" + ":" + getQNReportRank()+ "," +
            "totalRank" + ":" + getTotalRank()+ "," +
            "isSatisfied" + ":" + getIsSatisfied()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null");
  }
}