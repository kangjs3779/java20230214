package ch04.lecture.p02swich;

public class C06Swich {
	public static void main(String[] args) {
		//switch case(:) statement 하나의 명령문
		//switch labeled(->) statement
		
		//switch case(:) expression
		//switch (case) (labeled)(->) expression statement의 일부분
		int val = 1;
		
		String res = switch(val) {
						case 1: {
							yield "값1";
						}
						case 2: {
							yield "값2";
						}
						case 3: {
							String r = "값" + val;
							yield r;
						}
						default: {
							yield "기본 값";
						}
						};
						
	String res2 = switch(val) {
					case 1 -> "값1";
					case 2 -> "값2";
					case 3 -> {
						String r = "값" + val;
						yield r;
					}
					default -> "기본 값";
					}
	}
}
