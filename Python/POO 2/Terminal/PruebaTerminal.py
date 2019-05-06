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
from Terminal import Terminal

if __name__ == '__main__':
    
    #Creamos los objetos
    t1= Terminal("678 11 22 23")
    t2= Terminal("644 74 44 68")
    t3= Terminal("622 32 89 09")
    t4= Terminal("664 73 98 18")
    
    #Imprimimos los terminales antes de realizar llamadas
    print(t1)
    print(t2)
    
    #Realizamos llamadas
    t1.llama(t2, 320)
    t2.llama(t3, 200)
    
    #Imprimimos los terminales después de realizar las llamadas
    print(t1)
    print(t2)
    print(t3)
    print(t4)