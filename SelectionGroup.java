public class SelectionGroup(){
  private ArrayList<Student> students;
  private ArrayList<String> names;
  private ArrayList<String> selected;
  private String groupname;
  public SelectionGroup(String name){
    groupname = name;
    names = new Arraylist<Student>;
  }
  public SelectionGroup(String name, ArrayList<Student> currnames){
    groupname = name;
    names = currnames;
  }
  public void addStudent(Student student){
    students.add(student);
    names.add(student.getName());
  }
  public void removeStudent(Student student){
    for(int i=0;i<names.length();i++){
      if((names.get(i)).equals(student.name);
        names.remove(i);
        student.remove(i);
        break;
      }
    }
  }
  public ArrayList<String> listAllStudents(){
    return names;
  }
  public ArrayList<String> pickRandomSubgroup(int numstudents){
    for(int i=0;i<selected.length();i++) selected.remove(i);
    for(int i=0;i<numStudents;i++){
      selected.add(names.get(i));
      names.remove(i);
      students.remove(i);
    }
  }
}
