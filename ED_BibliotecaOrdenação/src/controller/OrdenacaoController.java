package controller;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}

	// ORDENA��O BUBBLE SORT
	public int[] ordenacaoBubble(int[] vetor) {
		int tamanho = vetor.length;

		// Rodadas
		for (int i = 0; i < tamanho; i++) {
			// Ordena��o
			for (int j = 0; j < tamanho - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}

			for (int num : vetor) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		return vetor;
	}

	// ORDENA��O MERGE SORT
	public int[] ordenacaoMerge(int[] vetor) {
		return vetor;
	}

	// ORDENA��O QUICK SORT
	public int[] ordenacaoQuick(int[] vetor) {
		return vetor;

	}

}
