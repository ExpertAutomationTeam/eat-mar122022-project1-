package keywords.accessmodifiers;

public class Source {

    //public gives property access from anywhere in the project (outside the package)
    public char apartmentNum = 'b';
    //the variable apartmentNum cann be accessible everywhere in the project

    //private gives property access in the class only
    private int myAge = 25;
    //I cannot access the variable my age outside the class

    //default gives property access only in package
    String phoneNumber = "347 678 3452";

    //protected gives property access in subclass
    //we will be to this in the subclass chapter
}
