public class Customer {
    private String name;
    private int age;
    Credit credit = new Credit();
    
    public Customer(String n, int a, int c) {
        this.name = n;
        this.age = a;
        this.credit.setCredit(c);
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Credit: " + credit.getCredit());
    }
}
