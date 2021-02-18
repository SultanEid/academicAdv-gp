/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/


import java.util.*;
import java.sql.Time;

// line 61 "model.ump"
// line 127 "model.ump"
public class Advisor extends Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Advisor Attributes
  private int numberOfStudents;

  //Advisor Associations
  private List<Student> students;
  private Meeting meeting;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Advisor(String aName, String aId, String aAddress, String aPhone, String aPassword, String aUsername, String aEmail, int aNumberOfStudents)
  {
    super(aName, aId, aAddress, aPhone, aPassword, aUsername, aEmail);
    numberOfStudents = aNumberOfStudents;
    students = new ArrayList<Student>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumberOfStudents(int aNumberOfStudents)
  {
    boolean wasSet = false;
    numberOfStudents = aNumberOfStudents;
    wasSet = true;
    return wasSet;
  }

  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }
  /* Code from template association_GetMany */
  public Student getStudent(int index)
  {
    Student aStudent = students.get(index);
    return aStudent;
  }

  public List<Student> getStudents()
  {
    List<Student> newStudents = Collections.unmodifiableList(students);
    return newStudents;
  }

  public int numberOfStudents()
  {
    int number = students.size();
    return number;
  }

  public boolean hasStudents()
  {
    boolean has = students.size() > 0;
    return has;
  }

  public int indexOfStudent(Student aStudent)
  {
    int index = students.indexOf(aStudent);
    return index;
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudents()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addStudent(Student aStudent)
  {
    boolean wasAdded = false;
    if (students.contains(aStudent)) { return false; }
    Advisor existingAdvisor = aStudent.getAdvisor();
    if (existingAdvisor == null)
    {
      aStudent.setAdvisor(this);
    }
    else if (!this.equals(existingAdvisor))
    {
      existingAdvisor.removeStudent(aStudent);
      addStudent(aStudent);
    }
    else
    {
      students.add(aStudent);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStudent(Student aStudent)
  {
    boolean wasRemoved = false;
    if (students.contains(aStudent))
    {
      students.remove(aStudent);
      aStudent.setAdvisor(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudentAt(Student aStudent, int index)
  {  
    boolean wasAdded = false;
    if(addStudent(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudentAt(Student aStudent, int index)
  {
    boolean wasAdded = false;
    if(students.contains(aStudent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudents()) { index = numberOfStudents() - 1; }
      students.remove(aStudent);
      students.add(index, aStudent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudentAt(aStudent, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setMeeting(Meeting aNewMeeting)
  {
    boolean wasSet = false;
    if (meeting != null && !meeting.equals(aNewMeeting) && equals(meeting.getAdvisor()))
    {
      //Unable to setMeeting, as existing meeting would become an orphan
      return wasSet;
    }

    meeting = aNewMeeting;
    Advisor anOldAdvisor = aNewMeeting != null ? aNewMeeting.getAdvisor() : null;

    if (!this.equals(anOldAdvisor))
    {
      if (anOldAdvisor != null)
      {
        anOldAdvisor.meeting = null;
      }
      if (meeting != null)
      {
        meeting.setAdvisor(this);
      }
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !students.isEmpty() )
    {
      students.get(0).setAdvisor(null);
    }
    Meeting existingMeeting = meeting;
    meeting = null;
    if (existingMeeting != null)
    {
      existingMeeting.delete();
    }
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "numberOfStudents" + ":" + getNumberOfStudents()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "meeting = "+(getMeeting()!=null?Integer.toHexString(System.identityHashCode(getMeeting())):"null");
  }
}