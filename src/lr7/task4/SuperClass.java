package lr7.task4;

public class SuperClass {
    public char char1;

    public SuperClass(char char1) {
        this.char1 = char1;
    }

    public SuperClass createCopySuperClass(char char1){
        SuperClass copySuperClass = new SuperClass(char1);
        copySuperClass.char1 = this.char1;
        return copySuperClass;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + char1;
    }
}
