package br.com.alberto.game_store.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alberto.game_store.Model.Game;
import br.com.alberto.game_store.Repository.GameRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping("/list")
    public ModelAndView getListGame(){
        ModelAndView mv = new ModelAndView("gamelist");
        mv.addObject("games", gameRepository.findAll());
        return mv;
    }

    @GetMapping("/addgame")
    public ModelAndView getAddGame(){
        ModelAndView mv = new ModelAndView("addgame");
        return mv;
    }

    @PostMapping("/addgame")
    public String postAddGame(Game game) {
gameRepository.save(game);
        return "gamelist.html";
    }
    
}
