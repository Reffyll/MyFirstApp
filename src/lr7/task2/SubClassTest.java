package lr7.task2;

public class SubClassTest extends SuperClassTest{
    public int int1;
    public SubClassTest(String str1) {
        super(str1);
    }

    public SubClassTest(String str1, int int1) {
        super(str1);
        this.int1 = int1;
    }

    @Override
    public String getStr1() {
        return super.getStr1();
    }

    @Override
    public void setStr1(String str1) {
        super.setStr1(str1);
    }

    @Override
    public void setConstValue() {
        super.setConstValue();
        this.int1 = 1;
    }

    @Override
    public int getStringLength() {
        return super.getStringLength();
    }

    public void setValues(int x){
        setConstValue();
        this.int1 = x;
    }

    public void setValues(){
        setConstValue();
    }

    public void setValues(String str1){
        setConstValue();
        setStr1(str1);
    }

    public void setValues(String str1, int x){
        setStr1(str1);
        this.int1 = x;
    }
}
