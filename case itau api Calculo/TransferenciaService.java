import java.util.HashMap;
import java.util.Map;

// Classe Conta representa uma conta bancária
class Conta {
    private final String numeroConta; // Número da conta (não pode ser alterado após a inicialização)
    private double saldo; // Saldo da conta

    // Construtor da classe Conta
    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta; // Inicializa o número da conta
        this.saldo = saldo; // Inicializa o saldo
    }

    // Método para obter o número da conta
    public String getNumeroConta() {
        return numeroConta;
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para debitar um valor do saldo da conta
    public void debitar(double valor) {
        saldo -= valor; // Subtrai o valor do saldo
    }

    // Método para creditar um valor no saldo da conta
    public void creditar(double valor) {
        saldo += valor; // Adiciona o valor ao saldo
    }
}

// Classe TransferenciaService realiza transferências entre contas
public class TransferenciaService {
    private final Map<String, Conta> contas; // Mapa de contas bancárias

    // Construtor da classe TransferenciaService
    public TransferenciaService() {
        contas = new HashMap<>(); // Inicializa o mapa de contas
        // Adiciona algumas contas de exemplo ao mapa
        contas.put("123456", new Conta("123456", 500.0)); // Conta com saldo inicial de 500.0
        contas.put("789012", new Conta("789012", 200.0)); // Conta com saldo inicial de 200.0
    }

    // Método para realizar uma transferência entre contas
    public boolean realizarTransferencia(String contaOrigem, String contaDestino, double valor) {
        Conta origem = contas.get(contaOrigem); // Obtém a conta de origem
        Conta destino = contas.get(contaDestino); // Obtém a conta de destino

        // Verifica se as contas de origem e destino existem
        if (origem == null || destino == null) {
            return false; // Retorna false se uma das contas não existir
        }

        // Verifica se o valor da transferência não excede R$100,00
        if (valor > 100.0) {
            return false; // Retorna false se o valor exceder R$100,00
        }

        // Verifica se há saldo suficiente na conta de origem
        if (origem.getSaldo() < valor) {
            return false; // Retorna false se o saldo for insuficiente
        }

        origem.debitar(valor); // Debita o valor da conta de origem
        destino.creditar(valor); // Credita o valor na conta de destino

        return true; // Retorna true se a transferência for realizada com sucesso
    }

    // Método principal para simular uma transferência
    public static void main(String[] args) {
        TransferenciaService service = new TransferenciaService(); // Cria uma instância do serviço de transferência
        String contaOrigem = "123456"; // Número da conta de origem
        String contaDestino = "789012"; // Número da conta de destino
        double valorTransferencia = 50.0; // Valor da transferência

        // Verifica se a transferência foi bem-sucedida e exibe uma mensagem adequada
        if (service.realizarTransferencia(contaOrigem, contaDestino, valorTransferencia)) {
            System.out.println("Transferência de R$" + valorTransferencia + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Verifique as informações e tente novamente.");
        }
    }
}
