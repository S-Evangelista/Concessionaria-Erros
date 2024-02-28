import java.util.ArrayList;
import java.util.List;

    public abstract class Usuario{

        private String nome;
        private String user;
        private String senha;


        public static Usuario login(String user, String senha){
            for (Usuario userPesquisado: usuarios) {
                if(userPesquisado.user.equals(user) &&
                        userPesquisado.senha.equals(senha)){
                    return userPesquisado;
                }
            }
            return null;
        }


        public void cadastrarUsuario(Usuario usuario) {
                Usuario.addUsuario((usuario));
            }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }


    }


