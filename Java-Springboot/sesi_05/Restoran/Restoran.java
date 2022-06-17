package Restoran;

public class Restoran {
    
    // Variable private
    private String menu;
    private double harga;
    private boolean spesial;

    // Method Setter Public dengan Params
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    // Method Gatter (Public)
    public String getMenu() {
        return menu;
    }

    public double getHarga() {
        return harga;
    }

    public boolean getSpesial() {
        return spesial;
    }
}
