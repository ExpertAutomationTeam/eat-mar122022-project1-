public class WorkWithStrings {
    public static void main(String[] args) {

        //string concatenation
        String str1 = "Hello";
        String str2 = "World";
        int number = 10;
        System.out.println(str1+" "+str2);//output: Hello World
        System.out.println(str1+number);//output: Hello10

        //string manipulation
        String str = "Hello World";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.indexOf("W"));

        System.out.println(str1.concat(str2));

        //escape characters
        System.out.println("\"anything\"");//escape double quote

        System.out.println('\''); //escape single quote

        System.out.println("\\"); //escape backslash

        System.out.println("\t word1"); //tab
        System.out.print("word2 \n"); //new line
        System.out.println("word3");

    }
}
