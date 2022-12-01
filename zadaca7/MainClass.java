package fikt.oop.inki895.zadaca7;

import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> mails=new ArrayList<String>();
		for(int i=0;i<20;i++) {
			if(i<9)
			    mails.add("mail0"+(i+1)+"@yahoo.com");
			else
				mails.add("mail"+(i+1)+"@yahoo.com");
			System.out.println(mails.get(i));
		}
	
	}
}
