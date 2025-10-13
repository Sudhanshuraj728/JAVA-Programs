
import java.util.Scanner;
class student {
    String usn;
    String name;
    int[] marks = new int[3];
    int[] credits = new int[3];

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter usn : ");
        usn = sc.nextLine();
        System.out.println("enter name: ");
        name = sc.nextLine();
        System.out.println("enter marks and credit for three subjects : ");
        for (int i = 0; i < 3; i++) {
            System.out.println("subject " + (i + 1) + " marks");
            marks[i] = sc.nextInt();
            System.out.println("subject " + (i + 1) + " credit");
            credits[i] = sc.nextInt();
            
        }
        sc.close();
    }

    double gradepoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }

    double sgpa() {
        int totalcredits = 0;
        double totalpoints = 0;
        for (int i = 0; i < 3; i++) {
            totalpoints += gradepoint(marks[i]) * credits[i];
            totalcredits += credits[i];
        }
        return totalpoints / totalcredits;
    }

    void display() {
        System.out.println("usn: " + usn);
        System.out.println("name: " + name);
        System.out.println("sgpa: " + sgpa());
    }
}

class main {
    public static void main(String args[]){
        student s = new student();
        s.read();
        s.display();
        
    }
}



