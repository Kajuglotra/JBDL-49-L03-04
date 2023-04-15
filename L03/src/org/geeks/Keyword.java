package org.geeks;

public class Keyword{
    private String keyword;
    private int count;

    public Keyword(String keyword, int count) {
        this.keyword = keyword;
        this.count = count;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "keyword='" + keyword + '\'' +
                ", count=" + count +
                '}';
    }
    // generic method
//    @Override
//    public int compareTo(Object o) {
//        Keyword keyword1 = (Keyword) o;
//        if(keyword1.getCount() > this.getCount()){
//            return 1;
//        }else if(keyword1.getCount() < this.getCount()){
//            return -1;
//        }
//        else{
//            return 0;
//        }
//        return keyword1.getCount() - this.getCount();

//    }
}
