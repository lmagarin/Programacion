'''
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.

@author: Cristina Prieto Jalao
'''
import random

tamano=int(random.randint(10,20))

lista=[0]*tamano

print(tamano)
for i in range (tamano):
    lista[i]=random.randint(1,100)
print(lista)
  
#Suma
suma = 0
for i in lista:
  suma+=int(i)

print('Suma: ',suma)
