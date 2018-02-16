package by.htp.classes;

public class Group {

	private int number;
	private Student[] students;
	private int studentsCount;

	public int getStudentsCount() {
		return this.studentsCount;
	}

	public Group(int number) {
		this.number = number;
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void setStudents(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}

	public void addStudent(Student student) {
		if (this.students != null) {
			if (studentsCount < students.length) {
				students[studentsCount] = student;
				studentsCount++;
			} else {
				Student[] extendStudent = new Student[this.students.length + 10];
				for (int i = 0; i < this.students.length; i++) {
					extendStudent[i] = this.students[i];
				}
				this.students = extendStudent;
				this.students[studentsCount] = student;
				studentsCount++;
			}

		} else {
			this.students = new Student[10];
			this.students[0] = student;
			studentsCount++;
		}
	}

	// check the number of students of the group 5-15

	public void addStudents(Student[] students) {
		if (students.length < 5) {
			System.out.println("Недопустимое количество студентов. В группе может учиться от 5 студентов.");
		} else if (students.length >= 15) {
			System.out.println("Недопустимое количество студентов. В группе может учиться до 15 студентов.");
		} else {
			for (int i = 0; i < students.length; i++) {
				addStudent(students[i]);
			}
		}
	}

	public double averageAge() {
		double average = 0;
		int sumAge = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			sumAge = sumAge + students[i].getAge();
		}
		average = (double) sumAge / studentsCount;
		return average;
	}

	public int countStudents2015Year() {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			if (students[i].getYear() == 2015) {
				count++;
			}
		}
		return count;
	}

	public int getMaxStudentsYear() {
		int studYears[] = new int[studentsCount];
		int studCount[] = new int[studentsCount];
		for (int i = 0; i < studentsCount; i++) {
			int year = students[i].getYear();
			for (int j = 0; j < studYears.length; j++) {
				if (studYears[j] == year) {
					studCount[j]++;
					break;
				} else if (studYears[j] == 0) {
					studYears[j] = year;
					studCount[j]++;
					break;
				}
			}
		}
		int indexMaxStudCount = 0;
		int maxStudCount = 0;
		for (int i = 0; i < studCount.length; i++) {
			if (studCount[i] > maxStudCount) {
				indexMaxStudCount = i;
				maxStudCount = studCount[i];
			}
		}
		System.out.println("Год с максимальным количеством студентов: " + studYears[indexMaxStudCount] + " год");
		System.out.println(
				"Количество зачисленных студентов в " + studYears[indexMaxStudCount] + " году: " + maxStudCount);
		return studYears[indexMaxStudCount];
	}

	public Student[] bubbleSort() {

		for (int i = 0; i < studentsCount - 1; i++) {
			for (int j = 0; j < studentsCount - 1; j++) {
				if (students[j].getAge() < students[j + 1].getAge()) {
					Student min = students[j];
					students[j] = students[j + 1];
					students[j + 1] = min;
				}
			}
		}
		return this.students;
	}

	public Student[] insertionSort() {
		for (int i = 0; i < studentsCount - 1; i++) {
			if (students[i].getAge() > students[i + 1].getAge()) {
				Student temp = students[i + 1];
				students[i + 1] = students[i];
				int j = i;
				while (j > 0 && temp.getAge() < students[j - 1].getAge()) {
					students[j] = students[j - 1];
					j--;
				}
				students[j] = temp;
			}
		}
		return this.students;
	}

	public Student[] selectionSort() {
		for (int min = 0; min < studentsCount - 1; min++) {
			int least = min;
			for (int j = min + 1; j < studentsCount; j++) {
				if (students[j].getAge() < students[least].getAge()) {
					least = j;
				}
			}
			Student tmp = students[min];
			students[min] = students[least];
			students[least] = tmp;
		}
		return this.students;
	}

}
