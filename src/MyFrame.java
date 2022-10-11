import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("JFrame title run here");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(420,420);
		setVisible(true);
		setResizable(false);
		ImageIcon image = new ImageIcon("E:\\Java\\DUCXT_Java_GUI\\src\\Logo-DH-Thuy-Loi.png");
		setIconImage(image.getImage());
		getContentPane().setBackground(new Color(123,5,250));
		
	}
	
}
