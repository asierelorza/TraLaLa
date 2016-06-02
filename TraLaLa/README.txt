Pasos a dar en caso de que el servidor no se pueda ejecutar (ClassDefNotFound org/Datanucleus/enhancer/Detachable):
1- Teniendo el RMI activo en todo momento (el fichero registry.bat ejecutado), crear una nueva interfaz para el façade global, que extienda de Remote y que no contenga nada
2- Crear el fichero façade global correspondiente con las mismas características (vacío, que extienda de UnicastRemoteObject y que implemente la interfaz anteriormente creada)
3- Cambiar en el main el rebind, de tal forma que use la interfaz nueva creada en vez de la antigua
4- Ejecutar ahora el servidor, tendría que funcionar.
5- Eliminar el fichero creado en el paso 2 y hacer que el façade global antiguo implemente la nueva interfaz
6- Volcar la antigua interfaz del façade a la nueva.
7- Eliminar la antigua interfaz.
8- Ejecutar el servidor, tendría que funcionar.
9- Arreglar los problemas que ha causado este cambio (en la parte de cliente, que se use la nueva interfaz en vez de la antigua).

No intentar cambiar el nombre de la nueva interfaz a la antigua con el Refactor, no funcionaría.