package NFLSpotlight.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    void deleteByPlayer(String playerName);
    Optional<Player> findByPlayer(String playerName);
    List<Player> findByTeam(String team);
    List<Player> findByPos(String position);
    List<Player> findByTeamAndPos(String team, String position);



}
