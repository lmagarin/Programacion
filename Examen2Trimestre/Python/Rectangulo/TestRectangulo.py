'''
Clase Test Rectángulo que usaremos para probar el funcionamiento de la clase Rectangulo

@author: Cristina Prieto Jalao

'''
from Rectangulo import Rectangulo;

if __name__=="__main__": 
    ancho=int(input('Inserte el ancho del rectángulo: '))
    alto=int(input('Inserte el alto del rectángulo: '))
        
    rectangulo=Rectangulo(ancho, alto)
    print(rectangulo)