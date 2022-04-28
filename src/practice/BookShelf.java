//package practice;
//
//import java.util.Scanner;
//
//public class BookShelf {
//    static Scanner in = new Scanner(System.in);
//    public static void main(String[] args) {
//
//
//        for(int i=0; i < 3; i++){
//            Shelf.addBook(makeBook());
//        }
//
//        switch (in.nextInt()){
//            case 0:
//                System.out.println(Shelf.getTheBooks().get(in.nextInt()));
//                break;
//            case 1:
//                System.out.println(Shelf.isIDUnique(in.nextInt()));
//                break;
//            case 2:
//                System.out.println(Shelf.addBook(makeBook()));
//                break;
//            case 3:
//                System.out.println(Shelf.getTitleByID(in.nextInt()));
//                break;
//            case 4:
//                System.out.println(Shelf.findBookByPartialTitle(in.next()));
//                break;
//            case 5:
//                Shelf.addBook(makeBook());
//                in.nextLine();
//                System.out.println(Shelf.getAllBooksForAuthor(in.nextLine()));
//                break;
//            case 6:
//                int before = Shelf.getTheBooks().size();
//                Shelf.removeBook(in.nextInt());
//                System.out.println(before == Shelf.getTheBooks().size());
//                break;
//            case 7:
//                int before2 = Shelf.getTheBooks().size();
//                in.nextLine();
//                Shelf.removeBook(in.nextLine());
//                System.out.println(before2 == Shelf.getTheBooks().size());
//                break;
//            case 8:
//                Shelf.clearBookShelf();
//                System.out.println(Shelf.isShelfEmpty());
//                break;
//        }
//
//
//    }
//
//    // Utility to create book objects
//
//    private static Book makeBook(){
//        int id = in.nextInt();
//        in.nextLine();
//        String author = in.nextLine();
//        String title = in.nextLine();
//        int pages = in.nextInt();
//        return new Book(id, author, title, pages);
//    }
//
//}

