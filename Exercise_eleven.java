public class Exercise_eleven {
    public static void main(String[] args){
        int number = 1231943712;

        while(number != 1){
            if(number % 2 == 0)
                number = number / 2;
            else
                number = 3 * number + 1;

            System.out.println(number);
        }

        //It's really cool! Most commonly referred as the Collatz conjecture, the conjecture suggests that
        //any number would eventually end up as one.
    }
}
