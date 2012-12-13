package test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Student;
import dao.StudentDao;

public class Debug {

	public static void main(String[] args) throws IOException, SQLException {

		ApplicationContext factory = new ClassPathXmlApplicationContext("context/spring_mvc_context.xml");
		StudentDao studentDao = (StudentDao) factory.getBean("studentDao");

		new Debug().getAll(studentDao);

		new Debug().get(studentDao);
	}

	public void getAll(StudentDao studentDao) {
		List<Student> students = studentDao.getAll();
		for (Student student : students) {
			System.out.print(student.getStuId() + "\t");
			System.out.print(student.getStuName() + "\t");
			System.out.print(student.getStuGender() + "\t");
			System.out.println(student.getStuAge() + "\n");
		}
	}

	public void get(StudentDao studentDao) {
		// 查询出id是1的Student对象.
		Student student = studentDao.get(1l);
		System.out.print(student.getStuId() + "\t");
		System.out.print(student.getStuName() + "\t");
		System.out.print(student.getStuGender() + "\t");
		System.out.println(student.getStuAge() + "\n");
	}

	public void add(StudentDao studentDao) {
		// 插入一个student
		Student student = new Student();
		student.setStuId(20l);
		student.setStuName("liulang");
		student.setStuGender("2");
		student.setStuAge(23l);
		studentDao.insert(student);
	}

	public void modify(StudentDao studentDao) {
		// 修改一个student
		Student student = new Student();
		student.setStuId(20l);
		student.setStuName("sfasdfasdf");
		student.setStuGender("2");
		student.setStuAge(23l);
		studentDao.update(student);
	}

}
