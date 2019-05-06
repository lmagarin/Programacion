'''
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.

@author: Cristina Prieto Jalao
'''
archivo = open('datos.dat','w')

def esPrimo(num):
  if num<2:
    return False
  for i in range (2,num):
    if num%i==0:
      return False
    return True
  
numPrimos=[]

for i in range(1, 500):
  if esPrimo(i)==True:
    numPrimos.append(i)
    
print(numPrimos)

for i in numPrimos:
    archivo.write(str((i))+'\n')
    
archivo.close()