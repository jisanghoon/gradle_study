package kr.or.dgit.bigdata.school;

import java.util.Calendar;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.school.dto.Student;
import kr.or.dgit.bigdata.school.service.StudentService;

public class StudentServieceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testSelectByAll() {
		List<Student> list = studentService.findAllStudent();
		Assert.assertNotNull(list);
		for(Student s : list){
			System.out.println(s);
		}
	}
	@Test
	public void testSelectByNo(){
		Student std=studentService.selectByNo(2);
		Assert.assertNotNull(std);
	}
	
/*	@Test
	public void testInsertItem(){
		Calendar cal=Calendar.getInstance();
		cal.set(2000, 01,01);
		
		Student insStd=new Student(4,"������2","kbm@test.co.kr",cal.getTime());
		studentService.insertItem(insStd);
		List<Student> list=studentService.findAllStudent();
		
		Assert.assertEquals(3, list.size());
	}*/
	/*@Test
	public void testDeleteItem(){
		studentService.deleteItem(4);
		Student std=studentService.selectByNo(4);
		Assert.assertNull(std);
	}*/
	
	@Test
	public void testUpdateItem(){
		Calendar cal=Calendar.getInstance();
		cal.clear();
		cal.set(2000,01,01);
		Student update=new Student(2,"������","ky@test.co.kr",cal.getTime());
		
		studentService.updateItem(update);
		
		Student selectItem=studentService.selectByNo(2);
		
		Assert.assertEquals(selectItem, update);
	}

}
