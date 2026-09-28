package ejercicio01;

public class HoraExacta extends Hora {
    private int segundos;

    // Constructor
    public HoraExacta(int hora, int minutos, int segundos) {
        // Llamamos al constructor de la clase padre (Hora)
        super(hora, minutos);
        this.segundos = 0;
        
        // Validamos e inicializamos los segundos
        setSegundo(segundos);
    }

    // Asigna los segundos si el valor es válido
    public boolean setSegundo(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.segundos = valor;
            return true;
        }
        return false;
    }

    // Sobrescribe el método inc() para incrementar en segundos
    @Override
    public void inc() {
        this.segundos++;
        if (this.segundos > 59) {
            this.segundos = 0;
            // Si los segundos pasan de 59, se reinician y usamos el inc() de la clase padre
            // para que sume un minuto automáticamente.
            super.inc(); 
        }
    }

    // Sobrescribe el método toString para incluir los segundos
    @Override
    public String toString() {
        // %02d asegura que siempre haya dos dígitos (ej. 03:05:08)
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}