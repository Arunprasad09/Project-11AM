package org.exc;

import java.io.File;

public class Exception1 {

	public static void main(String[] args) {
		File a=new File("C:\\Downloads");
		boolean b=a.mkdir();
		System.out.println(b);
		File c=new File("C:\\Java");
		boolean d=c.mkdir();
		System.out.println(d);
		File e=new File("E:\\Java\\Selenium\\Material");
		boolean f=e.mkdirs();
		System.out.println(f);
	}
}
