public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private int numStudents;

	public StudentScores() {
		Student.scores = new int[MAX_STUDENTS]; // Student 클래스를 사용하여 배열 생성
		Student.names = new String[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		Student.names[numStudents] = name;
		Student.scores[numStudents] = score;
		numStudents++;
	}

	public String getHighest() {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (Student.scores[i] > Student.scores[highest])
				highest = i;

		return Student.names[highest];
	}

	public String getLowest() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (Student.scores[i] < Student.scores[lowest])
				lowest = i;

		return Student.names[lowest];
	}
}
