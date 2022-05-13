package day_56_polymorphism.book;

public class RunnerLibrary {

    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programing";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextbook();
        book2.name = "Java Programing";
        book2.size = 20.5;
        //book2.fun = true; -> EBook does not have access to fun variable
        ((JavaTextbook) book2).fun = true; // cast the reference from the parent EBook to the child reference of JavaTextBook and that allows us to access the fun variable
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextbook();
        book3.name = "Java Programing";
        //book3.size = 20.5;
        //book3.fun = true;
        book3.read();
        //book3.open();
        //book3.download();
        // Book reference  has only  access to the name variable and read variable

        Downloadable book4 = new JavaTextbook();
        //book4.name = "Java Programing";
        //book4.size = 20.5;
        //book4.fun = true;
        //book4.read();
        //book4.open();
        book4.download();
        //Only thing accessible by Downloadable interface is download method

        JavaTextbook book5 = ((JavaTextbook) book4);
        //book4 was the interface reference we cast the reference to be a JavaTextbook and assigned it to the book5 reference,we are not making new object
        book5.read();
        book5.open();
        book5.fun = false;



    }
}


