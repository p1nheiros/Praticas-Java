package OrientacaoObjetosPratic;

import OrientacaoObjetos2.Gerente;

public class TestaAdm {
    public static void main(String[] args) {
        AdmProjeto admProjeto = new AdmProjeto();
        admProjeto.setNome("João da SIlva");
        admProjeto.setSenha(22);

        admProjeto.autentica(22);
    }
}
