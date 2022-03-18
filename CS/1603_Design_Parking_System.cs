public class ParkingSystem {

    private int[] arr = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        arr[0] = big;
        arr[1] = medium;
        arr[2] = small;
    }
    
    public bool AddCar(int carType) {
        arr[carType-1]--;
        if(arr[carType-1] < 0){
            return false;
        }
        else{
            return true;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj.AddCar(carType);
 */
