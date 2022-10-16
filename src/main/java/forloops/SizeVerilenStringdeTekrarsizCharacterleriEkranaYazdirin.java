package forloops;

public class SizeVerilenStringdeTekrarsizCharacterleriEkranaYazdirin {
    public static void main(String[] args) {

        //Example 8:"Size verilen String'de tekrarsiz characterleri ekrana yazdiriniz.
        //           "Hellooooo Ali " ==>HeAi


        String str = "Hellooooo Ali ";

        for (int i = 0; i <str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch)==str.lastIndexOf(ch)) {

                System.out.print(ch);//boslugu saymadi cunku 2 tane bosluk girildi
            }
            
        }

        System.out.println();

        //Example 8:"Size verilen String'de tekrarsiz characterleri ekrana yazdiriniz.
        //           "Beni ben yapan benim. " ==> Bypm.

        String tekrarsiz = "Beni ben yapan benim. ";

        for (int i = 0; i <tekrarsiz.length(); i++) {

            char c = tekrarsiz.charAt(i);

            if (tekrarsiz.indexOf(c)==tekrarsiz.lastIndexOf(c)) {

                System.out.print(c);//Bypm.
            }

        }
        
    }
}
