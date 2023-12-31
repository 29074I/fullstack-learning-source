import java.util.Stack;

public class Ex01스택 {

	public static void main(String[] args) {
		
		// 1. 스택 생성, import까지
		Stack<String> st = new Stack<String>();
		
		// 2. 요소 삽입 (push)
		st.push("Hello");
		st.push("Hi");
		String a = st.push("Java");
		
		// 3. 가장 마지막에 들어간 요소 확인 (top에서 가장 가까운 요소)
		System.out.println(st.peek());
		
		// 4. 특정 요소의 위치 확인
		// 스택은 1부터 시작(인덱스는 0~)
		System.out.println(st.search("Hello"));; // 3  // search -> 입력한 값이 몇 번째에 위치했는지 
		System.out.println(st.search("Hi"));; 	// 2
		System.out.println(st.search("Java"));; // 1 		
		
		
		// 5. 요소 삭제 (pop) -> 반환까지
		String e = st.pop();
		System.out.println(e);
		
		// 6. Stack이 비어있는지 확인
		// 비어있으면 -> true, 요소가 하나라도 있으면 -> false
		System.out.println(st.empty());;
		

	}

}
