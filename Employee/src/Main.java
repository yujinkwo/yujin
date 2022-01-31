public class Main {
    public static void main(String[] args) {
        Student jim = new Student(23434, "Jim");
        Student jane = new Student(3434, "Jane");
        Student jake = jim;
        System.out.println(jim.getName());
        jim.setName("Jimbo");
        System.out.println(jim.getName());
        System.out.println(jim);
        System.out.println(jake);
        System.out.println(jane);
        Employee employee = new Employee();
    }
}
