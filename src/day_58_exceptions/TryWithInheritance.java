package day_58_exceptions;

public class TryWithInheritance {
    public static void main(String[] args) {

        try{



        } catch (IndexOutOfBoundsException e){      //from child to parent,from the most specific one to most general one

        } catch (RuntimeException e){

        } catch (Exception e){

        }


        /*

            possible references for IndexOutOfBoundsException

             IndexOutOfBoundsException obj =  new IndexOutOfBoundsException();

             RunTimeException obj =  new IndexOutOfBoundsException();

             Exception obj =  new IndexOutOfBoundsException();

         */

    }
}
