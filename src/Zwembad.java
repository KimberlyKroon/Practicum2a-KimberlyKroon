public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double le, double di){
        breedte = br;
        lengte = le;
        diepte = di;
    }
    public Zwembad(){
    }
    public double getBreedte(){
        return breedte;
    }
    public double getLengte(){
        return lengte;
    }
    public double getDiepte(){
        return diepte;
    }

    public void setBreedte(Double newBreedte){
        this.breedte = newBreedte;
    }
    public void setLengte(Double newLengte){
        this.lengte = newLengte;
    }
    public void setDiepte(Double newDiepte){
        this.diepte = newDiepte;
    }
    public double inhoud(){
        return breedte * lengte * diepte;
    }
}