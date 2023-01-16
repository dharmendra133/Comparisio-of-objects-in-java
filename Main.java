package ComparingObjects;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student Dharmendra=new Student(1,90f);
        Student Ram=new Student(2,89f);
        Student Shyam=new Student(3,88);
        Student Hari=new Student(4,23);
        Student Sita=new Student(4,23);
        Student Gita=new Student(6,99f);

        Student[] std={Dharmendra,Ram,Shyam,Hari,Sita,Gita};

        Arrays.sort(std, (o1,o2)->(int)(o1.percent-o2.percent));

        System.out.println(Arrays.toString(std));
    }
}
