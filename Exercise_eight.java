public class Exercise_eight {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i;
        }

        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
