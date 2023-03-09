package ch12.lecture.p01object;

import java.util.*;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		//집합 = 별개의 원소들의 모임
		//이러한 집합을 구현한 자바의 타입이 있음
		//이것을 set이라고 함
		//집합이 영어로 set임
		//중복없는 원소들의 모임(collection)
		Set set = new HashSet();
		//set instance를 만들고 싶은데 이것은 interface라서 이걸 구현하는 클래스를 통해서 인스턴스를 만들어야 한다
		//hashset은 set을 구현하는 클래스이다
		System.out.println(set.size());
		
		set.add(100);
		System.out.println(set.size()); //100이 들어가서 1임
		
		set.add(200);
		System.out.println(set.size()); //200이 들어가서 2임
		
		set.add(100); //이미 100은 들어가 있음
		//add는 존재하지 않으면 추가인데 이미 있으니까 들어가지 않음 그래서 여전히 사이즈는 2다
		System.out.println(set.size());
		
		
	}
}
