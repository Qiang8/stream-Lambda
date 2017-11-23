package test_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

/**
*@ProjectName:
* @author ShiWeiqing
* @date 2017年11月22日 下午5:16:49
* @Description:
*/
public class TestStream {
	
	@Test
	public void test1(){
		String[]names={"张1","张2","张3","张4","张5","张6","张7","张8","张9","张10","张11","张12","张13","张14","张15",
				"张16","张17","张18","张19","张20","张21","张22","张23","张24","张25","张26","张27","张28","张29","张30",
				"张31","张32","张33","张34","张35","张36","张37","张38","张39","张40","张41","张42","张43","张44","张45",
				"张46","张47","张48","张49","张50"};
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
