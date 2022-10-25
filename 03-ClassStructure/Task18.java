import java.util.Arrays;

public class Task18 {

    public static class StudentGrades {

        String studentName;
        int numberOfGrades;
        double[] grades;
    
        StudentGrades(String name, int numberOfGrades) {
            this.studentName = name;
            this.grades = new double[numberOfGrades];
            for (int index= 0; index < numberOfGrades; index ++){
                this.grades[index] = Math.round(Math.random() * (5.5 - 2.0) + 2.0);
            }
        }

        double lowestGrade(){
            double low[] = this.grades;
            Arrays.sort(low);

            return low[0];
        }
    
        double highestGrade(){
            double high[] = this.grades;
            Arrays.sort(high);

            return high[high.length - 1];
        }
    
        int numOfGrades(){
            return this.grades.length;
        }
    
        double gradeAverage(){
            double sum = 0;
            for (double grade : this.grades){
                sum += grade;
            }
            return sum / numOfGrades();
        }
    
        void displayRecord(){
            System.out.println("Student Name : " + this.studentName);
            System.out.println("List of grades : " + Arrays.toString(this.grades));
            System.out.println("Number of grades : " + this.numOfGrades());
            System.out.println("Lowest grade : " + lowestGrade());
            System.out.println("Highest grade : " + highestGrade());
            System.out.println("Grade Average : " + gradeAverage());
            System.out.println("");
        }
    }

    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda", 4);
        StudentGrades s2 = new StudentGrades("James", 6);

        s1.displayRecord();
        s2.displayRecord();
        
    }


}
