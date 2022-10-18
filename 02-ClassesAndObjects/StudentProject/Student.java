package StudentProject;
public class Student{
    
    //Wykaz atrybutow
    String name;
    int wiek;
    String studentIdCard;
    Boolean isStudentIdValid;
    int semesterNumber;
    float averageGrade;
    
    //Wykaz metod
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void displayInfo1(){
        System.out.println("Student Name: " + name);
        System.out.println("Semester Number: " + semesterNumber);
        System.out.println("Is student id card valid?: " + isStudentIdValid);
    }
    
    public void displayInfo2(){
        System.out.println("Student Name: " + name);
        System.out.println("Id card Number: " + studentIdCard);
        System.out.println("Average Grade: " + averageGrade);
    }
    
    public void displayAge(){
        System.out.println("Moj wiek to: " + wiek);
    }
    
    public void displaySemesterNumber(){
        System.out.println("Moj numer Semestru to : " + semesterNumber);
    }
    
    public void changeStatusStudentCardId(){
      isStudentIdValid = !isStudentIdValid;
    }
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Szymon";
        s1.wiek = 20;
        s1.studentIdCard = "123123";
        s1.isStudentIdValid = true;
        s1.semesterNumber = 3;
        s1.averageGrade = 4.5f;
        
        s1.displayInfo1();
        s1.displayInfo2();
        s1.changeStatusStudentCardId();
    }
    
}