package Lec2AbsrtrucInterf.Lesson_08.Ex005.v2;

import Lec2AbsrtrucInterf.Lesson_08.Ex005.v2.Healers.Healer;
import Lec2AbsrtrucInterf.Lesson_08.Ex005.v2.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

    @Override
    public void attack(Hero target) {
        
    }

    @Override
    public void healing(Hero target) {
        
    }
}

