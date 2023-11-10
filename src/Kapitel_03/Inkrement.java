package Kapitel_03;

public class Inkrement {

	public Inkrement() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int iA = 5, 
			iB = 5;
		
		System.out.println(iA + " " + iB);
		System.out.println((++iA) + " " + (--iB));
		System.out.println((iA--) + " " + (iB++));
		System.out.println(iA + " " + iB);
	}

}
