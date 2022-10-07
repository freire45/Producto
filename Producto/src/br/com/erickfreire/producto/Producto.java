package br.com.erickfreire.producto;

import java.util.Scanner;

public class Producto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int producto;
		
		System.out.println("Programa en Java que calcula el producto de tres valores: ");
		System.out.print("Introduzca el primer valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.print("Introduzca el tercer valor: ");
		numero3 = entrada.nextInt();
		
		producto = numero1 * numero2 * numero3;
		
		System.out.printf("Producto: %d%n", producto);

	}

}
