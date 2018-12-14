public class PRU03E04TempsTest_nom_llinatge {

    public static void main(String[] args) throws Exception {

        PRU03E04Temps_Ivan_Cabellos tiempo1 = new PRU03E04Temps_Ivan_Cabellos(1, 20, 30);
        PRU03E04Temps_Ivan_Cabellos tiempo2 = new PRU03E04Temps_Ivan_Cabellos(2, 40, 20);

        System.out.println(tiempo1.toString() + " \n" + tiempo2);

        PRU03E04Temps_Ivan_Cabellos tiempoSumado;

        //TODO

        tiempoSumado = tiempo1.sumaTiempo(tiempo1, tiempo2);

    }

}
