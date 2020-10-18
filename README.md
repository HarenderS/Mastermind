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

![mastermaind](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/mastermind.jpeg)

## Vista de Lógica/Diseño
- Modelo/Vista/Presentador con Presentador del Modelo con Vista Achicada

### Arquitectura
![Arquitectura](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/Arquitectura.PNG)

### Paquetes Mastermind
![PaquetesM](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteMastermind.PNG)

### Paquete Mastermind.models
![PaquetesModel](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteModel.PNG)

### Paquete Mastermind.controllers
![PaquetesView](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteControllers.PNG)

### Paquete Mastermind.views
![PaquetesView](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteView.PNG)

### Paquete Mastermind.views.console
![PaquetesView](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteViewConsole.PNG)

### Paquete Mastermind.views.graphics
![PaquetesView](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteViewGraphics.PNG)

### Paquete utils
![PaquetesUtils](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/paqueteUtils.PNG)

## Vista de Desarrollo/Implementación
![DI](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/umlVD.PNG)

## Vista de Despliegue/Física
![DF](/Mastermind/Documentation/mvp.pm.withoutDoubleDispatching/umlDF.PNG)

## Vista de Procesos
- No hay concurrencia
