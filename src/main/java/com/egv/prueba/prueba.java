package com.egv.prueba;

public class prueba {
	
	

	public static void main(String[] args) {

		int array[] = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
		int arrayOrdenado[]=ordenarArreglo(array);
        for(int k=0; k<arrayOrdenado.length-1; k++) {
        System.out.print(arrayOrdenado[k]+"-");
        }

	}

	private static int[] ordenarArreglo(int array[]) {
		//int i,j;
		
		for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
            	int valorArrayJ=array[j];
            	int valorSiguinte = array[j+1];
                if (array[j] > array[j+1]) {// valido si el numero actual es mayor que el siguiente 
                	int auxiliar = array[j + 1];
                	//cambiamos las posiciones
                    array[j + 1] = array[j];
                    array[j] = auxiliar;
                }
            }
        }
		return array;
	}
	
}
