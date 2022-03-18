class ParkingSystem {
private:
    int park[3];
public:
    ParkingSystem(int big, int medium, int small) {
        park[0] = big;
        park[1] = medium;
        park[2] = small;
    }
    
    bool addCar(int carType) {
        if(park[carType-1] == 0){
            return false;
        }
        else{
            park[carType-1]--;
            return true;
        }
        //return park[carType-1]--;
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */
