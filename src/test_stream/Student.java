package test_stream;

import java.io.Serializable;

/**
*@ProjectName:
* @author ShiWeiqing
* @date 2017年11月22日 下午5:14:18
* @Description:
*/
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1343103110173516451L;
	private int ID;
	private String name;
	private int grade;
	
	
	
	public Student() {
		super();
	}
	public Student(int iD, String name, int grade) {
		super();
		ID = iD;
		this.name = name;
		this.grade = grade;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", grade=" + grade + "]";
	}
	
	

}
