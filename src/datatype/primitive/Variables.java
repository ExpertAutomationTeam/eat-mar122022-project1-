package datatype.primitive;

public class Variables {
    public static void main(String[] args) {
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
    }
}
