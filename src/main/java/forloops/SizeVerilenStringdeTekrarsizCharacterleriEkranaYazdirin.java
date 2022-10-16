package forloops;

public class SizeVerilenStringdeTekrarsizCharacterleriEkranaYazdirin {
    public static void main(String[] args) {

        //Example 8:"Size verilen String'de tekrarsiz characterleri ekrana yazdiriniz.
        //           "Hellooooo Ali " ==>HeAi


        String str = "Hellooooo Ali ";

        for (int i = 0; i <str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch)==str.lastIndexOf(ch)) {

                System.out.print(ch + " ");
            }
            
        }

        
        
    }
}
