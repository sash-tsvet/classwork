package ru.sbt.bit.ood.patterns.chess;

public abstract class Figure {

    public void move(Coordinate newPoint) {
        if (canMoveTo(newPoint)) {
            doTheMove(newPoint);
        }
    }

    protected abstract void doTheMove(Coordinate newPoint);

    protected abstract boolean canMoveTo(Coordinate newPoint);


}
