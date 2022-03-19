package classobjectmethod;

public class World {

    /*
    java is object oriented programming (OOP)
    java is all about classes and objects
    java class is a blueprint or template for object
     */

    //class properties (variables or methods)
    public String name = "John Doe";
    public int age = 20;
    char gender = 'M';

    //method or function is a reusable block of code that runs only when it is called
    //non-return method
    //syntax: accessModifier methodType methodName(parameters) { body }
    //non-return method without parameters
    public void myMethod(){
        System.out.println("my first method print few lines");
        System.out.println("this is my second line to print");
        System.out.println("third and final line to print");
    }

    //non-return method with parameters
    public void addition(int a, int b){
        int total = a + b;
        System.out.println(total);
    }

    //return method
    //syntax: accessModifier returnDataType methodName(parameters) { body return valueToReturn }
    //return method without parameters
    public int getMyAge(){
        int yearOfBorn = 1990;
        int currentYear = 2022;
        int myAge = currentYear - yearOfBorn;
        return myAge;
    }

    //return method with parameters
    public int getAnyAge(int yearOfBorn, int currentYear){
        int myAge = currentYear - yearOfBorn;
        return myAge;
    }

}
