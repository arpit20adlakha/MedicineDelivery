import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import models.Medicine;
import models.Slot;
import models.SlotStockValue;
import utils.FormatDate;
import models.userRequest;
import utils.MergeOverlappingIntervals;

public class Main {
    public static void main(String[] args) {

        Map<String, List<Medicine>> medicineStockMap = new HashMap();

        Map<String, List<SlotStockValue>> medicineSlotStockValue = new HashMap<>();

        Map<Date, List<Slot>> dateSlotListMap = new HashMap();

        List<String> medicineList = new ArrayList<String>();
        List<SlotStockValue> slotStockValues = new ArrayList<>();


        userRequest  request = new userRequest("medicine", 100);
// Test Code
//        medicineList.add("paracetamol");
//        medicineList.add("dolo");
//        String sDate = "18-Dec-2018 23:37:50";
//        String eDate = "20-Dec-2018 25:37:50";
//
//        Medicine medicine = new Medicine("paracetamol", 25, FormatDate.formatDate(sDate), FormatDate.formatDate(eDate));
//        medicineStockMap.put("paracetamol", medicine);
//        int requestSize = 100;



        Slot [] slotsPerMedicine = {};

        List<SlotStockValue> slotStockValues1 = MergeOverlappingIntervals.mergeIntervals(slotsPerMedicine);
        medicineStockMap.put("medicineName", slotStockValues1);



        for (int i=0; i < medicineList.size(); i++){

            for (Map.Entry<Date, List<Slot>> entry:  dateSlotListMap.entrySet()) {
                // For printing
                    Date currentDate = entry.getKey();

                    // Print Date Slot here
                    List<Slot> slotList =  entry.getValue();
                    for(int j=0; j< slotList.size(); j++){

                        // Print time slot here
                        if (medicineStockMap.containsKey(medicineList.get(i))){

                            List<Medicine> medicine1 = medicineStockMap.get(medicineList.get(i));
                            boolean slotAvailForMedicine = false;

                            for (int k=0;k < medicine1.size(); k++) {
                                if ((medicine1.get(k).getStartDate().compareTo(slotList.get(j).getStartTime()) < 0) && (medicine1.get(k).getEndDate().compareTo(slotList.get(j).getEndTime()) > 0) && (medicine1.get(k).getStockUnits() > request.getRequestUnits())) {
                                    slotAvailForMedicine = true;
                                    System.out.println("true");
                                }
                            }
                            if (!slotAvailForMedicine) {
                                System.out.println("false");
                            }
                        }

                    }
            }
        }


    }
}

