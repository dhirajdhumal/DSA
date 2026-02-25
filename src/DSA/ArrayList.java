package DSA;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> names = new java.util.ArrayList<>();

        //For adding element use - names.add("Dhiraj")
        names.add("Dhiraj");
        names.add("Jay");
        names.add("Adesh");

        //Printing DSA.ArrayList Use Only DSA.ArrayList name - Like here - (DSA.ArrayList)
        System.out.println("DSA.ArrayList elements - " + names);

        //For inserting using index use - names.add(index, value)
        System.out.println("before inserting - " + names);
        names.add(1, "Kausalya");
        System.out.println("after inserting element at index 1 - " + names);

        //For access any element in DSA.ArrayList use - names.get(index)
        System.out.println("Getting any element using get Method with its index " + "[" + names.get(2) + "]");

        //For updating elements use - names.set(index, value)
        System.out.println("before updating " + names);
        names.set(1, "Vishal");
        System.out.println("after updating element at index 1 - " + names);

        //For Removing elements use - names.remove(index)
        System.out.println("before removing - " + names);
        names.remove(1);
        System.out.println("after removing element of index 1 - " + names);

        //For checking size of DSA.ArrayList use - names.size()
        System.out.println("Checking size of arraylist - " + names.size());

        //For checking element are exist or not use - names.contains(value) - it return true or false
        System.out.println("Checking element is exist or not - " + names.contains("Jay"));

        //clear()	Remove all
        System.out.println("before removing DSA.ArrayList - " + names);
        names.clear();
        System.out.println("after removing DSA.ArrayList - " + names);


        //isEmpty()	Check empty
        System.out.println("checking DSA.ArrayList is empty or not it gives true or false - " + names.isEmpty());

        //indexOf()	Get index - if element exist in DSA.ArrayList it gives index of that particular element else gives -1
        System.out.println("Getting Index of any element - " + names.indexOf("Jay"));

        //toArray()	Convert to array
        names.add("Jay");
        names.add("Dhiraj");
        System.out.println("before converting to array - " + names);
        String arr[] = names.toArray(new String[0]);
        System.out.println("Converting DSA.ArrayList into Array - " + Arrays.toString(arr));


        //Looping in array
        for(int i=0; i<names.size(); i++){
            System.out.println("Using normal loop - " + names.get(i) + " ");
        }

        //Enhanced For Loop
        for(String s : names){
            System.out.println("Using enhanced For Loop - " + s);
        }
    }
}