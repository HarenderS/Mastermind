# Mastermind

#### Index
- [Requisitos](#Requisitos)
- [Vista de Lógica/Diseño](#Vista-de-LógicaDiseño)
  - [Arquitectura](#Arquitectura)
  - [Paquetes Mastermind](#Paquetes-Mastermind)
  - [Paquete mastermind.models](#Paquete-Mastermindmodels)
  - [Paquete mastermind.controllers](#Paquete-Mastermindcontrollers)
  - [Paquete mastermind.views](#Paquete-Mastermindviews)
  - [Paquete mastermind.views.console](#Paquete-Mastermindviewsconsole)
  - [Paquete Mastermind.distributed](#PaqueteMasterminddistributed)
  - [Paquete Mastermind.distributed.dispatchers](#Paquete-Masterminddistributeddispatchers)
  - [Paquete M.d.dispatchers.startAndResumeDispatcher](#Paquete-MddispatchersstartAndResumeDispatcher)
  - [Paquete M.d.dispatchers.boardDispatcher](#Paquete-MddispatchersboardDispatcher)
  - [Paquete M.d.utils](#Paquete-Mdutils)
  - [Paquete utils](#Paquete-utils)
- [Vista de Desarrollo/Implementación](#Vista-de-DesarrolloImplementación)
- [Vista de Despliegue/Física](#Vista-de-DespliegueFísica)
- [Vista de Procesos](#Vista-de-Procesos)

## Requisitos
- Funcionalidad: **Básica + undo/redo**
- Interfaz: **Gráfica y Texto**
- Distribución: **Standalone**  
- Persistencia: **No**

![mastermaind](/Mastermind/Documentation/mastermind.jpeg)

## Vista de Lógica/Diseño
- **Modelo/Vista/Presentador** con **Presentador del Modelo** con **Vista Achicada**

### Arquitectura
![Arquitectura](/Mastermind/Documentation/Arquitectura.PNG)

### Paquetes Mastermind
![PaquetesM](/Mastermind/Documentation/paqueteMastermind.PNG)

### Paquete Mastermind.models
![PaquetesModel](/Mastermind/Documentation/paqueteModel.PNG)

### Paquete Mastermind.controllers
![PaquetesController](/Mastermind/Documentation/paqueteControllers.PNG)

### Paquete Mastermind.views
![PaquetesView](/Mastermind/Documentation/paqueteView.PNG)

### Paquete Mastermind.views.console
![PaquetesViewConsole](/Mastermind/Documentation/paqueteViewConsole.PNG)

### Paquete Mastermind.distributed
![PaquetesMastermindDistributed](/Mastermind/Documentation/paqueteDistributed.png)

### Paquete Mastermind.distributed.dispatchers
![PaquetesMastermindDistributedDispatchers](/Mastermind/Documentation/paqueteDispatchers.png)

### Paquete M.d.dispatchers.startAndResumeDispatcher
![PaquetesMdDispatchersStartAndResumeDispatcher](/Mastermind/Documentation/startResumeDispatchers.png)

### Paquete M.d.dispatchers.boardDispatcher
![PaquetesMdDispatchersStartAndResumeDispatcher](/Mastermind/Documentation/boardDispatchers.png)

### Paquete M.d.utils
![PaquetesMdUtils](/Mastermind/Documentation/utilDispatchers.png)

### Paquete utils
![PaquetesUtils](/Mastermind/Documentation/paqueteUtils.PNG)

## Vista de Desarrollo/Implementación
![DI](/Mastermind/Documentation/umlVD.PNG)
![DICliente](/Mastermind/Documentation/umlVDCliente.PNG)
![DIServer](/Mastermind/Documentation/umlVDServer.PNG)

## Vista de Despliegue/Física
![DF](/Mastermind/Documentation/umlDF.PNG)

## Vista de Procesos
- No hay concurrencia
