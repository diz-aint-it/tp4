import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

public class MaFenetre extends JFrame {
    public static int NBOUTONS = 5;
    private JButton boutons[];

    public MaFenetre() {
        this.setTitle("Exemple BorderLayout");
        this.setSize(300, 180);
        Container contenu = this.getContentPane();
        boutons = new JButton[NBOUTONS];

        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("Bouton " + i);
        }


        contenu.add(boutons[0]); // Centre par défaut
        contenu.add(boutons[1], BorderLayout.NORTH);
        contenu.add(boutons[2], BorderLayout.SOUTH);
        contenu.add(boutons[3], BorderLayout.WEST);
        contenu.add(boutons[4], BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new MaFenetre().setVisible(true);
    }
}