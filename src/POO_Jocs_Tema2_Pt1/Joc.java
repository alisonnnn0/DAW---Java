    
    package POO_Jocs_Tema2_Pt1;

    
    public abstract class Joc {

        private int vides;
        private final int videsInicials;
        private static int record = 0;


        //Constructor
        public Joc(int videsInicials) {

            if (videsInicials > 10) videsInicials = 10;

            this.vides = videsInicials;
            this.videsInicials = videsInicials;
        }


        //Getters
        public int getVides() {

            return vides;
        }

        public int getVidesTotal() {

            return videsInicials;
        }

        public int getRecord() {

            return record;
        }


        //Metodes
        public void mostraVidesRestants(){

            System.out.println("Vides restants: " + vides);
        }

        public boolean treuVida() {

            vides--; 
            return vides > 0;
        }

        public void reiniciaPartida() {

            vides = videsInicials;
        }

        public void actualitzaRecord() {

            int videsGastades = videsInicials - vides;
            int puntuacio = 10 - videsGastades;

            if (puntuacio > record){

                record = puntuacio;

                System.out.println("S'ha batut el record! Nou record de: " + record);

            } else if (puntuacio == record){

                System.out.println("S'ha aconseguit el record!");
            } 
            //Si es menor no hacemos nada
        }

        
        //Metodes abstractes
        public abstract boolean heGuanyat();

        public abstract void juga();
    }
