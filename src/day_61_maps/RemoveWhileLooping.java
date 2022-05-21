package day_61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                2, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5
        ));

        //traditional loop with remove doesnt work because index/elements get shifted so it's skipping some elements
//        for (int i = 0; i < list.size() ; i++){
//            if (list.get(i)< 5){
//                list.remove(i);
//            }
//        }

        //removing with each loop is also not valid because cannot change size of ArrayList
//        for (int each : list ){
//            if (each < 5){
//                list.remove(each);
//            }
//        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){ // checks if there is ana element next to it, if not stop the loop
            if (it.next()< 5){ // checks if next element is less than 5 and returns it
                it.remove(); // removes it if it less than 5
            }
        }

        System.out.println(list);

    }
}
