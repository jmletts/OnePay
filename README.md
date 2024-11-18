# AutoservicioPOS

Este proyecto, **AutoservicioPOS**, es un sistema automatizado de pagos que utiliza el **SDK de MercadoPago para Java**. Permite la generación dinámica de enlaces de pago e integración con la plataforma de MercadoPago. El sistema está diseñado para ser ejecutado en **Java**, configurado con **Ant** como herramienta de construcción, y desarrollado en el entorno de **NetBeans IDE**.

El objetivo principal del proyecto es ofrecer una solución eficiente para sistemas de autoservicio que requieran un proceso de pago rápido y seguro.

---

## Características

- **Integración Total con MercadoPago**:
  - Soporte para generación dinámica de enlaces de pago únicos.
  - Configuración avanzada de preferencias de pago y redirección.
  - Retorno automático después de pagos exitosos o fallidos.

- **Automatización del Proceso de Pagos**:
  - Incluye un sistema que permite generar enlaces de pago personalizados para cada transacción.
  - Configuración amigable con `Preference` y redirección según el estado del pago.

- **Entorno Preparado para el Desarrollo**:
  - Implementación lista para usar en proyectos desarrollados con NetBeans IDE.
  - Construcción y ejecución con scripts de Ant.

---

## Requisitos Previos

Antes de utilizar este sistema, asegúrate de contar con los siguientes componentes:

1. **Java Development Kit (JDK)**:
   - Versión mínima: 8
   - Probado con: JDK 11

2. **NetBeans IDE**:
   - Herramienta recomendada para edición y compilación.

3. **Ant**:
   - Utilizado para construir y ejecutar el proyecto.

4. **Dependencias**:
   Las siguientes bibliotecas son necesarias y deben estar presentes en la carpeta `lib/`:
   - **MercadoPago SDK**: `sdk-java-2.1.29.jar`
   - **Apache Commons Lang**:
     - `commons-lang-2.6.jar`
     - `commons-lang3-3.17.0.jar`
   - **Google Gson**: `gson-2.8.9.jar`
   - **Apache HttpClient**:
     - `httpclient-4.5.13.jar`
     - `httpcore-4.4.13.jar`
   - **Commons Logging**: `commons-logging-1.2.jar`
   - **Absolute Layout**: Librería visual de NetBeans.

---

## Instalación

Sigue estos pasos para instalar y configurar el proyecto:

### 1. Clonar el Repositorio
```bash

git clone https://github.com/jmletts/AutoservicioPOS.git
cd AutoservicioPOS

1. Generar Enlace Dinámico de Pago
El sistema incluye una funcionalidad que permite generar enlaces dinámicos de pago. El método generarEnlacePago se utiliza de la siguiente forma:

public String generarEnlacePago(
    String id, 
    String titulo, 
    String descripcion, 
    String imagenUrl, 
    String categoria,
    int cantidad, 
    String moneda, 
    BigDecimal precio, 
    String urlExito,
    String urlFallo, 
    String urlPendiente
)
Ejemplo de uso:

MercadoPagoService servicio = new MercadoPagoService();
String enlace = servicio.generarEnlacePago(
    "producto123",
    "Producto A",
    "Descripción del producto A",
    "https://imagen-del-producto.com/imagen.jpg",
    "categoria123",
    1,
    "PEN",
    new BigDecimal("150.00"),
    "https://mi-sitio.com/pago-exitoso",
    "https://mi-sitio.com/pago-fallido",
    "https://mi-sitio.com/pago-pendiente"
);

System.out.println("Enlace de pago: " + enlace);
2. Compilar y Ejecutar
Ejecuta los siguientes comandos desde la terminal para compilar y ejecutar el proyecto con Ant:

# Limpiar el proyecto
ant clean

# Compilar el proyecto
ant compile

# Ejecutar el proyecto
ant run
Estructura del Proyecto

AutoservicioPOS/
├── src/
│   ├── com.interfaz.*            # Interfaces gráficas
│   ├── com.mercadopago.service   # Integración con MercadoPago
│   ├── lib/                      # Dependencias (archivos .jar)
│
├── build.xml                     # Script Ant
├── README.md                     # Documentación

