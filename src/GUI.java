import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("JFrame title run here");
		frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setResizable(false);
		ImageIcon image = new ImageIcon("E:\\Java\\DUCXT_Java_GUI\\src\\Logo-DH-Thuy-Loi.png");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(123,5,250));

	}
}
