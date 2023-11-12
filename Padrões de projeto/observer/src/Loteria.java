import java.util.ArrayList;
import java.util.List;

class Loteria {
    private String nome;
    private String numero;
    private String tipo;
    private List<Observer> observers = new ArrayList<>();

    public Loteria(String nome, String numero, String tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public void notificarObservadores() {
        for (Observer observer : observers) {
            observer.update(nome, numero, tipo);
        }
    }

    public void addObservador(Observer observer) {
        observers.add(observer);
    }

    public void remObservador(Observer observer) {
        observers.remove(observer);
    }

    public void setObservador(Observer observer) {
        observers.clear();
        observers.add(observer);
    }
}
