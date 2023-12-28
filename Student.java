import java.util.*;
public class Student {
    private String name;
    private String id;
    private int scoreEng;
    private int scoreMath;
    private int scoreCom,gradeEng,gradeCom,gradeMath;
    public Student(String name,String id,int scoreEng,int scoreMAth,int scoreCom){
        setName(name);
        setId(id);
        setScoreEng(scoreEng);
        setScoreMath(scoreMAth);
        setScoreCom(scoreCom);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setScoreEng(int scoreEng){
        this.scoreEng=scoreEng;
    }
    public void setScoreMath(int scoreMAth){
        this.scoreMath=scoreMAth;
    }
    public void setScoreCom(int scoreCom){
        this.scoreCom=scoreCom;
    }
    public String setscore(int score){
        if(score>=80&&score<=100)
        return "A";
        else if(score>=70&&score<80)
        return"B";
        else if(score>=60&&score<70)
        return"C";
        else if(score>=50&&score<60)
        return"D";
        else{
            return"F";
        }   
    }
    public int gradeEng(String grade){
        if(grade=="A")
        return 4;
        else if(grade=="B")
        return 3;
        else if(grade=="C")
        return 2;
        else if(grade=="D")
        return 1 ;
        else{
            return 0;
        }
    }
    public int gradeMath(String grade){
        if(grade=="A")
        return 4;
        else if(grade=="B")
        return 3;
        else if(grade=="C")
        return 2;
        else if(grade=="D")
        return 1 ;
        else{
            return 0;
        }

    }
    public int gradeCom(String grade){
        if(grade=="A")
        return 4;
        else if(grade=="B")
        return 3;
        else if(grade=="C")
        return 2;
        else if(grade=="D")
        return 1 ;
        else{
            return 0;
        }

    }
    public  double calculateGrade() {
        int gradeEngValue = gradeEng(setscore(scoreEng));
        int gradeMathValue = gradeMath(setscore(scoreMath));
        int gradeComValue = gradeCom(setscore(scoreCom));
    
        int totalGrade = (gradeEngValue * 2 + gradeMathValue * 2 + gradeComValue * 3) / 7;
    
         System.out.println("Total Grade: " + totalGrade);
         return calculateGrade();
    }
    public void display(){
         System.out.println(name);
        System.out.println(id);
        System.out.println(setscore(gradeEng));
        System.out.println(setscore(gradeMath));
        System.out.println(setscore(scoreCom));
        System.out.println(calculateGrade());

    }
    public static void main(String[] king){
        Scanner scan=new Scanner(System.in);

        System.out.print("Name : ");
         String name = scan.next();
        System.out.print("ID : ");
        String id = scan.next();
        System.out.print("Engpoint : ");
        int scoreEng = scan.nextInt();
        System.out.print("Mathpoint : ");
        int scoreMAth = scan.nextInt();
        System.out.print("Compoint : ");
        int scoreCom = scan.nextInt();

        Student student=new Student( name, id, scoreCom, scoreEng, scoreMAth);

        student.display();
        


       

    }

    

    
    
}
