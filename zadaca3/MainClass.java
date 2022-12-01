package fikt.oop.inki895.zadaca3;

import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> smeroviFIKT=new ArrayList<String>();
		smeroviFIKT.add("ИНКИ");
		smeroviFIKT.add("ИКТ");
		System.out.println("Првичната листа изгледа вака: "+smeroviFIKT);
		smeroviFIKT.add(2,"КНИ");
		System.out.println("После измените листата изгледа вака:");
		for(int i=0;i<smeroviFIKT.size();i++) {
			System.out.println(smeroviFIKT.get(i));
		}
	}

}
