package Deck;

public enum Rank {
    TWO(2, "two"), THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"), SIX(6, "six"),
    SEVEN(7, "seven"), EIGHT(8,"eight"),
    NINE(9, "nine"),
    JACK(10, "jack"), QUEEN(10, "queen"),
    KING(10, "two"), ACE(11, "ace");

    private final int rankVal;
    private final String rankName;

    Rank(int val, String name){
        rankVal=val;
        rankName=name;
    }

    public int getRankVal(){
        return rankVal;
    }

    @Override
    public String toString() {
        return "Rank " +
                " " + rankVal +
                ",  " + rankName
                ;
    }
}
