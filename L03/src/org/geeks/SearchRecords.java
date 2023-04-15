package org.geeks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchRecords {

    public List<String> getSearchedRecords();

    public void recordData(String str);

    default Map<String,Keyword> getKeyWordWithFreq(){
        return null;
    }
    default List<String> getTopFiveRecords(){return null;}

}
