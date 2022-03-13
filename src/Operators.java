public class Operators {
    public static void main(String[] args) {

       //arithmetic operator: +, -, *, /, %, ++, --
        System.out.println(3+6); //addition
        System.out.println(6-3); //subtraction
        System.out.println(3*6); //multiplication
        System.out.println(6/3); //division
        System.out.println(7%3); //remainder
        int number1 = 3;
        System.out.println(++number1); //incrementation by 1
        int number2 = 3;
        System.out.println(--number2); //decrementation by 1
        System.out.println(number1+number2);

        //+ sign in String gives us concatenation
        String str1 = "Hello";
        String str2 = "World";
        int number = 10;
        System.out.println(str1+" "+str2);
        System.out.println(str1+number);

       //assignment operators: =, +=, -=, *=, /+, %=
        int x;
        x = 5; //assigning 5
        x += 5; //x = x+5
        System.out.println(x);

       //comparison operators: ==, !=, >, <, >=, <=
        System.out.println(5 == 5); //equal to
        System.out.println(5 != 5); //not equals to
        System.out.println(5 > 5); //greater than
        System.out.println(5 < 5); //less then
        System.out.println(5 >= 5); //greater than or equals to
        System.out.println(5 <= 5); //less than or equals to

       //logical operators: &&, ||, !
        System.out.println(x>0 && x<15); //and
        System.out.println(x<0 || x<15); //or
        System.out.println(!(x<15)); //not

    }
}
