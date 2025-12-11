package com.antonio.typerush_api.controller;

import com.antonio.typerush_api.model.Player;
import com.antonio.typerush_api.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {
  private final PlayerService service;

  // call getAllPlayer methods using verbs http get
  @GetMapping
  public List<Player> findAllPlayers() {
    return service.getAllPlayers();
  }

  // create Player / modification
  @PostMapping
  public Player addPlayer(@RequestBody Player player) {
    return service.savePlayer(player);
  }
}
