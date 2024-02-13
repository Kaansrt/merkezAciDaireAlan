import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;
        System.out.print("Yarıcap giriniz : ");
        r = input.nextInt();
        double alan,cevre;
        alan = pi * (r*r);
        cevre = 2*pi*r;
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : "+ cevre);
        System.out.println("Merkez açı giriniz : ");
        //ODEV
        int merkezAci= input.nextInt();
        merkezAci = (merkezAci > 0 && merkezAci < 361) ? merkezAci : 0;
        double merkezAciAlan = (pi * (r*r)*merkezAci )/360;
        System.out.print("Alan : "+merkezAciAlan);

    }
}