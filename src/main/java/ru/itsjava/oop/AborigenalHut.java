package ru.itsjava.oop;

public class AborigenalHut {

    private int hutHeight;
    private int hutWidth;
    private String wallMaterial;
    private String roofMaterial;

    public AborigenalHut(){
        hutHeight = 2;
        hutWidth = 4;
        wallMaterial = "bamboo";
        roofMaterial = "bones";
    }

    public void setHutHeight(int hutHeight){
        this.hutHeight = hutHeight;
    }
    public int getHutHeight(){
        return hutHeight;
    }
    public void setHutWidth(int hutWidth){
        this.hutWidth = hutWidth;
    }
    public int getHutWidth(){
        return hutWidth;
    }
    public void setWallMaterial(String wallMaterial){
        this.wallMaterial = wallMaterial;
    }
    public String getWallMaterial(){
        return wallMaterial;
    }
    public void setRoofMaterial(String roofMaterial){
        this.roofMaterial = roofMaterial;
    }
    public String getRoofMaterial(){
        return roofMaterial;
    }
}
