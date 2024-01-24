package controller;

import view.*;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        BemVindo.bemVindo();
        Cardapio.consultarEstoque();
        ApresentaCardapio.mostrar();
    }
}
