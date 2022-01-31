import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
class Friend2 {
    String name, address, group;
    int age;
    Friend2(String name, String address, int age, String group) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.group = group;
    }
    public String toString() {
        return name+" "+address+" "+age+" "+group;
    }
}
public class Friends {
    static ArrayList list = new ArrayList(10);
    static void loadFile(File file) {
        try {
            list = new ArrayList(10);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                String line = br.readLine();
                if (line==null) break;
                String[] strings = line.split("");
                Friend2 f = new Friend2(strings[0], strings[1], Integer.parseInt(strings[2]), strings[3]);
                list.add(f);
            }
            fr.close();
            br.close();
        }
        catch(Exception e) {
        }
    }
    static void saveToFile(File file) {
        try {
            FileWriter fr = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fr);
            String r = "";
            for (int i=0; i<list.size(); i++) {
                Friend2 f = (Friend2) list.get(i);
                r += f.toString() + "\n";
            }
            br.write(r);
            br.flush();
            fr.close();
            br.close();
        }
        catch(Exception e) {
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] group = {"friend1", "friend2", "friend3"};
        for (int i=0; i<group.length; i++) {
            File file = new File(group[i]+".txt");
            file.createNewFile();
        }
        String Group = group[0];
        File File = new File(Group+".txt");
        loadFile(File);
        while (true) {
            System.out.print("0.Group selection, 1.create a friend, 2.see their properties, 3.delete a friend, 4.display all the friends, 5.end");
            int n = sc.nextInt();
            sc.nextLine();
            if (n==5) break;
            if (n==0) {
                for (int i=0; i<group.length; i++) {
                    System.out.println((i+1)+"."+group[i]);
                }
                System.out.print("Select a number and select a group.: ");
                int num = sc.nextInt();
                sc.nextLine();
                Group = group[num-1];
                File = new File(Group+".txt");
                loadFile(File);
                System.out.println("selected a group.");
            }
            else if (n==1) {
                System.out.print("Enter your name ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Enter your address: ");
                String address = sc.next();
                sc.nextLine();
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                sc.nextLine();
                Friend2 f = new Friend2(name, address, age, Group);
                list.add(f);
                saveToFile(File);
                System.out.println("A friend has been added.");
            }
            else if (n==2) {
                for (int i=0; i<list.size(); i++) {
                    Friend2 f = (Friend2) list.get(i);
                    System.out.println((i+1)+". "+f.name);
                }
                System.out.print("choose a number and see their properties.: ");
                int num = sc.nextInt();
                sc.nextLine();
                System.out.println(list.get(num-1));
            }
            else if (n==3) {
                for (int i=0; i<list.size(); i++) {
                    Friend2 f = (Friend2) list.get(i);
                    System.out.println((i+1)+". "+f.name);
                }
                System.out.print("choose a number and delete a friend.: ");
                int num = sc.nextInt();
                sc.nextLine();
                Object o = list.remove(num-1);
                if (o != null) {
                    System.out.println("delete a friend.");
                    saveToFile(File);
                }
                else System.out.println("Delete failed.");
            }
            else if (n==4) {
                for (int i=0; i<list.size(); i++) {
                    Friend2 f = (Friend2) list.get(i);
                    System.out.println((i+1)+". "+f);
                }
            }
        }
    }
}