package com.fundamentals.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/* This class goes over the lesson 17 content
* Collection Framework*/
public class Lesson17 {

    public void exampleArrayList1() {
        List<String> mylist = new ArrayList<>();
        mylist.add("Happy");
        mylist.add("Thursday");
        mylist.add("Not Monday");
        mylist.add("Where\'s Friday");

        for (String able : mylist) {
            System.out.println(able);
        }// end loop
    } // end method exampleArrayList1

    public void exampleArrayList2() {
        ArrayList<House> myHouseList = new ArrayList<>();
        myHouseList.add(new House());
        myHouseList.add(new House("Red"));
        myHouseList.add(new House("concrete", "metal", "Brown", 35));

        for (House yourHouse : myHouseList) {
            System.out.println(yourHouse.getDoorColor());
        } // end for loop

        for (int i = 0; i < myHouseList.size(); i++) {
            System.out.println(myHouseList.get(i).getRoofType());
        }// end for loop
    } // end method exampleArrayList2

    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");
        myHash.add("Quarter Stick");
        myHash.add("Smoke Bombs");
        myHash.add("Mortars");

        Iterator<String> init = myHash.iterator();
        while (init.hasNext()) {
            System.out.println(init.next());
        }// end while

    } // end method exampleHashSet

    public void exampleHashMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(15, "Days");
        myMap.put(20, "Are Here");
        myMap.put(25, "Happy");

        for (Map.Entry<Integer, String> beta : myMap.entrySet()) {
            System.out.println(beta.getKey() + " = " + beta.getValue());
        } // end for loop

    } // end method exampleHasMap

} // end class Lesson17

