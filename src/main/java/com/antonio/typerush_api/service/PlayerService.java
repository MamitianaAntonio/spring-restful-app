package com.antonio.typerush_api.service;

import com.antonio.typerush_api.model.Player;
import com.antonio.typerush_api.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor // generate automatically the constructor with final word
public class PlayerService {
  private final PlayerRepository repository;

  // get list of all players
  public List<Player> getAllPlayers() {
    return repository.findAll();
  }

  // save player : add / modify
  public Player savePlayer (Player player) {
    player.setCreatedAt(LocalDateTime.now());
    return repository.save(player);
  }

}
