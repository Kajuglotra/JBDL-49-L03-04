package org.geeks;

import java.io.*;
import java.util.*;

public class CollectionMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        SearchRecords searchRecords = new UniqueSearchImpl();
//
//        searchRecords.recordData("pen");
//        searchRecords.recordData("pen");
//        searchRecords.recordData("laptop");
//        searchRecords.recordData("pencil");
//        searchRecords.recordData("laptop");
//        searchRecords.recordData("laptop");
//        searchRecords.recordData("bottle");
//        searchRecords.recordData("chain");
//        List<String> list23 = searchRecords.getSearchedRecords();
//        System.out.println(list23);
//        List<String> list = searchRecords.getSearchedRecords();
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Map<String, Keyword> dataStore =searchRecords.getKeyWordWithFreq();
//        Iterator<Map.Entry<String,Keyword>> iterator = dataStore.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,Keyword> entrySet = iterator.next();
//            System.out.println(entrySet.getKey() +" with frequency " +entrySet.getValue().getCount());
//
//        }
//        List<String> list1 =searchRecords.getTopFiveRecords();
//        System.out.println(list1);
//        HashMap ->  key , value
//              HashSet -> key, value -> 1 record

//            Integer[] arr = new Integer[]{1,2,3,4,5};
//            List<Integer> list = Arrays.asList(arr);
//                    System.out.println(list);
//        System.out.println(searchRecords.getKeyWordWithFreq());
//        writePersonObjectToFile();
        readPersonObjectToFile();

    }
    public static void writePersonObjectToFile() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/b0293498/Downloads/JBDL-49L03/L03/temp.txt"));
        Person p1 = new Person("John", 30 , 12);
        objectOutputStream.writeObject(p1);

    }
    public static void readPersonObjectToFile() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/b0293498/Downloads/JBDL-49L03/L03/temp.txt"));
        Person person = (Person) inputStream.readObject();
        System.out.println(person);
    }
}


//list -> maintain list
//set -> unique
//1,2,4,10,3,7,2 -> 1,2,2,4,10 -> min heap
//        max -> 10, 7,
//        keywords which were searched higher (5 records)
//Heap-> ds which keeps an order ->


//String, Integer -> comparable / comparator -> asc
//        Class -> priority Queue -> comparator / comparable

//Diff between comparator and comparable

//Marker Interface => empty interfaces => java compiler only checks if the class is implementing the interface or not