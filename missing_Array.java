public class missing_Array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        for (int i = 1; i <= 6; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number: " + i);
            }
        }
    }
}