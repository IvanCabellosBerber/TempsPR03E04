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

    public void setHora(int hora){
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) throws Exception {
        if (minutos < 60){
            this.minutos = minutos;
        } else throw new Exception("No hay mas de 59 minutos");
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) throws Exception {
        if (segundos < 24){
            this.segundos = segundos;
        } else throw new Exception("No hay mas de 59 segundos");
    }

    public static PRU03E04Temps_Ivan_Cabellos sumaTiempo (PRU03E04Temps_Ivan_Cabellos hora1, PRU03E04Temps_Ivan_Cabellos hora2) throws Exception {

        int segundosHora1 = sumaSegundos(hora1);
        int segundosHora2 = sumaSegundos(hora2);

        int sumaTiempoTotal = segundosHora1 + segundosHora2;

        int hora = sumaTiempoTotal / 3600;
        int minutos = (sumaTiempoTotal - (hora * 3600)) / 60;
        int segundos = sumaTiempoTotal - ((hora * 3600) + (minutos * 60));

        return new PRU03E04Temps_Ivan_Cabellos(hora, minutos, segundos);
    }

    public static PRU03E04Temps_Ivan_Cabellos restaTiempo (PRU03E04Temps_Ivan_Cabellos hora1, PRU03E04Temps_Ivan_Cabellos hora2) throws Exception {

        int segundosHora1 = sumaSegundos(hora1);
        int segundosHora2 = sumaSegundos(hora2);

        int restaTiempoTotal = segundosHora1 - segundosHora2;

        if (restaTiempoTotal < 0) throw new Exception("Estas intentado restar una hora más grande que la otra, volverías atrás en el tiempo");

        int hora = restaTiempoTotal / 3600;
        int minutos = (restaTiempoTotal - (hora * 3600)) / 60;
        int segundos = restaTiempoTotal - ((hora * 3600) + (minutos * 60));

        return new PRU03E04Temps_Ivan_Cabellos(hora, minutos, segundos);
    }

    public static int sumaSegundos(PRU03E04Temps_Ivan_Cabellos tiempo){
        int horasSegundos = tiempo.getHora() * 3600;
        int minutosSegundos = tiempo.getMinutos() * 60;
        int segundos = tiempo.getSegundos();

        return horasSegundos + minutosSegundos + segundos;
    }

    @Override
    public String toString() {
        return "El resultado sería: " +
                "hora = " + getHora() +
                ", minutos = " + getMinutos() +
                ", segundos = " + getSegundos();
    }

    public static void main(String[] args) throws Exception {

        PRU03E04Temps_Ivan_Cabellos tiempo1 = new PRU03E04Temps_Ivan_Cabellos(1, 30, 0);
        PRU03E04Temps_Ivan_Cabellos tiempo2 = new PRU03E04Temps_Ivan_Cabellos(1, 30, 0);
        PRU03E04Temps_Ivan_Cabellos tiempoSumado1y2;
        tiempoSumado1y2 = sumaTiempo(tiempo1, tiempo2);

        System.out.println(tiempoSumado1y2.toString());

    }

}
