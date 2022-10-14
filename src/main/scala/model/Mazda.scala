package model

class Mazda extends  AbstractFactory {

    def createAutomovil: Automovil = return new MazdaAuto(2010,4,"Premium")

    def createVan: Van = return new MazdaVan()

    
}