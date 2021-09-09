package controller;

public class OrdenacaoController {

	public OrdenacaoController() {
		super();
	}

	// ORDENAÇÃO BUBBLE SORT
	public int[] ordenacaoBubble(int[] vetor) {
		int tamanho = vetor.length;

		// Rodadas
		for (int i = 0; i < tamanho; i++) {
			// Ordenação
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

	// ORDENAÇÃO MERGE SORT
	public int[] ordenacaoMerge(int[] vetor) {
		return vetor;
	}

	// ORDENAÇÃO QUICK SORT
	public int[] ordenacaoQuick(int[] vetor) {
		return vetor;

	}

}
