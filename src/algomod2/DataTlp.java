
package algomod2;

public class DataTlp {
    public String nama, alamat, noRum, noHP;
    //public Long ;
    
    public DataTlp(String nm, String almt, String noR, String noH){
        this.nama = nm;
        this.alamat = almt;
        this.noRum = noR;
        this.noHP = noH;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoRum() {
        return noRum;
    }
    
    public String getNoHP() {
        return noHP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoRum(String noRum) {
        this.noRum = noRum;
    }
    
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}
