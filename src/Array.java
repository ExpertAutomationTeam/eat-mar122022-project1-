public class Array {
    public static void main(String[] args) {

        //array is a variable that can hold multiple value: arrayType[] arrayName = {value1, value2, value3};

        //in line declaration and assignment
        int[] array1 = {2, 9, 7, 5};

        //declare array
        String[] array2 = new String[5];

        //assign array value: arrayName[index] = value;
        array2[0] = "john";
        array2[1] = "josh";
        array2[2] = "dave";
        array2[3] = "sean";
        array2[4] = "brad";

        System.out.println(array2[1]);

        //multiple dimension array (2D array)
        char[][] array3 = new char[2][2];
        array3[0][0] = 'a';
        array3[0][1] = 'b';
        array3[1][0] = 'c';
        array3[1][1] = 'd';

        System.out.println(array3[1][1]);

    }
}
