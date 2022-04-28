class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.park = [big, medium, small]
        """
        self.park = []
        self.park.append(big)
        self.park.append(medium)
        self.park.append(small)
        """
        
    def addCar(self, carType: int) -> bool:
        self.park[carType-1] -= 1
        return self.park[carType-1] >= 0

# Your ParkingSystem object will be instantiated and called as such:
# obj = ParkingSystem(big, medium, small)
# param_1 = obj.addCar(carType)
