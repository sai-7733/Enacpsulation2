import java.util.*;
class Student{
    private int S_id;
    private String S_name;
    private List<Double> grades;
    
    public int getSid(){
        return S_id;
    }
    public void setSid(int S_id){
        this.S_id=S_id;
    }
    public String getName(){
        return S_name;
    }
    public void setName(String S_name){
        this.S_name=S_name;
    }
    
    public List<Double> getGrade(){
        return grades;
    }
    public void addGrades(double grade){
        if(grades == null){
            grades=new ArrayList<>();
        }
        grades.add(grade);
    }
}
public class Main{
    public static void main(String args[]){
        Student st=new Student();
        st.setSid(1);
        st.setName("sai");
        st.addGrades(95.5);
        st.addGrades(78.9);
        System.out.println(st.getSid());
        System.out.println(st.getGrade());
        System.out.println(st.getName());
    }
}