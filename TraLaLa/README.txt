Pasos a dar en caso de que el servidor no se pueda ejecutar (ClassDefNotFound org/Datanucleus/enhancer/Detachable):
1- Teniendo el RMI activo en todo momento (el fichero registry.bat ejecutado), crear una nueva interfaz para el fa�ade global, que extienda de Remote y que no contenga nada
2- Crear el fichero fa�ade global correspondiente con las mismas caracter�sticas (vac�o, que extienda de UnicastRemoteObject y que implemente la interfaz anteriormente creada)
3- Cambiar en el main el rebind, de tal forma que use la interfaz nueva creada en vez de la antigua
4- Ejecutar ahora el servidor, tendr�a que funcionar.
5- Eliminar el fichero creado en el paso 2 y hacer que el fa�ade global antiguo implemente la nueva interfaz
6- Volcar la antigua interfaz del fa�ade a la nueva.
7- Eliminar la antigua interfaz.
8- Ejecutar el servidor, tendr�a que funcionar.
9- Arreglar los problemas que ha causado este cambio (en la parte de cliente, que se use la nueva interfaz en vez de la antigua).

No intentar cambiar el nombre de la nueva interfaz a la antigua con el Refactor, no funcionar�a.