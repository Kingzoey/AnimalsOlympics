/**
 * 游戏
 */
@Data
public class Game {

    /**
     * 玩家走的步数
     */
    private int playerStep;

    /**
     * 备份游戏
     * @return
     */
    public GameMemento createGameMemento(){
        return new GameMemento(playerStep);
    }

    /**
     * 开始玩游戏
     */
    public void play(){
        playerStep = 0;
    }

    /**
     * 恢复备份
     * @param gameMemento
     */
    public void restore(GameMemento gameMemento){
        this.playerStep = gameMemento.getPlayerSteps();
    }
}