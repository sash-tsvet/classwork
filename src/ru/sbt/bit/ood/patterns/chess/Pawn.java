package ru.sbt.bit.ood.patterns.chess;

public class Pawn extends Figure {

    @Override
    protected void doTheMove(Coordinate newPoint) {
        // change current figure coordinates
    }

    @Override
    protected boolean canMoveTo(Coordinate newPoint) {
        return true; // check the field
    }
}
