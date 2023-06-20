package data_clumps.after;

import java.util.Date;

public class RentalPeriod {
    private Date start;
    private Date end;

    public RentalPeriod(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
    
