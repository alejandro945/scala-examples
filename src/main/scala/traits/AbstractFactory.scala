package model

trait AbstractFactory {
    def createAutomovil: Automovil
    def createVan: Van
} 