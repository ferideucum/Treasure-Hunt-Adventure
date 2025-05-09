
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ferideucum
 */
public class game extends javax.swing.JFrame {

    private String username;

    /**
     * Creates new form game
     */
    LinkedList<Integer> liste = new LinkedList<>();
    Node currentNode = null;

    public game(String username) {
        initComponents();
        this.username = username;
      //  System.out.println(username);
        g_box1.setVisible(false);
        g_box2.setVisible(false);
        g_box3.setVisible(false);
        g_box4.setVisible(false);
        g_box5.setVisible(false);
        g_box6.setVisible(false);
        g_box7.setVisible(false);
        g_box8.setVisible(false);
        g_box9.setVisible(false);
        g_box10.setVisible(false);
        g_box11.setVisible(false);
        g_box12.setVisible(false);
        g_box13.setVisible(false);
        g_box14.setVisible(false);
        g_box15.setVisible(false);
        g_box16.setVisible(false);
        g_box17.setVisible(false);
        g_box18.setVisible(false);
        g_box19.setVisible(false);
        g_box20.setVisible(false);
        g_box21.setVisible(false);
        g_box22.setVisible(false);
        g_box23.setVisible(false);
        g_box24.setVisible(false);
        g_box25.setVisible(false);
        g_box26.setVisible(false);
        g_box27.setVisible(false);
        g_box28.setVisible(false);
        g_box29.setVisible(false);
        g_box30.setVisible(false);

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/game.jpg"));
        Image image = icon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon(image));

         ImageIcon book = new ImageIcon(getClass().getResource("/images/book.png"));
        Image image_b = book.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        jLabel5.setIcon(new ImageIcon(image_b));
        
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/gugu.png"));
        Image image1 = icon1.getImage().getScaledInstance(piyon.getWidth(), piyon.getHeight(), Image.SCALE_SMOOTH);
        piyon.setIcon(new ImageIcon(image1));

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image2 = icon2.getImage().getScaledInstance(box1.getWidth(), box1.getHeight(), Image.SCALE_SMOOTH);
        box1.setIcon(new ImageIcon(image2));

        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image3 = icon3.getImage().getScaledInstance(box2.getWidth(), box2.getHeight(), Image.SCALE_SMOOTH);
        box2.setIcon(new ImageIcon(image3));

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image4 = icon4.getImage().getScaledInstance(box3.getWidth(), box3.getHeight(), Image.SCALE_SMOOTH);
        box3.setIcon(new ImageIcon(image4));

        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(box4.getWidth(), box4.getHeight(), Image.SCALE_SMOOTH);
        box4.setIcon(new ImageIcon(image5));

        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image6 = icon6.getImage().getScaledInstance(box5.getWidth(), box5.getHeight(), Image.SCALE_SMOOTH);
        box5.setIcon(new ImageIcon(image6));

        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image7 = icon7.getImage().getScaledInstance(box6.getWidth(), box6.getHeight(), Image.SCALE_SMOOTH);
        box6.setIcon(new ImageIcon(image7));

        ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image8 = icon8.getImage().getScaledInstance(box7.getWidth(), box7.getHeight(), Image.SCALE_SMOOTH);
        box7.setIcon(new ImageIcon(image8));

        ImageIcon icon9 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image9 = icon9.getImage().getScaledInstance(box8.getWidth(), box8.getHeight(), Image.SCALE_SMOOTH);
        box8.setIcon(new ImageIcon(image9));

        ImageIcon icon10 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image10 = icon10.getImage().getScaledInstance(box9.getWidth(), box9.getHeight(), Image.SCALE_SMOOTH);
        box9.setIcon(new ImageIcon(image10));

        ImageIcon icon11 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image11 = icon11.getImage().getScaledInstance(box10.getWidth(), box10.getHeight(), Image.SCALE_SMOOTH);
        box10.setIcon(new ImageIcon(image11));

        ImageIcon icon12 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image12 = icon12.getImage().getScaledInstance(box11.getWidth(), box11.getHeight(), Image.SCALE_SMOOTH);
        box11.setIcon(new ImageIcon(image12));

        ImageIcon icon13 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image13 = icon13.getImage().getScaledInstance(box12.getWidth(), box12.getHeight(), Image.SCALE_SMOOTH);
        box12.setIcon(new ImageIcon(image13));

        ImageIcon icon14 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image14 = icon14.getImage().getScaledInstance(box13.getWidth(), box13.getHeight(), Image.SCALE_SMOOTH);
        box13.setIcon(new ImageIcon(image14));

        ImageIcon icon15 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image15 = icon15.getImage().getScaledInstance(box14.getWidth(), box14.getHeight(), Image.SCALE_SMOOTH);
        box14.setIcon(new ImageIcon(image15));

        ImageIcon icon16 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image16 = icon16.getImage().getScaledInstance(box15.getWidth(), box15.getHeight(), Image.SCALE_SMOOTH);
        box15.setIcon(new ImageIcon(image16));

        ImageIcon icon17 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image17 = icon17.getImage().getScaledInstance(box16.getWidth(), box16.getHeight(), Image.SCALE_SMOOTH);
        box16.setIcon(new ImageIcon(image17));

        ImageIcon icon18 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image18 = icon18.getImage().getScaledInstance(box17.getWidth(), box17.getHeight(), Image.SCALE_SMOOTH);
        box17.setIcon(new ImageIcon(image18));

        ImageIcon icon19 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image19 = icon19.getImage().getScaledInstance(box18.getWidth(), box18.getHeight(), Image.SCALE_SMOOTH);
        box18.setIcon(new ImageIcon(image19));

        ImageIcon icon20 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image20 = icon20.getImage().getScaledInstance(box19.getWidth(), box19.getHeight(), Image.SCALE_SMOOTH);
        box19.setIcon(new ImageIcon(image20));

        ImageIcon icon21 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image21 = icon21.getImage().getScaledInstance(box20.getWidth(), box20.getHeight(), Image.SCALE_SMOOTH);
        box20.setIcon(new ImageIcon(image21));

        ImageIcon icon22 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image22 = icon22.getImage().getScaledInstance(box21.getWidth(), box21.getHeight(), Image.SCALE_SMOOTH);
        box21.setIcon(new ImageIcon(image22));

        ImageIcon icon23 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image23 = icon23.getImage().getScaledInstance(box22.getWidth(), box22.getHeight(), Image.SCALE_SMOOTH);
        box22.setIcon(new ImageIcon(image23));

        ImageIcon icon24 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image24 = icon24.getImage().getScaledInstance(box23.getWidth(), box23.getHeight(), Image.SCALE_SMOOTH);
        box23.setIcon(new ImageIcon(image24));

        ImageIcon icon25 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image25 = icon25.getImage().getScaledInstance(box24.getWidth(), box24.getHeight(), Image.SCALE_SMOOTH);
        box24.setIcon(new ImageIcon(image25));

        ImageIcon icon26 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image26 = icon26.getImage().getScaledInstance(box25.getWidth(), box25.getHeight(), Image.SCALE_SMOOTH);
        box25.setIcon(new ImageIcon(image26));

        ImageIcon icon27 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image27 = icon27.getImage().getScaledInstance(box26.getWidth(), box26.getHeight(), Image.SCALE_SMOOTH);
        box26.setIcon(new ImageIcon(image27));

        ImageIcon icon28 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image28 = icon28.getImage().getScaledInstance(box27.getWidth(), box27.getHeight(), Image.SCALE_SMOOTH);
        box27.setIcon(new ImageIcon(image28));

        ImageIcon icon29 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image29 = icon29.getImage().getScaledInstance(box28.getWidth(), box28.getHeight(), Image.SCALE_SMOOTH);
        box28.setIcon(new ImageIcon(image29));

        ImageIcon icon30 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image30 = icon30.getImage().getScaledInstance(box29.getWidth(), box29.getHeight(), Image.SCALE_SMOOTH);
        box29.setIcon(new ImageIcon(image30));

        ImageIcon icon31 = new ImageIcon(getClass().getResource("/images/kutu.jpg"));
        Image image31 = icon31.getImage().getScaledInstance(box30.getWidth(), box30.getHeight(), Image.SCALE_SMOOTH);
        box30.setIcon(new ImageIcon(image31));

        ImageIcon icon_zar = new ImageIcon(getClass().getResource("/images/zar1_l1.png"));
        Image image_zar = icon_zar.getImage().getScaledInstance(zar_label.getWidth(), zar_label.getHeight(), Image.SCALE_SMOOTH);
        zar_label.setIcon(new ImageIcon(image_zar));

        for (int i = 0; i < 32; i++) {
            int randomNumber = (int) (Math.random() * 3);
            Node<Integer> newNode = new Node<>(randomNumber);
            liste.addFirst(newNode);
        }
        liste.head.data = -1;
        Node lastNode = liste.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.data = -1;
        currentNode = liste.head;
    }

    public Node forward(int steps, Node currentNode) {
        if (currentNode == null) {
            return null;
        }

        for (int i = 0; i < steps; i++) {
            if (currentNode.next != null) {
                currentNode = currentNode.next;
            } else {
                break;
            }
        }

        return currentNode;
    }

    private void saveScoreToFile(int level) {
        String totalScore = score.getText();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("score.txt", true))) {
            writer.write(username + "," + level + "," + totalScore);
            writer.newLine();
          //  System.out.println("Skor dosyasına yazıldı: " + username + " - Level: " + level + " - Skor: " + totalScore);
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        piyon = new javax.swing.JLabel();
        box1 = new javax.swing.JLabel();
        box3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box2 = new javax.swing.JLabel();
        box4 = new javax.swing.JLabel();
        box5 = new javax.swing.JLabel();
        box6 = new javax.swing.JLabel();
        box7 = new javax.swing.JLabel();
        box8 = new javax.swing.JLabel();
        box9 = new javax.swing.JLabel();
        box10 = new javax.swing.JLabel();
        box11 = new javax.swing.JLabel();
        box12 = new javax.swing.JLabel();
        box13 = new javax.swing.JLabel();
        box14 = new javax.swing.JLabel();
        box15 = new javax.swing.JLabel();
        box16 = new javax.swing.JLabel();
        box17 = new javax.swing.JLabel();
        box18 = new javax.swing.JLabel();
        box19 = new javax.swing.JLabel();
        box20 = new javax.swing.JLabel();
        box21 = new javax.swing.JLabel();
        box22 = new javax.swing.JLabel();
        box23 = new javax.swing.JLabel();
        box24 = new javax.swing.JLabel();
        box25 = new javax.swing.JLabel();
        box26 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        box27 = new javax.swing.JLabel();
        box28 = new javax.swing.JLabel();
        box29 = new javax.swing.JLabel();
        box30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        zar_button = new javax.swing.JButton();
        zar_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        g_box1 = new javax.swing.JLabel();
        g_box2 = new javax.swing.JLabel();
        g_box3 = new javax.swing.JLabel();
        g_box4 = new javax.swing.JLabel();
        g_box5 = new javax.swing.JLabel();
        g_box6 = new javax.swing.JLabel();
        g_box7 = new javax.swing.JLabel();
        g_box8 = new javax.swing.JLabel();
        g_box9 = new javax.swing.JLabel();
        g_box10 = new javax.swing.JLabel();
        g_box11 = new javax.swing.JLabel();
        g_box12 = new javax.swing.JLabel();
        g_box13 = new javax.swing.JLabel();
        g_box14 = new javax.swing.JLabel();
        g_box15 = new javax.swing.JLabel();
        g_box16 = new javax.swing.JLabel();
        g_box17 = new javax.swing.JLabel();
        g_box18 = new javax.swing.JLabel();
        g_box19 = new javax.swing.JLabel();
        g_box20 = new javax.swing.JLabel();
        g_box21 = new javax.swing.JLabel();
        g_box22 = new javax.swing.JLabel();
        g_box23 = new javax.swing.JLabel();
        g_box24 = new javax.swing.JLabel();
        g_box25 = new javax.swing.JLabel();
        g_box26 = new javax.swing.JLabel();
        g_box27 = new javax.swing.JLabel();
        g_box28 = new javax.swing.JLabel();
        g_box29 = new javax.swing.JLabel();
        g_box30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        piyon.setText("piyon");
        jPanel1.add(piyon);
        piyon.setBounds(10, 410, 60, 60);

        box1.setText("1");
        jPanel1.add(box1);
        box1.setBounds(30, 350, 40, 40);

        box3.setForeground(new java.awt.Color(255, 255, 255));
        box3.setText("3");
        jPanel1.add(box3);
        box3.setBounds(30, 240, 40, 40);

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("FINISH");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 80, 42, 17);

        box2.setText("2");
        jPanel1.add(box2);
        box2.setBounds(30, 290, 40, 40);

        box4.setForeground(new java.awt.Color(255, 255, 255));
        box4.setText("4");
        jPanel1.add(box4);
        box4.setBounds(30, 190, 40, 40);

        box5.setForeground(new java.awt.Color(255, 255, 255));
        box5.setText("5");
        jPanel1.add(box5);
        box5.setBounds(30, 140, 40, 40);

        box6.setForeground(new java.awt.Color(255, 255, 255));
        box6.setText("6");
        jPanel1.add(box6);
        box6.setBounds(30, 90, 40, 40);

        box7.setForeground(new java.awt.Color(255, 255, 255));
        box7.setText("7");
        jPanel1.add(box7);
        box7.setBounds(30, 40, 40, 40);

        box8.setForeground(new java.awt.Color(255, 255, 255));
        box8.setText("8");
        jPanel1.add(box8);
        box8.setBounds(80, 40, 40, 40);

        box9.setForeground(new java.awt.Color(255, 255, 255));
        box9.setText("9");
        jPanel1.add(box9);
        box9.setBounds(130, 40, 40, 40);

        box10.setForeground(new java.awt.Color(255, 255, 255));
        box10.setText("10");
        jPanel1.add(box10);
        box10.setBounds(190, 40, 40, 40);

        box11.setForeground(new java.awt.Color(255, 255, 255));
        box11.setText("11");
        jPanel1.add(box11);
        box11.setBounds(190, 90, 40, 40);

        box12.setForeground(new java.awt.Color(255, 255, 255));
        box12.setText("12");
        jPanel1.add(box12);
        box12.setBounds(190, 140, 40, 40);

        box13.setForeground(new java.awt.Color(255, 255, 255));
        box13.setText("13");
        jPanel1.add(box13);
        box13.setBounds(190, 190, 40, 40);

        box14.setForeground(new java.awt.Color(255, 255, 255));
        box14.setText("14");
        jPanel1.add(box14);
        box14.setBounds(190, 240, 40, 40);

        box15.setForeground(new java.awt.Color(255, 255, 255));
        box15.setText("15");
        jPanel1.add(box15);
        box15.setBounds(190, 290, 40, 40);

        box16.setForeground(new java.awt.Color(255, 255, 255));
        box16.setText("16");
        jPanel1.add(box16);
        box16.setBounds(190, 340, 40, 40);

        box17.setForeground(new java.awt.Color(255, 255, 255));
        box17.setText("17");
        jPanel1.add(box17);
        box17.setBounds(190, 390, 40, 40);

        box18.setForeground(new java.awt.Color(255, 255, 255));
        box18.setText("18");
        jPanel1.add(box18);
        box18.setBounds(190, 440, 40, 40);

        box19.setForeground(new java.awt.Color(255, 255, 255));
        box19.setText("19");
        jPanel1.add(box19);
        box19.setBounds(270, 440, 40, 40);

        box20.setForeground(new java.awt.Color(255, 255, 255));
        box20.setText("20");
        jPanel1.add(box20);
        box20.setBounds(350, 440, 40, 40);

        box21.setForeground(new java.awt.Color(255, 255, 255));
        box21.setText("21");
        jPanel1.add(box21);
        box21.setBounds(350, 380, 40, 40);

        box22.setForeground(new java.awt.Color(255, 255, 255));
        box22.setText("22");
        jPanel1.add(box22);
        box22.setBounds(350, 320, 40, 40);

        box23.setForeground(new java.awt.Color(255, 255, 255));
        box23.setText("23");
        jPanel1.add(box23);
        box23.setBounds(350, 260, 40, 40);

        box24.setForeground(new java.awt.Color(255, 255, 255));
        box24.setText("24");
        jPanel1.add(box24);
        box24.setBounds(350, 200, 40, 40);

        box25.setForeground(new java.awt.Color(255, 255, 255));
        box25.setText("25");
        jPanel1.add(box25);
        box25.setBounds(350, 140, 40, 40);

        box26.setForeground(new java.awt.Color(255, 255, 255));
        box26.setText("26");
        jPanel1.add(box26);
        box26.setBounds(420, 140, 40, 40);

        score.setForeground(new java.awt.Color(102, 51, 0));
        score.setText("0");
        jPanel1.add(score);
        score.setBounds(650, 280, 30, 17);

        box27.setForeground(new java.awt.Color(255, 255, 255));
        box27.setText("27");
        jPanel1.add(box27);
        box27.setBounds(500, 140, 40, 40);

        box28.setForeground(new java.awt.Color(255, 255, 255));
        box28.setText("28");
        jPanel1.add(box28);
        box28.setBounds(500, 80, 40, 40);

        box29.setForeground(new java.awt.Color(255, 255, 255));
        box29.setText("29");
        jPanel1.add(box29);
        box29.setBounds(500, 20, 40, 40);

        box30.setForeground(new java.awt.Color(255, 255, 255));
        box30.setText("30");
        jPanel1.add(box30);
        box30.setBounds(570, 20, 40, 40);

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("START");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 470, 42, 17);

        zar_button.setText("Dice");
        zar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(zar_button);
        zar_button.setBounds(590, 480, 72, 23);
        jPanel1.add(zar_label);
        zar_label.setBounds(550, 350, 140, 130);

        jLabel4.setFont(new java.awt.Font("Herculanum", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Total");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(560, 280, 40, 14);
        jPanel1.add(infoLabel);
        infoLabel.setBounds(580, 230, 0, 0);

        g_box1.setForeground(new java.awt.Color(255, 255, 255));
        g_box1.setText("g-box1");
        jPanel1.add(g_box1);
        g_box1.setBounds(20, 360, 60, 17);

        g_box2.setForeground(new java.awt.Color(255, 255, 255));
        g_box2.setText("jLabel5");
        jPanel1.add(g_box2);
        g_box2.setBounds(20, 300, 70, 17);

        g_box3.setForeground(new java.awt.Color(255, 255, 255));
        g_box3.setText("jLabel6");
        jPanel1.add(g_box3);
        g_box3.setBounds(20, 250, 70, 17);

        g_box4.setForeground(new java.awt.Color(255, 255, 255));
        g_box4.setText("jLabel7");
        jPanel1.add(g_box4);
        g_box4.setBounds(20, 200, 70, 17);

        g_box5.setForeground(new java.awt.Color(255, 255, 255));
        g_box5.setText("jLabel8");
        jPanel1.add(g_box5);
        g_box5.setBounds(20, 150, 80, 17);

        g_box6.setForeground(new java.awt.Color(255, 255, 255));
        g_box6.setText("jLabel9");
        jPanel1.add(g_box6);
        g_box6.setBounds(10, 100, 80, 17);

        g_box7.setForeground(new java.awt.Color(255, 255, 255));
        g_box7.setText("g_box7");
        jPanel1.add(g_box7);
        g_box7.setBounds(10, 50, 60, 17);

        g_box8.setForeground(new java.awt.Color(255, 255, 255));
        g_box8.setText("jLabel8");
        jPanel1.add(g_box8);
        g_box8.setBounds(70, 50, 70, 17);

        g_box9.setForeground(new java.awt.Color(255, 255, 255));
        g_box9.setText("jLabel9");
        jPanel1.add(g_box9);
        g_box9.setBounds(120, 50, 70, 17);

        g_box10.setForeground(new java.awt.Color(255, 255, 255));
        g_box10.setText("jLabel10");
        jPanel1.add(g_box10);
        g_box10.setBounds(180, 50, 90, 10);

        g_box11.setForeground(new java.awt.Color(255, 255, 255));
        g_box11.setText("jLabel11");
        jPanel1.add(g_box11);
        g_box11.setBounds(180, 100, 80, 17);

        g_box12.setForeground(new java.awt.Color(255, 255, 255));
        g_box12.setText("jLabel12");
        jPanel1.add(g_box12);
        g_box12.setBounds(180, 150, 70, 17);

        g_box13.setForeground(new java.awt.Color(255, 255, 255));
        g_box13.setText("jLabel12");
        jPanel1.add(g_box13);
        g_box13.setBounds(180, 200, 80, 17);

        g_box14.setForeground(new java.awt.Color(255, 255, 255));
        g_box14.setText("jLabel12");
        jPanel1.add(g_box14);
        g_box14.setBounds(180, 250, 80, 20);

        g_box15.setForeground(new java.awt.Color(255, 255, 255));
        g_box15.setText("jLabel12");
        jPanel1.add(g_box15);
        g_box15.setBounds(180, 300, 90, 17);

        g_box16.setForeground(new java.awt.Color(255, 255, 255));
        g_box16.setText("jLabel12");
        jPanel1.add(g_box16);
        g_box16.setBounds(180, 350, 90, 17);

        g_box17.setForeground(new java.awt.Color(255, 255, 255));
        g_box17.setText("jLabel12");
        jPanel1.add(g_box17);
        g_box17.setBounds(180, 400, 80, 17);

        g_box18.setForeground(new java.awt.Color(255, 255, 255));
        g_box18.setText("jLabel18");
        jPanel1.add(g_box18);
        g_box18.setBounds(180, 450, 80, 17);

        g_box19.setForeground(new java.awt.Color(255, 255, 255));
        g_box19.setText("jLabel12");
        jPanel1.add(g_box19);
        g_box19.setBounds(250, 450, 90, 17);

        g_box20.setForeground(new java.awt.Color(255, 255, 255));
        g_box20.setText("jLabel12");
        jPanel1.add(g_box20);
        g_box20.setBounds(340, 450, 90, 17);

        g_box21.setForeground(new java.awt.Color(255, 255, 255));
        g_box21.setText("jLabel12");
        jPanel1.add(g_box21);
        g_box21.setBounds(340, 390, 90, 17);

        g_box22.setForeground(new java.awt.Color(255, 255, 255));
        g_box22.setText("jLabel12");
        jPanel1.add(g_box22);
        g_box22.setBounds(340, 330, 90, 17);

        g_box23.setForeground(new java.awt.Color(255, 255, 255));
        g_box23.setText("jLabel12");
        jPanel1.add(g_box23);
        g_box23.setBounds(340, 270, 90, 17);

        g_box24.setForeground(new java.awt.Color(255, 255, 255));
        g_box24.setText("jLabel24");
        jPanel1.add(g_box24);
        g_box24.setBounds(340, 210, 90, 17);

        g_box25.setForeground(new java.awt.Color(255, 255, 255));
        g_box25.setText("jLabel25");
        jPanel1.add(g_box25);
        g_box25.setBounds(340, 150, 70, 17);

        g_box26.setForeground(new java.awt.Color(255, 255, 255));
        g_box26.setText("jLabel26");
        jPanel1.add(g_box26);
        g_box26.setBounds(400, 150, 90, 17);

        g_box27.setForeground(new java.awt.Color(255, 255, 255));
        g_box27.setText("jLabel27");
        jPanel1.add(g_box27);
        g_box27.setBounds(480, 150, 90, 17);

        g_box28.setForeground(new java.awt.Color(255, 255, 255));
        g_box28.setText("jLabel28");
        jPanel1.add(g_box28);
        g_box28.setBounds(489, 90, 80, 17);

        g_box29.setForeground(new java.awt.Color(255, 255, 255));
        g_box29.setText("jLabel29");
        jPanel1.add(g_box29);
        g_box29.setBounds(490, 30, 90, 17);

        g_box30.setForeground(new java.awt.Color(255, 255, 255));
        g_box30.setText("jLabel30");
        jPanel1.add(g_box30);
        g_box30.setBounds(560, 30, 90, 20);

        jLabel6.setFont(new java.awt.Font("Herculanum", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("SCORE");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 290, 40, 20);

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(510, 220, 220, 140);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int totalPoint = 0;
    int totalZar = 0;

    private void zar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zar_buttonActionPerformed
        zar_button.setEnabled(false);
        Timer timer = new Timer(100, null);
        Random rand = new Random();
        timer.addActionListener(new ActionListener() {
            int sayac = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                int fakeZar = rand.nextInt(6) + 1;

                ImageIcon tempIcon = new ImageIcon(getClass().getResource("/images/zar" + fakeZar + "_l1.png"));
                Image tempImage = tempIcon.getImage().getScaledInstance(zar_label.getWidth(), zar_label.getHeight(), Image.SCALE_SMOOTH);
                zar_label.setIcon(new ImageIcon(tempImage));

                sayac++;

                if (sayac >= 10) {
                    timer.stop();

                    int zarDeger = rand.nextInt(6) + 1;
                    currentNode = forward(zarDeger, currentNode);
                 //  System.out.println("zar değeri: " + zarDeger);

                    ImageIcon finalIcon = new ImageIcon(getClass().getResource("/images/zar" + zarDeger + "_l1.png"));
                    Image finalImage = finalIcon.getImage().getScaledInstance(zar_label.getWidth(), zar_label.getHeight(), Image.SCALE_SMOOTH);
                    zar_label.setIcon(new ImageIcon(finalImage));

                    totalZar += zarDeger;
                    int donenDeger = (int) currentNode.data;
               //     System.out.println("Toplam Konum: " + totalZar + " / Hücre tipi: " + donenDeger);
                   // liste.print();
                    if (donenDeger == 0) {
                        totalPoint -= 5;
                        JOptionPane.showMessageDialog(rootPane, "You lost 5 points :(");
                        score.setText(Integer.toString(totalPoint));
                    } else if (donenDeger == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Empty Chest!");
                    } else if (donenDeger == 2) {
                        totalPoint += 10;
                        JOptionPane.showMessageDialog(rootPane, "You earn 10 points :)");
                        score.setText(Integer.toString(totalPoint));
                    }
               //     System.out.println(currentNode.data);

                    switch (totalZar) {
                        case 1:
                            piyon.setLocation(22, 342);
                            break;
                        case 2:
                            piyon.setLocation(22, 282);
                            break;
                        case 3:
                            piyon.setLocation(22, 232);
                            break;
                        case 4:
                            piyon.setLocation(22, 182);
                            break;
                        case 5:
                            piyon.setLocation(22, 132);
                            break;
                        case 6:
                            piyon.setLocation(22, 82);
                            break;
                        case 7:
                            piyon.setLocation(22, 32);
                            break;
                        case 8:
                            piyon.setLocation(72, 32);
                            break;
                        case 9:
                            piyon.setLocation(122, 32);
                            break;
                        case 10:
                            piyon.setLocation(182, 32);
                            break;
                        case 11:
                            piyon.setLocation(182, 82);
                            break;
                        case 12:
                            piyon.setLocation(182, 132);
                            break;
                        case 13:
                            piyon.setLocation(182, 182);
                            break;
                        case 14:
                            piyon.setLocation(182, 232);
                            break;
                        case 15:
                            piyon.setLocation(182, 282);
                            break;
                        case 16:
                            piyon.setLocation(182, 332);
                            break;
                        case 17:
                            piyon.setLocation(182, 382);
                            break;
                        case 18:
                            piyon.setLocation(182, 432);
                            break;
                        case 19:
                            piyon.setLocation(262, 432);
                            break;
                        case 20:
                            piyon.setLocation(342, 432);
                            break;
                        case 21:
                            piyon.setLocation(342, 372);
                            break;
                        case 22:
                            piyon.setLocation(342, 312);
                            break;
                        case 23:
                            piyon.setLocation(342, 252);
                            break;
                        case 24:
                            piyon.setLocation(342, 192);
                            break;
                        case 25:
                            piyon.setLocation(342, 132);
                            break;
                        case 26:
                            piyon.setLocation(412, 132);
                            break;
                        case 27:
                            piyon.setLocation(492, 132);
                            break;
                        case 28:
                            piyon.setLocation(492, 72);
                            break;
                        case 29:
                            piyon.setLocation(492, 12);
                            break;
                        case 30:
                            piyon.setLocation(562, 12);
                            break;
                    }

                    if (totalZar > 30) {
                        zar_button.setEnabled(false);
                        JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                        piyon.setLocation(622, 22);
                        // ****************************************************
                        box1.setVisible(false);
                        box2.setVisible(false);
                        box3.setVisible(false);
                        box4.setVisible(false);
                        box5.setVisible(false);
                        box6.setVisible(false);
                        box7.setVisible(false);
                        box8.setVisible(false);
                        box9.setVisible(false);
                        box10.setVisible(false);
                        box11.setVisible(false);
                        box12.setVisible(false);
                        box13.setVisible(false);
                        box14.setVisible(false);
                        box15.setVisible(false);
                        box16.setVisible(false);
                        box17.setVisible(false);
                        box18.setVisible(false);
                        box19.setVisible(false);
                        box20.setVisible(false);
                        box21.setVisible(false);
                        box22.setVisible(false);
                        box23.setVisible(false);
                        box24.setVisible(false);
                        box25.setVisible(false);
                        box26.setVisible(false);
                        box27.setVisible(false);
                        box28.setVisible(false);
                        box29.setVisible(false);
                        box30.setVisible(false);
                        //*****************************
                        g_box1.setVisible(true);
                        g_box2.setVisible(true);
                        g_box3.setVisible(true);
                        g_box4.setVisible(true);
                        g_box5.setVisible(true);
                        g_box6.setVisible(true);
                        g_box7.setVisible(true);
                        g_box8.setVisible(true);
                        g_box9.setVisible(true);
                        g_box10.setVisible(true);
                        g_box11.setVisible(true);
                        g_box12.setVisible(true);
                        g_box13.setVisible(true);
                        g_box14.setVisible(true);
                        g_box15.setVisible(true);
                        g_box16.setVisible(true);
                        g_box17.setVisible(true);
                        g_box18.setVisible(true);
                        g_box19.setVisible(true);
                        g_box20.setVisible(true);
                        g_box21.setVisible(true);
                        g_box22.setVisible(true);
                        g_box23.setVisible(true);
                        g_box24.setVisible(true);
                        g_box25.setVisible(true);
                        g_box26.setVisible(true);
                        g_box27.setVisible(true);
                        g_box28.setVisible(true);
                        g_box29.setVisible(true);
                        g_box30.setVisible(true);
                        //******************************
                        Node temp = liste.head;
                        for (int j = 0; j < 32; j++) {
                            if (temp == null) {
                                break;
                            }

                            switch ((int) temp.data) {
                                case 0:
                                    switch (j) {
                                        case 1:
                                            g_box1.setText("Trap");
                                            break;
                                        case 2:
                                            g_box2.setText("Trap");
                                            break;
                                        case 3:
                                            g_box3.setText("Trap");
                                            break;
                                        case 4:
                                            g_box4.setText("Trap");
                                            break;
                                        case 5:
                                            g_box5.setText("Trap");
                                            break;
                                        case 6:
                                            g_box6.setText("Trap");
                                            break;
                                        case 7:
                                            g_box7.setText("Trap");
                                            break;
                                        case 8:
                                            g_box8.setText("Trap");
                                            break;
                                        case 9:
                                            g_box9.setText("Trap");
                                            break;
                                        case 10:
                                            g_box10.setText("Trap");
                                            break;
                                        case 11:
                                            g_box11.setText("Trap");
                                            break;
                                        case 12:
                                            g_box12.setText("Trap");
                                            break;
                                        case 13:
                                            g_box13.setText("Trap");
                                            break;
                                        case 14:
                                            g_box14.setText("Trap");
                                            break;
                                        case 15:
                                            g_box15.setText("Trap");
                                            break;
                                        case 16:
                                            g_box16.setText("Trap");
                                            break;
                                        case 17:
                                            g_box17.setText("Trap");
                                            break;
                                        case 18:
                                            g_box18.setText("Trap");
                                            break;
                                        case 19:
                                            g_box19.setText("Trap");
                                            break;
                                        case 20:
                                            g_box20.setText("Trap");
                                            break;
                                        case 21:
                                            g_box21.setText("Trap");
                                            break;
                                        case 22:
                                            g_box22.setText("Trap");
                                            break;
                                        case 23:
                                            g_box23.setText("Trap");
                                            break;
                                        case 24:
                                            g_box24.setText("Trap");
                                            break;
                                        case 25:
                                            g_box25.setText("Trap");
                                            break;
                                        case 26:
                                            g_box26.setText("Trap");
                                            break;
                                        case 27:
                                            g_box27.setText("Trap");
                                            break;
                                        case 28:
                                            g_box28.setText("Trap");
                                            break;
                                        case 29:
                                            g_box29.setText("Trap");
                                            break;
                                        case 30:
                                            g_box30.setText("Trap");
                                            break;

                                    }
                                    break;
                                case 1:
                                    switch (j) {
                                        case 1:
                                            g_box1.setText("Empty");
                                            break;
                                        case 2:
                                            g_box2.setText("Empty");
                                            break;
                                        case 3:
                                            g_box3.setText("Empty");
                                            break;
                                        case 4:
                                            g_box4.setText("Empty");
                                            break;
                                        case 5:
                                            g_box5.setText("Empty");
                                            break;
                                        case 6:
                                            g_box6.setText("Empty");
                                            break;
                                        case 7:
                                            g_box7.setText("Empty");
                                            break;
                                        case 8:
                                            g_box8.setText("Empty");
                                            break;
                                        case 9:
                                            g_box9.setText("Empty");
                                            break;
                                        case 10:
                                            g_box10.setText("Empty");
                                            break;
                                        case 11:
                                            g_box11.setText("Empty");
                                            break;
                                        case 12:
                                            g_box12.setText("Empty");
                                            break;
                                        case 13:
                                            g_box13.setText("Empty");
                                            break;
                                        case 14:
                                            g_box14.setText("Empty");
                                            break;
                                        case 15:
                                            g_box15.setText("Empty");
                                            break;
                                        case 16:
                                            g_box16.setText("Empty");
                                            break;
                                        case 17:
                                            g_box17.setText("Empty");
                                            break;
                                        case 18:
                                            g_box18.setText("Empty");
                                            break;
                                        case 19:
                                            g_box19.setText("Empty");
                                            break;
                                        case 20:
                                            g_box20.setText("Empty");
                                            break;
                                        case 21:
                                            g_box21.setText("Empty");
                                            break;
                                        case 22:
                                            g_box22.setText("Empty");
                                            break;
                                        case 23:
                                            g_box23.setText("Empty");
                                            break;
                                        case 24:
                                            g_box24.setText("Empty");
                                            break;
                                        case 25:
                                            g_box25.setText("Empty");
                                            break;
                                        case 26:
                                            g_box26.setText("Empty");
                                            break;
                                        case 27:
                                            g_box27.setText("Empty");
                                            break;
                                        case 28:
                                            g_box28.setText("Empty");
                                            break;
                                        case 29:
                                            g_box29.setText("Empty");
                                            break;
                                        case 30:
                                            g_box30.setText("Empty");
                                            break;

                                    }
                                    break;
                                case 2:
                                    switch (j) {
                                        case 1:
                                            g_box1.setText("Treasure");
                                            break;
                                        case 2:
                                            g_box2.setText("Treasure");
                                            break;
                                        case 3:
                                            g_box3.setText("Treasure");
                                            break;
                                        case 4:
                                            g_box4.setText("Treasure");
                                            break;
                                        case 5:
                                            g_box5.setText("Treasure");
                                            break;
                                        case 6:
                                            g_box6.setText("Treasure");
                                            break;
                                        case 7:
                                            g_box7.setText("Treasure");
                                            break;
                                        case 8:
                                            g_box8.setText("Treasure");
                                            break;
                                        case 9:
                                            g_box9.setText("Treasure");
                                            break;
                                        case 10:
                                            g_box10.setText("Treasure");
                                            break;
                                        case 11:
                                            g_box11.setText("Treasure");
                                            break;
                                        case 12:
                                            g_box12.setText("Treasure");
                                            break;
                                        case 13:
                                            g_box13.setText("Treasure");
                                            break;
                                        case 14:
                                            g_box14.setText("Treasure");
                                            break;
                                        case 15:
                                            g_box15.setText("Treasure");
                                            break;
                                        case 16:
                                            g_box16.setText("Treasure");
                                            break;
                                        case 17:
                                            g_box17.setText("Treasure");
                                            break;
                                        case 18:
                                            g_box18.setText("Treasure");
                                            break;
                                        case 19:
                                            g_box19.setText("Treasure");
                                            break;
                                        case 20:
                                            g_box20.setText("Treasure");
                                            break;
                                        case 21:
                                            g_box21.setText("Treasure");
                                            break;
                                        case 22:
                                            g_box22.setText("Treasure");
                                            break;
                                        case 23:
                                            g_box23.setText("Treasure");
                                            break;
                                        case 24:
                                            g_box24.setText("Treasure");
                                            break;
                                        case 25:
                                            g_box25.setText("Treasure");
                                            break;
                                        case 26:
                                            g_box26.setText("Treasure");
                                            break;
                                        case 27:
                                            g_box27.setText("Treasure");
                                            break;
                                        case 28:
                                            g_box28.setText("Treasure");
                                            break;
                                        case 29:
                                            g_box29.setText("Treasure");
                                            break;
                                        case 30:
                                            g_box30.setText("Treasure");
                                            break;

                                    }
                                    break;
                            }

                            temp = temp.next; 
                        }
                        saveScoreToFile(1);
                        int result = JOptionPane.showConfirmDialog(
                                null,
                                "Do you want to move on second level?",
                                "Confirmation",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.WARNING_MESSAGE
                        );

                    
                        if (result == JOptionPane.YES_OPTION) {
                            game2 hel = new game2(username);
                            hel.setVisible(true);
                            setVisible(false);
                        }else if(result == JOptionPane.NO_OPTION){
                            start hel2=new start();
                            hel2.setVisible(true);
                            setVisible(false);}
                        else {
                            System.out.println("Exit cancelled.");
                        }

                    }
                    zar_button.setEnabled(true);
                }
            }
        });

        timer.start();


    }//GEN-LAST:event_zar_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game("TestUser").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel box1;
    private javax.swing.JLabel box10;
    private javax.swing.JLabel box11;
    private javax.swing.JLabel box12;
    private javax.swing.JLabel box13;
    private javax.swing.JLabel box14;
    private javax.swing.JLabel box15;
    private javax.swing.JLabel box16;
    private javax.swing.JLabel box17;
    private javax.swing.JLabel box18;
    private javax.swing.JLabel box19;
    private javax.swing.JLabel box2;
    private javax.swing.JLabel box20;
    private javax.swing.JLabel box21;
    private javax.swing.JLabel box22;
    private javax.swing.JLabel box23;
    private javax.swing.JLabel box24;
    private javax.swing.JLabel box25;
    private javax.swing.JLabel box26;
    private javax.swing.JLabel box27;
    private javax.swing.JLabel box28;
    private javax.swing.JLabel box29;
    private javax.swing.JLabel box3;
    private javax.swing.JLabel box30;
    private javax.swing.JLabel box4;
    private javax.swing.JLabel box5;
    private javax.swing.JLabel box6;
    private javax.swing.JLabel box7;
    private javax.swing.JLabel box8;
    private javax.swing.JLabel box9;
    private javax.swing.JLabel g_box1;
    private javax.swing.JLabel g_box10;
    private javax.swing.JLabel g_box11;
    private javax.swing.JLabel g_box12;
    private javax.swing.JLabel g_box13;
    private javax.swing.JLabel g_box14;
    private javax.swing.JLabel g_box15;
    private javax.swing.JLabel g_box16;
    private javax.swing.JLabel g_box17;
    private javax.swing.JLabel g_box18;
    private javax.swing.JLabel g_box19;
    private javax.swing.JLabel g_box2;
    private javax.swing.JLabel g_box20;
    private javax.swing.JLabel g_box21;
    private javax.swing.JLabel g_box22;
    private javax.swing.JLabel g_box23;
    private javax.swing.JLabel g_box24;
    private javax.swing.JLabel g_box25;
    private javax.swing.JLabel g_box26;
    private javax.swing.JLabel g_box27;
    private javax.swing.JLabel g_box28;
    private javax.swing.JLabel g_box29;
    private javax.swing.JLabel g_box3;
    private javax.swing.JLabel g_box30;
    private javax.swing.JLabel g_box4;
    private javax.swing.JLabel g_box5;
    private javax.swing.JLabel g_box6;
    private javax.swing.JLabel g_box7;
    private javax.swing.JLabel g_box8;
    private javax.swing.JLabel g_box9;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel piyon;
    private javax.swing.JLabel score;
    private javax.swing.JButton zar_button;
    private javax.swing.JLabel zar_label;
    // End of variables declaration//GEN-END:variables
}
