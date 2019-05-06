'''
 Crea la clase Rectángulo de forma que:
• Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
ArithmeticException.
• Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
anterior.
• Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
del libro Aprende Java con Ejercicios).
• Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
la posibilidad de comparar objetos cuadrados entre sí.
• Crea los programas de test correspondientes a ambas clases. Debes provocar que se lance la
excepción y capturarla. 

@author: Cristina Prieto Jalao
'''
class Rectangulo ():
    #Constructor
    def __init__(self, ancho, alto):
        self.set_ancho(ancho)
        self.set_alto(alto)
            
        #except ValueError:
            #print("ERROR: No se puede insertar esas dimensiones\n")

    #Propiedad para obtener el alto del rectángulo
    @property
    def alto(self):
        return self.alto
    
    #Método para modificar el alto del rectángulo
    @alto.setter
    def alto(self, alto):
        if alto>10 or alto<1:
            print("ERROR: No se puede insertar esas dimensiones\n")
        self.alto=alto
          
    #Propiedad para obtener el ancho del rectángulo
    @property
    def ancho(self):
        return self.ancho
      
    #Método para modificar el ancho del rectángulo
    @ancho.setter
    def ancho(self, ancho):
        if ancho>10 or ancho<1:
            print("ERROR: No se puede insertar esas dimensiones\n")
        self.ancho=ancho
          
    #Método para imprimir el rectángulo
    def __str__(self):
        linea = ""
        for i in range(0,self.ancho):
            linea += "[]"
        linea += "\n"
          
        for i in range(1,self.alto-1):
            for j in range(0,self.ancho):
                if j == 0 or j == self.ancho-1:
                    linea += "[]"
                else:
                    linea += "  "
        
            linea += "\n"
        
        if self.alto>1:
            for i in range(0,self.ancho):
                linea += "[]"
        
        return linea