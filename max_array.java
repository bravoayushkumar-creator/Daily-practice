public class max_array {
    public static void main(String[] args){
        int[] arr={6,7,8,8,6,6,5,6,8,987};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);

    }

}
