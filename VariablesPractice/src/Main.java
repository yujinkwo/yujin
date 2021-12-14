public class Main {
    public static void main(String[] args) {
        int roomNumber=113;
        double e= 2.71828;
        String subject="Computer Science";
        System.out.println("This is room #" + roomNumber);
        System.out.println("e is close to" + e);
        System.out.println("I am learning a bit about" + subject);

        String[] subjects = { "English III"
                , "Precalculuus"
                , "Music Theory"
                , "Biotechnology"
                , "Principles of Technology I"
                , "Latin II"
                , "AP US History"
                , "Business Computer Information Systems" };
        String[] names = { "Ms. Lapan"
                , "Mrs. Gideon"
                , "Mr. Davis"
                , "Ms. Palmer"
                , "Ms. Garcia"
                , "Mrs. Barnett"
                , "Ms. Johannessen"
                , "Mr. James" };
        System.out.println("+-------------------------------------------------------------+");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("| %d | %37s | %15s |\n", i + 1, subjects[i], names[i]);
        }
        System.out.println("+-------------------------------------------------------------+");
    }
}
