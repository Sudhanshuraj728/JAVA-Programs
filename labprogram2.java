// import java.util.Scanner;
// class student {
//     String usn;
//     String name;
//     int[] marks = new int[3];
//     int[] credits = new int[3];

//     void read() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter usn : ");
//         usn = sc.nextLine();
//         System.out.println("enter name: ");
//         name = sc.nextLine();
//         System.out.println("enter marks and credit for three subjects : ");
//         for (int i = 0; i < 3; i++) {
//             System.out.println("subject " + (i + 1) + " marks");
//             marks[i] = sc.nextInt();
//             System.out.println("subject " + (i + 1) + " credit");
//             credits[i] = sc.nextInt();
            
//         }
//         sc.close();
//     }

//     double gradepoint(int marks) {
//         if (marks >= 90) return 10;
//         else if (marks >= 80) return 9;
//         else if (marks >= 70) return 8;
//         else if (marks >= 60) return 7;
//         else if (marks >= 50) return 6;
//         else if (marks >= 40) return 5;
//         else return 0;
//     }

//     double sgpa() {
//         int totalcredits = 0;
//         double totalpoints = 0;
//         for (int i = 0; i < 3; i++) {
//             totalpoints += gradepoint(marks[i]) * credits[i];
//             totalcredits += credits[i];
//         }
//         return totalpoints / totalcredits;
//     }

//     void display() {
//         System.out.println("usn: " + usn);
//         System.out.println("name: " + name);
//         System.out.println("sgpa: " + sgpa());
//     }
// }

// class main {
//     public static void main(String args[]){
//         student s = new student();
//         s.read();
//         s.display();
//     }
// }

import java.util.Scanner;
class Student{
    String name;String usn;
    int submarks[]=new int[8];
    int credits[]=new int[8];
    double sgpa;
    void getdetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=s.nextLine();
        System.out.println("Enter the usn: ");
        usn=s.nextLine();
        for(int i=0;i<8;i++){
            System.out.println("Enter the subject "+(i+1)+"marks: ");
            submarks[i]=s.nextInt();
            System.out.println("Enter the credits of subject "+(i+1)+": ");
            credits[i]=s.nextInt();
        }
    }
    int getgrade(int m){
        if(m>=90)
            return 10;
        else if (m>=80)
            return 9;
        else if (m>=70)
            return 8;
        else if(m>=60)
            return 7;
        else if(m>=50)
            return 6;
        else
            return 0;

        }
    void getSgpa(){
        double totalcredit=0;
        double totalmarks=0;
        for(int i=0;i<8;i++){
            totalmarks=totalmarks+(getgrade(submarks[i])*credits[i]);
            totalcredit=totalcredit+credits[i];
        }
        sgpa=totalmarks/totalcredit;
    }
    void ddisplay(){
        System.out.println("NAME IS: "+name);
        System.out.println("USN IS: "+usn);
        System.out.println("SGPA IS: "+sgpa);
    }
}
class Sgpa{
    public static void main(String[] args){
        Student students[]=new Student[2];
        for(int i=0;i<2;i++){
            Student a=new Student();
            a.getdetails();
            a.getSgpa();
            students[i]=a;
        }
        for(int i=0;i<2;i++){
            students[i].ddisplay();
        }
    }
}
