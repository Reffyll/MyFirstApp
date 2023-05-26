package lr7.task5;

public class SuperClass {
    private String str1;

    public SuperClass(String str1) {
        this.str1 = str1;
    }

    public void showInfo(){
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                "str = " + str1);
    }

    public String getStr1() {
        return str1;
    }
}
