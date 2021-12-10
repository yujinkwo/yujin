public class Main {
    public static int[] add(int[] array, int val) {
        //make new array size of the paramater + 1
        //Loop through array vcopy old array to new one that we made
        //add on val to last position of new array
        //return new array

        int[] newarray = new int[array.length + 1];
        for(int i=0; i< array.length; i++){
            newarray[i]=array[i];
        }
        newarray[newarray.length-1] = val;

        return newarray;
    }


    public static int[] remove(int[] array) {
        int[] newarray = new int[array.length - 1];
        for(int i=0; i< newarray.length; i++){
            newarray[i]=array[i];
        }
        return newarray;
    }

    public static int[] insert(int[] array, int val, int pos) {
        int[] newarray = new int[array.length + 1];
        for(int i=0; i< newarray.length; i++){
            if (i < pos) {
                newarray[i] = array[i];
            } else if (i == pos) {
                newarray[i] = val;
            }
            else{
                newarray[i] = array[i - 1];
            }
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        array = add(array, 9);
    }
}
