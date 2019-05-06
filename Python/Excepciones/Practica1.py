'''
Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

__author__ Cristina Prieto Jalao

'''
i=0
arraylist=[]
numero=0

while(i!=6):
  try:
    numero=int(input('Inserte un número: '))
    arraylist.append(numero)
    i=i+1
    
  except ValueError:
    print('Debe insertar un número entero')
    
arraylist.sort()

print('El número mayor es: '+str(arraylist[len(numero)-1]))