package aulapackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Tela1 tela = new Tela1();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(300, 400);
//		tela.setBounds(50, 50, 50, 50);
		tela.setVisible(true);
	}

}
