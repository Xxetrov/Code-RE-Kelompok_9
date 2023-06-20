public class Credit {

    private int credit;
    
    public void setCredit(int c) {
        this.credit = c;
    }
    public int getCredit() {
        return this.credit;
    }

    public boolean hasCredit() {
        if (this.credit > 0) {
            return true;
        } else {
            return false;
        }
    }
}
