
package Matrius_Tema3_Pt1_alisongodoy;


public class Tema3_Pt1_AlisonGodoy {

    
    public static void main(String[] args) {
        
        double [] mitjana = new double[7];
        double [] maxima = new double [7];
        
        double notaFinalAlta = 0;
        double notaGlobalAlta = 0;
        double mitjanaNF = 0;
        double maximaNF = 0;
        
        double notes[][] = {
            
            {1.24, 6.53, 7.05, 2.87, 6.86, 5.97, 4.31},
            {2.11, 5.59, 9.00, 8.28, 7.43, 0.68, 4.19},
            {8.82, 4.34, 3.15, 2.74, 1.10, 6.84, 4.46},
            {5.38, 6.34, 5.74, 7.79, 6.34, 9.33, 0.31},
            {2.27, 3.58, 2.92, 0.67, 4.65, 4.88, 2.19},
            {6.59, 9.19, 7.63, 6.74, 5.01, 0.45, 9.50},
            {5.95, 4.51, 0.88, 5.67, 9.07, 8.94, 2.14},
            {7.97, 5.67, 7.31, 8.52, 3.93, 1.21, 9.45},
            {2.61, 0.37, 2.59, 9.47, 4.27, 5.54, 4.85},
            {5.91, 3.22, 6.43, 6.83, 7.35, 7.02, 5.13},
            {9.43, 7.54, 0.59, 8.49, 9.70, 9.76, 5.20},
            {1.62, 6.51, 1.91, 5.07, 1.32, 0.79, 2.05},
            {1.52, 9.55, 5.43, 0.15, 6.22, 6.90, 1.40},
            {2.28, 1.21, 8.67, 1.90, 3.84, 5.37, 4.52},
            {2.52, 9.69, 5.32, 8.88, 3.00, 3.88, 6.99},
            {2.18, 2.13, 1.32, 3.50, 9.93, 2.65, 2.85},
            {6.67, 5.25, 0.05, 8.32, 1.84, 3.04, 5.76},
            {8.37, 3.80, 4.51, 4.48, 2.88, 4.82, 8.78},
            {8.62, 8.82, 1.22, 5.22, 8.55, 6.76, 2.25},
            {7.59, 9.65, 5.71, 9.23, 5.70, 9.84, 7.77},
            {3.74, 4.60, 7.58, 5.55, 0.09, 8.18, 6.54},
            {0.21, 3.88, 1.03, 8.38, 2.71, 9.80, 8.57},
            {8.24, 3.10, 3.41, 1.27, 9.94, 3.99, 0.51},
            {9.88, 4.24, 1.49, 7.51, 0.28, 3.61, 5.07},
            {8.54, 1.68, 1.61, 8.16, 6.59, 6.25, 7.67},
            {4.55, 3.11, 9.75, 5.91, 1.42, 1.63, 8.65},
            {2.54, 4.37, 2.45, 0.95, 4.71, 7.41, 6.75},
            {2.11, 2.89, 0.76, 1.86, 3.63, 2.64, 5.43},
            {1.02, 1.97, 9.37, 5.38, 3.19, 1.09, 0.18},
            {0.39, 0.23, 5.15, 1.66, 1.66, 3.91, 6.96}};
    
        System.out.println("           | Pt1     Pt2     Pe2     Pt3     Pt4     Pt5     Pe3   |  Nota NF2");
        System.out.println("___________|_______________________________________________________|___________");
        
        for (int i = 0; i < notes.length; i++) {
            
            System.out.printf("Alumne %2d", i + 1);
            System.out.print("  |");
            
            double nf = 
                    notes[i][0] * 0.1 +
                    notes[i][1] * 0.1 + 
                    notes[i][2] * 0.25 + 
                    notes[i][3] * 0.1 + 
                    notes[i][4] * 0.1 + 
                    notes[i][5] * 0.1 + 
                    notes[i][6] * 0.25;
            
            if (nf > notaFinalAlta){
                
                notaFinalAlta = nf;
            }
            
            if (nf > maximaNF) {
                
                maximaNF = nf;
            }
            
            for (int j = 0; j < notes[i].length; j++) {
                
                System.out.printf("%6.2f", notes[i][j]);
                System.out.print(" |");
                
                mitjana [j] += notes [i][j];
                
                if (notes [i][j] > notaGlobalAlta) {
                    
                    notaGlobalAlta = notes[i][j];
                }
                
                if (i == 0 || notes [i][j] > maxima[j]) {
                    
                    maxima [j] = notes [i][j];
                }
            }
            
            System.out.printf("%6.2f", nf);
            System.out.println("");
            
            mitjanaNF = mitjanaNF + nf;
        }
        
        
        
        //Nota mitjana
        System.out.println("___________|_______________________________________________________|___________");
        
        System.out.print("Mitjana    |");
        
        for (int i = 0; i < mitjana.length; i++) {
            
            System.out.printf("%6.2f", mitjana [i]/notes.length);
            System.out.print(" |");
            
        }
        System.out.printf("%6.2f", mitjanaNF / notes.length);
        System.out.println("");
        
        //Nota mes alta
        System.out.println("___________|_______________________________________________________|___________");
        
        System.out.print("Mes Alta   |");
        
        for (int i = 0; i < maxima.length; i++) {
            
            System.out.printf("%6.2f", maxima [i]);
            System.out.print(" |");
            
        }
        System.out.printf("%6.2f", maximaNF);
        System.out.println("");
        
        System.out.println("___________|_______________________________________________________|___________");
        
        System.out.println("");
        System.out.println("Nota Global mes alta: " + notaGlobalAlta);
    }
}