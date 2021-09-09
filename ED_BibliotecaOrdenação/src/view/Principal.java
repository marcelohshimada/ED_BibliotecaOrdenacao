// Não entendi como desenvolver a biblioteca de ordenações.
// Estive ausente na última aula e a houve um problema na gravação da 2ª parte da aula
// O código está incompleto, mas irei finalizar

package view;

import javax.swing.JOptionPane;

import controller.OrdenacaoController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {9,8,7,6,5,4,3,2,1,0};
		
		OrdenacaoController oCont = new OrdenacaoController();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções para ordenar o vetor:\n"
					+ "\n1 - Ordenação do vetor por Bubble Sort \n2 - Ordenação do vetor por Merge Sort "
					+ "\n3 - Ordenação do vetor por Quick Sort \n\n9 - Finalizar"));

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
				System.err.println("Opção inválida, escolha entre 1 e 3 ou 9 para sair");
			}
		}
	}
}
