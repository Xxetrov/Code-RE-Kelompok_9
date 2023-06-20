public class Perkalian implements Operation{
    Integer a;
    Integer b;

    public Perkalian(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perform() {
        System.out.println(a*b);
    }
    public String pilihanOperasi() {
        
        return "Anda memilih Perkalian dan hasilnya adalah";
    }
}
