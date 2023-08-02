package OrientacaoObjetosPratic;

public class AdmProjeto extends DevFullStack {

    private int senha;
    private int dataEntrega;

    public AdmProjeto() {
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(int dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }
}
