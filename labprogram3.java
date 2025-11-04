import java.util.Scanner;

class Book{
    String name,author;
    int price,pages;

    Book(String name,String author,int price,int pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    public String toString(){
        String name,author,price,pages;
        name = "Book name: "+this.name+"\n";
        author = "Author name: "+this.author+"\n";
        price = "Price: "+this.price+"\n";
        pages = "Pages: "+this.pages+"\n";
        return name+author+price+pages;
    }
}

public class Lp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, price,pages;
        String name,author;
        System.out.println("enter no of books");
        n = sc.nextInt();
        sc.nextLine();
        Book b[] = new Book[n];
        for(int i = 0 ;i<n;i++){
            System.out.println("enter name");
            name = sc.nextLine();
            System.out.println("enter author");
            author = sc.nextLine();
            System.out.println("enter price");
            price = sc.nextInt();
            System.out.println("enter pages");
            pages = sc.nextInt();
            b[i] = new Book(name,author,price,pages);
            sc.nextLine();
        }
        for(int i = 0;i<n;i++)
            System.out.println(b[i]);
    }
}
