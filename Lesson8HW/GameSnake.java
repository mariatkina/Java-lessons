package Lesson8;

import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame {
    final String TITLE_OF_Program = "Snake"; //название окна
    final String GAME_OVER_MSG = "GAME OVER"; // сообщение о проигрыше
    final String YOU_WIN_MSG = "YOU WIN!"; // сообщение о выигрыше
    final static int CELL_SIZE = 20; // размер ячейки в пикс
    final static int CANVAS_WIDTH = 30; // ширина в пикс
    final static int CANVAS_HEIGTH = 25; //высота в пикс
    final static Color SNAKE_COLOR = Color.green; //цвет змеи
    final static Color FOOD_COLOR = Color.blue; // цвет еды
    final static Color POISON_COLOR = Color.red; //цвет яда
    final static int KEY_LEFT = 37; //обозначение кнопки влево
    final static int KEY_UP = 38; //обозначение кнопки вверх
    final static int KEY_RIGHT = 39; //обозначение кнопки вправо
    final static int KEY_DOWN = 40; //обозначение кнопки вниз
    final int START_SNAKE_SIZE = 5; //количество звеньев змеи на старте
    final int START_SNAKE_X = CANVAS_WIDTH/2; //положение змеи на поле на старте (ширина)
    final int START_SNAKE_Y = CANVAS_HEIGTH/2; //положение змеи на поле на старте (высота)
    final int SNAKE_DELAY = 150; //задержка движения в мс
    int snakeSize = 0; //переменная размер змеи
    static boolean gameOver = false;

    Canvas canvas;
    Snake snake;
    Food food;
    Poison poison;
    Cell cell;

    public GameSnake(){
        setTitle(TITLE_OF_Program);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH - 10,
                CELL_SIZE * CANVAS_HEIGTH - 10));

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    public static void main(String[] args) {
        new GameSnake().game();

    }

    private void game() {
        snake = new Snake(
                START_SNAKE_X,
                START_SNAKE_Y,
                START_SNAKE_SIZE,
                KEY_RIGHT
        );
        food = new Food(snake);
        snake.setFood(food);
        food.setPoison(poison);

        poison = new Poison(snake);
        poison.setFood(food);
        food.setPoison(poison);
        snake.setPoison(poison);



        while (!gameOver){
            snake.move();
            if(snake.size() > snakeSize){
                snakeSize = snake.size();
                setTitle(TITLE_OF_Program + ": " + snakeSize);

            }
            if (food.isEaten()){
                food.appear();
                poison.add();
            }
            if (snakeSize == 20) {
                JOptionPane.showMessageDialog(this, YOU_WIN_MSG);
            }
            canvas.repaint();
            sleep(SNAKE_DELAY);
        }
        JOptionPane.showMessageDialog(this,GAME_OVER_MSG);
    }

    private void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Canvas extends JPanel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            snake.paint(g2D);
            food.paint(g2D);
            poison.paint(g2D);
        }
    }

}
