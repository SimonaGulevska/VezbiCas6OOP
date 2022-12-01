package fikt.oop.inki895.zadaca11;

import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> array1=new ArrayList<String>();
		array1.add("Сина");
		array1.add("Розева");
		array1.add("Црвена");
		array1.add("Виолетова");
		System.out.println(array1);
		ArrayList<String> array2=new ArrayList<String>();
		array2.add("Сина");
		array2.add("Црна");
        System.out.println(array2);
		
		array1.retainAll(array2);
		System.out.println(array1);
	}
}
