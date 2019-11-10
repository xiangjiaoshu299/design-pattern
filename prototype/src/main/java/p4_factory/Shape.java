package p4_factory;

public interface Shape extends Cloneable {

    void countArea(int r);
    Object clone();
}
