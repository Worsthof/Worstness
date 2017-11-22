package x20170913;
import java.util.Scanner;
// @author Bodi Szabolcs 
public class Szemelyiazonosito {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //DEKLARACIO
        int [] szemelyiazonosito = new int[11];
        int osszeg = 0;
        int ev;
        String evszoveg = "";
        System.out.print("Kerem adja meg a szemelyi azonositojat!: ");
        String bekertadat = sc.next();
        int eu2000 = Character.getNumericValue(bekertadat.charAt(0)); //az ev elso 2 szamjegyenek meghatarozasara
        
        for (int i = 1; i < 3; i++) { //illeto szuletesi evenek meghatarozasa
            evszoveg = evszoveg + Character.toString(bekertadat.charAt(i));
        }
        ev = Integer.parseInt(evszoveg);
        
        for (int i = 0; i < 11; i++) { //a bekert adat feldarabolasa, tombbe toltese es az ellenorzo szamhoz szukseges ertek meghatarozasa
            szemelyiazonosito[i] = Character.getNumericValue(bekertadat.charAt(i));
            if(ev < 97 && eu2000 < 3 || ev < 97 && eu2000 > 4){   
                if(i < 10){
                    osszeg = osszeg + (szemelyiazonosito[i]*(i+1));
                }
            }else{
                if(i < 10){
                    osszeg = osszeg + (szemelyiazonosito[i]*(10-i));
                }
            }
        } 
        
        if(osszeg % 11 == szemelyiazonosito[10]){ //az ellenorzo szam meghatarozasa es osszehasonlitasa az eredetivel
            System.out.println("A szemelyi azonosito helyes!");
        }else{
            System.out.println("A szemelyi azonosito helytelen!");
        }
    } 
}
