package ru.shishkin.maxim.bomber;

public class BombCounter extends AbstractPowerup {
    public BombCounter(int rowIndex, int colIndex) {
        super(colIndex, rowIndex);
    }

    public void addToPlayer(Player player) {
        int currentBombCount = player.getBombCount();
        player.setBombCount(currentBombCount + 1);
    }

    public String getName() {
        final String name = "BombCounter";
        return name;
    }
}