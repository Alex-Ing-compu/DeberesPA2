# Taller práctico: Simulador de descuentos con Quarkus

**Materia:** Programación Avanzada II  
**Unidad:** 1  
**Estudiante:** Jhon Córdova

---

## Preguntas de análisis

### 1. ¿En qué parte del ejercicio se aplica IoC y en cuál DI?
* **Inversión de Control (IoC):** Se aplica al delegar la creación, gestión del ciclo de vida y destrucción de las clases de negocio (`VentaService`, `DescuentoRegular`, `DescuentoVIP`, `Auditoria`) al contenedor ArC de Quarkus, evitando instanciar manualmente las clases mediante el uso de `new`.
* **Inyección de Dependencias (DI):** Se aplica mediante la anotación `@Inject`, la cual le indica al contenedor qué dependencias debe inyectar automáticamente. En `VentaService` se utilizó inyección por **atributo** (para `CalculadoraDescuento`) e inyección por **constructor** (para `Auditoria`).

### 2. ¿Qué función cumplen los Qualifiers y por qué son necesarios?
Los Qualifiers implementados en este caso con `@Named("regular")` y `@Named("vip")` sirven para diferenciar e identificar de forma única qué implementación concreta debe inyectarse cuando existen múltiples clases (`DescuentoRegular` y `DescuentoVIP`) que implementan una misma interfaz (`CalculadoraDescuento`). Son necesarios para evitar errores de ambigüedad al realizar la inyección.

### 3. ¿Cuál es la diferencia entre `@ApplicationScoped` y `@Dependent`?
* **`@ApplicationScoped`:** Mantiene una única instancia compartida (Singleton a nivel de aplicación) durante todo el ciclo de vida de la aplicación.
* **`@Dependent`:** La instancia está ligada al ciclo de vida del objeto que la requiere; cada vez que un objeto solicita una dependencia `@Dependent`, el contenedor crea una nueva instancia exclusiva para él.

### 4. ¿Por qué las instancias `@ApplicationScoped` pueden reutilizarse entre varias ventas?
Porque el contenedor de Quarkus (ArC) crea un único objeto en memoria al inicio de la aplicación o cuando se requiere por primera vez. Las llamadas posteriores en diferentes procesos de venta utilizan exactamente esa misma instancia sin necesidad de crear objetos adicionales en memoria.

### 5. ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de `CalculadoraDescuento`?
El contenedor CDI de Quarkus (ArC) fallará al intentar iniciar la aplicación y lanzará una excepción de dependencia ambigua (`Ambiguous resolution error`), ya que no sabrá cuál de las dos implementaciones disponibles (`DescuentoRegular` o `DescuentoVIP`) debe inyectar.
---