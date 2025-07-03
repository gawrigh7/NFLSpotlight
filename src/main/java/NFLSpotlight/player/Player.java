package NFLSpotlight.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {


    @Id
    @Column(name = "player", unique = true, nullable = false)
    private String player;
    private String team;
    private String pos;

    private int g;
    private float cmp;
    @Column(name = "passatt")
    private Float passAtt;
    @Column(name = "passyds")
    private Float passYds;
    @Column(name = "passtd")
    private Float passTD;
    @Column(name = "int")
    private Float interceptions;
    @Column(name = "passerrating")
    private Float passerRating;

    @Column(name = "rushatt")
    private Integer rushAtt;
    @Column(name = "rushyds")
    private Integer rushYds;
    @Column(name = "rushtd")
    private Integer rushTD;
    private Integer fumbles;

    private Integer targets;      // nullable
    private Integer receptions;   // nullable
    private Integer recYds;       // nullable
    private Integer recTD;        // nullable
    private Float catchPct;       // nullable

    private Integer xpm;
    private Integer xpa;
    private Integer fgm;
    private Integer fga;

    @Column(name = "fantasypoints_k")
    private Float fantasyPointsK;
    @Column(name = "pts_per_game_k")
    private Float ptsPerGameK;

    public Player() {}

    public Player(String player, String team, String pos, int g, float cmp, float passAtt, float passYds, float passTD, float interceptions, float passerRating, int rushAtt, int rushYds, int rushTD, int fumbles, Integer targets, Integer receptions, Integer recYds, Integer recTD, Float catchPct, int xpm, int xpa, int fgm, int fga, float fantasyPointsK, float ptsPerGameK) {
        this.player = player;
        this.team = team;
        this.pos = pos;
        this.g = g;
        this.cmp = cmp;
        this.passAtt = passAtt;
        this.passYds = passYds;
        this.passTD = passTD;
        this.interceptions = interceptions;
        this.passerRating = passerRating;
        this.rushAtt = rushAtt;
        this.rushYds = rushYds;
        this.rushTD = rushTD;
        this.fumbles = fumbles;
        this.targets = targets;
        this.receptions = receptions;
        this.recYds = recYds;
        this.recTD = recTD;
        this.catchPct = catchPct;
        this.xpm = xpm;
        this.xpa = xpa;
        this.fgm = fgm;
        this.fga = fga;
        this.fantasyPointsK = fantasyPointsK;
        this.ptsPerGameK = ptsPerGameK;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public float getCmp() {
        return cmp;
    }

    public void setCmp(float cmp) {
        this.cmp = cmp;
    }

    public float getPassAtt() {
        return passAtt;
    }

    public void setPassAtt(float passAtt) {
        this.passAtt = passAtt;
    }

    public float getPassYds() {
        return passYds;
    }

    public void setPassYds(float passYds) {
        this.passYds = passYds;
    }

    public float getPassTD() {
        return passTD;
    }

    public void setPassTD(float passTD) {
        this.passTD = passTD;
    }

    public float getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(float interceptions) {
        this.interceptions = interceptions;
    }

    public float getPasserRating() {
        return passerRating;
    }

    public void setPasserRating(float passerRating) {
        this.passerRating = passerRating;
    }

    public int getRushAtt() {
        return rushAtt;
    }

    public void setRushAtt(int rushAtt) {
        this.rushAtt = rushAtt;
    }

    public int getRushYds() {
        return rushYds;
    }

    public void setRushYds(int rushYds) {
        this.rushYds = rushYds;
    }

    public int getRushTD() {
        return rushTD;
    }

    public void setRushTD(int rushTD) {
        this.rushTD = rushTD;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

    public Integer getTargets() {
        return targets;
    }

    public void setTargets(Integer targets) {
        this.targets = targets;
    }

    public Integer getReceptions() {
        return receptions;
    }

    public void setReceptions(Integer receptions) {
        this.receptions = receptions;
    }

    public Integer getRecYds() {
        return recYds;
    }

    public void setRecYds(Integer recYds) {
        this.recYds = recYds;
    }

    public Integer getRecTD() {
        return recTD;
    }

    public void setRecTD(Integer recTD) {
        this.recTD = recTD;
    }

    public Float getCatchPct() {
        return catchPct;
    }

    public void setCatchPct(Float catchPct) {
        this.catchPct = catchPct;
    }

    public int getXpm() {
        return xpm;
    }

    public void setXpm(int xpm) {
        this.xpm = xpm;
    }

    public int getXpa() {
        return xpa;
    }

    public void setXpa(int xpa) {
        this.xpa = xpa;
    }

    public int getFgm() {
        return fgm;
    }

    public void setFgm(int fgm) {
        this.fgm = fgm;
    }

    public int getFga() {
        return fga;
    }

    public void setFga(int fga) {
        this.fga = fga;
    }

    public float getFantasyPointsK() {
        return fantasyPointsK;
    }

    public void setFantasyPointsK(float fantasyPointsK) {
        this.fantasyPointsK = fantasyPointsK;
    }

    public float getPtsPerGameK() {
        return ptsPerGameK;
    }

    public void setPtsPerGameK(float ptsPerGameK) {
        this.ptsPerGameK = ptsPerGameK;
    }

    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                ", team='" + team + '\'' +
                ", pos='" + pos + '\'' +
                ", g=" + g +
                ", cmp=" + cmp +
                ", passAtt=" + passAtt +
                ", passYds=" + passYds +
                ", passTD=" + passTD +
                ", interceptions=" + interceptions +
                ", passerRating=" + passerRating +
                ", rushAtt=" + rushAtt +
                ", rushYds=" + rushYds +
                ", rushTD=" + rushTD +
                ", fumbles=" + fumbles +
                ", targets=" + targets +
                ", receptions=" + receptions +
                ", recYds=" + recYds +
                ", recTD=" + recTD +
                ", catchPct=" + catchPct +
                ", xpm=" + xpm +
                ", xpa=" + xpa +
                ", fgm=" + fgm +
                ", fga=" + fga +
                ", fantasyPointsK=" + fantasyPointsK +
                ", ptsPerGameK=" + ptsPerGameK +
                '}';
    }
}
