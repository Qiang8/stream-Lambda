package test_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

/**
*@ProjectName:
* @author ShiWeiqing
* @date 2017��11��22�� ����5:16:49
* @Description:
*/
public class TestStream {
	
	@Test
	public void test1(){
		String[]names={"��1","��2","��3","��4","��5","��6","��7","��8","��9","��10","��11","��12","��13","��14","��15",
				"��16","��17","��18","��19","��20","��21","��22","��23","��24","��25","��26","��27","��28","��29","��30",
				"��31","��32","��33","��34","��35","��36","��37","��38","��39","��40","��41","��42","��43","��44","��45",
				"��46","��47","��48","��49","��50"};
		int[]mark={90,70,65,60,80,95,75,100,90,70,65,60,80,95,75,100,90,70,65,60,80,95,75,100,90,70,65,60,80,95,75,100,90,70,65,60,
				80,95,75,100,90,70,65,60,80,95,75,100,75,80};
		List<Student>stuList=new ArrayList<Student>();
		for (int i = 0; i < 50; i++) {
			stuList.add(new Student(i+1, names[i], mark[i]));
		}

		List<Student> list1 = stuList.stream().filter(s->s.getGrade()==65).collect(Collectors.toList());
		List<Student> list2 = stuList.stream().filter(s->s.getGrade()==70).collect(Collectors.toList());
		List<Student> list3 = stuList.stream().filter(s->s.getGrade()==75).collect(Collectors.toList());
		List<Student> list4 = stuList.stream().filter(s->s.getGrade()==80).collect(Collectors.toList());
		List<Student> list5 = stuList.stream().filter(s->s.getGrade()==85).collect(Collectors.toList());
		List<Student> list6 = stuList.stream().filter(s->s.getGrade()==90).collect(Collectors.toList());
		List<Student> list7 = stuList.stream().filter(s->s.getGrade()==95).collect(Collectors.toList());
		List<Student> list8 = stuList.stream().filter(s->s.getGrade()==100).collect(Collectors.toList());
		
		List<List>list=new ArrayList<>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		list.add(list5);
		list.add(list6);
		list.add(list7);
		list.add(list8);
		
		for (List list9 : list) {
			for (Object object : list9) {
				Student stu=(Student)object;
				System.out.print(stu.getID()+"="+stu.getName()+"\t");
			}
			System.out.println();
		}
		
	}

}
