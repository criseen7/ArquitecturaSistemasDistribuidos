# Invocación de Objetos Remotos

Descripción
-----------
Ejemplo básico de invocación de objetos remotos. El repositorio contiene una implementación cliente/servidor donde el cliente invoca operaciones expuestas por objetos en el servidor.

Archivos
-------
- `Server.py` — servidor que expone objetos/servicios remotos.
- `Client.py` — cliente que se conecta al servidor y realiza invocaciones remotas.

Requisitos
---------
- Python 3.7 o superior.
- Si el proyecto usa una biblioteca específica para RMI (por ejemplo `Pyro4`), instala las dependencias necesarias. Si no estás seguro, revisa `Server.py` y `Client.py`.

Ejecución
--------
1. Inicia el servidor en una terminal:

```bash
python Server.py
```

2. En otra terminal, ejecuta el cliente:

```bash
python Client.py
```

3. Sigue las instrucciones que muestre el cliente para invocar métodos remotos.

Configuración
-------------
- Ajusta `HOST` y `PORT` en `Server.py` y `Client.py` si es necesario.
- Si se requiere autenticación o un registry, consulta los comentarios dentro de `Server.py`.

Resolución de problemas
----------------------
- `Connection refused`: asegúrate de que el servidor esté en ejecución y no haya bloqueo de firewall.
- `ImportError`: instala dependencias indicadas en los archivos o añade un `requirements.txt`.
- Errores de serialización: comprueba cómo se (de)serializan los objetos en `Client.py`/`Server.py`.
