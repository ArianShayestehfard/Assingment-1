import java.util.Scanner;
public class S2 {

    public static void main(String[] args) {

        int x,i,j=0;

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(i=1 ; i<x ; i++){

            if(x%i==0){

                j+=i;
            }
        }
         if (j==x){
            System.out.println("Yes");
         }
          else{
            System.out.println("No");
          }
    }
}
