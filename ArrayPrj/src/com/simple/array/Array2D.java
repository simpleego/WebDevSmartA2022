package com.simple.array;

public class Array2D {

	public static void main(String[] args) {
		final int ROW = 3;
		final int COL = 4;
		
		int[] tot = new int[ROW];		
		double[] avg = new double[ROW];	
		
		int temp=0;
		
		int[][] array = {				
				{10,25,30,40},
				{50,66,70,85},
				{90,56,10,78}				
		};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(" " +array[i][j]);
			}
			System.out.println();			
		}
		
		// ¸ðµç ÇàÀÇ ÃÑÁ¡°ú Æò±ÕÀ» ±¸ÇÏ½Ã¿À.
		//
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				// ÃÑÁ¡°è»ê
				temp += array[i][j];
				//tot[i] += array[i][j];
				
			}
			tot[i] = temp;
			avg[i] = (double)temp/array[i].length;
			//avg[i] = tot[i]/array[i].length;
			temp=0;
		}
		
		System.out.print(" ÃÑÁ¡ : ");
		for (int i = 0; i < ROW; i++) {
			System.out.print(" "+tot[i]);
		}
		
		System.out.print("\n Æò±Õ :");
		for (int i = 0; i < ROW; i++) {
			System.out.printf(" %6.2f ",avg[i]);
		}

	}

}
