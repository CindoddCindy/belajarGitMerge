package com.trygitmerge.belajargitmerge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelajargitmergeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajargitmergeApplication.class, args);

		System.out.println("Hello World");

<<<<<<< HEAD
		int angka =" 1";

		int jumlah = angka + angka;
		System.out.println("Hasil Penjumlahan " + jumlah);
=======
		 int angka=1;

		 int  jumlah = angka + angka;

		System.out.println("hasil penjumlahan" + angka);
>>>>>>> main
	}

}
