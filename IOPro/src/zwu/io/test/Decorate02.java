package zwu.io.test;
/*
 * 实现放大器对声音的方法功能
 * */

public class Decorate01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.say();

        Amplifier am = new Amplifier(p);
        am.say();

    }
}

interface Say {
    void say();
}

class Person implements Say {
    //属性
    private int voice = 7;

    @Override
    public void say() {
        System.out.println("人的声音为 " + this.getVoice());
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}

//放大器
class Amplifier implements Say {
    private Person p;

    Amplifier(Person p) {
        this.p = p;
    }

    @Override
    public void say() {
        System.out.println("人的声音为 " + p.getVoice() * 10);
        System.out.println("噪音");
    }
}