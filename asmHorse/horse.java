package asmHorse;

public class horse implements Comparable<horse> {
    private Integer rank,number;
    public Integer getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    horse(){
        rank = -1;
        number = -1;
    }
    horse(int r){
        rank = r;
        number = -1;
    }
    horse(int r, int n){
        rank = r;
        number = n;
    }
    public String toString(){
        String str = " | real speed rank # " + getRank() + " || horse number : " + getNumber() ;
        return str;
    }
    @Override
    public int compareTo(horse o) {
        return this.rank.compareTo(o.getRank());
    }
}
