import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Box;
import java.awt.Container;

public class MaFenetre5 extends JFrame {
    private Box bVert;
    private JButton b1, b2, b3;

    public MaFenetre5() {
        this.setTitle("Exemple strut et glue");
        this.setSize(150, 200);
        Container contenu = this.getContentPane();

        // Crée une boîte verticale
        bVert = Box.createVerticalBox();
        contenu.add(bVert);

        b1 = new JButton("Bouton1");
        bVert.add(b1);

        // Ajoute un espace fixe de 10 pixels
        bVert.add(Box.createVerticalStrut(10));

        b2 = new JButton("Bouton2");
        bVert.add(b2);

        // Ajoute un espacement maximal
        bVert.add(Box.createGlue());

        b3 = new JButton("Bouton3");
        bVert.add(b3);
    }

    public static void main(String[] args) {
        new MaFenetre().setVisible(true);
    }
}