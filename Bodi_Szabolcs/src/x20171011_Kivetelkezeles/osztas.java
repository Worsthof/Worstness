package x20171011_Kivetelkezeles;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class osztas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sikeres = false;
        double hanyados;
        int osztando;
        int oszto;
        try {
            System.out.println("Kérem az osztandót!");
            osztando = sc.nextInt();
            System.out.println("Kérem az osztót!");
            oszto = sc.nextInt();
            hanyados = (double)osztando / (double)oszto;
            System.out.println(osztando + " / " + oszto + " = " + hanyados);
            sikeres = true;
        } catch (Exception e) {
            System.out.println("Hiba: " + e.getMessage());
        } finally {
            if (sikeres) {
                System.out.println("Az osztás lezajlott!");
            } else {
                System.out.println("Az osztás sikertelen!");
            }
        }
    }

}
