// N�o entendi como desenvolver a biblioteca de ordena��es.
// Estive ausente na �ltima aula e a houve um problema na grava��o da 2� parte da aula
// O c�digo est� incompleto, mas irei finalizar

package view;

import javax.swing.JOptionPane;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {9,8,7,6,5,4,3,2,1,0};
		
		OrdenacaoController oCont = new OrdenacaoController();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das op��es para ordenar o vetor:\n"
					+ "\n1 - Ordena��o do vetor por Bubble Sort \n2 - Ordena��o do vetor por Merge Sort "
					+ "\n3 - Ordena��o do vetor por Quick Sort \n\n9 - Finalizar"));

			switch (opc) {
			case 1:
				oCont.ordenacaoBubble(vetor);
				break;
			case 2:
				oCont.ordenacaoMerge(vetor);
				break;
			case 3:
				oCont.ordenacaoQuick(vetor);
				break;
			default:
				System.err.println("Op��o inv�lida, escolha entre 1 e 3 ou 9 para sair");
			}
		}
	}
}
