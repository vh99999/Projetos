package telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Telas2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup grupo; //agrupa os radiobuttons
	private String opcao1;
	private String opcao2;
	private String opcao3;
	private String opcao4;
	private String opcao5;
	private String opcao6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telas2 frame = new Telas2();
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
	public Telas2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 326, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(346, 11, 393, 407);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea taExecutarTudo = new JTextArea();
		taExecutarTudo.setBounds(10, 11, 373, 385);
		panel_3.add(taExecutarTudo);
		
		JCheckBox ckOp1 = new JCheckBox("Opção 1");
		ckOp1.setBounds(6, 7, 97, 23);
		panel.add(ckOp1);
		
		JCheckBox ckOp2 = new JCheckBox("Opção 2");
		ckOp2.setBounds(105, 7, 97, 23);
		panel.add(ckOp2);
		
		JCheckBox ckOp3 = new JCheckBox("Opção 3");
		ckOp3.setBounds(204, 7, 97, 23);
		panel.add(ckOp3);
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (ckOp1.isSelected()) {
					//System.out.println("Opção 1 foi selecionada");
					taExecutarTudo.append("Opção 1 foi selecionada\n");
				}
				if (ckOp2.isSelected()) {
					//System.out.println("Opção 2 foi selecionada");
					taExecutarTudo.append("Opção 2 foi selecionada\n");
					
				}
				if (ckOp3.isSelected()) {
					//System.out.println("Opção 3 foi selecionada");
					taExecutarTudo.append("Opção 3 foi selecionada\n");
					
				}
				if (ckOp1.isSelected() == false && ckOp2.isSelected() == false && ckOp3.isSelected() == false) {
					//System.out.println("Nenhuma opção foi selecionada");
					taExecutarTudo.append("Nenhuma opção foi selecionada\n");
				}
				
			}
		});
		
		
		btnExecutar.setBounds(227, 37, 89, 23);
		panel.add(btnExecutar);
		
		JButton btnSelectAll = new JButton("Selecionar tudo");
		btnSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ckOp1.setSelected(true);
				ckOp2.setSelected(true);
				ckOp3.setSelected(true);
				
			}
		});
		btnSelectAll.setBounds(16, 37, 137, 23);
		panel.add(btnSelectAll);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 141, 326, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rbtn1 = new JRadioButton("Matutino");
		rbtn1.setBounds(6, 7, 109, 23);
		panel_1.add(rbtn1);
		
		JRadioButton rbtn2 = new JRadioButton("Vespertino");
		rbtn2.setBounds(117, 7, 109, 23);
		panel_1.add(rbtn2);
		
		JRadioButton rbtn3 = new JRadioButton("Noturno");
		rbtn3.setBounds(228, 7, 109, 23);
		panel_1.add(rbtn3);
		
		grupo = new ButtonGroup();
		grupo.add(rbtn1);
		grupo.add(rbtn2);
		grupo.add(rbtn3);
		
		JButton btnExecutar2 = new JButton("Executar");
		btnExecutar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rbtn1.isSelected()) {
					//System.out.println("Matutino");
					taExecutarTudo.append("Matutino\n");
				}
				if (rbtn2.isSelected()) {
					//System.out.println("Vespertino");
					taExecutarTudo.append("Vespertino\n");
				}
				if (rbtn3.isSelected()) {
					//System.out.println("Noturno");
					taExecutarTudo.append("Noturno\n");
				}
				if (rbtn1.isSelected() == false && rbtn2.isSelected() == false && rbtn3.isSelected() == false) {
					//System.out.println("Nenhuma opção foi selecionada");
					taExecutarTudo.append("Nenhuma opção foi selecionada\n");
				}
				
			}
		});
		btnExecutar2.setBounds(227, 53, 89, 23);
		panel_1.add(btnExecutar2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 316, 326, 102);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox cbDisciplinas = new JComboBox();
		cbDisciplinas.setModel(new DefaultComboBoxModel(new String[] {"...", "Matematica", "Portugues", "Historia"}));
		cbDisciplinas.setBounds(10, 32, 190, 22);
		panel_2.add(cbDisciplinas);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setBounds(10, 11, 95, 14);
		panel_2.add(lblDisciplinas);
		
		JButton btnCb = new JButton("Mostrar");
		btnCb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cbDisciplinas.getSelectedItem() != "...") {
					taExecutarTudo.append((String) cbDisciplinas.getSelectedItem());
					}else {
						taExecutarTudo.append("Nenhuma opção selecionada em disciplinas\n");
					}
				}
			});
		btnCb.setBounds(227, 32, 89, 23);
		panel_2.add(btnCb);
		
		JButton btnTudo = new JButton("Executar tudo");
		btnTudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (ckOp1.isSelected()) {
					//System.out.println("Opção 1 foi selecionada");
					taExecutarTudo.append("Opção 1 foi selecionada\n");
				}
				if (ckOp2.isSelected()) {
					//System.out.println("Opção 2 foi selecionada");
					taExecutarTudo.append("Opção 2 foi selecionada\n");
					
				}
				if (ckOp3.isSelected()) {
					//System.out.println("Opção 3 foi selecionada");
					taExecutarTudo.append("Opção 3 foi selecionada\n");
					
				}
				if (ckOp1.isSelected() == false && ckOp2.isSelected() == false && ckOp3.isSelected() == false) {
					//System.out.println("Nenhuma opção foi selecionada");
					taExecutarTudo.append("Nenhuma opção foi selecionada\n");
				}
				
				if (rbtn1.isSelected()) {
					//System.out.println("Matutino");
					taExecutarTudo.append("Matutino\n");
				}
				if (rbtn2.isSelected()) {
					//System.out.println("Vespertino");
					taExecutarTudo.append("Vespertino\n");
				}
				if (rbtn3.isSelected()) {
					//System.out.println("Noturno");
					taExecutarTudo.append("Noturno\n");
				}
				if (rbtn1.isSelected() == false && rbtn2.isSelected() == false && rbtn3.isSelected() == false) {
					//System.out.println("Nenhuma opção foi selecionada");
					taExecutarTudo.append("Nenhuma opção foi selecionada entre os turnos\n");
				}
				if(cbDisciplinas.getSelectedItem() != "...") {
					taExecutarTudo.append((String) cbDisciplinas.getSelectedItem());
					}else {
						taExecutarTudo.append("Nenhuma opção selecionada em disciplinas\n");
					}
				
				
			}
		});
		btnTudo.setBounds(164, 445, 144, 23);
		contentPane.add(btnTudo);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				taExecutarTudo.setText("");
				
			}
		});
		btnLimpar.setBounds(510, 445, 89, 23);
		contentPane.add(btnLimpar);
		
		
	}
}
