'''
Subclase de Rectangulo

@author: Cristina Prieto Jalao
'''
from Rectangulo import Rectangulo

class Cuadrado(Rectangulo):
      def __init__(self, alto):
          super().__init__(alto, alto);
          
      #Método para modificar el lado
      @lado.setter
      def lado(self, lado):
          self.alto=lado
          self.ancho=lado
      
      #Método para devolver el valor del lado del cuadrado
      @property
      def lado(self):
        return self.alto
      
      #Método para comparar los cuadrados
      def __gt__(self, cuadrado):
          return self.lado() > cuadrado.lado()

      def __lt__(self, cuadrado):
          return self.lado < cuadrado.lado()
  
      def __eq__(self, cuadrado):
          return self.lado == cuadrado.lado()
      
        
if __name__=="__main__": 
    #lado=int(input('Inserte el lado del cuadrado: '))
    cuadrado=Cuadrado(9)
    print(cuadrado)
    cuadrado2=Cuadrado(6)
    print(cuadrado2)
