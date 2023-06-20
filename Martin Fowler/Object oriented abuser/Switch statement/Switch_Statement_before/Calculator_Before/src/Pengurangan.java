public class Pengurangan implements Operation{
    Integer a;
    Integer b;

    public Pengurangan(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perform() {
        System.out.println(a-b);
    }

}
