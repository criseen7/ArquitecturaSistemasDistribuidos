# RPC Cliente-Servidor en Python usando XML-RPC

Este proyecto implementa un sistema básico de **Invocación de Procedimientos Remotos (RPC)** en Python utilizando `XML-RPC`.

El sistema permite que un cliente invoque métodos remotos alojados en un servidor como si fueran funciones locales.

---

# Arquitectura

```text
CLIENTE RPC
    ↓
HTTP + XML
    ↓
SERVIDOR RPC
    ↓
CLASE REMOTA
```

---

# Estructura del proyecto

```text
rpc-project/
│
├── servidor.py
├── cliente.py
└── README.md
```

---

# Requisitos

- Python 3.8 o superior

No se requieren librerías externas.

Se utilizan módulos estándar:

- `xmlrpc.server`
- `xmlrpc.client`

---

# Servidor RPC

## Archivo: `servidor.py`

```python
from xmlrpc.server import SimpleXMLRPCServer


class Calculadora:

    def sumar(self, a, b):
        return a + b

    def restar(self, a, b):
        return a - b

    def multiplicar(self, a, b):
        return a * b

    def dividir(self, a, b):

        if b == 0:
            return "Error: división entre cero"

        return a / b

    def potencia(self, a, b):
        return a ** b

    def factorial(self, n):

        resultado = 1

        for i in range(1, n + 1):
            resultado *= i

        return resultado


# Crear servidor RPC
server = SimpleXMLRPCServer(
    ("localhost", 8000),
    allow_none=True
)

print("Servidor RPC escuchando en puerto 8000")


# Registrar clase remota
server.register_instance(
    Calculadora()
)

# Mantener servidor activo
server.serve_forever()
```

---

# Cliente RPC

## Archivo: `cliente.py`

```python
import xmlrpc.client


# Conectar al servidor RPC
proxy = xmlrpc.client.ServerProxy(
    "http://localhost:8000/"
)

print("=== CLIENTE RPC ===")

print("Suma:", proxy.sumar(10, 5))

print("Resta:", proxy.restar(10, 5))

print("Multiplicación:", proxy.multiplicar(10, 5))

print("División:", proxy.dividir(10, 5))

print("Potencia:", proxy.potencia(2, 8))

print("Factorial:", proxy.factorial(5))
```

---

# Cómo ejecutar el proyecto

## 1. Iniciar el servidor

Abrir una terminal:

```bash
python server.py
```

Salida esperada:

```text
Servidor RPC escuchando en puerto 8000
```

---

## 2. Ejecutar el cliente

Abrir otra terminal:

```bash
python client.py
```

Salida esperada:

```text
=== CLIENTE RPC ===

Suma: 15
Resta: 5
Multiplicación: 50
División: 2.0
Potencia: 256
Factorial: 120
```

---

# Explicación técnica

## ¿Qué es RPC?

RPC (Remote Procedure Call) permite ejecutar procedimientos remotos como si fueran funciones locales.

Ejemplo:

```python
proxy.sumar(10, 5)
```

Aunque parece local, realmente:

1. El cliente serializa la petición en XML
2. La petición viaja por HTTP
3. El servidor ejecuta el método
4. El resultado se serializa
5. El cliente recibe la respuesta

---

# Conceptos de sistemas distribuidos implementados

| Concepto | Implementado |
|---|---|
| RPC | Sí |
| Cliente-servidor | Sí |
| Comunicación distribuida | Sí |
| Serialización | XML |
| Transporte de red | HTTP |
| Procedimientos remotos | Sí |
| Middleware básico | Sí |

---

# Posibles mejoras

- Concurrencia con hilos
- TLS/SSL
- Autenticación
- Migración a gRPC
- Uso de Protocol Buffers

---

# Aplicaciones reales del RPC

RPC es utilizado en:

- microservicios
- Kubernetes APIs
- bases de datos distribuidas
- cloud computing
- middleware empresarial
- sistemas financieros distribuidos

---

# Autor

Proyecto educativo para aprendizaje de:

- Sistemas Distribuidos
- Comunicación Cliente-Servidor
- RPC en Python
- Middleware distribuido
