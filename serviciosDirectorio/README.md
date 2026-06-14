# Servicio de Directorio en Java

Implementación de un **servicio de directorio distribuido** utilizando
Java y sockets TCP.

El proyecto simula un sistema de descubrimiento de servicios donde los
proveedores registran sus servicios y los clientes pueden consultarlos
dinámicamente.

------------------------------------------------------------------------

## Objetivo

Implementar un mecanismo de **Service Discovery** básico que permita:

-   Registrar servicios
-   Buscar servicios
-   Localizar recursos distribuidos
-   Comunicar clientes con proveedores

------------------------------------------------------------------------

## Arquitectura

``` text
              Servicio Directorio

                    |
        ----------------------------
        |                          |
 Proveedor de Servicio        Cliente

     REGISTER                 LOOKUP
```

------------------------------------------------------------------------

## Estructura del proyecto

``` text
DirectoryService/

├── DirectoryServer.java
├── DirectoryClient.java
├── ServiceProvider.java
└── README.md
```

------------------------------------------------------------------------

# Componentes

## DirectoryServer

Servidor encargado de mantener el catálogo de servicios.

Funciones:

-   aceptar conexiones
-   almacenar registros
-   responder consultas
-   administrar nombres de servicios

Ejemplo:

    Calculadora -> localhost:9000
    Chat -> localhost:9001

------------------------------------------------------------------------

## ServiceProvider

Representa un servicio que desea publicarse.

Envía solicitudes:

    REGISTER Nombre Ubicación

Ejemplo:

    REGISTER Calculadora localhost:9000

------------------------------------------------------------------------

## DirectoryClient

Cliente que consulta la ubicación de servicios.

Solicitud:

    LOOKUP Calculadora

Respuesta:

    localhost:9000

------------------------------------------------------------------------

# Protocolo utilizado

La comunicación usa mensajes de texto sobre TCP.

## Registro

Cliente:

    REGISTER Servicio Direccion

Servidor:

    REGISTERED

------------------------------------------------------------------------

## Consulta

Cliente:

    LOOKUP Servicio

Servidor:

    Direccion del servicio

------------------------------------------------------------------------

## Lista de servicios

Cliente:

    LIST

Servidor:

    {Servicio=Direccion}

------------------------------------------------------------------------

# Ejecución

Compilar:

``` bash
javac *.java
```

------------------------------------------------------------------------

## Iniciar servidor de directorio

``` bash
java DirectoryServer
```

Salida:

    Servicio de directorio activo...

------------------------------------------------------------------------

## Registrar servicio

``` bash
java ServiceProvider
```

Salida:

    REGISTERED

------------------------------------------------------------------------

## Buscar servicio

``` bash
java DirectoryClient
```

Salida:

    Servidor encontrado:

    localhost:9000

------------------------------------------------------------------------

# Conceptos de Sistemas Distribuidos

  Concepto                  Implementado
  ------------------------- --------------
  Cliente-servidor          Sí
  Servicio de nombres       Sí
  Registro de servicios     Sí
  Descubrimiento dinámico   Sí
  Comunicación TCP          Sí
  Concurrencia              Sí
  Naming Service            Sí

------------------------------------------------------------------------

# Aplicaciones reales

Este concepto es utilizado en:

-   microservicios
-   cloud computing
-   Kubernetes
-   arquitecturas distribuidas
-   sistemas empresariales

Ejemplos reales:

-   DNS
-   LDAP
-   Eureka
-   Consul
-   ZooKeeper

------------------------------------------------------------------------

# Mejoras futuras

Posibles extensiones:

-   Base de datos para persistencia
-   Heartbeat de servicios
-   TTL de registros
-   Balanceador de carga
-   Replicación
-   Autenticación
-   Comunicación cifrada

------------------------------------------------------------------------

# Tecnologías

-   Java
-   TCP/IP
-   Programación distribuida
-   Arquitecturas cliente-servidor

------------------------------------------------------------------------

# Autor

Cristofer Raziel

Proyecto educativo de Arquitectura de Sistemas Distribuidos.
