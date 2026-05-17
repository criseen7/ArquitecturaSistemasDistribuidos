# Servidor Eco (Cliente/Servidor)

Descripción breve
-----------------
Este pequeño ejemplo implementa un servidor "eco" y su cliente correspondiente. El servidor recibe mensajes de los clientes y reenvía (hace echo) exactamente el mismo texto de vuelta.

Contenido
---------
- `ServidorEco.py` — implementación del servidor eco.
- `ClienteEco.py` — cliente de ejemplo que envía mensajes y muestra las respuestas del servidor.

Requisitos
---------
- Python 3.7+ instalado.

Cómo usar
---------
1. Abrir una terminal y arrancar el servidor:

```bash
python ServidorEco.py
```

2. En otra terminal, arrancar el cliente:

```bash
python ClienteEco.py
```

3. Escribir mensajes en la entrada del cliente; el servidor devolverá el mismo texto (comportamiento "echo").

Notas
-----
- Dependiendo de tu entorno, puede que necesites usar `python3` en lugar de `python`.
- Si el servidor y el cliente están en máquinas distintas, asegúrate de ajustar la dirección/puerto en `ClienteEco.py` para apuntar al host donde corre `ServidorEco.py`.
- Si aparece un error de "port already in use", libera el puerto o cambia el puerto en el código.
