package forloops;

public class SizeVerilenBirStringdekiMdenOncekiCharacterleriYazdiriniz {
    public static void main(String[] args) {

        //Example 3: Size verilen bir String'deki'm' den onceki characterleri yazdiriniz.
        //           Luxemburg ==> luxe

        String str = "Luxemburg";

        for (int i =0; i <str.length(); i++) {

            char c = str.charAt(i);

            if (c=='m') {
                break;
            }
            System.out.print(c);
        }
        System.out.println("\n");

        //Example 3: Size verilen bir String'deki 'y' den onceki characterleri yazdiriniz.
        //          Ben bir sal yaptim ==> Ben bir sal

        String sum = "Ben bir sal yaptim";

        for (int i=0; i<sum.length(); i++) {

            char ch = sum.charAt(i);

            if (ch=='y') {
                break;
            }
            System.out.print(ch);
        }

    }
}
