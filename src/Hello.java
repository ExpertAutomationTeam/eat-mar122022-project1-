public class Hello {

    public static void main(String[] args){

        /*
        Java syntax:
        Class name should be camel case starting with capital
        Everything thing you write in java must be in a class
        Class is delimited by curly brackets
        Main method is required and you will see it in every java program
        The code inside main will be executed
        Print statement is a method tp print a line of text to the screen
        */

        //single line comment

        //print statement
        System.out.println("my name is john doe");

        /*
        this is
        a multiple
        line comment
         */

        //variable types  - data types: variableType variableName = variableValue;

        //primitive variable
            //numbers
                //whole numbers
                byte b = 127; //1 byte
                short s = 3445; //2 bytes
                int x = 245674345; //4 bytes
                long l = 6566578987654898754L; //8 bytes

                //fractions - decimals
                float f = 1.3458765367898765678F; //4 bytes
                double d = 1.4789876458764567898764542356787564535678987565; //8 bytes

            //characters
            char c = '4'; //2 bytes

            //true or false
            boolean bool = false; //1 bit (1/8 byte)

        //declare variable: variableType variableName;
        int a;

        //assign variable: variableName = variableValue;
        //in order to assign variable it has to be previously declared
        a = 1234;

        //general variable naming
        int age = 20;
        /*
        general rules for variable name:
        * it can contain letters, digits, _ and $
        * must begin with letter accepts also _ and $
        * should start with lowercase
        * no space allowed
        * java keyword cannot be used (like int, boolean...)
        * use camel case (firstWordLowerNextWordStartsWithCapital)
         */

        //java logic
        System.out.println(10<5);

        //non-primitive variables
            //chain of character - one character or more or nothing
            String str = "any text or 1234 or special character";

            //array: a variable that can hold multiple values: variableType[] variableName = {value1, value2, value3};
            int[] array = {5, 2, 7, 7, 8};


    }

}
