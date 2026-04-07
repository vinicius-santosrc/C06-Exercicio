package PCMania.models;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] computadores = new Computador[10];
    private int qtd = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addComputador(Computador pc) {
        computadores[qtd] = pc;
        qtd++;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtd; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void mostrarCompras() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);

        for (int i = 0; i < qtd; i++) {
            computadores[i].mostraPCConfigs();
        }

        System.out.println("Total: R$" + calculaTotalCompra());
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}