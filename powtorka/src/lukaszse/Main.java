package lukaszse;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        LosowanieLiczb losowanie;

        JOptionPane.showMessageDialog(null, "Witamy");
        int dG = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj dolną granice: "));
        int gG = Integer.parseInt(JOptionPane.showInputDialog(null, "Podaj górną granice: "));

        losowanie = new LosowanieLiczb(6, dG, gG);

        JOptionPane.showMessageDialog(null, Arrays.toString(losowanie.getTablicaLiczb()));

    }
}
