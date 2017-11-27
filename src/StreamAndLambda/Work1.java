package StreamAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


import java.util.Map;
public class Work1 {
	public static void main(String[] args) {
	  int [] scores = { 100,95,90,85,80,75,70,60};
		  List <Student> students = new ArrayList<>();
		  int count = 50;
			for (int i = 0; i < count; i++) {
				Student student = new Student();
				int sScore = getScoreByRandom(scores);
				student.setCardId(i);
				student.setName("学生"+i);				
				student.setScore(sScore);
				students.add(student);
			}
		
			System.out.println("所有学生：");
			for(Student student: students) {
				System.out.println(student);
				}
			makeGroup(students);
			}
	 
	//获取指定数组随机数值
	 public static int getScoreByRandom(int [] arr) {
		 Random ran =new Random();
		 int  l =arr.length;
		 int index = ran.nextInt(l)%l;
		return arr[index];
		 
	 }

	 public static void makeGroup(List<Student> students) {
		Map<Integer, List<Student>> collect = students.stream()
				.collect(Collectors.groupingBy(Student::getScore));
			//获取对应分数的学生数
		for(Integer i:collect.keySet()){
		 long count =collect.get(i).stream().count();
		 System.out.println("成绩是"+i+"的学生有"+count);
		 //打印对应分数学生信息
		 collect.get(i).stream().forEach(l->System.out.println(l));
		 
		}
	 }
}
