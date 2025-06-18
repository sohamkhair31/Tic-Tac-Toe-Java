package InputOperation;

import javax.swing.*;

public class CheckPoints extends PrintSymbol{
    static int Score_1 =0;
    static int Score_2 =0;

    public void CheckStart(JLabel[] jLabels,ImageIcon[] img)
    {



        if(jLabels[0].getIcon()==jLabels[1].getIcon()
            &&jLabels[1].getIcon()==jLabels[2].getIcon())
        {
                 if(jLabels[2]!=null&&CheckSigns[0]==true){
                     if (jLabels[0].getIcon()==img[0]) {Score_1++;CheckSigns[0]=false;}
                    else if (jLabels[0].getIcon()==img[1]) {Score_2++;CheckSigns[0]=false;}
                     System.out.println("SCORE : "+Score_1);
                     System.out.println("SCORE : "+Score_2);
                     System.out.println("From 1");

                 }
        }
        else  if(jLabels[3].getIcon()==jLabels[4].getIcon()
                &&jLabels[4].getIcon()==jLabels[5].getIcon())
        {
            if(jLabels[3]!=null&&CheckSigns[1]){
                if (jLabels[3].getIcon()==img[0]) {Score_1++;CheckSigns[1]=false;}
                else if (jLabels[3].getIcon()==img[1]) {Score_2++;CheckSigns[1]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 2");
            }
        }
        else  if(jLabels[6].getIcon()==jLabels[7].getIcon()
                &&jLabels[7].getIcon()==jLabels[8].getIcon())
        {
            if(jLabels[6]!=null&&CheckSigns[2]){
                if (jLabels[6].getIcon()==img[0]) {Score_1++;CheckSigns[2]=false;}
                else if (jLabels[6].getIcon()==img[1]) {Score_2++;CheckSigns[2]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 3");
            }
        }
        else  if(jLabels[2].getIcon()==jLabels[5].getIcon()
                &&jLabels[5].getIcon()==jLabels[8].getIcon())
        {
            if(jLabels[2]!=null&&CheckSigns[3]){
                if (jLabels[2].getIcon()==img[0]) {Score_1++;CheckSigns[3]=false;}
                else if (jLabels[2].getIcon()==img[1]) {Score_2++;CheckSigns[3]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 4");
            }
        }else  if(jLabels[1].getIcon()==jLabels[4].getIcon()
                &&jLabels[4].getIcon()==jLabels[7].getIcon())
        {
            if(jLabels[1]!=null&&CheckSigns[4]){
                if (jLabels[1].getIcon()==img[0]) {Score_1++;CheckSigns[4]=false;}
                else if (jLabels[1].getIcon()==img[1]) {Score_2++;CheckSigns[4]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 5");
            }
        }else  if(jLabels[0].getIcon()==jLabels[3].getIcon()
                &&jLabels[3].getIcon()==jLabels[6].getIcon())
        {
            if(jLabels[0]!=null&&CheckSigns[5]){
                if (jLabels[0].getIcon()==img[0]) {Score_1++;CheckSigns[5]=false;}
                else if (jLabels[0].getIcon()==img[1]) {Score_2++;CheckSigns[5]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 6");
            }
        }
        else  if(jLabels[0].getIcon()==jLabels[4].getIcon()
                &&jLabels[4].getIcon()==jLabels[8].getIcon())
        {
            if(jLabels[0]!=null&&CheckSigns[6]){
                if (jLabels[0].getIcon()==img[0]) {Score_1++;CheckSigns[6]=false;}
                else if (jLabels[0].getIcon()==img[1]) {Score_2++;CheckSigns[6]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 7");
            }
        }
        else  if(jLabels[2].getIcon()==jLabels[4].getIcon()
                &&jLabels[4].getIcon()==jLabels[6].getIcon())
        {
            if(jLabels[2]!=null&&CheckSigns[7]){
                if (jLabels[2].getIcon()==img[0]) {Score_1++;CheckSigns[7]=false;}
                else if (jLabels[2].getIcon()==img[1]) {Score_2++;CheckSigns[7]=false;}
                System.out.println("SCORE : "+Score_1);
                System.out.println("SCORE : "+Score_2);
                System.out.println("From 8");
            }
        }
        if(Score_1==1){
            JOptionPane.showMessageDialog(null,"Winner : Player 1","GAME STAUS",JOptionPane.OK_OPTION);
            System.exit(0);
        }
        else if (Score_2==1)
        {
            JOptionPane.showMessageDialog(null,"Winner : Player 2","GAME STAUS",JOptionPane.OK_OPTION);
            System.exit(0);

        }
    }
    public void TieCondition(JLabel[] jLabels,ImageIcon[] img)
    {
        int CntBlocked = 0;
        for(int i=0;i<9;i++)
        {
            if(jLabels[i].getIcon()==img[0]
                || jLabels[i].getIcon()==img[1]
            )
            {
                CntBlocked++;
            }
        }
        if(CntBlocked==9)
        {
            JOptionPane.showMessageDialog(null,"TIE","GAME STATUS",JOptionPane.OK_OPTION);
        }
    }

}
