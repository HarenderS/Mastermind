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
  - [Paquete mastermind.views.graphics](#Paquete-Mastermindviewsgraphics)
  - [Paquete utils](#Paquete-utils)
- [Vista de Desarrollo/Implementación](#Vista-de-DesarrolloImplementación)
- [Vista de Despliegue/Física](#Vista-de-DespliegueFísica)
- [Vista de Procesos](#Vista-de-Procesos)

## Requisitos
- Funcionalidad: Básica
- Interfaz: Texto         
- Distribución: Standalone  
- Persistencia: No     

![mastermaind](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/mastermind.jpeg)

## Vista de Lógica/Diseño
- Modelo/Vista/Presentador con Presentador del Modelo con Vista Achicada


### Arquitectura
![Arquitectura](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/Arquitectura.PNG)

### Paquetes Mastermind
![PaquetesM](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteMastermind.PNG)

### Paquete Mastermind.models
![PaquetesModel](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteModel.PNG)

### Paquete Mastermind.controllers
![PaquetesView](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteControllers.PNG)

### Paquete Mastermind.views
![PaquetesView](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteView.PNG)

### Paquete Mastermind.views.console
![PaquetesView](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteViewConsole.PNG)

### Paquete Mastermind.views.graphics
![PaquetesView](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteViewGraphics.PNG)

### Paquete utils
![PaquetesUtils](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/paqueteUtils.PNG)

## Vista de Desarrollo/Implementación
![DI](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/umlVD.PNG)

## Vista de Despliegue/Física
![DF](/Mastermind/Documentation/mvp.pm.withDoubleDispatching/umlDF.PNG)

## Vista de Procesos
- No hay concurrencia
