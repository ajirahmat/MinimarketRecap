package model;


public class RukoModel {
    
    private String kodebarang;
    private String namabarang;
    private String harga;
    private String jumlahstock;
    private String keterangan;

    public RukoModel(String kodebarang, String namabarang, String harga, String jumlahstock, String keterangan) {
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.harga = harga;
        this.jumlahstock = jumlahstock;
        this.keterangan = keterangan;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlahstock() {
        return jumlahstock;
    }

    public void setJumlahstock(String jumlahstock) {
        this.jumlahstock = jumlahstock;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
    
    
}
