package ch12.sec12;

import java.lang.reflect.*;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception{
		Method[] declareMethods = Service.class.getDeclaredMethods();
		for(Method method : declareMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
			
			method.invoke(new Service());
			
			printLine(printAnnotation);
		}
	}

	private static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			
			int number = printAnnotation.number();
			for(int i = 0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			
			System.out.println();
		}
	}
}
