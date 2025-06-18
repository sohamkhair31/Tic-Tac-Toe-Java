package InputOperation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintSymbol extends JFrame implements MouseListener {
    String pathOf_x ="C:\\Users\\Soham Khair\\IdeaProjects\\Final_Tic\\Images\\x.png";
    String pathOf_o= "C:\\Users\\Soham Khair\\IdeaProjects\\Final_Tic\\Images\\o.png";
    public static CheckPoints Check = new CheckPoints();
    public static boolean[] CheckSigns = new boolean[8];
        JLabel[] labels = new JLabel[9];
        ImageIcon[] img = new ImageIcon[2];
        ImageIcon SelectedImg = new ImageIcon();

            int Width_Frame = 320;
            int Height_Frame = 340;
            int Current = 0;

    public void Print()
    {
            for(int i=0;i<8;i++){CheckSigns[i]=true;}
        this.setTitle("Tic-Tac-Toe");
        this.setSize(Width_Frame,Height_Frame);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
            img[0]= new ImageIcon(pathOf_x);
            img[1]= new ImageIcon(pathOf_o);

        for( int i=0;i<9;i++)
        {
            labels[i] = new JLabel();
            labels[i].setBorder(BorderFactory.createEtchedBorder());
            labels[i].setVerticalAlignment(SwingConstants.CENTER);
            labels[i].setHorizontalAlignment(SwingConstants.CENTER);
            labels[i].setIcon(null);
            labels[i].setBackground(Color.RED);
                add(labels[i]);
        }

            labels[0].setBounds(0,0,100,100);
            labels[1].setBounds(100,0,100,100);
            labels[2].setBounds(200,0,100,100);
            labels[3].setBounds(0,100,100,100);
            labels[4].setBounds(100,100,100,100);
            labels[5].setBounds(200,100,100,100);
            labels[6].setBounds(0,200,100,100);
            labels[7].setBounds(100,200,100,100);
            labels[8].setBounds(200,200,100,100);
        setLayout(null);
        setPreferredSize(new Dimension(270,282));
        repaint();
        addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource()==this)
        {
            if((e.getX()>0&&e.getX()<100)&&(e.getY()>0&&e.getY()<100))
            {

                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[0].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);
            }
            else if((e.getX()>100&&e.getX()<200)&&(e.getY()>0&&e.getY()<100))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[1].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);


            }
            else if((e.getX()>200&&e.getX()<300)&&(e.getY()>0&&e.getY()<100))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[2].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);


            }
            else if((e.getX()>0&&e.getX()<100)&&(e.getY()>100&&e.getY()<200))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[3].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);

            }
            else if((e.getX()>100&&e.getX()<200)&&(e.getY()>100&&e.getY()<200))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[4].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);

            }
            else if((e.getX()>200&&e.getX()<300)&&(e.getY()>100&&e.getY()<200))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[5].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);

            }
            else if((e.getX()>0&&e.getX()<100)&&(e.getY()>200&&e.getY()<300))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[6].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);

            }
            else if((e.getX()>100&&e.getX()<200)&&(e.getY()>200&&e.getY()<300))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[7].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);

            }
            else if((e.getX()>200&&e.getX()<300)&&(e.getY()>200&&e.getY()<300))
            {
                SelectedImg = ((Current % 2) == 0) ? img[0]:img[1];
                labels[8].setIcon(SelectedImg);
                Current++;
                Check.CheckStart(labels,img);
                Check.TieCondition(labels,img);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}