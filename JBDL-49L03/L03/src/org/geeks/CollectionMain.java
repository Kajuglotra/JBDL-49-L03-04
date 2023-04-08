package org.geeks;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionMain {

    public static void main(String[] args) {
        SearchRecords searchRecords = new SearchRecordsImpl();

        searchRecords.recordData("pen");
        searchRecords.recordData("pen");
        searchRecords.recordData("laptop");
        searchRecords.recordData("pencil");
        searchRecords.recordData("laptop");
        searchRecords.recordData("laptop");
        searchRecords.recordData("bottle");
        searchRecords.recordData("chain");
        List<String> list = searchRecords.getSearchedRecords();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        Map<String, Keyword> dataStore =searchRecords.getKeyWordWithFreq();
//        Iterator<Map.Entry<String,Keyword>> iterator = dataStore.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,Keyword> entrySet = iterator.next();
//            System.out.println(entrySet.getKey() +" with frequency " +entrySet.getValue().getCount());
//
//        }
//        System.out.println(searchRecords.getKeyWordWithFreq());
    }
}


//list -> maintain list
//set -> unique
