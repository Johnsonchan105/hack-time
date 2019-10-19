public class SelectionGroup(){
  private ArrayList<Student> students;
  private ArrayList<String> names;
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

}
