package ravin.interfaces;

public interface ICrud<T> {
    T create(T obj);
    T read(String id);
    T update(T obj);
    void delete(String id);
}