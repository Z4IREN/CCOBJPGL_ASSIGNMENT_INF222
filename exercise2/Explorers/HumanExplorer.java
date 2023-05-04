package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("TAO NAG SPAWN SA MERCURY");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("TAO NAG SPAWN SA MARS");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("TAO NAG SPAWN SA SATURN");
    }

    public void visit(Earth earth) {
        System.out.println("TAO NAG SPAWN SA EARTH");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("TAO NAG SPAWN SA JUPITER");
    }

    public void visit(Neptune neptune) {
        System.out.println("TAO NAG SPAWN SA NEPTUNE");
    }

    public void visit(Pluto pluto) {
        System.out.println("TAO NAG SPAWN SA PLUTO");
    }

    public void visit(Uranus uranus) {
        System.out.println("TAO NAG SPAWN SA URANUS");
    }

    public void visit(Venus venus) {
        System.out.println("TAO NAG SPAWN SA VENUS");
    }

}