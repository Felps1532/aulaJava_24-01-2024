package view;
import controller.*;

public class ApresentaCardapio {
    public static void mostrar() {
        System.out.printf(InterfaceController.receitasDisponiveis);
        System.out.printf(InterfaceController.receitasIndisponiveis);
    }
}
