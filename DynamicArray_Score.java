package QKDRHKGN;
import java.util.Scanner;
public class DynamicArray_Score {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in); //성명 입력받는 스캐너(String)
		Scanner s2 = new Scanner(System.in); // 성죽, 과목수, 학생수과 같은 정수를 입력(int)
		
		System.out.println("===== 동적 배열을 사용한 성적 프로그램 =====\n");
		
		System.out.print("학생수 입력 : ");
		int stuNum = s2.nextInt();
		
		// 성명을 저장하는 배열 (1차원 배열)
		String[] stuNames = new String[stuNum];
		// 각 학생의 성적을 저장하는 배열(동적 2차원배열)
		int[][] scores = new int[stuNum][];
		// 합계를 저장하는 비열 (1차원 배열)
		int[] sums = new int[stuNum];
		
		for(int i = 0; i<scores.length; i++) {
			System.out.print("이름 : ");
			stuNames[i] = s1.nextLine();
			System.out.print("과목 수 입력 : ");
			int subNum = s2.nextInt(); //열 과목 수 입력
			scores[i] = new int[subNum]; //열 과목 수 지정
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print("점수 입력 : ");
				scores[i][j] = s2.nextInt();
				sums[i] += scores[i][j];
			}
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+". "+stuNames[i]+"	");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"	");
			}
			System.out.println("합계 : " + sums[i]+"");
		}
		System.out.println("=================================\n");
		
	
			
		s1.close();
		s2.close();
	}

}
