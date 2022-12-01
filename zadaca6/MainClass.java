package fikt.oop.inki895.zadaca6;

import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> mails=new ArrayList<String>();
		for(int i=0;i<20;i++) {
			mails.add("mail"+(i+1)+"@yahoo.com");
		}
		for(int i=0;i<20;i++) {
			System.out.println(mails.get(i));
		}
	}
}
