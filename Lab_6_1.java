import java.util.*;
public class Lab_6_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student stu=new Student();
        System.out.println("Enter A Student id_no");
        int id_no=sc.nextInt(); 
        System.out.println("Enter A Student Subject");
        int no_of_subjects_registered=sc.nextInt();
        
        for(int i=1;i<=no_of_subjects_registered;i++){
            stu.subject_credits[]=subject_credits[];
        }
    }
}

class student{
    int id_no;
    int no_of_subjects_registered;
    String subject[];
    int subject_credits[];
    String grade_obtained[];
    int spi;

    student(int no_of_subjects_registered){
        subject=new String[no_of_subjects_registered];
        subject_credits=new int[no_of_subjects_registered];
        grade_obtained=new String[no_of_subjects_registered];
    }
}