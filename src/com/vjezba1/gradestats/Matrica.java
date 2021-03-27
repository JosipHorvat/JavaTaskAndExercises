package com.vjezba1.gradestats;

import javax.swing.*;

public class Matrica {
       /*
   // *************** SPIRALNA MATRICA ***************
          Matrica pero = new Matrica();
          pero.spirala();

        */

    public void spirala() {

        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("************CIKLICNA MATRICA**************");

        int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj:"));
        int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Upisi broj:"));

        int[][] spirala = new int[prviBroj][drugiBroj];
        {


            int vrijednost = 1;
            int minStupac = 0;
            int minRed = 0;
            int maxStupac = drugiBroj - 1;
            int maxRed = prviBroj - 1;


            while (vrijednost <= prviBroj * drugiBroj) {

                for (int i = minStupac; i <= maxStupac; i++) {
                    spirala[maxRed][i] = vrijednost;
                    vrijednost++;
                    if (vrijednost > prviBroj * drugiBroj) {
                        break;
                    }
                }

                for (int i = maxRed - 1; i >= minRed; i--) {
                    spirala[i][maxStupac] = vrijednost;
                    vrijednost++;
                    if (vrijednost > prviBroj * drugiBroj) {
                        break;
                    }
                }

                for (int i = maxStupac - 1; i >= minStupac; i--) {
                    spirala[minRed][i] = vrijednost;
                    vrijednost++;
                    if (vrijednost > prviBroj * drugiBroj) {
                        break;
                    }
                }
                for (int i = minStupac + 1; i < maxStupac; i++) {
                    spirala[i][minStupac] = vrijednost;
                    vrijednost++;
                    if (vrijednost > prviBroj * drugiBroj) {
                        break;
                    }
                }
                minStupac++;
                maxStupac--;
                minRed++;
                maxRed--;

            }
            for (int i = 0; i < prviBroj; i++) {
                for (int j = 0; j < drugiBroj; j++) {
                    System.out.print(spirala[i][j] + "\t");
                }
                System.out.println();

            }
            System.out.println("**************************");
            System.out.println();

        }
        }
}
