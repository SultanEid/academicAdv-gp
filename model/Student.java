/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/


import java.sql.Time;

// line 2 "model.ump"
// line 117 "model.ump"
public class Student extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Student Attributes
  private String program;
  private String studentType;
  private double rank;
  private int gpa;
  private int unitFinished;
  private int unitAdded;
  private int unitLeft;
  private int numberOfF;
  private int numberOfMemberships;
  private int numberOfRewards;
  private int numberOfStrikes;
  private int numberOfDropRequests;
  private double progressPercentage;
  private boolean isOnPlan;
  private boolean isDelayed;
  private String currentLevel;
  private String currentSemester;
  private boolean hasMedicalCondition;
  private boolean hasLearningIssue;
  private boolean hasSocialIssue;
  private int socialImpact;
  private int medicalConditionImpact;
  private int learningImpact;
  private int levelOfInitiation;
  private int levelOfCommunication;

  //Student Associations
  private Report report;
  private Meeting meeting;
  private Advisor advisor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Student(String aName, String aId, String aAddress, String aPhone, String aPassword, String aUsername, String aEmail, String aProgram, String aStudentType, double aRank, int aGpa, int aUnitFinished, int aUnitAdded, int aUnitLeft, int aNumberOfF, int aNumberOfMemberships, int aNumberOfRewards, int aNumberOfStrikes, int aNumberOfDropRequests, double aProgressPercentage, boolean aIsOnPlan, boolean aIsDelayed, String aCurrentLevel, String aCurrentSemester, boolean aHasMedicalCondition, boolean aHasLearningIssue, boolean aHasSocialIssue, int aSocialImpact, int aMedicalConditionImpact, int aLearningImpact, int aLevelOfInitiation, int aLevelOfCommunication, Report aReport)
  {
    super(aName, aId, aAddress, aPhone, aPassword, aUsername, aEmail);
    program = aProgram;
    studentType = aStudentType;
    rank = aRank;
    gpa = aGpa;
    unitFinished = aUnitFinished;
    unitAdded = aUnitAdded;
    unitLeft = aUnitLeft;
    numberOfF = aNumberOfF;
    numberOfMemberships = aNumberOfMemberships;
    numberOfRewards = aNumberOfRewards;
    numberOfStrikes = aNumberOfStrikes;
    numberOfDropRequests = aNumberOfDropRequests;
    progressPercentage = aProgressPercentage;
    isOnPlan = aIsOnPlan;
    isDelayed = aIsDelayed;
    currentLevel = aCurrentLevel;
    currentSemester = aCurrentSemester;
    hasMedicalCondition = aHasMedicalCondition;
    hasLearningIssue = aHasLearningIssue;
    hasSocialIssue = aHasSocialIssue;
    socialImpact = aSocialImpact;
    medicalConditionImpact = aMedicalConditionImpact;
    learningImpact = aLearningImpact;
    levelOfInitiation = aLevelOfInitiation;
    levelOfCommunication = aLevelOfCommunication;
    boolean didAddReport = setReport(aReport);
    if (!didAddReport)
    {
      throw new RuntimeException("Unable to create student due to report. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setProgram(String aProgram)
  {
    boolean wasSet = false;
    program = aProgram;
    wasSet = true;
    return wasSet;
  }

  public boolean setStudentType(String aStudentType)
  {
    boolean wasSet = false;
    studentType = aStudentType;
    wasSet = true;
    return wasSet;
  }

  public boolean setRank(double aRank)
  {
    boolean wasSet = false;
    rank = aRank;
    wasSet = true;
    return wasSet;
  }

  public boolean setGpa(int aGpa)
  {
    boolean wasSet = false;
    gpa = aGpa;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnitFinished(int aUnitFinished)
  {
    boolean wasSet = false;
    unitFinished = aUnitFinished;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnitAdded(int aUnitAdded)
  {
    boolean wasSet = false;
    unitAdded = aUnitAdded;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnitLeft(int aUnitLeft)
  {
    boolean wasSet = false;
    unitLeft = aUnitLeft;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberOfF(int aNumberOfF)
  {
    boolean wasSet = false;
    numberOfF = aNumberOfF;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberOfMemberships(int aNumberOfMemberships)
  {
    boolean wasSet = false;
    numberOfMemberships = aNumberOfMemberships;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberOfRewards(int aNumberOfRewards)
  {
    boolean wasSet = false;
    numberOfRewards = aNumberOfRewards;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberOfStrikes(int aNumberOfStrikes)
  {
    boolean wasSet = false;
    numberOfStrikes = aNumberOfStrikes;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberOfDropRequests(int aNumberOfDropRequests)
  {
    boolean wasSet = false;
    numberOfDropRequests = aNumberOfDropRequests;
    wasSet = true;
    return wasSet;
  }

  public boolean setProgressPercentage(double aProgressPercentage)
  {
    boolean wasSet = false;
    progressPercentage = aProgressPercentage;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOnPlan(boolean aIsOnPlan)
  {
    boolean wasSet = false;
    isOnPlan = aIsOnPlan;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDelayed(boolean aIsDelayed)
  {
    boolean wasSet = false;
    isDelayed = aIsDelayed;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentLevel(String aCurrentLevel)
  {
    boolean wasSet = false;
    currentLevel = aCurrentLevel;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentSemester(String aCurrentSemester)
  {
    boolean wasSet = false;
    currentSemester = aCurrentSemester;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasMedicalCondition(boolean aHasMedicalCondition)
  {
    boolean wasSet = false;
    hasMedicalCondition = aHasMedicalCondition;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasLearningIssue(boolean aHasLearningIssue)
  {
    boolean wasSet = false;
    hasLearningIssue = aHasLearningIssue;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasSocialIssue(boolean aHasSocialIssue)
  {
    boolean wasSet = false;
    hasSocialIssue = aHasSocialIssue;
    wasSet = true;
    return wasSet;
  }

  public boolean setSocialImpact(int aSocialImpact)
  {
    boolean wasSet = false;
    socialImpact = aSocialImpact;
    wasSet = true;
    return wasSet;
  }

  public boolean setMedicalConditionImpact(int aMedicalConditionImpact)
  {
    boolean wasSet = false;
    medicalConditionImpact = aMedicalConditionImpact;
    wasSet = true;
    return wasSet;
  }

  public boolean setLearningImpact(int aLearningImpact)
  {
    boolean wasSet = false;
    learningImpact = aLearningImpact;
    wasSet = true;
    return wasSet;
  }

  public boolean setLevelOfInitiation(int aLevelOfInitiation)
  {
    boolean wasSet = false;
    levelOfInitiation = aLevelOfInitiation;
    wasSet = true;
    return wasSet;
  }

  public boolean setLevelOfCommunication(int aLevelOfCommunication)
  {
    boolean wasSet = false;
    levelOfCommunication = aLevelOfCommunication;
    wasSet = true;
    return wasSet;
  }

  public String getProgram()
  {
    return program;
  }

  public String getStudentType()
  {
    return studentType;
  }

  public double getRank()
  {
    return rank;
  }

  /**
   * QN attributes
   */
  public int getGpa()
  {
    return gpa;
  }

  public int getUnitFinished()
  {
    return unitFinished;
  }

  public int getUnitAdded()
  {
    return unitAdded;
  }

  public int getUnitLeft()
  {
    return unitLeft;
  }

  public int getNumberOfF()
  {
    return numberOfF;
  }

  public int getNumberOfMemberships()
  {
    return numberOfMemberships;
  }

  public int getNumberOfRewards()
  {
    return numberOfRewards;
  }

  public int getNumberOfStrikes()
  {
    return numberOfStrikes;
  }

  public int getNumberOfDropRequests()
  {
    return numberOfDropRequests;
  }

  public double getProgressPercentage()
  {
    return progressPercentage;
  }

  public boolean getIsOnPlan()
  {
    return isOnPlan;
  }

  public boolean getIsDelayed()
  {
    return isDelayed;
  }

  public String getCurrentLevel()
  {
    return currentLevel;
  }

  public String getCurrentSemester()
  {
    return currentSemester;
  }

  /**
   * QL attributes
   */
  public boolean getHasMedicalCondition()
  {
    return hasMedicalCondition;
  }

  public boolean getHasLearningIssue()
  {
    return hasLearningIssue;
  }

  public boolean getHasSocialIssue()
  {
    return hasSocialIssue;
  }

  public int getSocialImpact()
  {
    return socialImpact;
  }

  public int getMedicalConditionImpact()
  {
    return medicalConditionImpact;
  }

  public int getLearningImpact()
  {
    return learningImpact;
  }

  public int getLevelOfInitiation()
  {
    return levelOfInitiation;
  }

  public int getLevelOfCommunication()
  {
    return levelOfCommunication;
  }
  /* Code from template association_GetOne */
  public Report getReport()
  {
    return report;
  }
  /* Code from template association_GetOne */
  public Meeting getMeeting()
  {
    return meeting;
  }

  public boolean hasMeeting()
  {
    boolean has = meeting != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Advisor getAdvisor()
  {
    return advisor;
  }

  public boolean hasAdvisor()
  {
    boolean has = advisor != null;
    return has;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setReport(Report aNewReport)
  {
    boolean wasSet = false;
    if (aNewReport == null)
    {
      //Unable to setReport to null, as student must always be associated to a report
      return wasSet;
    }
    
    Student existingStudent = aNewReport.getStudent();
    if (existingStudent != null && !equals(existingStudent))
    {
      //Unable to setReport, the current report already has a student, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    Report anOldReport = report;
    report = aNewReport;
    report.setStudent(this);

    if (anOldReport != null)
    {
      anOldReport.setStudent(null);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setMeeting(Meeting aNewMeeting)
  {
    boolean wasSet = false;
    if (meeting != null && !meeting.equals(aNewMeeting) && equals(meeting.getStudent()))
    {
      //Unable to setMeeting, as existing meeting would become an orphan
      return wasSet;
    }

    meeting = aNewMeeting;
    Student anOldStudent = aNewMeeting != null ? aNewMeeting.getStudent() : null;

    if (!this.equals(anOldStudent))
    {
      if (anOldStudent != null)
      {
        anOldStudent.meeting = null;
      }
      if (meeting != null)
      {
        meeting.setStudent(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setAdvisor(Advisor aAdvisor)
  {
    boolean wasSet = false;
    Advisor existingAdvisor = advisor;
    advisor = aAdvisor;
    if (existingAdvisor != null && !existingAdvisor.equals(aAdvisor))
    {
      existingAdvisor.removeStudent(this);
    }
    if (aAdvisor != null)
    {
      aAdvisor.addStudent(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Report existingReport = report;
    report = null;
    if (existingReport != null)
    {
      existingReport.setStudent(null);
    }
    Meeting existingMeeting = meeting;
    meeting = null;
    if (existingMeeting != null)
    {
      existingMeeting.delete();
    }
    if (advisor != null)
    {
      Advisor placeholderAdvisor = advisor;
      this.advisor = null;
      placeholderAdvisor.removeStudent(this);
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "program" + ":" + getProgram()+ "," +
            "studentType" + ":" + getStudentType()+ "," +
            "rank" + ":" + getRank()+ "," +
            "gpa" + ":" + getGpa()+ "," +
            "unitFinished" + ":" + getUnitFinished()+ "," +
            "unitAdded" + ":" + getUnitAdded()+ "," +
            "unitLeft" + ":" + getUnitLeft()+ "," +
            "numberOfF" + ":" + getNumberOfF()+ "," +
            "numberOfMemberships" + ":" + getNumberOfMemberships()+ "," +
            "numberOfRewards" + ":" + getNumberOfRewards()+ "," +
            "numberOfStrikes" + ":" + getNumberOfStrikes()+ "," +
            "numberOfDropRequests" + ":" + getNumberOfDropRequests()+ "," +
            "progressPercentage" + ":" + getProgressPercentage()+ "," +
            "isOnPlan" + ":" + getIsOnPlan()+ "," +
            "isDelayed" + ":" + getIsDelayed()+ "," +
            "currentLevel" + ":" + getCurrentLevel()+ "," +
            "currentSemester" + ":" + getCurrentSemester()+ "," +
            "hasMedicalCondition" + ":" + getHasMedicalCondition()+ "," +
            "hasLearningIssue" + ":" + getHasLearningIssue()+ "," +
            "hasSocialIssue" + ":" + getHasSocialIssue()+ "," +
            "socialImpact" + ":" + getSocialImpact()+ "," +
            "medicalConditionImpact" + ":" + getMedicalConditionImpact()+ "," +
            "learningImpact" + ":" + getLearningImpact()+ "," +
            "levelOfInitiation" + ":" + getLevelOfInitiation()+ "," +
            "levelOfCommunication" + ":" + getLevelOfCommunication()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "report = "+(getReport()!=null?Integer.toHexString(System.identityHashCode(getReport())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "meeting = "+(getMeeting()!=null?Integer.toHexString(System.identityHashCode(getMeeting())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "advisor = "+(getAdvisor()!=null?Integer.toHexString(System.identityHashCode(getAdvisor())):"null");
  }
}