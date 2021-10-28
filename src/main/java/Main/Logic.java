package Main;

public class Main implements ShowString {

    private String str;

    Main(String str){
        this.str = str;

    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void methodShowString(Main main) {
        System.out.println(main.getStr());
    }
}
