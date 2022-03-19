package conditions;

public class ConditionStatements {
    public static void main(String[] args) {
        int number1 = 0;
        //if(condition){result}
        if(number1 == 0){
            System.out.println("if statement:");
            System.out.println("the number is null");
        }

        int number2 = -5;
        //if(condition){result1} else {result2}
        if(number2 > 0){
            System.out.println("if else statement:");
            System.out.println("the number is positive");
        }else{
            System.out.println("if else statement:");
            System.out.println("the number is negative");
        }

        int number3 = -8;
        //if(condition1){result1} else if(condition2){result2} ... else {result n}
        if (number3 > 0) {
            System.out.println("if else if ... else statement:");
            System.out.println("the number is positive");
        }else if(number3 < 0){
            System.out.println("if else if ... else statement:");
            System.out.println("the number is negative");
        }else {
            System.out.println("if else if ... else statement:");
            System.out.println("the number is null");
        }

    }
}
