package by.htp.classes;

public class MainApp {

	public static void main(String[] args) {

		Student st1 = new Student("Name1", "Surname1", 21, 2014);
		Student st2 = new Student("Name2", "Surname2", 24, 2015);
		Student st3 = new Student("Name3", "Surname3", 21, 2016);
		Student st4 = new Student("Name4", "Surname4", 22, 2016);
		Student st5 = new Student("Name5", "Surname5", 23, 2016);
		Student st6 = new Student("Name6", "Surname6", 21, 2016);
		Student st7 = new Student("Name7", "Surname7", 24, 2013);
		Student st8 = new Student("Name8", "Surname8", 22, 2016);
		Student st9 = new Student("Name9", "Surname9", 20, 2015);


		Group gr1 = new Group(93541);
		Group gr2 = new Group(95412);
		Group gr3 = new Group(98741);

		Student[] students = new Student[] { st1, st2, st3, st4, st5, st6, st7, st8, st9 };

		gr1.addStudents(students);
		System.out.println(" Имя   " + "Фамилия  " + "Возраст  " + "Год поступления");
		for (int i = 0; i < gr1.getStudentsCount(); i++) {
			System.out.println(gr1.getStudents()[i].getName() + "  " + gr1.getStudents()[i].getSurname() + "   "
					+ gr1.getStudents()[i].getAge() + "        " + gr1.getStudents()[i].getYear());
		}
		System.out.println("Средний возраст студентов в группе: " + gr1.averageAge());
		System.out.println("Количество студентов: " + gr1.getStudentsCount());
		gr1.getMaxStudentsYear();
		Student[] bubbleArray = gr1.bubbleSort();
		System.out.println();
		System.out.println("Сортировка пузырьком: ");
		for (int i = 0; i < bubbleArray.length; i++) {
			if (bubbleArray[i] != null) {
				System.out.println(bubbleArray[i].getName() + " " + bubbleArray[i].getSurname() + " " + bubbleArray[i].getYear() + " " + bubbleArray[i].getAge());
			}
		}
		Student[] insertArray = gr1.insertionSort();
		System.out.println();
		System.out.println("Сортировка вставками: ");
		for (int i = 0; i < insertArray.length; i++) {
			if (insertArray[i] != null) {
				System.out.println(insertArray[i].getName() + " " + insertArray[i].getSurname() + " " + insertArray[i].getYear() + " " + insertArray[i].getAge());
			}
		}
		System.out.println();
		System.out.println("Сортировка выбором: ");
		Student[] selectArray = gr1.selectionSort();
		for (int i = 0; i < selectArray.length; i++) {
			if (selectArray[i] != null) {
				System.out.println(selectArray[i].getName() + " " + selectArray[i].getSurname() + " " + selectArray[i].getYear() + " " + selectArray[i].getAge());
			}
		}
	}
}