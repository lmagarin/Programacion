'''
Created on 7 feb. 2019

Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla.
Contenido del main
Terminal t1 = new Terminal("678 11 22 33");
Terminal t2 = new Terminal("644 74 44 69");
Terminal t3 = new Terminal("622 32 89 09");
Terminal t4 = new Terminal("664 73 98 18");
System.out.println(t1);
System.out.println(t2);
t1.llama(t2, 320);
t1.llama(t3, 200);
System.out.println(t1);
System.out.println(t2);
System.out.println(t3);
System.out.println(t4);
Salida
Nº 678 11 22 33 - 0s de conversación
Nº 644 74 44 69 - 0s de conversación
Nº 678 11 22 33 - 520s de conversación
Nº 644 74 44 69 - 320s de conversación
Nº 622 32 89 09 - 200s de conversación
Nº 664 73 98 18 - 0s de conversación

@author: Cristina Prieto Jalao
'''
class Terminal:
  
    #Constructor
    def __init__(self, numero):
        self.numero=numero
        self.tiempoDeConversacion=0
    
    #Método para obtener el número
    def getNumero(self):
        return self.numero
      
    #Método para modificar el número
    def setNumero(self, numero):
        self.numero=numero
        
    #Método para obtener el tiempo de conversación
    def getTiempoDeConversacion(self):
        return self.tiempoDeConversacion
      
    #Método para modificar el tiempo de conversación
    def setTiempoDeConversacion(self, tConver):
        self.tiempoDeConversacion=tConver
        
    #Método para llamar a un terminal
    def llama(self, Terminal, segundosDeLlamada):
        self.tiempoDeConversacion+=segundosDeLlamada
        Terminal.tiempoDeConversacion+=segundosDeLlamada
        