import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

public class Calculatrice extends JFrame {

    public Calculatrice() {
        this.setTitle("Calculatrice");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Configuration du layout principal
        this.setLayout(new BorderLayout());

        // Zone d'affichage
        JTextField ecran = new JTextField("0");
        ecran.setHorizontalAlignment(JTextField.RIGHT);
        ecran.setFont(new Font("Arial", Font.BOLD, 24));
        this.add(ecran, BorderLayout.NORTH);

        // Panel pour les boutons
        JPanel panelBoutons = new JPanel(new GridLayout(5, 4, 5, 5));

        // Première ligne
        panelBoutons.add(new JButton("C"));
        panelBoutons.add(new JButton("±"));
        panelBoutons.add(new JButton("%"));
        panelBoutons.add(new JButton("÷"));

        // Deuxième ligne
        panelBoutons.add(new JButton("7"));
        panelBoutons.add(new JButton("8"));
        panelBoutons.add(new JButton("9"));
        panelBoutons.add(new JButton("×"));

        // Troisième ligne
        panelBoutons.add(new JButton("4"));
        panelBoutons.add(new JButton("5"));
        panelBoutons.add(new JButton("6"));
        panelBoutons.add(new JButton("-"));

        // Quatrième ligne
        panelBoutons.add(new JButton("1"));
        panelBoutons.add(new JButton("2"));
        panelBoutons.add(new JButton("3"));
        panelBoutons.add(new JButton("+"));

        // Cinquième ligne
        panelBoutons.add(new JButton("0"));
        panelBoutons.add(new JButton("."));
        panelBoutons.add(new JButton(" "));
        panelBoutons.add(new JButton("="));

        this.add(panelBoutons, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculatrice().setVisible(true);
    }
}