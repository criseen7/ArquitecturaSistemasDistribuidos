# Arquitectura de Sistemas Distribuidos

Repositorio educativo orientado al estudio e implementación de conceptos fundamentales de sistemas distribuidos utilizando Python.

Este proyecto reúne ejemplos prácticos relacionados con:

- Comunicación cliente-servidor
- Protocolos de paso de mensajes
- RPC (Remote Procedure Call)
- Invocación de objetos remotos
- Concurrencia
- Sockets TCP
- Middleware distribuido
- Arquitecturas distribuidas

---

# Objetivos del proyecto

El objetivo principal es comprender cómo funcionan internamente los sistemas distribuidos modernos mediante implementaciones prácticas y progresivas.

El repositorio busca servir como:

- material de aprendizaje
- laboratorio experimental
- referencia académica
- base para proyectos distribuidos más complejos

---

# Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Python 3 | lenguaje principal |
| TCP Sockets | comunicación de red |
| XML-RPC | procedimientos remotos |
| JSON | serialización |
| Threads | concurrencia |
| HTTP | transporte RPC |

---

# Contenido del repositorio

## 1. Servidor Eco (Echo Server)

Implementación básica de comunicación cliente-servidor utilizando sockets TCP.

Características:

- sockets TCP
- comunicación bidireccional
- múltiples clientes
- echo de mensajes

Conceptos:

- networking
- sockets
- TCP/IP
- streams
- concurrencia

---

## 2. Protocolo Cliente-Servidor para Paso de Mensajes

Implementación de un protocolo propio de mensajería.

Características:

- framing de mensajes
- serialización JSON
- header con longitud
- protocolo request-response

Conceptos:

- message passing
- serialización
- middleware
- protocolos distribuidos

---

## 3. RPC (Remote Procedure Call)

Sistema de invocación de procedimientos remotos usando XML-RPC.

Características:

- funciones remotas
- comunicación vía HTTP
- serialización XML
- proxy remoto

Conceptos:

- RPC
- transparencia remota
- stubs
- middleware distribuido

---

## 4. Invocación de Objetos Remotos

Implementación de objetos remotos en Python.

Características:

- métodos remotos
- objetos distribuidos
- proxies
- comunicación transparente

Conceptos:

- RMI
- objetos distribuidos
- middleware orientado a objetos

---

# Estructura general

```text
ArquitecturaSistemasDistribuidos/
│
├── echo-server/
├── protocolo-mensajes/
├── rpc/
├── objetos-remotos/
└── README.md
```

---

# Requisitos

- Python 3.8+
- pip

---

# Instalación

Clonar el repositorio:

```bash
git clone https://github.com/criseen7/ArquitecturaSistemasDistribuidos.git
```

Entrar al proyecto:

```bash
cd ArquitecturaSistemasDistribuidos
```

---

# Ejecución

## Ejecutar servidor

```bash
python server.py
```

## Ejecutar cliente

```bash
python client.py
```

---

# Conceptos de Sistemas Distribuidos Cubiertos

| Concepto | Implementado |
|---|---|
| Cliente-Servidor | Sí |
| TCP/IP | Sí |
| RPC | Sí |
| Objetos Remotos | Sí |
| Concurrencia | Sí |
| Protocolos de Mensajes | Sí |
| Serialización | Sí |
| Middleware | Sí |
| Comunicación Distribuida | Sí |

---

# Posibles mejoras futuras

- gRPC
- Protocol Buffers
- asyncio
- RabbitMQ
- Kafka
- Consenso distribuido
- Replicación
- Balanceo de carga
- Tolerancia a fallos
- Service discovery
- Docker
- Kubernetes

---

# Aplicaciones reales relacionadas

Los conceptos implementados son utilizados en:

- microservicios
- cloud computing
- sistemas financieros
- videojuegos online
- bases de datos distribuidas
- plataformas streaming
- arquitecturas event-driven

---

# Recursos recomendados

## Libros

- Designing Data-Intensive Applications — Martin Kleppmann
- Distributed Systems — Maarten van Steen
- Distributed Algorithms — Nancy Lynch

## Tecnologías modernas

- gRPC
- Kafka
- RabbitMQ
- Redis Streams
- Kubernetes

---

# Autor

Desarrollado con fines educativos para el estudio de:

- Sistemas Distribuidos
- Arquitectura de Software
- Redes
- Middleware
- Computación Distribuida

---

# Licencia

Proyecto educativo de uso libre.
