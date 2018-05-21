package SubirLibro;




public interface IErrors {

    /**
     * Error en la sentencia.
     */
    public static final String ERROR_STATEMENT
            = "Error al ejecutar la sentencia SQL.";
    /**
     * Error cerrar conexión.
     */
    public static final String ERROR_CLOSE_CONNECTION
            = "Error al cerrar la sentencia o conexión.";
    /**
     * Error asociación.
     */
    public static final String ERROR_BINDING
            = "Error al asociar las propiedades con las columnas resultantes.";
    /**
     * Error criterio.
     */
    public static final String ERROR_SETTING_CRITERIA
            = "Error al establecer el criterio de búsqueda.";
    /**
     * Error driver.
     */
    public static final String ERROR_DRIVER
            = "No se encontró la clase para iniciar la conexión.";
    /**
     * Error abrir conexión.
     */
    public static final String ERROR_OPEN_CONNECTION
            = "Error al iniciar la conexión de MySQL.";
}