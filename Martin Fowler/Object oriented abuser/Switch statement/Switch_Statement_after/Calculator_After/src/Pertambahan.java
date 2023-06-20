public class Pertambahan implements Operation{
    Integer a;
    Integer b;

    public Pertambahan(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perform() {
        System.out.println(a+b);
    }
    public String pilihanOperasi() {
        return "Anda memilih Pertambahan dan hasilnya adalah ";
    }
}
