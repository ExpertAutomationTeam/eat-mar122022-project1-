package classobjectconstructor;

public class TestHouse {
    public static void main(String[] args) {

        House myHouse = new House("the melenium", 5769);

        myHouse.bathRoom();
        myHouse.bedRoom();
        myHouse.livingRoom();
        myHouse.kitchen();

        System.out.println(myHouse.houseColor);

        House yourHouse = new House("Eliza", 6786);

        yourHouse.kitchen();
        yourHouse.bedRoom();
        yourHouse.bedRoom();
        yourHouse.bedRoom();
        yourHouse.livingRoom();
        yourHouse.kitchen();

        House herHouse = new House(564);

        herHouse.livingRoom();
        herHouse.kitchen();
        herHouse.bathRoom();

    }
}
