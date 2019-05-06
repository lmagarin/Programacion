'''
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.

__author__ Cristina Prieto Jalao
'''
diccionario={'ORDENADOR':'Computer', 'ROJO':'Red','AMARILLO':'Yellow', 'AZUL':'Blue','ROSA':'Pink',
             'NEGRO':'Black', 'BLANCO':'White', 'MESA':'Table', 'RATÓN':'Mouse', 'ESCRITORIO':'Desktop',
             'AGUA':'Water', 'PAN':'Bread', 'DORMITORIO':'Bedroom','CUARTO DE BAÑO': 'Bathroom', 'SALA DE ESTAR':'Living room',
             'COCINA':'Kitchen', 'GATO':'Cat', 'PERRO':'Dog', 'OSO':'Bear', 'LUZ':'Light'
}

palabraABuscar=input('Inserte una palabra en español: ')
solucion=palabraABuscar.upper()
print(solucion)
if diccionario.__contains__(solucion):
  print(palabraABuscar,'traducida a ingles es: ',diccionario.get(solucion))
  
else:
  print('la palabra introducida no se encuentra en el diccionario')