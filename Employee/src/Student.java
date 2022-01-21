public class Student {
    private int studentNumber;
    private String firstName;
    private String lastName;
    private int grade;

    public Student(int studentNumber, int grade, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.grade=grade;
        this.firstName = firstName;
        this.lastName=lastName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setGrade(int grade) {
        if (grade < 0) {
            grade = 0;
        }
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getGrade() {
        return grade;
    }

    public String toString() {
        return "Name " +firstName+lastName+ "grade " + grade;
    }
}
