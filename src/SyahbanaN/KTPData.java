package SyahbanaN;

// inheritance
public class KTPData extends KTP {

    // overridding
    public KTPData(String nik, String nama) {
        super(nik, nama);
    }

    public int getKodeProvinsi() {
        return Integer.parseInt(getNik().substring(0, 2));
    }

    public int getKodeKota() {
        return Integer.parseInt(getNik().substring(2, 4));
    }

    public String getKodeKecamatan() {
        String KodeKec = getNik().substring(4, 6);
        // seleksi if
        if (KodeKec.equals("01")) {
            return "Banjarmasin Selatan";
        } else {
            return "Kecamatan Lain";
        }
    }

    public String getTgl_Lahir() {
        // seleksi switch
        String tgl = getNik().substring(6, 8);
        switch (tgl) {
            case "01":
                return "Tanggal 1";
            case "02":
                return "Tanggal 2";
            case "03":
                return "Tanggal 3";
            case "04":
                return "Tanggal 4";
            case "05":
                return "Tanggal 5";
            case "06":
                return "Tanggal 6";
            case "07":
                return "Tanggal 7";
            case "08":
                return "Tanggal 8";
            case "09":
                return "Tanggal 9";
            case "10":
                return "Tanggal 10";
            case "11":
                return "Tanggal 11";
            case "12":
                return "Tanggal 12";
            case "13":
                return "Tanggal 13";
            case "14":
                return "Tanggal 14";
            case "15":
                return "Tanggal 15";
            case "16":
                return "Tanggal 16";
            case "17":
                return "Tanggal 17";
            case "18":
                return "Tanggal 18";
            case "19":
                return "Tanggal 19";
            case "20":
                return "Tanggal 20";
            case "21":
                return "Tanggal 21";
            case "22":
                return "Tanggal 22";
            case "23":
                return "Tanggal 23";
            case "24":
                return "Tanggal 24";
            case "25":
                return "Tanggal 25";
            case "26":
                return "Tanggal 26";
            case "27":
                return "Tanggal 27";
            case "28":
                return "Tanggal 28";
            case "29":
                return "Tanggal 29";
            case "30":
                return "Tanggal 30";
            case "31":
                return "Tanggal 31";
            default:
                return "Tanggal Tidak Ada";
        }
    }

    public int getBln_Lahir() {
        return Integer.parseInt(getNik().substring(8, 10));
    }

    public int getThn_Lahir() {
        return Integer.parseInt(getNik().substring(10, 12)) + 2000;

    }

    public int getKodePendaftaran() {
        return Integer.parseInt(getNik().substring(12, 16));
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nKode Provinsi : " + getKodeProvinsi()
                + "\nKode Kota : " + getKodeKota()
                + "\nKode Kecamatan : " + getKodeKecamatan()
                + "\nTanggal Lahir : " + getTgl_Lahir()
                + "\nBulan Lahir : " + getBln_Lahir()
                + "\nTahun Lahir : " + getThn_Lahir()
                + "\nKode Pendaftaran : " + getKodePendaftaran();
    }
}
