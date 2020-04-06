package main.java;

public class Missile extends Init {

    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 10;

    public Missile(int x, int y) {
        super(x, y);

        initMissile();
    }
    
    private void initMissile() {
        
        loadImage("src/ressources/missile.png"); //charge l'image depuis les ressources
        getImageDimensions(); // récupère les dimensions de l'image
    }   

    public void move() {
        
        x += MISSILE_SPEED; // set vitesse des missiles
        
        if (x > BOARD_WIDTH) // set l'apparition des missiles à l'écran
            visible = false;
    }
}