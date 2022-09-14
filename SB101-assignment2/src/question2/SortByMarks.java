package question2;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	@Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks()>o2.getMarks())
            return 1;
        else if (o1.getMarks()<o2.getMarks()) {
            return  -1;

        }
        else return 0;
    }
	
}
