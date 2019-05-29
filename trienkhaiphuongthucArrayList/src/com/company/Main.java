package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add(0, "bang1");
        myList.add(1, "bang2");
        myList.add(2, "bang3");
        myList.add(3, "bang4");
                        myList.clear();    
        System.out.println(myList.size());
        if (myList.contains("bang5"))    {
                    myList.remove(0);
        }
        System.out.println("vi tri "+myList.indexOf("bang4"));
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


    }
}
