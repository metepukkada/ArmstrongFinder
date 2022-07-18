import java.util.Scanner;

public class ArmstrongFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = -1, tempNumber;
        int numberValue;
        int result = 0;
        int digit = 0;
        int tempDigit;
        int basPow = 1;
        int eksiltme;
        int firstNumber;
        while (number < 0) {
            System.out.print("Bir Sayı Giriniz: ");
            number = input.nextInt();
            if(number < 0){
                System.out.println("Lütfen Pozitif Sayı Giriniz!");
            }

        }

        tempNumber = number;
        eksiltme = number;

        for (int a = 1; a <= eksiltme; eksiltme--) {
            number = eksiltme;
            tempNumber = eksiltme;
            while (tempNumber != 0) {
                tempNumber /= 10;
                digit++;
            }
            tempDigit = digit;
            tempNumber = number;

            while (tempNumber != 0) {
                basPow = 1;
                tempDigit = digit;
                numberValue = tempNumber % 10;
                for (int z = 1; z <= tempDigit; z++) {
                    basPow *= numberValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (number == result) {
                System.out.println(number + " Sayısı Bir Armstrong Sayıdır.");
            }

            digit = 0;
            result = 0;
            basPow = 1;

        }
    }
}
