package keywords.breakcontinuekws;

public class ContinueKw {
    public static void main(String[] args) {

        //continue keyword: stop the loop at given condition then resume
        for (int i = 0; i < 10 ; i++) {
            if(i > 4 && i < 8){
                continue;
            }
            System.out.println(i);
        }

    }
}
