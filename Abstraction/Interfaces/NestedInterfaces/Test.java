package Abstraction.Interfaces.NestedInterfaces;

import Abstraction.Interfaces.NestedInterfaces.vogue.noor;

interface vogue {
    void message();

    default void defaultMessage() {
        System.out.println("Vogue Default Message");
    }

    interface noor {
        void noorMessage();

        default void noorDefault() {
            System.out.println("Noor interface default message");
        }
    }
}

class VogueImp implements vogue {
    @Override
    public void message() {
        System.out.println("I'm vogue");
    }
}

class NoorImp implements vogue.noor {
    @Override
    public void noorMessage() {

    }
}

public class Test {

}