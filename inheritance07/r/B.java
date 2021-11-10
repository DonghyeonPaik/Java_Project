package inheritance07.r;

import inheritance07.q.A;

public class B extends A {
	void set() {
		pub=1;
		pro=2;
//		def=3;
//		pri=4;
	}
	void showInfo() {
		System.out.println("pub: "+pub);
		System.out.println("pro: "+pro);
//		System.out.println("def: "+def);
//		System.out.println("pri: "+pri);
		
	}
}
