package forloops;

public class Birden100eKadar6IleBolunenlerHaricTumTamsayilariEkranaYazdiriniz {
    public static void main(String[] args) {

        //Example 2: 1'den 100'e kadar 6 ile bolunenler haric tum  tam sayilari ekrana yazdiriniz.

        for (int i = 1; i <101; i++) {

            if (i%6==0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
