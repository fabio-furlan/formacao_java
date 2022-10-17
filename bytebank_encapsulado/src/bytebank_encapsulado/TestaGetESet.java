package bytebank_encapsulado;

public class TestaGetESet {
    
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        //conta.numero = 1337;
        //conta.setNumero(1337); não precisa mais pq adicionamos em new conta
        System.out.println(conta.getNumero());
        
        Cliente paulo = new Cliente();
        //conta.titula = paulo;
        paulo.setNome("paulo silveira");
            
        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissão("programador");
        // agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissão("programador");
        
        // fazendo impressão com o mesmo resultado, mesma"caixa de armazenamento"
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
    
    
    
}
