package fikt.oop.inki895.zadaca10;

import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> array1=new ArrayList<String>();
		array1.add("Симона");
		array1.add("Ангела");
		System.out.println(array1);
		
		ArrayList<String> array2=new ArrayList<String>();
		array2.add("Весна");
		array2.add("Марија");
		System.out.println(array2);
		
		ArrayList<String> arrayunion=new ArrayList<String>();
		arrayunion.addAll(array1);
		arrayunion.addAll(array2);
		System.out.println(arrayunion);
	}
}
