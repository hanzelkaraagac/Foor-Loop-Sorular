package forloops;

public class SizeVerilenBirTamsayininRakamlariToplaminiBulunuz {
    public static void main(String[] args) {

        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz.

        int num = 385;

        int sonuc = 0;

        for (int i = num; i > 0; i = i / 10) {

            sonuc = sonuc + i / 10;

        }
        System.out.print(sonuc);

        System.out.println("\n");

        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz.

        int num2 = 567;

        int toplam =0;

        for (int i = num2; i >0 ; i= i/10) {

            toplam = toplam + i%10;
        }
        System.out.println(sonuc);


    }
}
