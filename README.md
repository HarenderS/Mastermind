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
  - [Paquete utils](#Paquete-utils)
- [Vista de Desarrollo/Implementación](#Vista-de-DesarrolloImplementación)
- [Vista de Despliegue/Física](#Vista-de-DespliegueFísica)
- [Vista de Procesos](#Vista-de-Procesos)

## Requisitos
- Funcionalidad: **Básica + undo/redo**
- Interfaz: **Gráfica y Texto**
- Distribución: **Standalone**  
- Persistencia: **No**

![mastermaind](/Mastermind/Documentation/mvp.pm.withComposite/mastermind.jpeg)

## Vista de Lógica/Diseño
- **Modelo/Vista/Presentador** con **Presentador del Modelo** con **Vista Achicada**
  - **Patrón Command**, para el menú
  - **Patrón Composite**, para multi-controladores
  - **Patrón Memento**, para la funcionalidad undo/redo

### Arquitectura
![Arquitectura](/Mastermind/Documentation/mvp.pm.withComposite/Arquitectura.PNG)

### Paquetes Mastermind
![PaquetesM](/Mastermind/Documentation/mvp.pm.withComposite/paqueteMastermind.PNG)

### Paquete Mastermind.models
![PaquetesModel](/Mastermind/Documentation/mvp.pm.withComposite/paqueteModel.PNG)

### Paquete Mastermind.controllers
![PaquetesController](/Mastermind/Documentation/mvp.pm.withComposite/paqueteControllers.PNG)

### Paquete Mastermind.views
![PaquetesView](/Mastermind/Documentation/mvp.pm.withComposite/paqueteView.PNG)

### Paquete Mastermind.views.console
![PaquetesViewConsole](/Mastermind/Documentation/mvp.pm.withComposite/paqueteViewConsole.PNG)

### Paquete utils
![PaquetesUtils](/Mastermind/Documentation/mvp.pm.withComposite/paqueteUtils.PNG)

## Vista de Desarrollo/Implementación
![DI](/Mastermind/Documentation/mvp.pm.withComposite/umlVD.PNG)

## Vista de Despliegue/Física
![DF](/Mastermind/Documentation/mvp.pm.withComposite/umlDF.PNG)

## Vista de Procesos
- No hay concurrencia
