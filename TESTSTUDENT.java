package Apisit1;

public class TestStudent {
    public static void main(String[] args){
        Student st=new Student("นาย เก่ง มีดี","66122250028",79,86,92);
        st.calculateGrade();
        st.calculateAverage();
        st.display();
    }
}
