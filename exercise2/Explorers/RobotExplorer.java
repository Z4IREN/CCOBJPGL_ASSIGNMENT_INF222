package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Mecha Roll on sa Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Mecha Roll on sa Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Mecha Roll on sa Saturn");
    }

    public void visit(Earth earth) {
        System.out.println("Mecha Roll on sa Earth");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Mecha Roll on sa Jupiter");
    }


    public void visit(Neptune neptune) {
        System.out.println("Mecha Roll on sa Neptune");
    }

    public void visit(Pluto pluto) {
        System.out.println("Mecha Roll on sa Pluto");
    }

    public void visit(Uranus uranus) {
        System.out.println("Mecha Roll on sa Uranus");
    }

    public void visit(Venus venus) {
        System.out.println("Mecha Roll on sa Venus");
    }

}