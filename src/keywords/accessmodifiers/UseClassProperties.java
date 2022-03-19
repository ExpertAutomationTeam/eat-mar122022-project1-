package keywords.accessmodifiers;

import classobjectmethod.World;

public class UseClassProperties {

    public static void main(String[] args) {
        //create object of world class - I can access public variable name
        World myWorld = new World();

        System.out.println(myWorld.name);

        //create object of source class I can have access to public apartmentNum and default phoneNumber
        Source mySource = new Source();
        System.out.println(mySource.apartmentNum);//public property
        System.out.println(mySource.phoneNumber);//default property
    }

}
