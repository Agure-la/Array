package com.company;




import java.util.*;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array[] = {5, 10, 40, 30, 20};

        List<Elements> elements = new ArrayList<Elements>();
        for (int i =0; i < array.length; i++){
            elements.add(new Elements(i, array[i]));
        }

        //sort and print
        Collections.sort(elements);

        for (Elements element : elements) {
            System.out.println((element.value + " " + element.index));

        }

        /*
     int[] iArray = new int[] {10, 8,6,7,2,12,5};
       Arrays.sort(iArray);
       for (int i =0; i < iArray.length; i++){
           System.out.println(iArray[i]);
       }
        /*
     //sort using for loop
        for (int i =0; i < iArray.length; i++){
            for (int k = i; k < iArray.length; k++){
                //initialise a temporary array
                int temp = 0;
                if(iArray[i] > iArray[k]){
                    temp = iArray[i];
                    iArray[i] = iArray[k];
                    iArray[k] = temp;
                }
            }

            //print sorted element of array
            System.out.println(iArray[i]);
        }

         */
    }
}
