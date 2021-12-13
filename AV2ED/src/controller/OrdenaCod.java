package controller;

public class OrdenaCod {

	public void insertionSort(int[] vetor) {
	    int i, j, aux;

	    for (j = 1; j < vetor.length; j++)
	    {
	      aux = vetor[j];
	      for (i = j - 1; (i >= 0) && (vetor[i] > j); i--)
	      {
	         vetor[i + 1] = vetor[i];
	       }
	        vetor[i + 1] = aux;
	    }
	    
	}
	
	public void bubbleSort (int [] vetor) {
	boolean troca = true;
    int aux;
    while (troca) {
        troca = false;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                troca = true;
            }
        }
    }
}
	 public static void mergeSort(int A[], int inicio, int fim){
	        if(inicio < fim){
	            int meio = (inicio + fim) / 2; //calcula o meio por meio da média aritmética
	            mergeSort(A, inicio, meio); //ordena do subvetor esquerdo
	            mergeSort(A, meio + 1, fim); //ordena do subvetor direito
	            merge(A, inicio, meio, fim); //funde os subvetores esquerdo e direito
	        }
	    }    
	  
	 private static void merge(int[] A, int inicio, int meio, int fim){
	        int tamEsq = meio - inicio + 1; //tamanho do subvetor esquerdo
	        int tamDir = fim - meio; //tamanho do subvetor direito
	        int esq[] = new int[tamEsq]; //subvetor auxiliar esquerdo
	        int dir[] = new int[tamDir]; //subvetor auxiliar direito
	        int Esq = 0; //índice do subvetor auxiliar esquerdo
	        int Dir = 0; //índice do subvetor auxiliar direito
	        
	        //Copia os elementos do subvetor esquerdo para o vetor auxiliar
	        for(int i = 0; i < tamEsq; i++){
	            esq[i] = A[inicio + i];
	        }
	        //Copia os elementos do subvetor direito para o vetor auxiliar
	        for(int j = 0; j < tamDir; j++){
	            dir[j] = A[meio + 1 + j];
	        }
	        
	        //intercala os subvetores
	        for(int k = inicio; k <= fim; k++){
	            if(Esq < tamEsq){
	                if(Dir < tamDir){
	                    if(esq[Esq] < dir[Dir]){
	                        A[k] = esq[Esq++];
	                    }else{
	                        A[k] = dir[Dir++];
	                    }
	                }else{
	                    A[k] = esq[Esq++];
	                }
	            }else{
	                A[k] = dir[Dir++];
	            }
	        }
	    }
	 public static void selectionSort(int[] v) {
			for (int i = 0; i< v.length; i++) {
				int menor = i;
				for (int j = i +1; j < v.length; j++) {
					if (v[j] < v[menor])
						menor = j;
				}
				trocar(v, i, menor);
			}
		}
	 private static void trocar(int[] v, int i, int menor) {
			int aux = v[i];
			v[i] = v[menor];
			v[menor] = aux;
	 	}
}

