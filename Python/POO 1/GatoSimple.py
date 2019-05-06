'''
Created on 11. ene 2019

Gato simple

@author Cristina Prieto Jalao

'''


class GatoSimple ():
    #Constructor
    def __init__(self, sexo):
      self.__sexo=sexo
      self.color=""
      self.raza=""
      self.edad=0
      self.peso=0
  
    #Método para obtener el sexo del gato
    def get_sexo(self):
        return self.__sexo

    #Método que hace que el gato maulle
    def maulla(self):
        print("Miauuuu")
  
    #Método que hace que el gato ronronee
    def ronronea(self):
        print("Mrrrrrr")
  
    #Método para que el gato coma. A los gatos les gusta el pescado, si le damos otra cosa lo rechaza
    def come(self, comida):
        if(comida=="pescado"):
            print("Hmmm, gracias")
  
        else:
            print("Lo siento, solo como pescado")

    #Método que pone a pelear a dos gatos. Solo se van a pelear dos machos entre sí
    def pelea_con(self, contrincante):
        if self.get_sexo()=="hembra":
            print("No me gusta pelear")
        else:
            if contrincante.get_sexo()=="hembra":
                print("No peleo con gatas")
            else:
                print("Ven aquí que te vas a enterar")

#Prueba GatoSimple
if __name__=="__main__":  #Programa principal
    #Creamos el 1º Gato
    Garfield=GatoSimple("macho")
     
    #Hacemos que el gato maulle   
    print("Hola Garfield")
    Garfield.maulla()
    print()
    
    #Damos tarta al gato
    print("Toma Garfield come tarta")
    Garfield.come("tarta")
    print()
    
    #Damos pescado al gato
    print("Garfield toma pescado")
    Garfield.come("pescado")
    print()
    
    #Creamos el 2º Gato 
    Tom=GatoSimple("macho")
    
    #Damos sopa de verduras al gato
    print("Hola Tom, come sopa de verduras")
    Tom.come("sopa de verduras")
    print()
    
    #Cremos el 3º Gato
    Lisa=GatoSimple("hembra")
    
    #Gatos maullando
    print("Gatitos, a ver como maulláis")
    Garfield.maulla()
    Tom.maulla()
    Lisa.maulla()
    print()
    
    #Gatos peleando
    Garfield.pelea_con(Lisa)
    Lisa.pelea_con(Tom)
    Tom.pelea_con(Garfield)
