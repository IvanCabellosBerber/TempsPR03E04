public class PRU03E04Temps_Ivan_Cabellos {

    private int hora;
    private int minutos;
    private int segundos;

    public PRU03E04Temps_Ivan_Cabellos(int hora, int minutos, int segundos) throws Exception{

        try {
            setHora(hora);
            setMinutos(minutos);
            setSegundos(segundos);
        } catch (Exception e){
            throw new Exception("Recuerda que no hay mas de 24h, ni de 60 minutos o segundos");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws Exception {
        if (hora < 24){
            this.hora = hora;
        } else throw new Exception("No hay mas de 24h");
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public static void main(String[] args) throws Exception {
        PRU03E04Temps_Ivan_Cabellos pru03E04Temps_ivan_cabellos = new PRU03E04Temps_Ivan_Cabellos(63, 30, 20);
        
    }

}
