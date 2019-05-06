'''
Created on 6 feb. 2019

@author: Cristina Prieto Jalao
'''
from Vehiculo import Vehiculo  #Importo la clase Vehiculo

class Coche(Vehiculo):  #Subclase de Vehiculo
    #Constructor
    def __init__(self, km, c):
        Vehiculo.__init__(self, km)
        self.cilindrada=c
        
    def quemaRueda(self):
        print("Estoy quemando rueda")