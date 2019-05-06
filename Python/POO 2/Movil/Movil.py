'''
Created on 21 feb. 2019

@author: Cristina Prieto Jalao
'''
from Terminal import Terminal #Importo la clase Terminal

class Movil(Terminal):
  
  #Constructor
  def __init__(self, numero, tarifa): 
      Terminal.__init__(self, numero)
      self.tarifa=tarifa
      self.totalTarificado=0
    
  #Método para llamar
  def llamar(self, Terminal, segundosDeLlamada):
      Terminal.llama(self, Terminal, segundosDeLlamada)
      minutos= segundosDeLlamada/60
    
      #Switch para asociar a cada tarifa su precio correspondiente
      if self.tarifa=="rata":
          self.totalTarificado+=minutos*0.06
        
      if self.tarifa=="mono":
          self.totalTarificado+=minutos*0.12
      
      if self.tarifa=="bisonte":
          self.totalTarificado+=minutos*0.30
        
  def __str__(self):
      Terminal.__str__(self)
      print("Nº ",self.getNumero()," - ",self.getTiempoDeConversacion(),"s de conversación - tarificados",self.totalTarificado, "  euros")
    