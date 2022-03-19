package classobjectconstructor;

public class House {

    //variables
    String houseName;
    String houseColor = "white";
    int houseAddress;

    //constructor: accessModifier ClassName(parameters){body}
    //built constructors
    public House(String myHouseName, int myHouseAddress){
        houseName = myHouseName;
        houseAddress = myHouseAddress;
        System.out.println(houseName);
        System.out.println(houseAddress);
    }

    public House(int myHouseAddress){
        houseAddress = myHouseAddress;
        System.out.println(houseAddress);
    }

    //default constructor
    public House(){

    }


    //methods
    public void bedRoom(){
        System.out.println("sleep zzzzzzzzz");
    }

    public void bathRoom(){
        System.out.println("shower lalalalala");
    }

    public void kitchen(){
        System.out.println("eat yummy yummy");
    }

    public void livingRoom(){
        System.out.println("watch tv");
    }
}
