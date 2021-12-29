package basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 14. Exception
 *  예외처리는 프로그램 실행중 예기치 못한 결과가 나왔을 경우의 대응을 말합니다.
 * 예를 들어 '숫자 데이터'를 입력받아야 하는데 '문자열데이터'를 입력받아, 문자열데이터를 숫자 변수에 대입하려하면 
 * 프로그램은 에러를 발생시키게 됩니다.
 * 프로그램 실행중 에러를 발생했을 경우  
 *  1) 에러의 이유를 로그로 알려주거나
 *  2) 에러가 발생했을때 필요한 로직을 실행하는 것 등으로 예외처리가 실행됩니다.
 */
public class B_14_Exception {

	public static void main(String[] args) {
		// 1. try-catch
		File file = new File("newFile.txt");
		//file.createNewFile(); // 파일생성 시에는 예외처리를 하지 않으면 컴파일 에러가 발생
		try {
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace(); // 실무에서는 StackTrace가 아닌 log4j나 logback에 로그를 남긴다.
		}
		
		
		// 2. 메서드에 throws를 붙이기
		// 메서드에 throws를 붙이면 메서드를 호출한곳에서 예외처리하도록 할 수 있다.
		try {
			writeFile(file);
		} catch (Exception e) {
			e.printStackTrace(); // 실무에서는 StackTrace가 아닌 log4j나 logback에 로그를 남긴다.
		}
		
		// 3. 일부러 예외를 발생 시키기
		try {
			if (file.exists()) {
				System.out.println(file.getCanonicalPath());
				throw new Exception("file exist!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("file delete!!");
			file.delete();
		}

	}
	
	
	public static void writeFile(File file) throws IOException {
		List<String> list = new ArrayList<String>();
		list.add("ArrayList-String01");  // Index 0 
		list.add("ArrayList-String02");  // Index 1
		list.add("ArrayList-String03");  // Index 2
		
		BufferedWriter wr = null;
		wr = new BufferedWriter(new FileWriter(file, true));
		for (String var : list) {
			wr.append(var);
			wr.append("\n");
		}
		wr.flush();

		if (wr != null) {
			wr.close();
			wr = null;
		}
		
	}
	
}
