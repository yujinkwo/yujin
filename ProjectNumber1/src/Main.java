import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        //TODO
        int count=0;
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.substring(i,i+1))){
                count++;
            }
        }
        
        return count;
    }
    //Code you problem number two here bob
    static int problemTwo(String s){
        //TODO
        int count=0;
        String vowels = "bob";
        for(int i = 0; i < s.length()-2; i++) {
            if(vowels.equals(s.substring(i,i+3))){
                count++;
            }
        }
        return count;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //TODO
        return "";
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
    }
}
