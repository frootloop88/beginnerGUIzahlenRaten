import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void  main(String[] args) {
        // Randon Zahl generieren:
        Random rd = new Random();

        // Variables deklarieren:


        // Scanner injecten:
        int versuche = 1;
        int eingabe;
        int rng = rd.nextInt(1,100);

        while (true) {
            JOptionPane.showMessageDialog(null, rng);
            eingabe = Integer.parseInt(JOptionPane.showInputDialog("Gebe eine Zahl ein oder drücke die 0 zum beenden"));


            if (eingabe == 0) {
                break;
            }

            if (eingabe == rng) {
                JOptionPane.showMessageDialog(null,"Meddl! " + " Du hast " + versuche + " Versuche gebraucht!");
                break;
            } else{
                if (eingabe <rng) {
                    JOptionPane.showMessageDialog(null, "größer");
                } else {
                    JOptionPane.showMessageDialog(null, "kleiner");
                }
                // Anzahl der Versuche wird gezaehlt:
                versuche++;
            }
        }



    }
}

// Was haben wir gelernt?
// - bei generierten zahlen (bzw. Spiel - Zahlenraten - niemals die rng generierte Zahl in die Schleife packen!!