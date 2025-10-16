package StudentInfo;

public class StudentInfo {

     public String showStudentInfo(String name, int age, double gpa) {
        // pakai format \n di akhir tiap baris
        return "Name: " + name + "\n" +
               "Age : " + age + "\n" +
               "GPA : " + gpa + "\n";
    }
    
}