package fikt.oop.inki895.zadaca2;

import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> drzavi=new ArrayList<String>();
		drzavi.add("Makedonija");
		drzavi.add("Spanija");
		drzavi.add("Irska");
		System.out.println("Golminata na listata iznesuva: "+drzavi.size()+" elementi.");
		if(drzavi.size()==3) {
			drzavi.add("Portugalija");
			drzavi.add("Italija");
			System.out.println("Elementi na segasnata lista se:"+drzavi);
		}else
			System.out.println("Elementi na segasnata lista se: "+drzavi);
	}
}
