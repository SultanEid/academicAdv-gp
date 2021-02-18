/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/


import java.sql.Time;

// line 47 "model.ump"
// line 122 "model.ump"
public class Meeting
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Meeting Attributes
  private Time date;
  private double time;
  private String topic;
  private String description;

  //Meeting Associations
  private Student student;
  private Advisor advisor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Meeting(Time aDate, double aTime, String aTopic, String aDescription, Student aStudent, Advisor aAdvisor)
  {
    date = aDate;
    time = aTime;
    topic = aTopic;
    description = aDescription;
    boolean didAddStudent = setStudent(aStudent);
    if (!didAddStudent)
    {
      throw new RuntimeException("Unable to create meeting due to student. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    boolean didAddAdvisor = setAdvisor(aAdvisor);
    if (!didAddAdvisor)
    {
      throw new RuntimeException("Unable to create meeting due to advisor. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(Time aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setTime(double aTime)
  {
    boolean wasSet = false;
    time = aTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setTopic(String aTopic)
  {
    boolean wasSet = false;
    topic = aTopic;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public Time getDate()
  {
    return date;
  }

  public double getTime()
  {
    return time;
  }

  public String getTopic()
  {
    return topic;
  }

  public String getDescription()
  {
    return description;
  }
  /* Code from template association_GetOne */
  public Student getStudent()
  {
    return student;
  }
  /* Code from template association_GetOne */
  public Advisor getAdvisor()
  {
    return advisor;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setStudent(Student aNewStudent)
  {
    boolean wasSet = false;
    if (aNewStudent == null)
    {
      //Unable to setStudent to null, as meeting must always be associated to a student
      return wasSet;
    }
    
    Meeting existingMeeting = aNewStudent.getMeeting();
    if (existingMeeting != null && !equals(existingMeeting))
    {
      //Unable to setStudent, the current student already has a meeting, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    Student anOldStudent = student;
    student = aNewStudent;
    student.setMeeting(this);

    if (anOldStudent != null)
    {
      anOldStudent.setMeeting(null);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setAdvisor(Advisor aNewAdvisor)
  {
    boolean wasSet = false;
    if (aNewAdvisor == null)
    {
      //Unable to setAdvisor to null, as meeting must always be associated to a advisor
      return wasSet;
    }
    
    Meeting existingMeeting = aNewAdvisor.getMeeting();
    if (existingMeeting != null && !equals(existingMeeting))
    {
      //Unable to setAdvisor, the current advisor already has a meeting, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    Advisor anOldAdvisor = advisor;
    advisor = aNewAdvisor;
    advisor.setMeeting(this);

    if (anOldAdvisor != null)
    {
      anOldAdvisor.setMeeting(null);
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
      existingStudent.setMeeting(null);
    }
    Advisor existingAdvisor = advisor;
    advisor = null;
    if (existingAdvisor != null)
    {
      existingAdvisor.setMeeting(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "time" + ":" + getTime()+ "," +
            "topic" + ":" + getTopic()+ "," +
            "description" + ":" + getDescription()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "student = "+(getStudent()!=null?Integer.toHexString(System.identityHashCode(getStudent())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "advisor = "+(getAdvisor()!=null?Integer.toHexString(System.identityHashCode(getAdvisor())):"null");
  }
}