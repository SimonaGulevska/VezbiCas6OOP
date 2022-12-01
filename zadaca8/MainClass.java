package fikt.oop.inki895.zadaca8;

import java.util.ArrayList;
import java.util.List;
public class MainClass {

	public static void main(String[] args) {
		List<String> mails=new ArrayList<String>();
		for(int i=5;i<=20;i=i+5) {
			System.out.println("mail"+i+"@yahoo.com");
			
		}
		for(int i=0;i<mails.size();i++) {
			System.out.println(mails.get(i));
		}
	}
}
