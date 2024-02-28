
public class Main {

   public static void main(String[] args) {

        Usuario fulano = new Gerente("fulano", "fulano", "1234");
        Usuario.addUsuario(fulano);

        Usuario ciclano = new Vendedor("ciclano", "ciclano", "1345");
        Usuario.addUsuario(ciclano);

        Usuario beltrano = new Cliente("beltrano", "beltrano", "1456");
        Usuario.addUsuario(beltrano);


        do {

            System.out.println("Concessionaria");
            System.out.println(" 1- Cadastro de Usuário \n 2- Login \n 3- Cadastrar veiculo");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> cadastroUsuario();
                case 2 -> login();
                case 3 -> cadastrarVeiculo();
            }

        }while (true);
    }

        private static void cadastroUsuario() {
            System.out.print("Digite o nome:");
            String nome = sc.next();

            System.out.print("Digite o nome de usuario:");
            String user = sc.next();

            System.out.print("Defina uma senha:");
            String senha = sc.next();

            Usuario usuario = new Usuario (nome, user, senha) {
            };
            Usuario.addUsuario(usuario);
        }

        private static void login(){
            do {
                System.out.print("Usuario: ");
                String usuario = sc.next();
                System.out.print("Senha: ");
                String senha = sc.next();

                usuarioLogado = Usuario.login(usuario, senha);

            } while (usuarioLogado == null);
        }

    public static void cadastrarVeiculo(){

        if(usuarioLogado instanceof Gerente){
            System.out.print("Digite o modelo do carro: ");
            String modelo = sc.next();

            Veiculo nome0 = null;

            for (Veiculo veiculo: Veiculo.getVeiculos()){
                if(veiculo.getModelo() == modelo){
                    nome0 = veiculo;
                }
            }

            ((Gerente) usuarioLogado).cadastrarVeiculo(nome0);
        } else {
            System.out.println("Você não tem permissão para este acesso. ");
        }
    }

}



