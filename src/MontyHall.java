public class MontyHall {
    private boolean hasCar = false;
    private boolean isChosen = false;
    private boolean isOpened = false;

    public MontyHall(){
        hasCar = hasCar();
        isChosen = isChosen();
        isOpened = isOpened();
    }

    public boolean hasCar(){
        return hasCar;
    }

    public void setHasCar() {
        this.hasCar = true;
    }

    public boolean isChosen() {
        return isChosen;
    }

    public void setChosen() {
        isChosen = true;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened() {
        isOpened = true;
    }
}