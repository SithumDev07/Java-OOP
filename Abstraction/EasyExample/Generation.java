package Abstraction.EasyExample;

//* Let's say we wan't to make a mobile phone which can perform special tasks.
//* There can be situations where we already know how to implement some tasks but some are not.
//* Let's assume we cannot make some features before the deadline. but we want to include those features. what we can do is write down and stop the project.
//* After, a few years someone wants to make a mobile with the same idea we had. So when he does research, and he finds we already implement some features. So he can start where we stopped from.
//* Somehow he implemented those mentioned features, but he failed to add his own features. So he has to do the same thing we did. Then again, someone came and can start from where he stopped
//* Let's break these steps into generations.

abstract class GenOne {
    void call() {
        System.out.println("Calling feature working");
    }

    abstract void vibrate();

    abstract void reset();

    abstract void playMusic();
}

abstract class GenTwo extends GenOne {
    @Override
    void vibrate() {
        System.out.println("Vibrating Feature is working");
    }

    @Override
    void reset() {
        System.out.println("Resetting feature is working");
    }

    @Override
    void playMusic() {
        System.out.println("Can play music");
    }

    abstract void FiveGConnectivity();
}

class GenThree extends GenTwo {
    @Override
    void FiveGConnectivity() {
        System.out.println("Phone can connect to 5G Connection");
    }
}

public class Generation {
    public static void main(String[] args) {
        GenThree latestPhone = new GenThree();
        latestPhone.call();
        latestPhone.vibrate();
        latestPhone.FiveGConnectivity();
    }
}
