import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class DispositionBoutons extends JFrame {

    public DispositionBoutons() {
        this.setTitle("Exemples de gestionnaires de mise en forme");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenu = this.getContentPane();
        contenu.setLayout(new BorderLayout());

        // Partie BoxLayout Horizontal
        Box boxHorizontale = Box.createHorizontalBox();
        boxHorizontale.add(new JButton("Bouton 1"));
        boxHorizontale.add(new JButton("Bouton 2"));
        boxHorizontale.add(new JButton("Bouton 3"));
        contenu.add(boxHorizontale, BorderLayout.NORTH);

        // Partie GridLayout
        JPanel panelGrid = new JPanel(new GridLayout(2, 3));
        for (int i = 1; i <= 6; i++) {
            panelGrid.add(new JButton("Bin " + i));
        }
        contenu.add(panelGrid, BorderLayout.CENTER);

        // Partie BoxLayout Vertical
        Box boxVerticale = Box.createVerticalBox();
        boxVerticale.add(new JButton("Premier"));
        boxVerticale.add(new JButton("Deuxième"));
        boxVerticale.add(new JButton("Troisième"));
        contenu.add(boxVerticale, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new DispositionBoutons().setVisible(true);
    }
}