package keywords.breakcontinuekws;

public class BreakKw {
    public static void main(String[] args) {

        //break keyword: stop the loop at the given condition
        for(int i = 0; i < 1000000; i++){
            if(i == 50){
                break;
            }
            System.out.println(i);
        }

    }
}
