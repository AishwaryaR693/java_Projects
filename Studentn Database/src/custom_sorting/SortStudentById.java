package custom_sorting;

import java.util.Comparator;

import sdbs.Student;

public class SortStudentById implements Comparator<Student>{

	
	@Override
	public int compare(Student x, Student y)  {
		return x.getage()-y.getage();
		
	}
	
	
}
