package ComparingObjects;

public class Student implements Comparable<Student> {
    int roll;
    float percent;

    public Student(int roll,float percent){
        this.roll=roll;
        this.percent=percent;
    }
    @Override
    public String toString(){
        return roll+" "+percent;
    }
    @Override
    public int compareTo(Student s){
        int diff=(int) (this.percent-s.percent);
        return diff;
    }
}
