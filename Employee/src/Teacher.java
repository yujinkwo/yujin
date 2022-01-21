public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject){
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSubject(){
        return subject;
    }

    public String toString(){
        return "name "+firstName+" subject "+subject;
    }
}
