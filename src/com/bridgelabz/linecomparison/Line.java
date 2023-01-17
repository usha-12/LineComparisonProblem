package com.bridgelabz.linecomparison;

public class Line {

    Points startCoordinates = new Points();
    Points endCoordinates = new Points();
    public Points getEndCoordinates(){
        return endCoordinates;
    }
    public Points getStartCoordinates(){
        return startCoordinates;
    }
    public void setStartCoordinates(int x1, int y1){
        this.startCoordinates.setxCoordinate(x1);
        this.startCoordinates.setyCoordinate(y1);
    }
    public void setEndCoordinates(int x2, int y2){
        this.endCoordinates.setxCoordinate(x2);
        this.endCoordinates.setyCoordinate(y2);
    }
}
