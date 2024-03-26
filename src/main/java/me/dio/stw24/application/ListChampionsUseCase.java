package me.dio.stw24.application;

import java.util.List;

import me.dio.stw24.domain.model.Champion;
import me.dio.stw24.domain.ports.ChampionsRepository;

public record ListChampionsUseCase(ChampionsRepository repository) {
    public List<Champion> findAll(){
        return repository.findAll();
    }
}
