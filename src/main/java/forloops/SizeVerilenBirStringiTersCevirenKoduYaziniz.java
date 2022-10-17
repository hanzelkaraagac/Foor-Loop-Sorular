package forloops;

public class SizeVerilenBirStringiTersCevirenKoduYaziniz {
    public static void main(String[] args) {

        // ****INTERVIEW SORUSU****
        //Example 4: size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Kaba" ==> "abaK"

        String str ="Kaba";

        String ters = "";

        for (int i = str.length()-1 ; i>-1; i--) {

            char c = str.charAt(i);

            ters = ters+c;
        }
        System.out.print(ters);

        System.out.println();

        // ****INTERVIEW SORUSU****
        //Example 4: size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Hanzel" ==> "leznaH"

        String sum = "Hanzel";

        String terss = "";

        for (int j = sum.length()-1; j >-1 ; j--) {

            char ch = sum.charAt(j);

            terss = terss + ch;
            System.out.print(ch);
        }

    }
}
