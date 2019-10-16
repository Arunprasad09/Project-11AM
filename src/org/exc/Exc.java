package org.exc;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Exc {
public static void main(String[] args) throws IOException {
	
File c=new File("E:\\Java\\Add\\arun.txt");
boolean b=c.createNewFile();
System.out.println(b);
FileUtils.write(c, "1. Class\r\n" + 
		"2. Method\r\n" + 
		"3. Object\r\n" + 
		"4. Abstraction\r\n" + 
		"5. Encapsulation\r\n" + 
		"6. Inheritance\r\n" + 
		"7. Polymorphism");
List <String> d=FileUtils.readLines(c);
for(String s:d)
{
	System.out.println(s);
}
}
}