package forloops;

public class BirStringdekimCharacteriHaricTumCharacterleriYazdiriniz {
    public static void main(String[] args) {

        //Example 1: Bir String'deki "m" characteri haric tum characterleri yazdiriniz.
        //           Andromeda ==> Androeda

        //1.yol
        String str = "Andromeda";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch !='m') {
                System.out.print(ch);
            }
        }
        System.out.println("\n");

        //2.yol
        String arr = "Andromeda";

        for (int i =0; i <arr.length(); i++) {

            char a = arr.charAt(i);

            if (a=='m') {
                continue;
            }
            System.out.print(a);
        }

        System.out.println("\n");

        //Example 1: Bir String'deki "h" characteri haric tum characterleri yazdiriniz.
        //           Hanzel ==> anzel

        //1.yol
        String sum = "Hanzel";

        for (int i = 0; i <sum.length(); i++) {

            char c = sum.charAt(i);

            if (c!='H') {
                System.out.print(c);
            }
        }

        System.out.println("\n");
        //2.yol

        String brr = "Hanzel";

        for (int i =0; i< brr.length(); i++) {

            char b = brr.charAt(i);

            if (b=='H') {
                continue;
            }
            System.out.print(b);
        }

    }
}
