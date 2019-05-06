'''
Created on 5 feb. 2019

@author: Usuario
'''
from Vehiculo import Vehiculo #Importo la clase Vehículo

class Bicicleta(Vehiculo):  #Subclase de Vehículo
  #Constructor
    def __init__(self,km,p):
        Vehiculo.__init__(self, km)
        self.pinones=p
    
    def hazCaballito(self):
        print("Estoy haciendo el caballito")
        print()
    