import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;

public class MaFenetre2 extends JFrame {
    public static int NBOUTONS = 5;
    private JButton boutons[];

    public MaFenetre2() {
        this.setTitle("Exemple FlowLayout");
        this.setSize(350, 180);
        Container contenu = this.getContentPane();

        contenu.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        boutons = new JButton[NBOUTONS];
        int n = 1;

        for (int i = 0; i < NBOUTONS; i++) {
            boutons[i] = new JButton("Bouton " + n);
            n *= 10;
            contenu.add(boutons[i]);
        }
    }

    public static void main(String[] args) {
        new MaFenetre().setVisible(true);
    }
}