package org.geeks;

import java.util.*;

public class SearchRecordsWithFreqImpl implements SearchRecords{
    Map<String, Keyword> dataSource; //->( pen, (pen,10)), (pencil, (pencil, 20))

    public SearchRecordsWithFreqImpl(){
        dataSource = new HashMap<>();
    }
    @Override
    public List<String> getSearchedRecords() {
        List<String> list = new ArrayList<>();
        list.addAll(dataSource.keySet());
        return  list;
    }

    @Override
    public void recordData(String key) {
        if(dataSource.containsKey(key)){
            Keyword keyword = dataSource.get(key);
            Keyword tempKeyword = new Keyword(key,keyword.getCount()+1);
            dataSource.put(key, tempKeyword);
        }else{
            dataSource.put(key,new Keyword(key, 1));
        }
    }
    @Override
    public Map<String,Keyword> getKeyWordWithFreq(){
        return dataSource;
    }
}
