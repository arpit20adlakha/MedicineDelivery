package models;



import java.util.*;
public class Medicine {
    private String medicineName;
    private int stockUnits;
    private Date startDate;
    private Date endDate;

    public Medicine(String medicineName, int stockUnits, Date startDate, Date endDate) {
        this.medicineName = medicineName;
        this.stockUnits = stockUnits;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getStockUnits() {
        return this.stockUnits;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }



}
