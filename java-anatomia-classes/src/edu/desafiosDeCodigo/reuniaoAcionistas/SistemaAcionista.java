package edu.semanaBase.desafiosDeCodigo.reuniaoAcionistas;
/*Descrição
Durante uma reunião de acionistas, alguns pontos importantes são discutidos
e com isso surge a necessidade do envolvimento da equipe de desenvolvedores.
Com isso, você foi designado para criar uma interface que permitirá aos acionistas de uma empresa acessarem informações relevantes
sobre as análises da organização bancária.
Sua tarefa é implementar uma classe que representa essa interface e que fornece um método para consultar as análises de desempenho
e outros tipos dentro de um determinado período.*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SistemaAcionista {

    import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws ParseException {
            Scanner scanner = new Scanner(System.in);
            String dataInicial = scanner.nextLine();
            String dataFinal = scanner.nextLine();

            SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
            List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

            for (String analise : analises) {
                System.out.println(analise);
            }
        }
    }

    class SistemaAcionistas {

        private List<Analise> analises;

        public SistemaAcionistas() {
            analises = new ArrayList<>();
            analises.add(new Analise("01/01/2023", "Analise de Desempenho Financeiro"));
            analises.add(new Analise("15/02/2023", "Analise de Riscos e Exposicoes"));
            analises.add(new Analise("31/03/2023", "Analises Corporativas"));
            analises.add(new Analise("01/04/2023", "Analise de Politicas e Regulamentacoes"));
            analises.add(new Analise("15/05/2023", "Analise de Ativos"));
            analises.add(new Analise("30/06/2023", "Analise de Inovacao e Tecnologia"));
        }

        public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dataInicial = df.parse(dataInicialStr);
            Date dataFinal = df.parse(dataFinalStr);

            List<String> analisesNoPeriodo = new ArrayList<>();

            for (Analise analise : analises) {
                Date dataAnalise = df.parse(analise.getData());
                if (dataAnalise.compareTo(dataInicial) >= 0 && dataAnalise.compareTo(dataFinal) <= 0) {
                    analisesNoPeriodo.add(analise.getDescricao());
                }
            }

            return analisesNoPeriodo;
        }
    }

    class Analise {
        private String data;
        private String descricao;

        public Analise(String data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }

        public String getData() {
            return data;
        }

        public String getDescricao() {
            return descricao;
        }
    }


}
