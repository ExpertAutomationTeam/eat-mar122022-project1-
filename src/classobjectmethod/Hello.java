package classobjectmethod;

public class Hello {
    public static void main(String[] args) {
        //object: is ain instance of a class
        //syntax: ClassName objectName = new ClassName();
        //the object inherits all class properties
        World myObject = new World();

        System.out.println(myObject.name);
        int extraAge = 10;
        int totalAge = myObject.age+extraAge;
        System.out.println(totalAge);

        //what is the difference between return and non-return method
        //non-return method cannot be assigned to a variable
        myObject.myMethod();
        myObject.addition(345, 543);

        //return method can be assigned to a variable
        int myAge = myObject.getMyAge();
        System.out.println(myAge);

        int peopleAge = myObject.getAnyAge(1985, 2022);
        System.out.println(peopleAge);
    }
}
