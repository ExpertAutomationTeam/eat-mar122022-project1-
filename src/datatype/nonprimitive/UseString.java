package datatype.nonprimitive;

public class UseString {
    public static void main(String[] args) {

        //string concatenation: when you add string to any other variable
        String str1 = "getstarted.HelloJava";
        String str2 = "classobjectmethod.World";
        int number = 10;
        System.out.println(str1+" "+str2);//output: getstarted.HelloJava classobjectmethod.World
        System.out.println(str1+number);//output: Hello10

        //string manipulation
        String str = "getstarted.HelloJava classobjectmethod.World Welcome Java";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.indexOf("W"));

        System.out.println(str1.concat(str2));

        String[] words = str.split(" ");
        System.out.println("word 1: "+words[0]);
        System.out.println("word 2: "+words[1]);
        System.out.println("word 3: "+words[2]);
        System.out.println("word 4: "+words[3]);

        System.out.println(str.replace(" ", "++"));

        //escape characters
        System.out.println("\"anything\"");//escape double quote

        System.out.println('\''); //escape single quote

        System.out.println("\\"); //escape backslash

        System.out.println("\t word1"); //tab
        System.out.print("word2 \n"); //new line
        System.out.println("word3");

    }
}
