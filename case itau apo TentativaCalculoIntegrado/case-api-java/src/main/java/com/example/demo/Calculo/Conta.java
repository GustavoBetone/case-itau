import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransferenciaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransferenciaServiceApplication.class, args);
    }
}

@Data
class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }
}

