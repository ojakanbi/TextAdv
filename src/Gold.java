public class Gold extends Treasure{
    int amt;



    public Gold(int amt){ // constructor to initialize value as amt
        super("Gold", String.format("A round coin with %s stamped on the front", String.valueOf(amt)), amt);
        this.amt = amt;
    }
    public int getValue() {
        return this.amt;
    }
    public String toString() {
        return String.format("You set your eyes on a forbidding grotto," +
                " where the sound of crashing waves echoes ominously and a pile of glittering gold coins lies nearby," +
                " tempting you to uncover the hidden plunder", getValue());
    }



}