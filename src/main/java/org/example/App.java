package org.example;

import org.example.mappers.MapperAtores;
import org.example.mappers.MapperAtriz;
import org.example.model.DadosVencedor;
import org.example.service.OscarService;
import org.example.util.FileUtil;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) throws IOException {

        var fileUtilMale = new FileUtil<DadosVencedor>("oscar_age_male.csv");
        var fileUtilFemale = new FileUtil<DadosVencedor>("oscar_age_female.csv");

        var dadosDoAtor = fileUtilMale.leitorArquivo(new MapperAtores());
        var dadosDaAtriz = fileUtilFemale.leitorArquivo(new MapperAtriz());

        var dadosGerais = Stream.concat(dadosDoAtor.stream(), dadosDaAtriz.stream()).collect(Collectors.toList());

        OscarService oscarService = new OscarService(dadosGerais);
        oscarService.atorMaisJovem();
        oscarService.atorMaisVelho();
        oscarService.variacaoIdade(18, 24);
    }
}