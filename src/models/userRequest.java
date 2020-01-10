package models;

public class userRequest {
    private String medicineName;
    private int requestUnits;

    public userRequest(String medicineName, int requestUnits) {
        this.medicineName = medicineName;
        this.requestUnits = requestUnits;
    }

 public int getRequestUnits() {
        return this.requestUnits;
 }

}
