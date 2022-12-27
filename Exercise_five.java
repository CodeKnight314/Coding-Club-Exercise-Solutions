public class Exercise_five {
    public static void main(String[] args){
        int num = 10;
        int num2 = 23123;
        int num3 = -13213;

        if(num > num2){
            if(num > num3)
                System.out.println(num);
            else
                System.out.println(num3);
        } else {
            if(num2 > num3)
                System.out.println(num2);
            else
                System.out.println(num3);
        }

        // a shorter version of this using Math.max (We will cover the Math library soon)
        int max_num = Math.max(num, Math.max(num2, num3));
        System.out.println(max_num);
    }
}
