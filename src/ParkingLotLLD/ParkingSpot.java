package ParkingLotLLD;

import ParkingLotLLD.VehicleImpl.Vehicle;

public class ParkingSpot {
    int spotNo;
    VehicleType parkingSpotType;// vehType allowed for Parking
    Vehicle vehicleParked;


    ParkingSpot(int spotNo, VehicleType vehicleType) {
        this.spotNo = spotNo;
        this.parkingSpotType = vehicleType;
    }

    public boolean isAvailable() {
        return this.vehicleParked == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (this.isAvailable() && vehicle.getVehicleType() == this.parkingSpotType) {
            this.vehicleParked = vehicle;
        } else {
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied");
        }
    }

    public void unParkVehicle(Vehicle vehicle) {
        this.vehicleParked = null;
    }

    public int getSpotNo() {
        return spotNo;
    }

    public VehicleType getParkingSpotType() {
        return parkingSpotType;
    }

    public Vehicle getVehicleParked() {
        return vehicleParked;
    }

}
