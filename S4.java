import java.util.Scanner;

public class S4 {

    static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        if (number < 0 || number > 9999) {
            return "Number out of range (Max 9999)";
        }
        String words = "";
        if ((number / 1000) > 0) {
            words += units[number / 1000] + " Thousand ";
            number %= 1000;
        }
        if ((number / 100) > 0) {
            words += units[number / 100] + " Hundred ";
            number %= 100;
        }
        if (number > 0) {
            if (number < 10) {
                words += units[number];
            } else if (number < 20) {
                words += teens[number - 10];
            } else {
                words += tens[number / 10] + " " + units[number % 10];
            }
        }
        return words.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println(convertNumberToWords(number));
    }
}