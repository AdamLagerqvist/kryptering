import java.io.IOException;

public class Controler {
    model m;
    view v;
    public static void main(String[] args) {
        new Controler();
    }

    public Controler() {
        v = new view();
        m = new model(v.get_file(), get_key_from_view());
    }
    public long get_key_from_view(){
        return v.get_key();
    }
}
