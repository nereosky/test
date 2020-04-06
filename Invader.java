package main.java;

public class Invader extends Init {

    private final int INITIAL_X = 400;

    public Invader(int x, int y) {
        super(x, y);

        initInvader();
    }

    private void initInvader() {

        loadImage("src/ressources/Invader.png"); //charge l'image depuis les ressources
        getImageDimensions(); // récupère les dimensions de l'image
    }

    public void move() {
        // set la possition de départ de l'invader
        if (x < 0) {
            x = INITIAL_X;
        }
        // permet de le déplacer
        x -= 1;
    }
}