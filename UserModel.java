
package model;

public class UserModel {
    private String NIP;
    private String Nama;
    private String Status;
    private String Password;

    public UserModel(String NIP, String Nama, String Status, String Password) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Status = Status;
        this.Password = Password;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
