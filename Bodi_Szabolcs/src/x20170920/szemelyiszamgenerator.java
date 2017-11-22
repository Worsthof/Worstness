package x20170920;

import java.util.Random;


//@author Bódi Szabolcs
 
public class szemelyiszamgenerator {

    public static void main(String[] args) {
        int osszeg = 0;
        int ev;
        String evszoveg = "";
        Random rnd = new Random();
        int eu2000;
        int[] szemelyiszam = new int[11];
        String[] kiad = new String[10];
        String kiadseged;
        int lepteto = 0;

        for (int y = 0; y < 10; y++) {
            osszeg = 0;
            evszoveg = "";
            kiadseged = "";
            szemelyiszam[0] = rnd.nextInt(8) + 1;
            szemelyiszam[1] = rnd.nextInt(10);
            szemelyiszam[2] = rnd.nextInt(10);
            szemelyiszam[3] = rnd.nextInt(2);
            szemelyiszam[4] = rnd.nextInt(9) + 1;
            szemelyiszam[5] = rnd.nextInt(2) + 1;
            szemelyiszam[6] = rnd.nextInt(8);
            szemelyiszam[7] = rnd.nextInt(10);
            szemelyiszam[8] = rnd.nextInt(10);
            szemelyiszam[9] = rnd.nextInt(10);

            eu2000 = szemelyiszam[0];

            for (int i = 1; i < 3; i++) { //az ev utolso 2 szamjegyenek meghatarozasa
                evszoveg = evszoveg + szemelyiszam[i];
            }
            ev = Integer.parseInt(evszoveg);

            for (int i = 0; i < 10; i++) { //a bekert adat feldarabolasa, tombbe toltese es az ellenorzo szamhoz szukseges ertek meghatarozasa
                if (ev < 97 && eu2000 < 3 || ev < 97 && eu2000 > 4) {
                    osszeg = osszeg + (szemelyiszam[i]) * (i + 1);
                } else {
                    osszeg = osszeg + (szemelyiszam[i]) * (10 - i);
                }
            }

            szemelyiszam[10] = osszeg % 11;

            for (int i = 0; i < szemelyiszam.length; i++) {
                if (szemelyiszam[10] == 10) {
                    i = szemelyiszam.length;
                } else {
                    System.out.print(szemelyiszam[i]);
                    kiadseged = kiadseged + szemelyiszam[i];
                }
            }
            if (szemelyiszam[10] != 10) {
                System.out.println("");
                kiad[lepteto] = kiadseged;
                lepteto++;
            }

        }
        System.out.println("---------------------------");
        System.out.println("- TÖMB ALUL - PRINT FELÜL -");
        System.out.println("---------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(kiad[i]);

        }

    }

}
