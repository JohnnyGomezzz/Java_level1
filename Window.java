package com.JohnnyGomezzz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame
{
    public Window(int x, int y, int w, int h)
    {
        setTitle("Moving Window"); //название окошка

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //закрывается по "крестику"

        setBounds(x,y,w,h); //расположение относительно лев-верх угла, размер

        setLayout(new BorderLayout()); //выбор компоновщика

        JButton btn_R = new JButton(">");
        btn_R.setPreferredSize(new Dimension(100, 100));

        add(btn_R, BorderLayout.EAST); //добавление кнопок

        btn_R.addActionListener(new ActionListener() { // действие по нажатию кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрытие окна
                Window window = new Window(x + 50, y, w, h); // создание нового окна
            }
        });

        JButton btn_L = new JButton("<");
        btn_L.setPreferredSize(new Dimension(100, 100));

        add(btn_L, BorderLayout.WEST); //добавление кнопок

        btn_L.addActionListener(new ActionListener() { // действие по нажатию кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрытие окна
                Window window = new Window(x - 50, y, w, h); // создание нового окна
            }
        });

        JButton btn_U = new JButton("^");
        btn_U.setPreferredSize(new Dimension(100, 75));

        add(btn_U, BorderLayout.NORTH); //добавление кнопок

        btn_U.addActionListener(new ActionListener() { // действие по нажатию кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрытие окна
                Window window = new Window(x, y - 50, w, h); // создание нового окна
            }
        });

        JButton btn_D = new JButton("v");
        btn_D.setPreferredSize(new Dimension(100, 75));

        add(btn_D, BorderLayout.SOUTH); //добавление кнопок

        btn_D.addActionListener(new ActionListener() { // действие по нажатию кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрытие окна
                Window window = new Window(x, y + 50, w, h); // создание нового окна
            }
        });

        JButton btn_C = new JButton("Reset");

        add(btn_C, BorderLayout.CENTER); //добавление кнопок

        btn_C.addActionListener(new ActionListener() { // действие по нажатию кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрытие окна
                Window window = new Window(500, 500, w, h); // создание нового окна
            }
        });

        setVisible(true); //видимость

        setResizable(false); // окошко не растягивается

        btn_U.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    btn_R.requestFocus();
                    btn_R.doClick();
                }

                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    btn_L.requestFocus();
                    btn_L.doClick();
                }

                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    btn_D.requestFocus();
                    btn_D.doClick();
                }

                if(e.getKeyCode() == KeyEvent.VK_UP){
                    btn_U.requestFocus();
                    btn_U.doClick();
                }

                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    btn_C.requestFocus();
                    btn_C.doClick();
                }
            }
        });
    }
}
