'''
Created on 15 ene. 2019

Cuadrado

@author: Cristina Prieto Jalao
'''
class Cuadrado():
      #Constructor
      def __init__(self, l):
          self.__lado=l
          
      #Método para obtener el lado
      def set_Lado(self, l):
          self.__lado=l
      
      #Método para pintar el cuadrado
      def __str__(self):
          linea=""
          for i in range(0,self.__lado):
              linea=linea+" * "
          print(linea)
          
          for i in range(2, self.__lado-1):
              linea=""
              contador=0
              while contador<=self.__lado:
                  contador=contador+1
                  if contador==1 or contador==self.__lado:
                      linea=linea+" * "
                  else:
                      linea=linea+"   "
              print(linea)
              linea=linea+"\n"
              
          for i in range(0,self.__lado):
              linea=linea+" * "
          return linea

#Método principal          
if __name__=="__main__":
    miCuadradito=Cuadrado(6)
    print(miCuadradito);
