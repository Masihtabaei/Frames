import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;

/**
 * @author Masih T
 * @version 1.0.0
 * @since 09.02.2022
 *
 * <b>Frames</b>
 *
 *
 * <p>This class is used to learn following topics:</p>
 * <ul>
 * <li> How can we work with frames (JFrame) in Swing? </li>
 * <li> How can we create/instantiate a frame? </li>
 * <li> How can we set some properties of a frame such as visibility, size, title, resizability, close operation, icon and background color? </li>
 * </ul>
 *
 * <p>Icon by <a href="https://unsplash.com/@sunder_2k25?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Sunder Muthukumaran</a> on <a href="https://unsplash.com/?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a></p>
 */
public class MainFrame {
    public static void main(String[] args) {

        ImageIcon iconOfFrame = new ImageIcon("Images/sunder-muthukumaran-fd6K_OFlnRA-unsplash.jpg"); // Creating a new image icon that will be used later as the icon of our frame

        JFrame mainFrame = new JFrame(); // Creating (Instantiating) a new JFrame-object
        mainFrame.setVisible(true); // Making our frame visible (Initial-State: Hidden)
        mainFrame.setSize(420, 420); // Setting the width and height of our frame
        mainFrame.setTitle("Title of our Frame"); // Setting the title of our frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing the frame AND the application (mot only hiding it) | Default-Value: HIDE_ON_CLOSE
        // mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); -> We can avoid closing the window by using this constant !
        // mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); -> Differences between DISPOSE_ON_CLOSE and EXIT_ON_CLOSE: https://coderanch.com/t/340183/java/DISPOSE-CLOSE-EXIT-CLOSE
        mainFrame.setResizable(false); // Avoiding the resizing
        mainFrame.setIconImage(iconOfFrame.getImage()); // Changing the icon of our frame

        /* Setting the background color of our frame in various ways */
        Container contentPane = mainFrame.getContentPane(); // Getting the content-pane of our frame
        // contentPane.setBackground(Color.blue); -> Using one of the default colors
        // contentPane.setBackground(new Color(0,0,0)); -> Creating a new color by specifying the RGB-code
        contentPane.setBackground(new Color(0X123456)); // Creating a new by specifying the hexadecimal-value
    }
}
