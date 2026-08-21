public class largest_elementarray {
    public static void main(String [] args ){
        int arr [] ={32,57,78,7,86,78,78,78,887,7};
            int largest = arr  [0];
            for(int i =1; i<arr.length;i++){
                if (arr[i] > largest){
                    largest=arr[i];

                }
            }
            System.out.println("so the largest number is "+largest);

    }

}
