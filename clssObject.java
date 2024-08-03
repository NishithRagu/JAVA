class libraryUser{  //creating class
    String name;
    int regno;
    String dept;
}

class libraryBook{
    String name;
    String author;
    int bookno;
}




public class clssObject {
    public static void main(String args[]){

            libraryUser user; //creating object
            user = new libraryUser();

            libraryBook book;
            book = new libraryBook();

            user.name = "varun";
            user.regno = 43;
            user.dept = "cs";

            System.out.println(user.name);
            System.out.println(user.regno);
            System.out.println(user.dept);

            System.out.println();

            book.name = "war and peace";
            book.author = "leo tolstoy";
            book.bookno = 112;

            System.out.println(book.name);
            System.out.println(book.author);
            System.out.println(book.bookno);
    }
}
