# Arquitectura:

                 Cliente

                    |
                    |
             Interfaz Remota
                    |
                    |
              Stub RMI
                    |
                    |
             RMI Registry
                    |
                    |
              Servidor RMI
                    |
                    |
           Objeto Remoto


# Estructura del proyecto

JavaRMIPlatform/

├── src/
│
├── remote/
│   └── Calculadora.java
│
├── server/
│   ├── CalculadoraImpl.java
│   └── Server.java
│
└── client/
    └── Client.java

# Compilar

Desde la carpeta raíz:

```bash
javac remote/*.java server/*.java client/*.java
```

# Ejecutar Servidor

Primera terminal:

```bash
java server.Server
```

Salida:

```bash
Servidor RMI iniciado...
```

# Ejecutar cliente

Segunda terminal:

```bash
java client.Client
```

Salida:

```bash
Suma: 15
Resta: 5
Multiplicación: 50
División: 2.0
```

# Cómo funciona internamente

Cuando el cliente llama:
---------

calculadora.sumar(10,5);

realmente ocurre:
---------

Cliente
 |
 |
Stub RMI
 |
 |
Serialización
 |
 |
TCP/IP
 |
 |
Skeleton
 |
 |
Objeto remoto