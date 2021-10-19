package lab.marcos.operacao.internal;

import lab.marcos.operacao.Operacao;

public class MultHelper implements Operacao {

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
