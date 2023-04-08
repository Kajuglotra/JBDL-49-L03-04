package org.geeks;

import java.util.*;

public class UniqueSearchImpl implements SearchRecords{
    Set<String> dataStore;

    public UniqueSearchImpl(){
        dataStore = new LinkedHashSet<>();
//        dataStore = new HashSet<>();
    }
    @Override
    public List<String> getSearchedRecords() {
        //i should put the set data into list, coz we have to return list
        List<String> list = new ArrayList<>();
        list.addAll(dataStore);
        return  list;
    }

    @Override
    public void recordData(String key) {
        dataStore.add(key);

    }
}
