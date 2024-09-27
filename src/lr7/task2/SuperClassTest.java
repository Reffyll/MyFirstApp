package lr7.task2;

public class SuperClassTest {
    private String str1;

    public SuperClassTest(String str1){
        this.str1 = str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public void setConstValue(){
        this.str1 = "Текстовому полю присвоили константу";
    }

    public int getStringLength(){
        if (this.str1 == null){
            return 0;
        }
        return this.str1.length();
    }
}
