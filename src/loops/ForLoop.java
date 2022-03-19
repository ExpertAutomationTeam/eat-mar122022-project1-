package loops;

public class ForLoop {
    public static void main(String[] args) {

        //for loop: all conditions are setup in 1 line
        int[] array = {2, 9, 7, 5, 6, 8 , 0, 2, 5, 6};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);

        System.out.println("array has: "+array.length);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }
}
