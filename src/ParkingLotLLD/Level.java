package ParkingLotLLD;

import ParkingLotLLD.VehicleImpl.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Level {

    List<ParkingSpot> parkingSpotList;
    int floorLevel;

    Level(int floorLevel, int noOfSpots) {
        this.floorLevel = floorLevel;
        this.parkingSpotList = new ArrayList<>(noOfSpots);

        double bikeSpotRatio = 0.5;
        double carSpotRatio = 0.4;

        int numOfBikeSpots = (int) (bikeSpotRatio * noOfSpots);
        int numOfCarSpots = (int) (carSpotRatio * noOfSpots);


        //initialising Bike spots
        for (int i = 0; i < numOfBikeSpots; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.BIKE));
        }

        for (int i = numOfBikeSpots; i < numOfCarSpots; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.CAR));
        }

        for (int i = numOfBikeSpots + numOfCarSpots + 1; i <= noOfSpots; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.TRUCK));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isAvailable() && parkingSpot.parkingSpotType == vehicle.getVehicleType()) { // we dot need to check twice
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unParkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (!parkingSpot.isAvailable() && parkingSpot.getVehicleParked().getLicensePlate().equals(vehicle.getLicensePlate())) {
                parkingSpot.unParkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public void displayAvailability() {
        System.out.println("Floor" + this.floorLevel + "availability");
        for (ParkingSpot parkingSpot : parkingSpotList) {
            System.out.println("SpotNo:" + parkingSpot + " " + (parkingSpot.isAvailable() ? "Available for" : "Occupied by" + parkingSpot.parkingSpotType));
        }
    }


}
