package org.example.mappers;

import org.example.model.DadosVencedor;

import java.util.function.Function;

public class MapperAtores implements Function <String, DadosVencedor> {

    @Override
    public DadosVencedor apply(String s) {
        var dadosLinha = s.split("; ");
        var index = Integer.parseInt(dadosLinha[0]);
        var ano = Integer.parseInt(dadosLinha[1]);
        var idade = Integer.parseInt(dadosLinha[2]);
        var nomeAtor = dadosLinha[3];
        var nomeFilme = dadosLinha[4];
        var sexo = 'M';
        var premio = 1;

        return new DadosVencedor(index, ano, idade, nomeAtor, nomeFilme,sexo, premio);
    }
}
