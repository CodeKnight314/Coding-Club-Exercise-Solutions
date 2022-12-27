public class Exercise_four {
    public static void main(String[] args){
        boolean boolean_value = true;
        boolean expression_one_nested = (10 != 9) == true;
        boolean expression_two_nested = (10 != 9) == (boolean_value == true);

        System.out.println(expression_one_nested);
        System.out.println(expression_two_nested);
    }
}
