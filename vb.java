import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class vb extends JFrame implements ActionListener
{
   JButton button1=new JButton("1 Player");
   JButton button2=new JButton("2 Player");
   vb()
   {
     JFrame frame = new JFrame("Guessing Game");
     JPanel panel = new JPanel();	
     JTextField textfield=new JTextField();
     JTextField t1=new JTextField();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.getContentPane().setBackground(new Color(50,50,50));
     ImageIcon image = new ImageIcon("logo.png");
     frame.setIconImage(image.getImage());
     frame.setLayout(null);
     frame.setResizable(false);

textfield.setBounds(0,0,700,50);
textfield.setBackground(new Color(25,25,25));
textfield.setForeground(new Color(255,255,0));
textfield.setFont(new Font("Ink Free",Font.BOLD,30));
textfield.setBorder(BorderFactory.createBevelBorder(1));
textfield.setHorizontalAlignment(JTextField.CENTER);
textfield.setEditable(false);
textfield.setText("THINK FOR A BLANK!");
frame.add(textfield);

t1.setBounds(0,70,350,50);
t1.setBackground(new Color(25,25,25));
t1.setForeground(new Color(25,255,0));
t1.setFont(new Font("Ink Free",Font.BOLD,30));
t1.setBorder(BorderFactory.createBevelBorder(1));
t1.setHorizontalAlignment(JTextField.LEFT);
t1.setEditable(false);
t1.setText("Choose number of players:");
frame.add(t1);
	
frame.setSize(700,250);
frame.setLocationRelativeTo(null);
frame.setVisible(true);
button1.addActionListener(this);
button1.setBounds(370,70,100,50);
button1.setBackground(new Color(25,25,25));
button1.setForeground(new Color(25,255,0));
frame.add(button1);
        
button2.addActionListener(this);
button2.setBounds(480,70,100,50);
button2.setBackground(new Color(25,25,25));
button2.setForeground(new Color(25,255,0));
frame.add(button2);
}

public void actionPerformed(ActionEvent e)
{ 
 if(e.getSource()==button1)
{
  UIManager UI=new UIManager();
  UIManager.put("OptionPane.minimumSize",new Dimension(500,200));  
  UI.put("Panel.background", Color.PINK);
  int k=JOptionPane.showConfirmDialog(null, "Rule 1 : Number of guesses=number of unique characters.\nRule 2 :  In case player uses a hint then number of guesses will be reduced by 1.\nNote : Game will continue till the player wins or number of guesses becomes 0.\nDo you want to play?","INFORMATION",JOptionPane.YES_NO_CANCEL_OPTION);
  if( k==JOptionPane.YES_OPTION)
  {
    Singleplayer sp = new Singleplayer();
  }  
  if(k==JOptionPane.NO_OPTION)
  {
    System.exit(0);
  }  
}  
 if(e.getSource()==button2)	
{
  UIManager UI=new UIManager();
  UIManager.put("OptionPane.minimumSize",new Dimension(600,250));  
  UI.put("Panel.background", Color.PINK);
  int k=JOptionPane.showConfirmDialog(null, "Rule 1 : Player one will start the game\nRule 2 : If the player's guess is correct then that player ony will get the next turn\nRule 3 : If the player's guess is wrong, then turn will be given to the other player\nNote : Game will continue till any of the two players win\n Hint will not be provided\nDo you want to play?","INFORMATION",JOptionPane.YES_NO_CANCEL_OPTION);
  if( k==JOptionPane.YES_OPTION)
  {
    Doubleplayer dp = new Doubleplayer();
  }  
  if(k==JOptionPane.NO_OPTION)
  {
    System.exit(0);
  }  
}
}
public static void main (String[] args)
 {
     vb v=new vb();
 }
}
class Doubleplayer extends JFrame implements ActionListener
{
 String p1="";
 String p2="";
 String g2="";
 String c2="";
 String random="";
 String[] ch2;
 String str2="";
 String p="";
 String ps1="";
 String ps2="";
 String[] array={"hello","apple","hat","grapes","baby"};
 int num=(int)Math.random()*5;

JTextField textfield = new JTextField();
JTextField t1 = new JTextField();
JTextField l1 = new JTextField();
JTextField l2 = new JTextField();
JTextField t3 = new JTextField();
JTextField l3 = new JTextField();
JTextField l4 = new JTextField();
JTextField l5 = new JTextField();
JTextField l6 = new JTextField();
JTextField t4 = new JTextField();

JButton ok = new JButton("OK");
JButton ok1 = new JButton("OK");
JButton ok2 = new JButton("OK");
JButton exit = new JButton("Exit");

JFrame frame=new JFrame();
Doubleplayer()
{	
JFrame frame=new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Guessing Game");
frame.setSize(850,600);
frame.setLocationRelativeTo(null);
frame.getContentPane().setBackground(new Color(50,50,50));
ImageIcon image = new ImageIcon("logo.png");
frame.setIconImage(image.getImage());
frame.setLayout(null);
frame.setResizable(true);

textfield.setBounds(0,0,850,50);
textfield.setBackground(new Color(25,25,25));
textfield.setForeground(new Color(255,255,0));
textfield.setFont(new Font("Ink Free",Font.BOLD,30));
textfield.setBorder(BorderFactory.createBevelBorder(1));
textfield.setHorizontalAlignment(JTextField.CENTER);
textfield.setEditable(false);
textfield.setText("THINK FOR A BLANK!");
frame.add(textfield);

t1.setBounds(0,70,350,50);
t1.setBackground(new Color(25,25,25));
t1.setForeground(new Color(25,255,0));
t1.setFont(new Font("Ink Free",Font.BOLD,30));
t1.setBorder(BorderFactory.createBevelBorder(1));
t1.setHorizontalAlignment(JTextField.LEFT);
t1.setEditable(false);
t1.setText("Enter name of Player 1:");
frame.add(t1);

l1.setBounds(360,70,200,50);
l1.setBackground(new Color(25,25,25));
l1.setForeground(new Color(25,255,0));
l1.setFont(new Font("Ink Free",Font.BOLD,30));
l1.setBorder(BorderFactory.createBevelBorder(1));
l1.setHorizontalAlignment(JTextField.LEFT);
l1.setEditable(true);
frame.add(l1);

l2.setBounds(0,130,350,50);
l2.setBackground(new Color(25,25,25));
l2.setForeground(new Color(25,255,0));
l2.setFont(new Font("Ink Free",Font.BOLD,30));
l2.setBorder(BorderFactory.createBevelBorder(1));
l2.setHorizontalAlignment(JTextField.LEFT);
l2.setText("Enter name of Player 2:");
l2.setEditable(false);
frame.add(l2);

t3.setBounds(360,130,200,50);
t3.setBackground(new Color(25,25,25));
t3.setForeground(new Color(25,255,0));
t3.setFont(new Font("Ink Free",Font.BOLD,30));
t3.setBorder(BorderFactory.createBevelBorder(1));
t3.setEditable(true);
frame.add(t3);

l3.setBounds(0,190,350,50);
l3.setBackground(new Color(25,25,25));
l3.setForeground(new Color(25,255,0));
l3.setFont(new Font("Ink Free",Font.BOLD,25));
l3.setBorder(BorderFactory.createBevelBorder(1));
l3.setHorizontalAlignment(JTextField.LEFT);
l3.setText("You have to guess this word:");
l3.setEditable(false);
frame.add(l3);

t4.setBounds(360,190,200,50);
t4.setBackground(new Color(25,25,25));
t4.setForeground(new Color(25,255,0));
t4.setFont(new Font("Ink Free",Font.BOLD,30));
t4.setBorder(BorderFactory.createBevelBorder(1));
t4.setEditable(false);
frame.add(t4);

l4.setBounds(0,250,350,50);
l4.setBackground(new Color(25,25,25));
l4.setForeground(new Color(25,255,0));
l4.setFont(new Font("Ink Free",Font.BOLD,25));
l4.setBorder(BorderFactory.createBevelBorder(1));
l4.setHorizontalAlignment(JTextField.LEFT);
l4.setText("Player 1 will start");
l4.setEditable(false);
frame.add(l4);

l6.setBounds(0,310,350,50);
l6.setBackground(new Color(25,25,25));
l6.setForeground(new Color(25,255,0));
l6.setFont(new Font("Ink Free",Font.BOLD,25));
l6.setBorder(BorderFactory.createBevelBorder(1));
l6.setHorizontalAlignment(JTextField.LEFT);
l6.setText("Enter your guessed letter:");
l6.setEditable(false);
frame.add(l6);

l5.setBounds(360,310,200,50);
l5.setBackground(new Color(25,25,25));
l5.setForeground(new Color(25,255,0));
l5.setFont(new Font("Ink Free",Font.BOLD,25));
l5.setBorder(BorderFactory.createBevelBorder(1));
l5.setHorizontalAlignment(JTextField.LEFT);
l5.setEditable(true);
frame.add(l5);

ok.addActionListener(this);
frame.add(ok);
ok.setBounds(570,310,70,50);
ok.setBackground(new Color(25,25,25));
ok.setForeground(new Color(25,255,0));

exit.addActionListener(this);
frame.add(exit);
exit.setBounds(570,380,70,50);
exit.setBackground(new Color(25,25,25));
exit.setForeground(new Color(25,255,0));

ok1.addActionListener(this);
frame.add(ok1);
ok1.setBounds(570,70,70,50);
ok1.setBackground(new Color(25,25,25));
ok1.setForeground(new Color(25,255,0));
ok2.addActionListener(this);
frame.add(ok2);
ok2.setBounds(570,130,70,50);
ok2.setBackground(new Color(25,25,25));
ok2.setForeground(new Color(25,255,0));
 
c2=Accept2(num);
ch2=new String[c2.length()];
for(int i=0;i<c2.length();i++)
 ch2[i]="*";
frame.setVisible(true);
}

public String Accept2(int n)
{
   String c2=array[n];
   String[] convert2=c2.split("");
   String random="";
   for(int i=0;i<convert2.length;i++)
    random=random+"*";
   t4.setText(String.valueOf(random));
   return c2;
}
public String opt2(String g2,String c2)
{
   p=letter2(g2,c2,ch2,ps1);
   return p;
}
public String letter2(String g2,String c2,String[] ch2,String ps1)
{
   int counter=0;
   int count1=0;
   String convert2[] = c2.split("");
   int winn=0;
   for(int i=0;i<c2.length();i++)
   {
    if(ps1.equals(p1))
    {
      if(convert2[i].equals(g2))
      {
        ps1=p1; 
        ch2[i]=g2;
        winn=1;
      }
      else
      {
        counter++;
      }
    }
    else if(ps1.equals(p2))
    {
     if(convert2[i].equals(g2))
     {         
      ps1=p2; 
      ch2[i]=g2;
      winn=1;
     }
     else
     {
      count1++;
     }        
    }
        
   }
    if(winn==1)
    JOptionPane.showMessageDialog(null,"Congratulations! Your guess is correct");
    else 
    JOptionPane.showMessageDialog(null,"OOPS! Your guess is wrong");
    if(counter==c2.length())
      ps1=p2;
   
    else if(count1==c2.length())
    ps1=p1;
    StringBuffer mb = new StringBuffer();
    for(int i = 0; i < ch2.length; i++) 
     mb.append(ch2[i]);
    str2 = mb.toString();
    t4.setText(str2);
    if(ps1.equals(p1))
    {
     int win=0;
     for(int i=0;i<ch2.length;i++)
     {
      if(ch2[i]!="*")
      win++;
      }
     
      ps1=p1;
      l4.setText(" "+ps1+"'s turn");
      if(win!=ch2.length)
      JOptionPane.showMessageDialog(null,"It is "+ps1+"'s turn"); 
       if(win==ch2.length)
       JOptionPane.showMessageDialog(null," "+p1+" is the winnner");
      return ps1;
     }
     else if(ps1.equals(p2));
    {
      ps1=p2;
      int win=0;
      for(int i=0;i<ch2.length;i++)
      {
       if(ch2[i]!="*")
       win++;
      }
      
      l4.setText(" "+ps1+"'s turn");
      if(win!=ch2.length)
      JOptionPane.showMessageDialog(null,"It is "+ps1+"'s turn"); 
      if(win==ch2.length)
       JOptionPane.showMessageDialog(null," "+p2+" is the winnner");
      return ps1;     
     }
}

public void actionPerformed(ActionEvent e)
{ 
 if(e.getSource()==ok)
 {
   g2=l5.getText();
   ps1=opt2(g2,c2);
 }
 if(e.getSource()==ok1)
 {
   p1=l1.getText();
   ps1=p1;
 }
 if(e.getSource()==ok2)
 {
    p2=t3.getText();
 }
 if(e.getSource()==exit)
{
  System.exit(0);
}
}
}

class Singleplayer extends JFrame implements ActionListener
{
 String[] array={"joker","loser","mouse","winner","apple"};
 int nog=0;
 int snog=0;
 String g="";
 String h="";
 String c="";
 int wc=0;
 int count1=0;
 String[] ch;
 int num=(int)Math.random()*5;
 int mb1=0;
JTextField l1 = new JTextField();
JTextField l2 = new JTextField();
JTextField l3 = new JTextField();
JTextField l4 = new JTextField();
JTextField l5 = new JTextField();
JTextField l6 = new JTextField();
JTextArea t2 = new JTextArea();
JTextField t3 = new JTextField();

JButton ok = new JButton("OK");
JButton exit = new JButton("Exit");

JFrame frame = new JFrame("Guessing Game");
Singleplayer()
{	
JTextField textfield = new JTextField();
JTextField t1 = new JTextField("You have to guess this word");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Guessing Game");
frame.setSize(850,600);
frame.setLocationRelativeTo(null);
frame.getContentPane().setBackground(new Color(50,50,50));
ImageIcon image = new ImageIcon("logo.png");
frame.setIconImage(image.getImage());
frame.setLayout(null);
frame.setResizable(true);

textfield.setBounds(0,0,850,50);
textfield.setBackground(new Color(25,25,25));
textfield.setForeground(new Color(255,255,0));
textfield.setFont(new Font("Ink free",Font.BOLD,30));
textfield.setBorder(BorderFactory.createBevelBorder(1));
textfield.setHorizontalAlignment(JTextField.CENTER);
textfield.setEditable(false);
textfield.setText("THINK FOR A BLANK!");
frame.add(textfield);

t1.setBounds(0,70,400,50);
t1.setBackground(new Color(25,25,25));
t1.setForeground(new Color(25,255,0));
t1.setFont(new Font("Ink Free",Font.BOLD,25));
t1.setBorder(BorderFactory.createBevelBorder(1));
t1.setHorizontalAlignment(JTextField.LEFT);
t1.setEditable(false);
frame.add(t1);


l1.setBounds(450,70,150,50);
l1.setBackground(new Color(25,25,25));
l1.setForeground(new Color(25,255,0));
l1.setFont(new Font("Ink Free",Font.BOLD,40));
l1.setBorder(BorderFactory.createBevelBorder(1));
l1.setHorizontalAlignment(JTextField.LEFT);
l1.setEditable(false);
frame.add(l1);

l2.setBounds(0,130,400,50);
l2.setBackground(new Color(25,25,25));
l2.setForeground(new Color(25,255,0));
l2.setFont(new Font("Ink Free",Font.BOLD,25));
l2.setBorder(BorderFactory.createBevelBorder(1));
l2.setHorizontalAlignment(JTextField.LEFT);
l2.setEditable(false);
frame.add(l2);

l3.setBounds(0,190,400,50);
l3.setBackground(new Color(25,25,25));
l3.setForeground(new Color(25,255,0));
l3.setFont(new Font("Ink Free",Font.BOLD,25));
l3.setBorder(BorderFactory.createBevelBorder(1));
l3.setHorizontalAlignment(JTextField.LEFT);
l3.setText("Enter your guessed letter or word:");
l3.setEditable(false);
frame.add(l3);

l4.setBounds(0,250,600,50);
l4.setBackground(new Color(25,25,25));
l4.setForeground(new Color(25,255,0));
l4.setFont(new Font("Ink Free",Font.BOLD,25));
l4.setBorder(BorderFactory.createBevelBorder(1));
l4.setHorizontalAlignment(JTextField.LEFT);
frame.add(l4);

t2.setBounds(450,190,150,50);
t2.setBackground(new Color(25,25,25));
t2.setForeground(new Color(25,255,0));
t2.setFont(new Font("Ink Free",Font.BOLD,25));
t2.setBorder(BorderFactory.createBevelBorder(1));
t2.setEditable(true);
frame.add(t2);

t3.setBounds(450,130,150,50);
t3.setBackground(new Color(25,25,25));
t3.setForeground(new Color(25,255,0));
t3.setFont(new Font("Ink Free",Font.BOLD,25));
t3.setBorder(BorderFactory.createBevelBorder(1));
t3.setEditable(false);
frame.add(t3);

ok.addActionListener(this);
frame.add(ok);
ok.setBounds(650,190,70,50);
ok.setBackground(new Color(25,25,25));
ok.setForeground(new Color(25,255,0));

exit.addActionListener(this);
frame.add(exit);
exit.setBounds(650,270,70,50);
exit.setBackground(new Color(25,25,25));
exit.setForeground(new Color(25,255,0));
frame.setVisible(true);
c=Accept(num);
for(int i=0;i<c.length();i++)
{
  for(int j=i+1;j<c.length()-1;j++)
 {
   if(c.charAt(i)==c.charAt(j))
   count1++;
  }
}
if(count1==0)
 nog=c.length();
else
 nog=c.length()-count1;
 snog=nog;
l2.setText("Number of guesses:");
t3.setText(String.valueOf(nog));
ch=new String[c.length()];
for(int i=0;i<c.length();i++)
 ch[i]="*";
}

public String Accept(int n)
{
 String c=array[n];
 String[] convert=c.split("");
 String random = "";
 for(int i=0;i<convert.length;i++)
{
  random=random+"*";
  l1.setText(String.valueOf(random));
}
  return c;
}
public void opt(String g,String c)
{
 String[] convert=c.split("");
 if(g.length()==1)
 {
   nog--;
   wc=letter(c,g,wc,ch);
   
   if(nog>0)
   JOptionPane.showMessageDialog(null,"You have "+nog+" guesses left!\nGuess next letter or word");        
   t3.setText(String.valueOf(nog));
  }
 else
 {
   word(c,g);
   nog--;
   t3.setText(String.valueOf(nog));
  }       
}

public int letter(String c, String g,int wc,String []ch)
{
   int count=0;
   String str="";
   String[] convert=c.split("");

   for(int j=0;j<c.length();j++)
   {
     if(convert[j].equals(g))
     {
       count++;
       ch[j]=g;
      }
   }
   StringBuffer mb = new StringBuffer();
   for(int i = 0; i < ch.length; i++) 
     mb.append(ch[i]);
      
   str = mb.toString();
   l1.setText(str);
   
   if(count!=0)
  { 
   JOptionPane.showMessageDialog(null,"You have guessed the correct letter","CONGRATULATIONS!",JOptionPane.INFORMATION_MESSAGE,null);  
    wc=wc+count;
   }
   else
  {
    JOptionPane.showMessageDialog(null,"Your guess is wrong","OOPS!",JOptionPane.ERROR_MESSAGE,null);
  	
    if(nog>1 && mb1==0)
   {
    int k=JOptionPane.showConfirmDialog(null, "Do you want to check a hint?\nYour guess will be reduced","",JOptionPane.YES_NO_OPTION);
    if( k==JOptionPane.YES_OPTION)
      hint(c);
    }   
   }
   if(nog==0)
  { 
    if(wc==c.length())
     JOptionPane.showMessageDialog(null,"YOU WON THE GAME");
  
    else //if(nog==1 && wc!=c.length())
     JOptionPane.showMessageDialog(null,"YOU LOST THE GAME");  
  } 
   return wc;
}
public void word(String c,String g)
{ 
   String a="";
   String[] convert=c.split("");
   if(g.equals(c))
  { 
    for(int i=0;i<c.length();i++)
     ch[i]=convert[i];
    StringBuffer bb = new StringBuffer();
    for(int i = 0; i < ch.length; i++)
      bb.append(ch[i]);
    a = bb.toString();
    l1.setText(a);  
    UIManager UI=new UIManager();
    JLabel label = new JLabel("MESSAGE");
    label.setFont(new Font("Arial", Font.BOLD, 18));
    UI.put("Panel.background", Color.cyan);
    UIManager.put("OptionPane.maximumSize",new Dimension(300,300));  
    JOptionPane.showMessageDialog(null,"CONGRATULATIONS, YOU WON!!!");
    wc=c.length();
  }
   else
  {
    JOptionPane.showMessageDialog(null,"Your guess is wrong","OOPS!",JOptionPane.ERROR_MESSAGE,null);
    if(nog==1)
     JOptionPane.showMessageDialog(null,"YOU LOST THE GAME!");
    t3.setText(String.valueOf(nog));
    if(nog>1 && mb1>0)
    { 
     int f=JOptionPane.showConfirmDialog(null, "Do you want to check a hint?\nYour guess will be reduced","",JOptionPane.YES_NO_OPTION);
     if( f==JOptionPane.YES_OPTION)
      hint(c);
    } 
         
  }
}

public void hint(String c)
{   mb1=1;
    int num=0;
    for(int i=0;i<array.length;i++)
    { 
       if(array[i].equals(c))
        num=i;
    }
    switch (num)
    {   
       case 0 : l4.setText("Hint : One of two extra playing cards in pack");
       break;
       case 1 : l4.setText("Hint : You get this tag when you lose a game");
       break;
       case 2 : l4.setText("Hint : It is an animal and also a device");
       break;
       case 3 : l4.setText("Hint : You get this tag when you win a game");
       break;
       case 4 : l4.setText("Hint : keeps you away from doctor");
       break;
    }
    nog--;
}

public void actionPerformed(ActionEvent e)
{	
 if(e.getSource()==ok)
 {
  g=t2.getText();
  opt(g,c);
 }
if(e.getSource()==exit)
{
  System.exit(0);
}
}
}
