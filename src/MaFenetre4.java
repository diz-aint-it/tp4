import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Container;

public class MaFenetre4 extends JFrame {
    private Box bHor;
    private JButton b1, b2;
    private JTextField txt;

    public MaFenetre4() {
        this.setTitle("Exemple BoxLayout horizontal");
        this.setSize(550, 100);
        Container contenu = this.getContentPane();

        // Crée une boîte horizontale
        bHor = Box.createHorizontalBox();
        contenu.add(bHor);

        b1 = new JButton("Bouton1");
        bHor.add(b1);

        txt = new JTextField(20);
        bHor.add(txt);

        b2 = new JButton("Bouton2");
        bHor.add(b2);
    }

    public static void main(String[] args) {
        new MaFenetre().setVisible(true);
    }
}