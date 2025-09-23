import java.util.Scanner;
class LABPROGRAM1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Hello world");
        System.out.println("Enter a ,b,c : ");
        int  a =sc.nextInt();
        int  b =sc.nextInt();
        int  c = sc.nextInt();
        if(a==0){
            System.out.println("Not a quadratic equation");
            System.out.println("Enter a again");
            int p=sc.nextInt();
            a=p;
        }
        int d=(b*b)-(4*a*c);
        if(d==0){
            double r1=(-b)/(double)(2*a);
            System.out.println("Roots are equal");
            System.out.println("The roots are : "+r1);
        }
        else if(d>0){
            double r1 = ((-b) + (Math.sqrt(d)))/(double)((2*a));
            double r2 = ((-b) - (Math.sqrt(d)))/(double)((2*a));
            System.out.println("The roots are : " + r1 +" " + r2);
        }
        else{
            System.out.println("The roots are imaginary :");
            double r1 = (-b)/(double)(2*a);
            double r2 = ((Math.sqrt(-d)))/(double)(2*a);
            System.out.println(r2);
            System.out.println("The roots are : " + r1 + "+" + r2+"i");
            System.out.println("The roots are : " + r1 + "-" + r2+"i");
        }
    }
}
