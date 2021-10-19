import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			if (name.equals("-1"))
				done = true;
			else {
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				studSc.add(name, score);
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		String High = studSc.getHighest(); // StudentScores 클래스를 사용하여 최고 점수와 최저 점수를 받은 학생 찾기
		String Low = studSc.getLowest();
		
		// 최고, 최저 점수를 받은 학생의 이름 출력
		System.out.println("최고 점수를 받은 학생: " + High);
		System.out.println("최저 점수를 받은 학생: " + Low);
		
	}
}
