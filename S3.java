import java.util.Scanner;
public class S3 {

    public static void main(String[] args) {

        int rev=0, n ,rem, i ;

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        i=n;

        while (n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }

         if (rev==i){
            System.out.println("It`s Palindrome");

         }
          else{
            System.out.println("It`s not Palindrome");

          }
    }

}
