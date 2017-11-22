package x20171004;

import java.io.FileReader;
import java.io.IOException;

public class szemelyiszamellenorzofajlbol {
    public static void main(String[] args){
            int c;
            String [] szemelyiszamok = new String[10];
            String szam = "";
            int lepteto = 0;
        try{
            FileReader fr = new FileReader("C:\\Users\\Tanulo\\Desktop\\valami.txt");
            while((c = fr.read()) != -1){
                if(szam.length() == 11){
                    szemelyiszamok[lepteto] = szam;
                    lepteto++;
                    szam = "";
                }
                szam += (char)c;
            }
            fr.close();
        }catch(IOException ioe){
            System.err.println(ioe.getMessage());
        }
        
        for (int i = 0; i < szemelyiszamok.length; i++) {
            System.out.println(szemelyiszamok[i]);
        }
    }
    
}
