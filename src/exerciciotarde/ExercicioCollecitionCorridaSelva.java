package exerciciotarde;

import java.util.*;

public class ExercicioCollecitionCorridaSelva {

    public static void main(String[] args) {
        //Declara uma Array de pessoas
        List<Participante> participantes = new ArrayList<>();

        Participante participante1 = new Participante(17,"1234567891", "Pedro", "Sorbone","9999-88818","Nada consta","O");
        Participante participante2 = new Participante(37, "1234567891", "Henrique", "Sorbone","9999-88818","Nada consta","O");
        Participante participante3 = new Participante(15,"1234567891", "Alex", "Sorbone","9999-88818","Nada consta","O");
        Participante participante4 = new Participante(57,"1234567891", "Constante", "Sorbone","9999-88818","Nada consta","O");
        Participante participante5 = new Participante(16,"1234567891", "Pedro2", "Sorbone","9999-88818","Nada consta","O");
        Participante participante6 = new Participante(18,"1234567891", "Pedro3", "Sorbone","9999-88818","Nada consta","O");
        Participante participante7 = new Participante(27,"1234567891", "Pedro4", "Sorbone","9999-88818","Nada consta","O");
        Participante participante8 = new Participante(45,"1234567891", "Pedro5", "Sorbone","9999-88818","Nada consta","O");
        Participante participante9 = new Participante(48,"1234567891", "Pedro5", "Sorbone","9999-88818","Nada consta","O");
        Participante participante10 = new Participante(55,"1234567891", "Pedro5", "Sorbone","9999-88818","Nada consta","O");
        Participante participante11 = new Participante(25,"1234567891", "Pedro5", "Sorbone","9999-88818","Nada consta","O");
        Participante participante12 = new Participante(67,"1234567891", "Pedro5", "Sorbone","9999-88818","Nada consta","O");


        participantes.add(participante1);
        participantes.add(participante2);
        participantes.add(participante3);
        participantes.add(participante4);
        participantes.add(participante5);
        participantes.add(participante6);
        participantes.add(participante7);
        participantes.add(participante8);
        participantes.add(participante9);
        participantes.add(participante10);
        participantes.add(participante11);
        participantes.add(participante12);

        /*
        Outra maneira de criar um objeto inserindo diretamente dentro da lista
        participantes.add(new Participante(17,"1234567891", "Pedro", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(37, "1234567891", "Henrique", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(15,"1234567891", "Alex", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(57,"1234567891", "Constante", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(16,"1234567891", "Pedro2", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(18,"1234567891", "Pedro3", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(27,"1234567891", "Pedro4", "Sorbone","9999-88818","Nada consta","O");
        participantes.add(new Participante(45,"1234567891", "Pedro5", "Sorbone","9999-88818","Nada consta","O");
         */

        //Declara e inicializa uma maratona.
        Maratona circuito = new Maratona();

        //Adiciona particpante ao circuito.
        circuito.inscreveMaratonista("", participantes.get(0));
        circuito.inscreveMaratonista("", participantes.get(1));
        circuito.inscreveMaratonista("", participantes.get(2));
        circuito.inscreveMaratonista("", participantes.get(3));
        circuito.inscreveMaratonista("", participantes.get(4));
        circuito.inscreveMaratonista("", participantes.get(5));
        circuito.inscreveMaratonista("", participantes.get(6));
        circuito.inscreveMaratonista("", participantes.get(7));
        circuito.inscreveMaratonista("", participantes.get(8));
        circuito.inscreveMaratonista("", participantes.get(9));
        circuito.inscreveMaratonista("", participantes.get(10));
        circuito.inscreveMaratonista("", participantes.get(11));
        circuito.inscreveMaratonista("", participantes.get(12));

        //Mostra a lista de inscritos
        circuito.mostraListaCategoria("pequena");
        circuito.mostraListaCategoria("média");
        circuito.mostraListaCategoria("avançado");

        //Remove a participante de uma determinada categoria.
        circuito.cancelaInscricao("pequena", 1);
        circuito.cancelaInscricao("médio", 1);
        circuito.cancelaInscricao("avançado", 1);

        //Mostra a lista de inscrito depois da remoçao
        circuito.mostraListaCategoria("pequena");
        circuito.mostraListaCategoria("média");
        circuito.mostraListaCategoria("avançado");
}

}

