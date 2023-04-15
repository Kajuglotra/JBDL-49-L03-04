package org.geeks;

import java.util.*;

public class SearchRecordsWithFreqImpl implements SearchRecords{
    Map<String, Keyword> dataSource; //->( pen, (pen,10)), (pencil, (pencil, 20))
    Queue<Keyword> keywordQueue;

    public SearchRecordsWithFreqImpl(){
        dataSource = new HashMap<>();
        keywordQueue = new PriorityQueue<>((o1, o2) -> o2.getCount() - o1.getCount());
    }
    @Override
    public List<String> getSearchedRecords() {
        List<String> list = new ArrayList<>();
        list.addAll(dataSource.keySet());
        return  list;
    }

    @Override
    public void recordData(String key) {
        if(keywordQueue.contains(dataSource.get(key)))
            keywordQueue.remove(dataSource.get(key));
        if(dataSource.containsKey(key)){
            dataSource.get(key).setCount(dataSource.get(key).getCount() +1);
//            Keyword keyword = dataSource.get(key);
//            Keyword tempKeyword = new Keyword(key,keyword.getCount()+1);
//            dataSource.put(key, tempKeyword);
        }else{
            dataSource.put(key,new Keyword(key, 1));
        }
        //remove the data from queue
        keywordQueue.add(dataSource.get(key));
    }
    @Override
    public Map<String,Keyword> getKeyWordWithFreq(){
        return dataSource;
    }
    //top 5 records
    @Override
    public List<String> getTopFiveRecords(){
        List<String> list = new ArrayList<>();
        for(int i=0; i<5 ;i++){
            list.add(keywordQueue.poll().getKeyword());
        }
        return list;
    }
}
