package JavaRushLevel22.Game_Snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {

   private List<SnakeSection> sections;
   private boolean isAlive;
   private SnakeDirection direction;

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(int x,int y) {
        sections=new ArrayList<>();
      SnakeSection head=new SnakeSection(x, y);
      sections.add(head);
      this.isAlive=true;
    }

                                                    //координаты головы
    int getX(){
        return sections.get(0).getX();
    }
    int getY(){
        return sections.get(0).getY();
    }
   void move(){
        if (isAlive) {
            if (direction == SnakeDirection.UP) {
                move(0, -1);
            }
            if (direction == SnakeDirection.RIGHT) {
                move(1, 0);
            }
            if (direction == SnakeDirection.DOWN) {
                move(0, 1);
            }
            if (direction == SnakeDirection.LEFT) {
                move(-1, 0);
            }
        }

    }
    void move(int x,int y){                //к уже имеющимся координатам головы вы прибавляем координаты движения
        SnakeSection head=new SnakeSection(sections.get(0).getX()+x,sections.get(0).getY()+y);
        checkBorders(head);             //проверяем -не заходит ли змея за границы комнаты
        checkBody(head);               // и не врезается в свои части тела


       if (isAlive) {//пока змея жива
           sections.add(0, head);//добавляем на нулевое место голову с обнавленными координатами движения
                                        //у змеи есть методы getX(), getY()-возвращающие коррдинаты головы
                                        //если голова(координаты) находится на месте мыши-то мыш съедается)
           if ((getX() == Room.game.getMouse().getX() && getY() == Room.game.getMouse().getY())) {
               Room.game.eatMouse();
                    return;
           }
           sections.remove(sections.size()-1);//если осуществляется движение тела(обновленные координаты головы), то последняя часть должна удаляться
       }

 }

    void   checkBorders(SnakeSection head) {//проверяем, если координаты головы заходят за границу, то змея погибает
        if (head.getX() >= Room.game.getWidth() || (head.getY() >= Room.game.getHeight()) || head.getX() < 0 || head.getY() < 0) {
            isAlive = false;
        }
        else isAlive=true;
    }

      void  checkBody(SnakeSection head){//если секции содержат уже голову -то змея погибает
        if (sections.contains(head)) isAlive=false;
else isAlive=true;
        }
}

