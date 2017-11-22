package x20171011_Kivetelkezeles;

public class verem_exception {

    public static class Verem_Exception extends Exception {

        public Verem_Exception(String hibaüzenet) {
            super(hibaüzenet);
        }
    }

    public static class Verem {

        private final static int MERET = 3; //a verem mérete
        private int[] verem = new int[MERET]; //a verem
        private int mutato = 0; //verem mutató

        public void betesz(int i) throws Verem_Exception {
            if (mutato < MERET) {
                verem[mutato] = i; //a szám elhelyezésea veremben
                mutato++; //mutato növelése
            } else {
                throw new Verem_Exception("A verem megtelt!");
            }
        }

        public int kivesz() throws Verem_Exception {
            if (mutato == 0) {
                throw new Verem_Exception("A verem üres!");
            }
            mutato--;
            int i = verem[mutato];
            System.out.println("A szám (" + i + ") a veremből kivéve!");
            return i;
        }
    }
    
    public static void main(String[] args) {
        Verem v = new Verem();
        try{
            v.betesz(21);
            v.betesz(52);
            v.betesz(77);
            v.betesz(99);
        }catch(Verem_Exception e){
            System.out.println("Hiba! - " + e.getMessage());
        }
        
        try{
            v.kivesz();
            v.kivesz();
            v.kivesz();
            v.kivesz();
        }catch(Verem_Exception e){
            System.out.println("Hiba! - " + e.getMessage());
        }
        
    }

}
