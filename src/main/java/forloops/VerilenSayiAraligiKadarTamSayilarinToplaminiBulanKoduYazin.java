package forloops;

public class VerilenSayiAraligiKadarTamSayilarinToplaminiBulanKoduYazin {
    public static void main(String[] args) {

        //Example 1: 3'den 6 ya kadar tam sayilarin toplamini bulan kodu yaziniz.

        int sum = 0;

        for (int i = 3; i <7 ; i++) {

            sum = sum + i;


        }
        System.out.print(sum);

        System.out.println();

        //Example 1: 15'den 10 ya kadar tam sayilarin toplamini bulan kodu yaziniz.

        int sa = 0;

        for (int i = 15; i > 9 ; i--) {

            sa = sa + i;

        }
        System.out.print(sa);

    }
}
