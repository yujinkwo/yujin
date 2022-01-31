import java.util.Scanner;
import java.util.ArrayList;
class Friend {
    String name, address;
    int age;
    Friend(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String toString() {
        return name+", "+address+", "+age;
    }
}
public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList(10);
        while (true) {
            System.out.print("1.create a friend, 2.see their properties, 3.delete a friend, 4.display all the friends, 5.end");
            int n = sc.nextInt();
            sc.nextLine();
            if (n==5) break;
            if (n==1) {
                System.out.print("Enter your name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Enter your address: ");
                String address = sc.next();
                sc.nextLine();
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                sc.nextLine();
                Friend f = new Friend(name, address, age);
                list.add(f);
                System.out.println("A friend has been added.");
            }
            else if (n==2) {
                for (int i=0; i<list.size(); i++) {
                    Friend f = (Friend) list.get(i);
                    System.out.println((i+1)+". "+f.name);
                }
                System.out.print("choose a number and see their properties.: ");
                int num = sc.nextInt();
                sc.nextLine();
                System.out.println(list.get(num-1));
            }
            else if (n==3) {
                for (int i=0; i<list.size(); i++) {
                    Friend f = (Friend) list.get(i);
                    System.out.println((i+1)+". "+f.name);
                }
                System.out.print("choose a number and delete a friend.: ");
                int num = sc.nextInt();
                sc.nextLine();
                Object o = list.remove(num-1);
                if (o != null)
                    System.out.println("delete a friend.");
                else System.out.println("Delete failed.");
            }
            else if (n==4) {
                for (int i=0; i<list.size(); i++) {
                    Friend f = (Friend) list.get(i);
                    System.out.println((i+1)+". "+f);
                }
            }
        }
    }
}
