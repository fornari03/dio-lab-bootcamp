package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classificacao {

    private List<Dev> devs = new ArrayList<>();

    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }

    public void ordenarDevsPorXP() {
        Collections.sort(devs, new DevComparatorXp());
    }

    public void exibirClassificacao() {
        ordenarDevsPorXP();
        devs.stream().forEach(dev -> System.out.println("Dev: " + dev.getNome() + " | XP: " + dev.calcularTotalXp()));
    }
}
