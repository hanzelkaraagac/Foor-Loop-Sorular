package forloops;

public class OnDortden5eKadarTumCiftSayilariYazdiriniz {
    public static void main(String[] args) {

        //Example 4: 14 den 5 ye kadar tum cift  sayilari ekrana yazdiran kodu yaziniz

        //1.yol
        for (int i = 14; i >4 ; i-=2) {

            System.out.print(i + " ");

        }
        System.out.println();
        //2.yol

        for (int i = 14; i >4 ; i-=2) {

            if (i%2==0) {
                System.out.print(i + " ");
            }

        }

    }
}
