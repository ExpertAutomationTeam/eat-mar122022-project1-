package datatype.primitive;

public class Casting {
    public static void main(String[] args) {

        //up casting is done automatically (widening): byte > short > char > int > long > float > double
        int x = 5;

        System.out.println(x);

        double y = x;

        System.out.println(y);

        //down casting has to be done manually (narrowing): double > float > long > int > char > short > byte
        double z = 7;

        System.out.println(z);

        int w = (int)z;

        System.out.println(w);

    }
}
