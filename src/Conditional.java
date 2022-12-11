public class Conditional {

    public static void main(String[] args) {
        Conditional a1 = new Conditional();
        System.out.println(String.format("%d is positive",a1.testQuiz1(20)));
        System.out.println(testQuiz2(8));

        /*
    Syntax
    if (condition | boolean ) {
        // DO or CHECK something if true do this chunk of code
    }

    if (condition | boolean) {
        // the condition (boolean) is true do this chunk of code
    } else if (condition | boolean ) {
        // check the condition true? if true do this chunk of code
    }

     */
    }

    public static int testQuiz1(int number) {
        if (number > 0) {
            return number;
        }
        /*
         Check if the number is positive or not

         Expected Output
         Input Data : 35
         Output: (NUMBER) is positive
         */
        return number;
    }

    public static String testQuiz2(int inputDay) {

        if (inputDay == 1){
            return "Monday";
        } else if (inputDay == 2) {
            return "Tuesday";
        }else if (inputDay == 3) {
            return "Wednesday";
        }else if (inputDay == 4) {
            return "Thursday";
        }else if (inputDay == 5) {
            return "Friday";
        }else if (inputDay == 6) {
            return "Saturday";
        }else if (inputDay == 7) {
            return "Sunday";
        }
        return "No day matches";

        // Input between 1 - 7 return the name of that week day if non matches return "No day matches"
    }


}
