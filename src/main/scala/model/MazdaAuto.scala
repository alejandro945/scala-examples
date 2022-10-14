package model

class MazdaAuto(m:Int, d:Int, b:String) extends Automovil {
    def model = m
    def amountOfDoors = d
    def brand = b
    def run = {
        print("Mazda Nitro")
    }
}

