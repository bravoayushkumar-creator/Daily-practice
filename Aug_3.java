import java.util.Scanner;

public class Aug_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number>>");
        int[]karan=new int[7];
        for (int i=0;i<7;i++){
            karan[i]=sc.nextInt();

        }
        for (int i=0;i<7;i++){
            System.out.print(2*karan[i]+" ");
        }


    }

}
