import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    String name;

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    private String Name;
    private String location;
    private String address;

    public School(String Name, String location, String address){
        this.Name=Name;
        this.location=location;
        this.address=address;
    }
    public void setName(String Name){
        this.Name= this.Name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getName(){
        return Name;
    }
    public String getLocation(){
        return location;
    }
    public String getAddress(){
        return address;
    }
}