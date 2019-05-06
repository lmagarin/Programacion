'''
Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList

@author: Cristina Prieto Jalaos
'''
from builtins import input
lista=list()

for i in range (0,10):
  lista.append(input('Inserte un número: '))