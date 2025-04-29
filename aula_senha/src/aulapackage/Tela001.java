package aulapackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class Tela001 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela001 frame = new Tela001();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela001() {
		
		String senha = "yawch";
		String usuario = "Storchio";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuario = new JLabel("Usuario :");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbUsuario.setBounds(25, 11, 74, 29);
		contentPane.add(lbUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tfUsuario.setBounds(102, 18, 242, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lbSenha = new JLabel("Senha :");
		lbSenha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbSenha.setBounds(25, 51, 74, 35);
		contentPane.add(lbSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 5));
		pfSenha.setBounds(102, 61, 242, 20);
		contentPane.add(pfSenha);
		
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(pfSenha.getText().equals(senha) && tfUsuario.getText().equals(usuario)) {
					JOptionPane.showMessageDialog(null, "Bem vindo : "+ tfUsuario.getText());
				}else {
					JOptionPane.showMessageDialog(null, "SOME DAQUI MEU");
				}
				
				
				
			}
		});
		btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogar.setBounds(160, 208, 146, 42);
		contentPane.add(btnLogar);
	}
}
