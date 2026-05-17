# Cliente-Servidor

Descripción
-----------
Ejemplo simple de arquitectura cliente-servidor con los siguientes archivos:

- `server.py` — servidor que acepta conexiones y atiende solicitudes.
- `client.py` — cliente que se conecta al servidor y envía/recibe mensajes.
- `protocol.py` — (opcional) definiciones del protocolo de comunicación usadas por ambos.

Requisitos
---------
- Python 3.7 o superior.

Ejecutar
-------
1. Iniciar el servidor en una terminal:

```bash
python server.py
```

2. Iniciar el cliente en otra terminal:

```bash
python client.py
```

3. Interactuar según las instrucciones del cliente (introducir mensajes, recibir respuestas).

Configuración
-------------
- Si el servidor escucha en una dirección o puerto específico, edita `server.py` y `client.py` para asegurar que `HOST` y `PORT` coincidan.
- Para ejecutar en otras máquinas, usa la IP del host donde el servidor corre en `client.py`.

Solución de problemas
---------------------
- "Address already in use": cambia el puerto o libera el puerto ocupado.
- "Connection refused": verifica que el servidor esté en ejecución y que el firewall no bloquee el puerto.
- Mensajes incompletos o truncados: revisa `protocol.py` para la forma en que se serializan/terminan los mensajes.
