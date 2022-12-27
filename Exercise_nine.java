import java.util.Arrays;

public class Exercise_nine {
    public static void main(String[] args){
        int[] arr = new int[21];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        double sum = 0;
        for(int x : arr){
            sum+=x;
        }

        double avg_value = sum / arr.length;

        System.out.println(sum);
        System.out.println(avg_value);
    }
}
