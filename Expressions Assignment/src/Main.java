public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */
        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        System.out.println(5 + 10/2 + 4/3);
        System.out.println(34/3);
        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        System.out.println(23%4 + 33/2);
        System.out.println(3 + 33/2);
        System.out.println(39/2);
        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println(((8-5) + 81/5));
        System.out.println(3 + 81/5);
        

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(1 - 8 + 1 + 3);
        System.out.println(-3);

        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(5, 3));
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - 125);
        System.out.println((10) * 0.8509035245341184 + 2 - 125);
        System.out.println(8.509035245341184 + 2 - 125);
        System.out.println(10.509035245341184 - 125);
        System.out.println(-114.49096475465882);
    }
}
