package org.geeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SearchRecordsImpl implements SearchRecords{

    List<String> dataStore;
    public SearchRecordsImpl(){
        dataStore = new LinkedList<>();
    }
    @Override
    public List<String> getSearchedRecords() {
        return dataStore;
    }

    @Override
    public void recordData(String key) {
        dataStore.add(key);

    }
}
