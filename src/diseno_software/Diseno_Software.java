/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseno_software;

import java.awt.Cursor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author JohanSanchez
 */
public class Diseno_Software extends JFrame implements MouseListener, ActionListener {

    JLabel title, point1, point2, point3, point4, point5, point6, point7, titleresult, titleentrada;
    JButton salir;
    TextArea entrada, resultado;

    public static void main(String[] args) {
        Diseno_Software obj = new Diseno_Software();
    }

    public Diseno_Software() {
        title = new JLabel("Opciones");
        titleresult = new JLabel("Resultado");
        titleentrada = new JLabel("Entrada");
        point1 = new JLabel("1. Punto 1");
        point2 = new JLabel("2. Punto 2");
        point3 = new JLabel("3. Punto 3");
        point4 = new JLabel("4. Punto 4");
        point5 = new JLabel("5. Punto 5");
        point6 = new JLabel("6. Punto 6");
        point7 = new JLabel("7. Punto 7");
        entrada = new TextArea();
        resultado = new TextArea();
        salir = new JButton("salir");
        point1.setName("point1");
        point2.setName("point2");
        point3.setName("point3");
        point4.setName("point4");
        point5.setName("point5");
        point6.setName("point6");
        point7.setName("point7");
        title.setFont(new java.awt.Font("Tahoma", 0, 20));
        title.setBounds(10, 10, 80, 20);

        point1.setBounds(10, 30, 70, 20);
        point2.setBounds(10, 60, 70, 20);
        point3.setBounds(10, 90, 70, 20);
        point4.setBounds(10, 120, 70, 20);
        point5.setBounds(10, 150, 70, 20);
        point6.setBounds(10, 180, 70, 20);
        point7.setBounds(10, 210, 70, 20);
        resultado.setBounds(460, 50, 300, 200);
        entrada.setBounds(120, 50, 300, 200);
        titleresult.setBounds(460, 1, 70, 70);
        titleentrada.setBounds(120, 1, 70, 70);
        //boton
        salir.setBounds(10, 250, 80, 20);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        point1.addMouseListener(this);
        point2.addMouseListener(this);
        point3.addMouseListener(this);
        point4.addMouseListener(this);
        point5.addMouseListener(this);
        point6.addMouseListener(this);
        point7.addMouseListener(this);
        salir.addActionListener(this);
        setTitle("Menu Principal");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //setEnabled(false);
        add(title);
        add(point1);
        add(point2);
        add(point3);
        add(point4);
        add(point5);
        add(point6);
        add(point7);
        add(resultado);
        add(entrada);
        add(titleresult);
        add(titleentrada);
        add(salir);

        add(panel);
        setSize(800, 350);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        String resp = "", ent = "";

        switch (me.getComponent().getName()) {
            case "point1": {
                Punto_1 p = new Punto_1(5);
                ent = p.fillData();
                entrada.setText(ent);
                float promedio = p.promedio();
                int prosupe = p.superior(promedio);
                resultado.setText("");
                resultado.setText("El promedio es: " + promedio + "\n" + "Superiores al promedio : " + prosupe);
                break;
            }
            case "point2": {
                Punto_2 p = new Punto_2(5);
                ent = p.fillData();
                entrada.setText(ent);
                int mayor = p.getMayor();
                int menor = p.getMenor();
                resultado.setText("");
                resultado.setText("El Mayor: " + mayor + "\n" + "Menor : " + menor);
                break;
            }
            case "point3": {
                Punto_3 p = new Punto_3();
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Cantidad de numeros primos"));
                entrada.setText(ent);
                String primo = p.getPrimoNum(cant);
                resultado.setText("Números primos:" + primo);
                break;
            }
            case "point4": {
                Punto_4 p = new Punto_4(10);
                ent = p.fillData();
                entrada.setText(ent);
                int[] arr = p.getNumberRepeat();
                resp = p.getDataFilter(arr);
                resultado.setText("Numeros unicos: \n" + resp);
                break;
            }
            case "point5": {
                Punto_5 p = new Punto_5(10);
                ent = p.fillData();
                entrada.setText(ent);
                p.reAsignacion();
                int[] arr = p.cleanMatriz();
                arr = p.ordenar(arr);
                resp = p.printMatriz(arr);
                resultado.setText("Numeros unicos ordenados\n" + resp);
                break;
            }
            case "point6": {
                Punto_6 p = new Punto_6(4);
                float arr[] = p.fillArray();
                ent = p.fillData();
                entrada.setText(ent);
                float promedio = p.promedio(arr);
                float aprovados = ((p.aprobados(arr) * 100 / arr.length));
                float reprobados = ((p.reprobados(arr) * 100 / arr.length));
                resultado.setText("Promedio: " + promedio + "\n" + "Aprovados: " + aprovados + "%\n" + "Reprobados: " + reprobados + "%");
                break;
            }
            case "point7": {
                Punto_7 p = new Punto_7(2, 2);
                ent = p.fillData();
                String[] matriz = ent.split(":");
                entrada.setText("matriz1: " + matriz[0] + "\n\nMatriz 2:" + matriz[1]);
                p.sumaMatriz();
                resp = p.printMatriz();
                resultado.setText("Array: " + resp);
                break;
            }

        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        setCursor(Cursor.getPredefinedCursor(DEFAULT_CURSOR));
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            System.exit(0);
        }
    }

}
