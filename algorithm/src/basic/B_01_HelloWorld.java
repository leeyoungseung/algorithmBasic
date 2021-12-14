/**
 * 1. Hello World
 * 개발환경 설정이 끝나면 간단한 문장을 출력하는 프로그램을 만들어 봄으로써 
 * 제대로 개발환경설정이 제대로 되었는지 확인할 수 있습니다. 
 * Java만이 아니라 일반적으로 모든 프로그래밍 언어가 개발환경설정 후 
 * Hello World라는 문자열을 출력하여 개발환경 설정을 확인합니다. 
 */

// 패키지는 디렉토리와 같다고 생각하시면됨.
package basic; 

// Java는 정의한 클래스 안에서만 코드를 작성할 수 있습니다.
public class B_01_HelloWorld {

	// main메서드는 Java로 만들어진 모든 프로그램의 시작점 입니다. 
	// 기동시 args 인수에 값을 넘길 수 도 있습니다.
	public static void main(String[] args) {
		System.out.println("Hello World!!");
	}
	
}
