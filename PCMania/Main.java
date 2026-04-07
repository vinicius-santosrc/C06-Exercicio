package PCMania;

import java.util.Scanner;
import PCMania.models.*;
import PCMania.utils.ProcessarPedido;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        int matricula = 1234;

        // PROMOÇÃO 1
        Computador pc1 = new Computador("Apple", matricula);
        pc1.addHardware(new HardwareBasico("Pentium i3", 2200), 0);
        pc1.addHardware(new HardwareBasico("RAM", 8), 1);
        pc1.addHardware(new HardwareBasico("HD", 500), 2);
        pc1.setSistema(new SistemaOperacional("macOS Sequoia", 64));
        pc1.addMemoriaUSB(new MemoriaUSB("PenDrive", 16));

        // PROMOÇÃO 2
        Computador pc2 = new Computador("Samsung", matricula + 1234);
        pc2.addHardware(new HardwareBasico("Pentium i5", 3370), 0);
        pc2.addHardware(new HardwareBasico("RAM", 16), 1);
        pc2.addHardware(new HardwareBasico("HD", 1000), 2);
        pc2.setSistema(new SistemaOperacional("Windows 8", 64));
        pc2.addMemoriaUSB(new MemoriaUSB("PenDrive", 32));

        // PROMOÇÃO 3
        Computador pc3 = new Computador("Dell", matricula + 5678);
        pc3.addHardware(new HardwareBasico("Pentium i7", 4500), 0);
        pc3.addHardware(new HardwareBasico("RAM", 32), 1);
        pc3.addHardware(new HardwareBasico("HD", 2000), 2);
        pc3.setSistema(new SistemaOperacional("Windows 10", 64));
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cliente.addComputador(pc1);
                    break;
                case 2:
                    cliente.addComputador(pc2);
                    break;
                case 3:
                    cliente.addComputador(pc3);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        cliente.mostrarCompras();

        ProcessarPedido.processar(cliente.getComputadores());

        sc.close();
    }
}