public class Exercise_twelve {
    public static void main(String[] args){
        boolean p = false;
        boolean q = false;

        //A simple demonstration of xor logic gate
        if((p && !q) || (!p && q))
            System.out.println("True!");
        else
            System.out.println("False");
    }
}
