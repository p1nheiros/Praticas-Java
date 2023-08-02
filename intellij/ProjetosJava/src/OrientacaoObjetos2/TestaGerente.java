package OrientacaoObjetos2;

import OrientacaoObjetos2.Gerente;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João da SIlva");
        gerente.setSenha(22);

        gerente.autentica(22);
    }
}
