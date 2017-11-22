package x20170913;
import java.util.Scanner;
// @author Szabi
public class Szemelyiazonosito_tombnelkul {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //DEKLARACIO
        int osszeg = 0;
        int ev;
        String evszoveg = "";
        System.out.print("Kerem adja meg a szemelyi azonositojat!: ");
        String bekertadat = sc.next();
        int eu2000 = Character.getNumericValue(bekertadat.charAt(0)); //az ev elso 2 szamjegyenek meghatarozasara
        
        for (int i = 1; i < 3; i++) { //az ev utolso 2 szamjegyenek meghatarozasa
            evszoveg = evszoveg + Character.toString(bekertadat.charAt(i));
        }
        ev = Integer.parseInt(evszoveg);
        
        for (int i = 0; i < 10; i++) { //a bekert adat feldarabolasa, tombbe toltese es az ellenorzo szamhoz szukseges ertek meghatarozasa
            if(ev < 97 && eu2000 < 3 || ev < 97 && eu2000 > 4){                   
                    osszeg = osszeg + (Character.getNumericValue(bekertadat.charAt(i))*(i+1));                
            }else{               
                    osszeg = osszeg + (Character.getNumericValue(bekertadat.charAt(i))*(10-i));               
            }
        } 
        
        if(osszeg % 11 == Character.getNumericValue(bekertadat.charAt(10))){ //az ellenorzo szam meghatarozasa es osszehasonlitasa az eredetivel
            System.out.println("A szemelyi azonosito helyes!");
        }else{
            System.out.println("A szemelyi azonosito helytelen!");
        }
        
    }
    
}
