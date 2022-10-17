package forloops;

public class AltidanUceKadarTamSayilarinCarpimiBulanKoduYaziniz {
    public static void main(String[] args) {

        //Example 1: 6'den 3 ya kadar tam sayilarin carpimi bulan kodu yaziniz.

        int sum = 1;

        for (int i = 6; i > 2; i--) {

            sum = sum * i;

        }

        System.out.print(sum);

        System.out.println("\n");

        //Example 2: 20'den 31'e kadar tam sayilarin carpimi bulan kodu yaziniz.

        int carpim = 0;

        for (int i = 20; i <32 ; i++) {

            sum = sum + i;

        }
        System.out.println(sum);

    }
}
