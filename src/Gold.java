public class Gold extends Treasure{
    int amt;



    public Gold(int amt){ // constructor to initialize value as amt
        super("Gold", String.format("A round coin with %s stamped on the front", (amt)), amt);
        this.amt = amt;
    }
    public int getValue() {
        return this.amt;
    }





}