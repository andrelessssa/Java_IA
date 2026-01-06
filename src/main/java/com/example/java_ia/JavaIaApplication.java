package com.example.java_ia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaIaApplication {

	public static void main(String[] args) {SpringApplication.run(JavaIaApplication.class, args);
		System.out.println("hello");


		byte number = 1;
		long nunb = 1L;
		float num = 1.0f;
		var nu = 1.0d;
		char cha = 'a';

		//var scanner = new Scanner(System.in);
		//System.out.println("Quanto é 2 + 2");
		//var result = scanner.nextInt();
		//System.out.printf("O resultado é 4, e voce acertou? (%s)", result == 4);


		var scanner = new Scanner(System.in); // inicializada
		System.out.println("Quanto é 2 + 2"); // ln quebra a linha
		var result = scanner.nextInt();
		var isRight = result == 4;
		System.out.printf("O resultado é 4, e voce acertou? (%s)", result == 4); // o f é para usar o %s


	}


}
