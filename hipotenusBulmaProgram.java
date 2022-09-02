import java.util.Scanner;

public class hipotenusBulmaProgram {
    private static Scanner hipo;

    public static void main(String[] args) {
        //Değişkenler tanımlarnıyor.
        int a, b;
        double c;

        //Verileri alıyoruz.

        hipo = new Scanner(System.in);
        System.out.print("a Kenarı :");
        a = hipo.nextInt();

        System.out.print("b Kenarı :");
        b = hipo.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :"+ c);
    }
}
//https://app.patika.dev/semihhato