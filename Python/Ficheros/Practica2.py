'''
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.

@author: Cristina Prieto Jalao
'''

f = open('primos.dat','r')

lineas = f.readlines()
for i in lineas:
    print(i)

f.close()