package ifpe;

class Carro extends Veiculo {
    double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public double getPreco() {
        if (km > 100000) {
            return preco * 0.92;
        }
        return preco;
    }
}