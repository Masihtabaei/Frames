import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

/**
 * @author Masih T
 * @version 1.0.0
 * @since 09.02.2022
 *
 * <p>This class is used to show that we can use a class that extends the JFrame as an alternative to instantiating a JFrame-object.</p>
 *
 * <p>Icon by <a href="https://unsplash.com/@sunder_2k25?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Sunder Muthukumaran</a> on <a href="https://unsplash.com/?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a></p>
 */
public class SecondFrame extends JFrame {

    private ImageIcon imageIcon = new ImageIcon("Images/sunder-muthukumaran-fd6K_OFlnRA-unsplash.jpg");

    public SecondFrame() {
        this.setVisible(true);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Title of our Second Frame");
        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
