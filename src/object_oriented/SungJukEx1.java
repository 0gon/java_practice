package object_oriented;

import java.util.*;

public class SungJukEx1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		// �̸�, ��, ��ȣ, ����, ����, ����

		list.add(new Student("���ü�", 3, 2, 100, 100, 100));
		list.add(new Student("���ڹ�", 3, 1, 90, 100, 80));
		list.add(new Student("�ڹٿ�", 3, 3, 70, 100, 100));
		list.add(new Student("ŷ��¯", 1, 2, 100, 60, 90));
		list.add(new Student("�ڹ�¯", 1, 1, 100, 100, 100));
		list.add(new Student("�ְ��", 1, 3, 100, 80, 60));
		list.add(new Student("ȫ�浿", 2, 1, 50, 80, 100));
		list.add(new Student("������", 2, 3, 70, 80, 100));
		list.add(new Student("������", 2, 4, 80, 80, 85));
		list.add(new Student("�̿���", 2, 2, 90, 90, 90));
		Collections.sort(list);
		printList(list);
	}

	public static void printList(List<Student> list) {
		System.out.println("�̸�\t��\t��ȣ\t����\t����\t����\t���� ");
		System.out.println("====================================================");

		for (Student s : list) {
			System.out.println(s);
		}

		System.out.println("====================================================");
	}
}

class Student implements Comparable<Student> {
	String name;
	int classNo, studentNo, Korean, Math, English, Total;
	public Student(String name, int classNo, int studentNo, int Korean, int Math, int English) {
		this.name=name;
		this.classNo=classNo;
		this.studentNo=studentNo;
		this.Korean=Korean;
		this.Math=Math;
		this.English=English;
		this.Total=Korean+Math+English;
	}
	@Override
	public String toString() {
		return name+'\t'+classNo+'\t'+studentNo+'\t'+Korean+'\t'+Math+'\t'+English+'\t'+Total;
	}
	@Override
	public int compareTo(Student obj) {
		if(this.Total==obj.Total) {
			return 0;
		}else if(this.Total<obj.Total) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

