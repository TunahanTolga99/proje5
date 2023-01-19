import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi,sum = 0, sayim = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz ! ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            if (i % 3 == 0 & i % 4 == 0){
                sum +=i;
                sayim++;
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------");
        ortalama = sayi / sayim;
        System.out.println("Ortalama" + ortalama);
    }
    }



