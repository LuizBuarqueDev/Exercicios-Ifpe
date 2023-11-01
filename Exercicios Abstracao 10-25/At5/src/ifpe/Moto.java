package ifpe;

class Moto extends Veiculo {
    int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        if (ano >= 2008) {
            return preco * 1.10;
        }
        return preco;
    }
}