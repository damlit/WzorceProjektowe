package facade.entity;

public class Screen {

    private boolean isDown;

    public Screen() {
        isDown = false;
    }

    public void setDown(boolean down) {
        if (down) {
            System.out.println("--> Screen is hide");
        } else {
            System.out.println("--> Screen is down");
        }
        isDown = down;
    }

    public boolean isDown() {
        return isDown;
    }
}
