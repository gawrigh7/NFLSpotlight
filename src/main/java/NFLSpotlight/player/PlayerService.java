package NFLSpotlight.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersByTeam(String team) {
        return playerRepository.findByTeam(team);
    }

    public Optional<Player> getPlayerByName(String searchText) {
        return playerRepository.findByPlayer(searchText);
    }

    public List<Player> getPlayersByPosition(String searchText) {
        return playerRepository.findByPos(searchText);

    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position) {
        return playerRepository.findByTeamAndPos(team, position);
    }

    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findByPlayer(updatedPlayer.getPlayer());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setPlayer(updatedPlayer.getPlayer());
            playerToUpdate.setTeam(updatedPlayer.getTeam());
            playerToUpdate.setPos(updatedPlayer.getPos());

            playerRepository.save(playerToUpdate);
            return playerToUpdate;

        }
        return null;
    }

    @Transactional
    public void deletePlayer(String removedPlayer) {
        playerRepository.deleteByPlayer(removedPlayer);
    }
}
