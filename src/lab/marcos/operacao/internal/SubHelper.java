package lab.marcos.operacao.internal;

import lab.marcos.operacao.Operacao;

public class SubHelper implements Operacao {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
