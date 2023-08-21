package view;

import controller.SequencialController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		SequencialController seqCont = new SequencialController();
		int n = 0;
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número para imprimir a sequência: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrado");
					System.exit(0);
				}
				n = Integer.parseInt(input);
				if (n <= 0) {
					JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
				continue;
				} break;
			} while(true);
		JOptionPane.showMessageDialog(null, "O resultado da sequência é de: " +seqCont.sequencial(n));
	}

}
