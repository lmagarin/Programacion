'''
Created on 13 ene. 2019

Cubo

@author: Cristina Prieto Jalao
'''
class Cubo():
    #Constructor
    def __init__ (self,capacidad):
        self.__capacidad=capacidad  #Atributo de capacidad
        self.__contenido=0  #Atributo de contenido
  
    #Métodos getter
    #Método para obtener la capacidad
    def getCapacidad(self):
        return self.__capacidad
  
    #Método para obtener el contenido
    def getContenido(self):
        return self.__contenido

    #Método setter
    #Método para modificar el contenido
    def setContenido(self, litros):
        self.__contenido=litros
  
    #Otros métodos
    #Método para vaciar un cubo
    def vacia(self):
        self.__contenido=0

    #LLena el cubo al máximo de su capacidad
    def llena(self):
        self.__contenido=self.__capacidad
  
    #Pinta el cubo en la pantalla
    def pinta(self):
        for nivel in range (0, self.__capacidad-self.__contenido):
            print("#    #")
        for i in range (0,self.contenido):
              print("#~~~~#")
              
        print("######")
          
    #Vuelca el contenido de un cubo sobre otro
    def vuelcaEn(self, destino):
        libres=destino.getCapacidad()-destino.getContenido()
        if libres>0:
            destino.setContenido(destino.getContenido()+self.__contenido)
            self.vacia()
        else:
            self.contenido-=libres
            destino.llena()
            
#Prueba de Cubo
if __name__=="__main__":
  
  #Cremos 1º Cubo
  cubito=Cubo(2)
  cubito.contenido=0
  
  #Creamos 2º Cubo
  cubote=Cubo(7)
  cubote.contenido=0
  
  #Pintar cubito
  print("cubito: \n")
  cubito.pinta()
  
  #Pintr cubote
  print("cubote: \n")
  cubote.pinta()
  
  #Llenar el cubito y pintarlo
  print("Lleno el cubito: \n")
  cubito.llena()
  cubito.pinta()
  
  #Volvemos a pintar de nuevo cubote
  print("El cubote sigue vacio: \n")
  cubote.pinta()
  
  #Volvemos a pintar cubote
  print("Ahora vuelco el cubito en el cubote: \n")
  cubito.vuelcaEn(cubote)
  
  #Pintar cubito
  print("Cubito: \n")
  cubito.pinta()
  
  #Pintar cubote
  print("Cubote: \n")
  cubote.pinta()
  
  
        
    
    