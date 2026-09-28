package ejercicio01;

public class Hora {
    // Usamos 'protected' para que las clases hijas puedan acceder a los atributos directamente
    protected int hora;
    protected int minutos;

    // Constructor
    public Hora(int hora, int minutos) {
        // Asignamos 0 por defecto por si los valores de entrada no son válidos
        this.hora = 0;
        this.minutos = 0;
        
        // Usamos los setters para validar la entrada
        setHora(hora);
        setMinutos(minutos);
    }

    // Incrementa la hora en un minuto
    public void inc() {
        this.minutos++;
        if (this.minutos > 59) {
            this.minutos = 0;
            this.hora++;
            if (this.hora > 23) {
                this.hora = 0; // Reinicia a la medianoche si pasa de las 23
            }
        }
    }

    // Asigna los minutos si el valor es válido
    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.minutos = valor;
            return true;
        }
        return false;
    }

    // Asigna la hora si el valor es válido
    public boolean setHora(int valor) {
        if (valor >= 0 && valor <= 23) {
            this.hora = valor;
            return true;
        }
        return false;
    }

    // Representación en texto
    @Override
    public String toString() {
        // String.format("%02d", minutos) asegura que si el minuto es 5, imprima "05"
        return hora + ":" + String.format("%02d", minutos);
    }
}