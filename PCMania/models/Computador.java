package PCMania.models;

public class Computador {
    private String marca;
    private float preco;

    private HardwareBasico[] hardwares = new HardwareBasico[3];
    private SistemaOperacional sistema;
    private MemoriaUSB usb;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void addHardware(HardwareBasico hw, int posicao) {
        this.hardwares[posicao] = hw;
    }

    public void setSistema(SistemaOperacional sistema) {
        this.sistema = sistema;
    }

    public void addMemoriaUSB(MemoriaUSB usb) {
        this.usb = usb;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("--- Computador ---");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);

        for (HardwareBasico hw : hardwares) {
            System.out.println(hw.getNome() + ": " + hw.getCapacidade());
        }

        System.out.println("Sistema: " + sistema.getNome() + " " + sistema.getTipo() + " bits");

        if (usb != null) {
            System.out.println("USB: " + usb.getNome() + " " + usb.getCapacidade() + "GB");
        }
    }
}