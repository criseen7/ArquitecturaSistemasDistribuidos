# Protocolo Basado en Transacciones en Java

Implementación educativa de un protocolo distribuido basado en
transacciones utilizando Java.

Se implementa el algoritmo **Two Phase Commit (2PC)** para coordinar
transacciones distribuidas.

## Objetivo

Simular un sistema donde varios participantes deben aprobar una
operación antes de confirmar cambios.

Características:

-   Atomicidad
-   Consistencia
-   Commit
-   Rollback
-   Coordinación distribuida

## Arquitectura

``` text
              Coordinador

                   |
        ---------------------
        |                   |
 Participante A       Participante B

        PREPARE
           |
        YES / NO
           |
        COMMIT / ROLLBACK
```

## Estructura

``` text
TransactionSystem/

├── Coordinator.java
├── Participant.java
└── Main.java
```

## Componentes

### Coordinator

Controla la transacción:

-   inicia el proceso
-   solicita PREPARE
-   analiza respuestas
-   decide COMMIT o ROLLBACK

### Participant

Nodo que participa:

-   valida operación
-   responde YES/NO
-   ejecuta cambios
-   revierte cambios

## Two Phase Commit

### Fase 1: PREPARE

El coordinador pregunta:

    ¿Puedes realizar la operación?

Respuestas:

    YES
    NO

### Fase 2: COMMIT

Si todos responden YES:

    COMMIT

Los participantes aplican cambios.

Si existe un rechazo:

    ROLLBACK

Los participantes cancelan.

## Ejecución

Compilar:

``` bash
javac *.java
```

Ejecutar:

``` bash
java Main
```

## Conceptos implementados

  Concepto                     Estado
  ---------------------------- --------------
  Sistemas distribuidos        Implementado
  Transacciones distribuidas   Implementado
  Coordinador                  Implementado
  Participantes                Implementado
  Commit                       Implementado
  Rollback                     Implementado
  Two Phase Commit             Implementado

## Limitaciones

-   Punto único de fallo en coordinador
-   Sin persistencia
-   Sin comunicación real por red

## Mejoras futuras

-   Sockets TCP
-   Logs de transacciones
-   Recuperación ante fallos
-   Timeouts
-   Saga Pattern
-   Raft

## Tecnologías

-   Java
-   Redes
-   Sistemas Distribuidos

## Autor

@criseen

Proyecto educativo de Arquitectura de Sistemas Distribuidos.
