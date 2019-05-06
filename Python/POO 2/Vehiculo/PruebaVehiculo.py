'''
Created on 6 feb. 2019

@author: Cristina Prieto Jalao
'''

#Importo la clase y las subclases para el método principal
from Vehiculo import Vehiculo
from Bicicleta import Bicicleta
from Coche import Coche

if __name__ == '__main__': #Método principal
 
    #Creamos los objetos
    orbea=Bicicleta(0,7)
    fiat=Coche(0,100)
    
    #Bucle para el menú
    def menu():
        print("1. Anda con la bicicleta")
        print("2. Haz el caballito con la bicicleta")
        print("3. Anda con el coche")
        print("4. Quema rueda con el coche")
        print("5. Ver kilometraje de la bicicleta")
        print("6. Ver kilometraje del coche")
        print("7. Ver kilometraje total")
        print("8. Salir")
        
    while True: #Mostramos el menú
        menu()
        
        #Insertamos la opción del menú
        opcion=input("Inserte una opción del (1-8): ")
            
        #Seleccionar una opción del menú
        if opcion=="1":
            km=int(input("¿Cuántos kilómetros quiere recorrer? \n"))
            orbea.recorre(km)
        
        elif opcion=="2":
            orbea.hazCaballito()
            
        elif opcion=="3":
            km=int(input("¿Cuántos kilometros quiere recorrer? \n"))
            fiat.recorre(km)
      
        elif opcion=="4":
            fiat.quemaRueda();
            
        elif opcion=="5":
            print("La bicicleta lleva recorridos ",orbea.getKilometrosRecorridos(),"km \n")
        
        elif opcion=="6":
            print("El coche lleva recorridos ",fiat.getKilometrosRecorridos(), " km\n")
          
        elif opcion=="7":
            print("Los vehículos llevan recorridos ",orbea.getKilometrosRecorridos()+fiat.getKilometrosRecorridos(), " km\n")
            
