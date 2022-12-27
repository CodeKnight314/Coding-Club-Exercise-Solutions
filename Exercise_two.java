public class Exercise_two {
    public static void main(String[] args){
        String name1 = "Bob";
        String name2 = "Wolfeschlegelsteinhausenbergerdorff";
        String name3 = "Bob";

        boolean expression1 = name1.length() == name2.length();
        boolean expression2 = name1.length() >= name3.length();
        boolean expression3 = name1 == name3;

        System.out.println(expression1);
        System.out.println(expression2);
        System.out.println(expression3);
    }
}
