package view;

import controller.OrdenaCod;

public class Principal {

	public static void main(String[] args) {
		int qtd = 10000;
	    int[] vetor = new int[qtd];
	    OrdenaCod ordena = new OrdenaCod();
	    ///////////////////////////INSERTION SORT////////////////////////////////////
	    //Pior caso
	    for (int i = 0; i < vetor.length; i++) {
	     vetor[i] = (int) (Math.random()*qtd); //Aqui ocorre o pior caso, porque não se sabe o tamanho do vetor
	    }
	    long tempoInicial = System.currentTimeMillis(); //Verifica o tempo de iniciação
	    ordena.insertionSort(vetor); //Procedimento de ordenação iniciado
	    long tempoFinal = System.currentTimeMillis(); //O tempo do sort
	    System.out.println("Inserção Executada em " + (tempoFinal - tempoInicial) + " ms (Pior caso)"); //O tempo decorrido
	    
	    //Melhor caso
	    for (int i = 0; i < vetor.length; i++) {
		     vetor[i] = i + 1; //Aqui ocorre o melhor caso, porque se sabe o tamanho do vetor
		    }
	    long tempo_Inicial = System.currentTimeMillis(); //Verifica o tempo de iniciação
	    ordena.insertionSort(vetor); //Procedimento de ordenação iniciado
	    long tempo_Final = System.currentTimeMillis(); //O tempo do sort
	    System.out.println("Inserção Executada em " + (tempo_Final - tempo_Inicial) + " ms (Melhor caso)"); //O tempo decorrido
	    
	    ///////////////////////////BUBBLE SORT////////////////////////////////////
	    
	    for (int i = 0; i < vetor.length; i++) {
		     vetor[i] = (int) (Math.random()*qtd); //Aqui ocorre o pior caso, porque não se sabe o tamanho do vetor
		    }
		    long Ti = System.currentTimeMillis(); //Verifica o tempo de iniciação
		    ordena.bubbleSort(vetor); //Procedimento de ordenação iniciado
		    long Tf = System.currentTimeMillis(); //O tempo do sort
		    System.out.println("Bubblesort executado em " + (Tf - Ti) + " ms (Pior caso)"); //O tempo decorrido
		    
		    //Melhor caso
		    for (int i = 0; i < vetor.length; i++) {
			     vetor[i] = i + 1; //Aqui ocorre o melhor caso, porque se sabe o tamanho do vetor
			    }
		    long TA = System.currentTimeMillis(); //Verifica o tempo de iniciação
		    ordena.bubbleSort(vetor); //Procedimento de ordenação iniciado
		    long TB = System.currentTimeMillis(); //O tempo do sort
		    System.out.println("Bubblesort Executado em " + (TB - TA) + " ms (Melhor caso)"); //O tempo decorrido
		    
		  ///////////////////////////MERGE SORT////////////////////////////////////
		    for (int i = 0; i < vetor.length; i++) {
			     vetor[i] = (int) (Math.random()*qtd); //Aqui ocorre o pior caso, porque não se sabe o tamanho do vetor
			    }
			    long Tempoi = System.currentTimeMillis(); //Verifica o tempo de iniciação
			    ordena.mergeSort(vetor, qtd, qtd); //Procedimento de ordenação iniciado
			    long Tempof = System.currentTimeMillis(); //O tempo do sort
			    System.out.println("Mergesort Executado em " + (Tempof - Tempoi) + " ms (Pior caso)"); //O tempo decorrido
			    
			    //Melhor caso
			    for (int i = 0; i < vetor.length; i++) {
				     vetor[i] = i + 1; //Aqui ocorre o melhor caso, porque se sabe o tamanho do vetor
				    }
			    long TX = System.currentTimeMillis(); //Verifica o tempo de iniciação
			    ordena.mergeSort(vetor, qtd, qtd); //Procedimento de ordenação iniciado
			    long TY = System.currentTimeMillis(); //O tempo do sort
			    System.out.println("Mergesort em " + (TY - TX) + " ms (Melhor caso)"); //O tempo decorrido
			    
			    for (int i = 0; i < vetor.length; i++) {
				     vetor[i] = (int) (Math.random()*qtd); //Aqui ocorre o pior caso, porque não se sabe o tamanho do vetor
				    }
				    long Tempox = System.currentTimeMillis(); //Verifica o tempo de iniciação
				    ordena.selectionSort(vetor);//Procedimento de ordenação iniciado
				    long Tempoy = System.currentTimeMillis(); //O tempo do sort
				    System.out.println("Seleção executada em " + (Tempoy - Tempox) + " ms (Pior caso)"); //O tempo decorrido
				    
				    //Melhor caso
				    for (int i = 0; i < vetor.length; i++) {
					     vetor[i] = i + 1; //Aqui ocorre o melhor caso, porque se sabe o tamanho do vetor
					    }
				    long TempoX = System.currentTimeMillis(); //Verifica o tempo de iniciação
				    ordena.selectionSort(vetor); //Procedimento de ordenação iniciado
				    long TempoY = System.currentTimeMillis(); //O tempo do sort
				    System.out.println("Seleção executada " + (TempoY - TempoX) + " ms (Melhor caso)"); //O tempo decorrido
	}
}

	