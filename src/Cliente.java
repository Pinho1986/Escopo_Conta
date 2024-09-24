


public class Cliente {
    final int NUMEROCONTA = 1021 ;
    final String AGENCIA = "067-8";
    String Nome ;
    double saldo;

   
    public void cadastrarCliente (String nomeClinteNovo, double SaldoCliente){
       
        Nome = nomeClinteNovo;
        saldo = SaldoCliente;
     }

     public void cadostroConcluido(){
        System.out.println("Nome do cliente: " +Nome);
        System.out.println("Saldo Atual: "+ saldo);
        System.out.println("Número da conta: " + NUMEROCONTA);
        System.out.println("Agência: " + AGENCIA);
        System.out.println("Olá " + Nome + ", obrigado pro criar uma conta em nosso banco, sua agência é " + AGENCIA + ", conta "+ NUMEROCONTA + " e seu saldo R$ "+ saldo+ " já está disponível para saque");
     }

     public void sacar (double valorSolicitado){

        if (saldo < valorSolicitado){
            System.out.println("Saldo insulficiente");
            System.out.println("Saldo atual R$ " + saldo);
        }
        else if (saldo >= valorSolicitado) {
            System.out.println("Valor solicitado:" + valorSolicitado);
            System.out.println("Saque realizado com sucesso");
            saldo -= valorSolicitado;
            System.out.println("Saldo atual R$ " + saldo);
        }
        else {
            System.out.println("Informe um valor valido ");
        }


     }
        
        
     


}
