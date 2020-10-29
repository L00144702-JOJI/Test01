package pkg01;

import pkg01.ChromeDr;

public class MainClass {
	
	int a_default = 10;
	public int b_public = 20;
	private int c_private = 30;
	protected int d_protected = 40;  

	public static void main(String[] args) {
		
		ChromeDr.ChromeDr();
		
		/*
		MainClass mc = new MainClass();
		System.out.println("In MainClass");
		System.out.println("\tDefault_var: "+mc.a_default);
		System.out.println("\tPublic_var: "+mc.b_public);
		System.out.println("\tPrivate_var: "+mc.c_private);
		System.out.println("\tProtected_var: "+mc.d_protected);
		*/
	}

}
