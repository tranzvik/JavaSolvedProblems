package ParkingLotLLD;

import ParkingLotLLD.VehicleImpl.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingBuilding {

    List<Level> parkingFloorLevels;


    private static ParkingBuilding parkingBuildingInstance;

    private ParkingBuilding() {
        parkingFloorLevels = new ArrayList<>(5);
    }

    //SingleTon with double locking as multiple threads can reach at same time
    public static ParkingBuilding getParkingInstance() {
        if (parkingBuildingInstance == null) {
            synchronized (ParkingBuilding.class) {
                if (parkingBuildingInstance == null) {
                    parkingBuildingInstance = new ParkingBuilding();
                }
            }
        }
        return parkingBuildingInstance;
    }

    public void addParkingLevels(Level level) {
        parkingFloorLevels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : parkingFloorLevels) {
            level.parkVehicle(vehicle);
            return true;
        }
        return false;
    }

    public boolean UnparkVehicle(Vehicle vehicle) {
        for (Level level : parkingFloorLevels) {
            level.unParkVehicle(vehicle);
            return true;
        }
        return false;
    }

    public void displayAvailability() {
        for (Level level : parkingFloorLevels) {
            level.displayAvailability();
        }
    }


}
