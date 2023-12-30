package Jobby;

public class TestStudent {
    public static void main(String[] args){
        Student st=new Student("นาย เก่ง มีดี","1234",79,86,92);
        st.calculateGrade();
        st.calculateAverage();
        st.display();
    }
}
