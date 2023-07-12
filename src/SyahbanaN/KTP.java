package SyahbanaN;

public class KTP {
    // atribut dan encapsulation
    private String nik;
    private String nama;
    
    
    // constructor

    public KTP(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // mutator (setter)

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getNik(){
       return nik;
    }
    
    public String displayInfo() {
        return "NIK : "+getNik()+ "\nNama : "+getNama();
    }
    
    // polymorphism (overloading)
    public String displayInfo(String Alamat){
        return displayInfo() + "\nAlamat : "+Alamat;   
    }
}