package edu.misena.senaviewer.model;

public class Serie extends Film {
    private int sessionQuantity;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
        super(title, genre, creator, duration);
        this.sessionQuantity = sessionQuantity;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sessions: " + sessionQuantity;
    }
}

