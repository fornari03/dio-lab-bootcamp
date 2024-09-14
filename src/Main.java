import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Classificacao;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 8);

        Curso curso2 = new Curso("curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Classificacao classificacao = new Classificacao();

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.showConteudosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.showConteudosInscritos();
        devCamila.showConteudosConcluidos();
        devCamila.showTotalXp();

        classificacao.adicionarDev(devCamila);

        System.out.println("-------");

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.showConteudosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devJoao.showConteudosInscritos();
        devJoao.showConteudosConcluidos();
        devJoao.showTotalXp();

        classificacao.adicionarDev(devJoao);
        classificacao.exibirClassificacao();
    }

}
