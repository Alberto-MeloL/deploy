package br.com.alberto.game_store.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alberto.game_store.Model.Game;

public interface GameRepository extends CrudRepository<Game, Integer>{
    
}
