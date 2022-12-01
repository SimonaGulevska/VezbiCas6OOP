package fikt.oop.inki895.zadaca9;

import java.util.ArrayList;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<Fakultet> lista=new ArrayList<Fakultet>();
		String ime;
		int broj;
		int vkupno;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Внесете има на факултетот:");
			ime=sc.next();
			System.out.println("Внесете број на смерови:");
			broj=sc.nextInt();
			System.out.println("Колку вкупно студенти се запишани во тој факултет?");
			vkupno=sc.nextInt();
			//kreiranje na objekt
			Fakultet f=new Fakultet(ime,broj,vkupno);
			//POLNENJE NA LISTA OD OBJEKTI
			lista.add(f);
		}
		System.out.println();
		for(int i=0;i<=lista.size();i++) {
			System.out.println("--------------------------------");
			System.out.println(lista.get(i).getImeNaFakultet());
			System.out.println(lista.get(i).getBrNaSmerovi());
			System.out.println(lista.get(i).getVkupnoStudenti());
		}  
		sc.close();
	}

}
