package model

class Chevrolet extends AbstractFactory{

    def createAutomovil: Automovil = return new ChevroletAuto(2010,4,"Pro")

    def createVan: Van = return  new ChevroletVan()

}