package parsing_json;

import java.lang.reflect.Field;
import java.util.*;

public class ElementCollection extends ArrayList<Element> {
    private Class<? extends Element> e;
    //private static List<Element> listOfElements = new ArrayList<>();
    //  private Element[] elements;

    public ElementCollection() {
        //  listOfElements = new ArrayList<>();
        // Collections.addAll(listOfElements, elements);
    }

    public Element findByAtomicNumber(int atomic_number) {
        while (super.listIterator().hasNext()) {
            Element e = super.listIterator().next();
            if (e.getNumber() == atomic_number) ;
            return e;
        }
        return null;
    }

    public Element findByName(String name) {
        while (super.listIterator().hasNext()) {
            Element e = super.listIterator().next();
            if (e.getName().equals(name)) ;
            return e;
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value) {


        Field field = null;
        try {
            field = Element.class.getField(fieldName);
            Object o = field.get(value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        while (super.listIterator().hasNext()) {
            Element e = super.listIterator().next();

            try {
                if(!e.getClass().getField(fieldName).get(value).equals(value)){
                    super.remove(e);
                }
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (NoSuchFieldException e1) {
                e1.printStackTrace();
            } {

            }

        }

        return this;
    }
}
