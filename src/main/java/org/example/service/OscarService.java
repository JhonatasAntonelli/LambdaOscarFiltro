package org.example.service;

import org.example.model.DadosVencedor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OscarService {

    private List <DadosVencedor> listaDados;

    public OscarService(List<DadosVencedor> listaDados) {
        this.listaDados = listaDados;
    }

    public void atorMaisJovem(){
        var maisJovem = listaDados.stream()
                .min(Comparator.comparingInt(DadosVencedor::getIdadeAtor));
        maisJovem.ifPresent(p-> System.out.printf("O vencedor mais jovem " +
                "entre homens e mulheres é %s com %d anos \n", p.getNomeAtor(), p.getIdadeAtor()));
    }
    public void atorMaisVelho(){
        var maisVelho = listaDados.stream()
                .max(Comparator.comparingInt(DadosVencedor::getIdadeAtor));
        maisVelho.ifPresent(p-> System.out.printf("O vencedor mais velho " +
                "entre homens e mulheres é %s com %d anos \n", p.getNomeAtor(), p.getIdadeAtor()));
    }

    public void variacaoIdade(int idadeInicial, int idadeFinal){

        var variacao = listaDados.stream()
                .filter(c-> c.getIdadeAtor()>=idadeInicial && c.getIdadeAtor()<= idadeFinal)
                .collect(Collectors.toList());
        System.out.printf("Os vencedores do oscar entre %d e % d anos são:\n", idadeInicial, idadeFinal);

        for (int i = 0; i < variacao.size(); i++) {
            System.out.println(variacao.get(i).getNomeAtor() + " com " + variacao.get(i).getIdadeAtor() + " anos");
        }

    }
}
