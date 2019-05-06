'''
Created on 7 feb. 2019

Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.

@author: Cristina Prieto Jalao 

'''

class Tiempo:
    
    #Constructor para 3 o 1 parámetro
    def __init__(self, *args):
      if (len(args)==3):
        self.segundos=(args[0]*3600)+(args[1]*60)+args[2]
      
      elif (len(args)==1):
        self.segundos=args[0]
        
    def __str__(self):
        segundos=self.segundos
        horas=self.segundos/3600
        segundos-=horas*3600
        minutos=self.segundos/60
        segundos-=minutos*60
        
        if (self.segundos<0):
            return f"-({-horas}h {-minutos}m {-segundos}s)"
        
        else:
            return f"{horas}h {minutos}m {segundos}s"
    
    #Método para obtener los segundos
    def getSegundos(self):
        return self.segundos
    
    #Método para sumar el tiempo    
    def sumaTiempo(self, Tiempo):
        return self.segundos+Tiempo.getSegundos()
    
    #Método para restar el tiempo
    def restaTiempo(self, Tiempo):
        return self.segundos-Tiempo.getSegundos()