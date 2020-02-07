package view;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ProdutoController;

import javax.swing.JButton;

public class ProdutoTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutoTela frame = new ProdutoTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProdutoTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 55, 56, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(69, 52, 266, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(10, 95, 89, 23);
		contentPane.add(btnEnviar);

		ActionListener acao = new ProdutoController(tfNome);
		btnEnviar.addActionListener(acao);
		tfNome.addActionListener(acao);
	}
}








