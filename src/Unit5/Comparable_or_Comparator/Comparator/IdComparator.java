package Unit5.Comparable_or_Comparator.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getId()==s2.getId()){
//            return 0;
            //if both id will be same then compare on the basis of name
            return s1.getName().compareTo(s2.getName());
        }else if(s1.getId()>s2.getId()){
            return 1;
        }else {
            return -1;
        }
    }
}
