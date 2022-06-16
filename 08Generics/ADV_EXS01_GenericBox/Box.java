package Advanced_Exersice8_Generics.ADV_EXS01_GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private String value;

    public Box() {
        this.value = value;

            }

            public void add(String element){
        value = element;
            }

    @Override
    public String toString() {
       return String.format("%s: %s", value.getClass().getName(), value);

    }
}
