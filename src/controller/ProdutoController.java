package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Produto;
import persistence.ProdutoDao;

public class ProdutoController implements ActionListener{

	private JTextField textField;
	
	public ProdutoController(JTextField textField) {
		this.textField = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		insere();
	}

	private void insere() {
		Produto p = new Produto();
		p.setNome(textField.getText());
		
		String saida = "";
		
		try {
			ProdutoDao pDao = new ProdutoDao();
			saida = pDao.insereProduto(p);
		} catch (ClassNotFoundException | SQLException e) {
			saida = e.getMessage();
		} finally {
			textField.setText("");
			JOptionPane.showMessageDialog(null, saida, "MENSAGEM",
											JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}




