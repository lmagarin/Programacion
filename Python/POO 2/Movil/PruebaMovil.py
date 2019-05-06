'''
Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat.
Contenido del main
Movil m1 = new Movil("678 11 22 33", "rata");
Movil m2 = new Movil("644 74 44 69", "mono");
Movil m3 = new Movil("622 32 89 09", "bisonte");
System.out.println(m1);
System.out.println(m2);
m1.llama(m2, 320);
m1.llama(m3, 200);
m2.llama(m3, 550);
System.out.println(m1);
System.out.println(m2);
System.out.println(m3);

@author: Cristina Prieto Jalao
'''
from Movil import Movil
if __name__=='__main__':
  
    #Creamos los objetos
    m1= Movil("678 11 22 23", "rata")
    m2= Movil("644 74 44 69", "mono")
    m3= Movil("622 32 89 09", "bisonte")
    
    #Imprimimos los móviles antes de realizar las llamadas
    m1.__str__()
    m2.__str__()
    
    #Los móviles llaman
    m1.llama(m2, 320)
    m1.llama(m3, 200)
    m2.llama(m3, 550)
    
    #Volvemos a imprimir los móviles después de las llamadas
    m1.__str__()
    m2.__str__()
    m3.__str__()