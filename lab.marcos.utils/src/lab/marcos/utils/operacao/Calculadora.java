package lab.marcos.utils.operacao;

import lab.marcos.utils.operacao.internal.DivHelper;
import lab.marcos.utils.operacao.internal.MultHelper;
import lab.marcos.utils.operacao.internal.SubHelper;
import lab.marcos.utils.operacao.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        divHelper = new DivHelper();
        multHelper = new MultHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }
    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }
}
