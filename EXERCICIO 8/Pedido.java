class Pedido {
    private Pizza pizza;
    private String endereco;

    public Pedido(Pizza pizza, String endereco) {
        this.pizza = pizza;
        this.endereco = endereco;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getEndereco() {
        return endereco;
    }
}
