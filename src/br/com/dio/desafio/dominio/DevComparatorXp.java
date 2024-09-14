package br.com.dio.desafio.dominio;

import java.util.Comparator;

public class DevComparatorXp implements Comparator<Dev> {

    @Override
    public int compare(Dev d1, Dev d2) {
        return Double.compare(d2.calcularTotalXp(), d1.calcularTotalXp());
    }
}
