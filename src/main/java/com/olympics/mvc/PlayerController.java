package com.olympics.mvc;

public class PlayerController {
    private Player model;
    private PlayerView view;

    public PlayerController(Player model, PlayerView view) {
        this.model = model;
        this.view = view;
    }

    public void setPlayerScore(String Score) {
        model.setScore(Score);
    }

    public void updateView() {
        view.printPlayerDetails(model.getName(), model.getScore());
    }
}
