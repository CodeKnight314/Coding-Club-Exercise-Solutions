public class Exercise_ten {
    public static void main(String[] args){
        String[] arr = {"Hello","from","Exercise","ten",":D"};

        for(int i = 0; i < 5; i++){
            if(arr[i].indexOf("e") != -1 || arr[i].indexOf("o") != -1){
                System.out.println("vowel found");
            }else{
                System.out.println("no vowel");
            }
        }
    }
}
