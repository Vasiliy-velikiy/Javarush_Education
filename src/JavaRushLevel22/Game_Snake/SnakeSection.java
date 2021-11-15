package JavaRushLevel22.Game_Snake;

import java.util.Objects;

public class SnakeSection {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SnakeSection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    @Override
    public boolean equals(Object obj) {
       // SnakeSection snakeSection=(SnakeSection) obj;

       if( this==obj)return true;
       if (obj==null||getClass()!=obj.getClass())return false;
        SnakeSection snakeSection=(SnakeSection) obj;//приводим к одному типу
        return getX()==snakeSection.getX()&&getY()==snakeSection.getY();//так как у объекта два поле-сравниваем каждое
    }


}