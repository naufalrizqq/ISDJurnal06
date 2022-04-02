public class Mahasiswa implements Comparable<Mahasiswa> {
    private String nim;
    private String nama;
    private String kelas;
    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public String getNim(){
        return nim;
    }
    @Override
    public int compareTo(Mahasiswa o) {
        return this.getNim().compareTo(o.getNim());
    }
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                '}';
    }
}