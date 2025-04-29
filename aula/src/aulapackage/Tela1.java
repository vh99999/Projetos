package aulapackage;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tela1 extends JFrame{
		
	private final JLabel label1;
	private final JLabel label2;
	
	
	public Tela1() {
		super("Primeira tela");
		setLayout(new FlowLayout());
		label1 = new JLabel("BANDODEBUTE");
		label1.setToolTipText("Rosa é um gremista nojento");
		add(label1);
		ImageIcon wolfzika = new ImageIcon(getClass().getResource("wolfzika.jpg"));
		label2 = new JLabel("Label cm icone e texto", wolfzika, SwingConstants.LEFT);
		label2.setToolTipText("eila");
		add(label2);
	}
	
	
	

}
