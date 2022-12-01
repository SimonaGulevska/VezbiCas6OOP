package fikt.oop.inki895.zadaca4;

import java.util.ArrayList;
import java.util.Collections;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<Integer> listaNaBroevi=new ArrayList<Integer>();
		listaNaBroevi.add(77);
		listaNaBroevi.add(895);
		listaNaBroevi.add(11);
		listaNaBroevi.add(2);
		listaNaBroevi.add(16);
		for(int i=0;i<listaNaBroevi.size();i++) {
			System.out.println(listaNaBroevi.get(i));
		}
		Collections.sort(listaNaBroevi);
		System.out.println("----SORTIRANA LISTA----");
		for(int i=0;i<listaNaBroevi.size();i++) {
			System.out.println(listaNaBroevi.get(i));
		}
	}
}
