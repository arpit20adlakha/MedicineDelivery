package models;
import java.util.*;

public class Slot {
    Date startTime;
    Date endTime;

    public Slot(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }
     public Date getEndTime() {
        return this.endTime;
     }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }
}

