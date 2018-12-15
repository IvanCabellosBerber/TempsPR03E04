public class PRU03E04TempsTest_nom_llinatge {

    public static void main(String[] args) throws Exception {

        PRU03E04Temps_Ivan_Cabellos tiempo1 = new PRU03E04Temps_Ivan_Cabellos(1, 20, 30);
        PRU03E04Temps_Ivan_Cabellos tiempo2 = new PRU03E04Temps_Ivan_Cabellos(2, 40, 20);
        System.out.println("Tiempo 1: " + tiempo1.toString() + " \nTiempo 2: " + tiempo2);

        PRU03E04Temps_Ivan_Cabellos tiempoSumado;
        PRU03E04Temps_Ivan_Cabellos tiempoRestado;

        tiempoSumado = tiempo1.sumaTiempo(tiempo2);
        System.out.println("Sumamos el tiempo 1 al 2: " + tiempoSumado.toString());

        tiempoRestado = tiempo2.restaTiempo(tiempo1);
        System.out.println("Restamos el tiempo 2 al 1: " + tiempoRestado.toString());

        PRU03E04Temps_Ivan_Cabellos tiempoSumadoMenosTiempoRestado = tiempoSumado.restaTiempo(tiempoRestado);
        System.out.println("Si retamos el segundo tiempo restado al primer tiempo sumado: " + tiempoSumadoMenosTiempoRestado.toString());

        /* EXCEPTIONS CONTROLS*/
        tiempo1.restaTiempo(tiempo2);
        PRU03E04Temps_Ivan_Cabellos tiempoErroneo = new PRU03E04Temps_Ivan_Cabellos(2, 63, 63);
        PRU03E04Temps_Ivan_Cabellos tiempoCorrecto = new PRU03E04Temps_Ivan_Cabellos(2, 30, 25);
        tiempoCorrecto.setHora(6);
        tiempoCorrecto.setMinutos(60);
        tiempoCorrecto.setSegundos(60);
        
    }

}
