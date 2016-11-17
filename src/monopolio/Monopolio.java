/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolio;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import monopolio.Chance.NodoCh;
import monopolio.Jugadores.NodoJug;
import monopolio.Propiedades.Nodo;
import monopolio.CommunityQuest.NodoCq;

/**
 *
 * @author SebastianCabarcas
 */
public class Monopolio extends javax.swing.JFrame {

    /**
     * Creates new form Monopolio
     */
    public Monopolio() throws FileNotFoundException {
        this.ptr = propiedades.hacerlista();
        this.ptr1 = jugadores.hacerlista(2);
        this.ptr2 = chance.hacerlista();
        this.ptr3 = community.hacerlista();
        initComponents();
        /*Font fuente = new Font("Mistral", Font.BOLD, 24);
        playern.setFont(fuente);
        playern.setText("PLAYER 1");*/
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);

        setLocation(0, 0);        // Centering on screen...
        setSize(976, 740);
        Image t = new ImageIcon(this.getClass().getResource("boot.png")).getImage();
        imagturno.setIcon(new ImageIcon(t));
        comprarpropiedad.setVisible(false);
        venderpropiedad.setVisible(false);
        pay.setVisible(false);
        chanceycommunity.setVisible(false);
        dueño.setVisible(false);
        comprarcasa.setVisible(false);
        comprarhotel.setVisible(false);
        casas.setVisible(false);
        p1.setOpaque(false);
        p1.setContentAreaFilled(false);
        p1.setBorderPainted(true);
        p3.setOpaque(false);
        p3.setContentAreaFilled(false);
        p3.setBorderPainted(true);
        p6.setOpaque(false);
        p6.setContentAreaFilled(false);
        p6.setBorderPainted(true);
        p8.setOpaque(false);
        p8.setContentAreaFilled(false);
        p8.setBorderPainted(true);
        p9.setOpaque(false);
        p9.setContentAreaFilled(false);
        p9.setBorderPainted(true);
        p11.setOpaque(false);
        p11.setContentAreaFilled(false);
        p11.setBorderPainted(true);
        p14.setOpaque(false);
        p14.setContentAreaFilled(false);
        p14.setBorderPainted(true);
        p13.setOpaque(false);
        p13.setContentAreaFilled(false);
        p13.setBorderPainted(true);
        p16.setOpaque(false);
        p16.setContentAreaFilled(false);
        p16.setBorderPainted(true);
        p18.setOpaque(false);
        p18.setContentAreaFilled(false);
        p18.setBorderPainted(true);
        p19.setOpaque(false);
        p19.setContentAreaFilled(false);
        p19.setBorderPainted(true);
        p21.setOpaque(false);
        p21.setContentAreaFilled(false);
        p21.setBorderPainted(true);
        p23.setOpaque(false);
        p23.setContentAreaFilled(false);
        p23.setBorderPainted(true);
        p24.setOpaque(false);
        p24.setContentAreaFilled(false);
        p24.setBorderPainted(true);
        p26.setOpaque(false);
        p26.setContentAreaFilled(false);
        p26.setBorderPainted(true);
        p27.setOpaque(false);
        p27.setContentAreaFilled(false);
        p27.setBorderPainted(true);
        p29.setOpaque(false);
        p29.setContentAreaFilled(false);
        p29.setBorderPainted(true);
        p31.setOpaque(false);
        p31.setContentAreaFilled(false);
        p31.setBorderPainted(true);
        p32.setOpaque(false);
        p32.setContentAreaFilled(false);
        p32.setBorderPainted(true);
        p34.setOpaque(false);
        p34.setContentAreaFilled(false);
        p34.setBorderPainted(true);
        p37.setOpaque(false);
        p37.setContentAreaFilled(false);
        p37.setBorderPainted(true);
        p39.setOpaque(false);
        p39.setContentAreaFilled(false);
        p39.setBorderPainted(true);
        p1.setVisible(false);
        p3.setVisible(false);
        p6.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p11.setVisible(false);
        p13.setVisible(false);
        p14.setVisible(false);
        p16.setVisible(false);
        p18.setVisible(false);
        p19.setVisible(false);
        p21.setVisible(false);
        p23.setVisible(false);
        p24.setVisible(false);
        p26.setVisible(false);
        p27.setVisible(false);
        p29.setVisible(false);
        p31.setVisible(false);
        p32.setVisible(false);
        p34.setVisible(false);
        p37.setVisible(false);
        p39.setVisible(false);
    }
    Propiedades propiedades = new Propiedades();
    Jugadores jugadores = new Jugadores();
    Chance chance = new Chance();
    CommunityQuest community = new CommunityQuest();
    NodoCq ptr3;
    NodoCq s;
    NodoCh ptr2;
    NodoCh r;
    Nodo ptr;
    Nodo p;
    NodoJug q;
    NodoJug ptr1;
    //NodoJug q;

    int x;
    int a;
    int intentosc = 0;
    int cp1 = 0;
    int cp3 = 0;
    int cp6 = 0;
    int cp8 = 0;
    int cp9 = 0;
    int cp11 = 0;
    int cp13 = 0;
    int cp14 = 0;
    int cp16 = 0;
    int cp18 = 0;
    int cp19 = 0;
    int cp21 = 0;
    int cp23 = 0;
    int cp24 = 0;
    int cp26 = 0;
    int cp27 = 0;
    int cp29 = 0;
    int cp31 = 0;
    int cp32 = 0;
    int cp34 = 0;
    int cp37 = 0;
    int cp39 = 0;
    int c = 0;
    int h = 0;
    int mov = 0;
    int npropiedades = 0;
    int mova1 = 0;
    int player = 0;
    int mova2 = 0;
    int turno = 0;
    int idchance = 0;
    int idcommunity = 0;
    int dinero;
    int propc;
    String casanow;
    Random ran = new Random();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playern1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        tirardados = new javax.swing.JButton();
        pasarturno = new javax.swing.JButton();
        venderpropiedad = new javax.swing.JButton();
        comprarpropiedad = new javax.swing.JButton();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        imagturno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        daditos = new javax.swing.JLabel();
        turnos = new javax.swing.JLabel();
        playern = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        chanceycommunity = new javax.swing.JButton();
        dueño = new javax.swing.JLabel();
        comprarcasa = new javax.swing.JButton();
        comprarhotel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        moneyp1 = new javax.swing.JLabel();
        cartas = new javax.swing.JLabel();
        moneyp2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p1 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p11 = new javax.swing.JButton();
        p13 = new javax.swing.JButton();
        p14 = new javax.swing.JButton();
        p16 = new javax.swing.JButton();
        p18 = new javax.swing.JButton();
        p19 = new javax.swing.JButton();
        p27 = new javax.swing.JButton();
        p26 = new javax.swing.JButton();
        p24 = new javax.swing.JButton();
        p23 = new javax.swing.JButton();
        p21 = new javax.swing.JButton();
        p31 = new javax.swing.JButton();
        p32 = new javax.swing.JButton();
        p34 = new javax.swing.JButton();
        p37 = new javax.swing.JButton();
        p39 = new javax.swing.JButton();
        p29 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        casas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        playern1.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        playern1.setForeground(new java.awt.Color(255, 0, 0));
        playern1.setText("PLAYER1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(null);

        tirardados.setBackground(java.awt.Color.lightGray);
        tirardados.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        tirardados.setForeground(new java.awt.Color(255, 0, 0));
        tirardados.setText("TIRAR DADOS");
        tirardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirardadosActionPerformed(evt);
            }
        });
        panel1.add(tirardados);
        tirardados.setBounds(730, 100, 210, 50);

        pasarturno.setBackground(new java.awt.Color(204, 204, 204));
        pasarturno.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        pasarturno.setForeground(new java.awt.Color(255, 0, 0));
        pasarturno.setText("PASAR TURNO");
        pasarturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarturnoActionPerformed(evt);
            }
        });
        panel1.add(pasarturno);
        pasarturno.setBounds(750, 100, 180, 40);

        venderpropiedad.setBackground(new java.awt.Color(255, 0, 0));
        venderpropiedad.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        venderpropiedad.setText("VENDER PROPIEDAD");
        venderpropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderpropiedadActionPerformed(evt);
            }
        });
        panel1.add(venderpropiedad);
        venderpropiedad.setBounds(760, 650, 150, 30);

        comprarpropiedad.setBackground(new java.awt.Color(255, 0, 0));
        comprarpropiedad.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        comprarpropiedad.setText("COMPRAR PROPIEDAD");
        comprarpropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarpropiedadActionPerformed(evt);
            }
        });
        panel1.add(comprarpropiedad);
        comprarpropiedad.setBounds(750, 600, 170, 30);

        dado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        panel1.add(dado1);
        dado1.setBounds(240, 510, 80, 80);

        dado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        panel1.add(dado2);
        dado2.setBounds(330, 510, 80, 80);

        player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopolio/dog.png"))); // NOI18N
        panel1.add(player2);
        player2.setBounds(640, 660, 40, 30);

        player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopolio/boot.png"))); // NOI18N
        panel1.add(player1);
        player1.setBounds(640, 610, 40, 40);
        panel1.add(imagturno);
        imagturno.setBounds(830, 130, 80, 60);

        jLabel4.setFont(new java.awt.Font("Mistral", 1, 22)); // NOI18N
        jLabel4.setText("TURNO:");
        panel1.add(jLabel4);
        jLabel4.setBounds(760, 150, 80, 30);

        daditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopolio/daditos.png"))); // NOI18N
        panel1.add(daditos);
        daditos.setBounds(790, 10, 80, 80);
        panel1.add(turnos);
        turnos.setBounds(790, 20, 80, 80);

        playern.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        playern.setForeground(new java.awt.Color(255, 0, 0));
        playern.setText("PLAYER1");
        panel1.add(playern);
        playern.setBounds(710, 220, 70, 30);

        pay.setBackground(new java.awt.Color(255, 0, 0));
        pay.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        panel1.add(pay);
        pay.setBounds(750, 620, 170, 40);

        chanceycommunity.setBackground(new java.awt.Color(255, 0, 0));
        chanceycommunity.setFont(new java.awt.Font("Mistral", 1, 24)); // NOI18N
        chanceycommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanceycommunityActionPerformed(evt);
            }
        });
        panel1.add(chanceycommunity);
        chanceycommunity.setBounds(710, 610, 240, 30);

        dueño.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        panel1.add(dueño);
        dueño.setBounds(710, 560, 90, 20);

        comprarcasa.setBackground(new java.awt.Color(255, 0, 0));
        comprarcasa.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        comprarcasa.setText("COMPRAR CASA");
        comprarcasa.setToolTipText("");
        comprarcasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarcasaActionPerformed(evt);
            }
        });
        panel1.add(comprarcasa);
        comprarcasa.setBounds(310, 110, 130, 23);

        comprarhotel.setBackground(new java.awt.Color(255, 0, 0));
        comprarhotel.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        comprarhotel.setText("COMPRAR HOTEL");
        comprarhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarhotelActionPerformed(evt);
            }
        });
        panel1.add(comprarhotel);
        comprarhotel.setBounds(310, 150, 140, 23);

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("PLAYER2");
        panel1.add(jLabel2);
        jLabel2.setBounds(710, 260, 70, 19);

        moneyp1.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        panel1.add(moneyp1);
        moneyp1.setBounds(850, 220, 100, 30);
        panel1.add(cartas);
        cartas.setBounds(710, 280, 240, 280);

        moneyp2.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        panel1.add(moneyp2);
        moneyp2.setBounds(850, 250, 90, 30);
        panel1.add(jLabel7);
        jLabel7.setBounds(710, 40, 0, 0);

        jLabel8.setFont(new java.awt.Font("Mistral", 1, 18)); // NOI18N
        jLabel8.setText("DINERO");
        panel1.add(jLabel8);
        jLabel8.setBounds(850, 200, 70, 19);

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 84, 54), 3));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        panel1.add(p1);
        p1.setBounds(550, 610, 60, 90);

        p3.setToolTipText("");
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 84, 54), 3));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        panel1.add(p3);
        p3.setBounds(436, 610, 60, 90);

        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 224, 250), 3));
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        panel1.add(p6);
        p6.setBounds(264, 610, 58, 90);

        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 224, 250), 3));
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        panel1.add(p8);
        p8.setBounds(148, 610, 60, 90);

        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 224, 250), 3));
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        panel1.add(p9);
        p9.setBounds(91, 610, 60, 90);

        p11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 58, 150), 3));
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });
        panel1.add(p11);
        p11.setBounds(0, 550, 90, 60);

        p13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 58, 150), 3));
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });
        panel1.add(p13);
        p13.setBounds(0, 436, 90, 60);

        p14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 58, 150), 3));
        p14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14ActionPerformed(evt);
            }
        });
        panel1.add(p14);
        p14.setBounds(0, 377, 90, 60);

        p16.setToolTipText("");
        p16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 3));
        p16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16ActionPerformed(evt);
            }
        });
        panel1.add(p16);
        p16.setBounds(0, 262, 90, 60);

        p18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 3));
        p18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p18ActionPerformed(evt);
            }
        });
        panel1.add(p18);
        p18.setBounds(0, 147, 90, 60);

        p19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 148, 29), 3));
        p19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19ActionPerformed(evt);
            }
        });
        panel1.add(p19);
        p19.setBounds(0, 90, 90, 60);

        p27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 242, 0), 3));
        p27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p27ActionPerformed(evt);
            }
        });
        panel1.add(p27);
        p27.setBounds(435, 0, 60, 90);

        p26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 242, 0), 3));
        p26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p26ActionPerformed(evt);
            }
        });
        panel1.add(p26);
        p26.setBounds(377, 0, 60, 90);

        p24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 27, 36), 3));
        p24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p24ActionPerformed(evt);
            }
        });
        panel1.add(p24);
        p24.setBounds(265, 0, 55, 90);

        p23.setToolTipText("");
        p23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 27, 36), 3));
        p23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p23ActionPerformed(evt);
            }
        });
        panel1.add(p23);
        p23.setBounds(204, 0, 60, 90);

        p21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 27, 36), 3));
        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });
        panel1.add(p21);
        p21.setBounds(90, 0, 60, 90);

        p31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 178, 90), 3));
        p31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p31ActionPerformed(evt);
            }
        });
        panel1.add(p31);
        p31.setBounds(610, 90, 90, 60);

        p32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 178, 90), 3));
        p32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p32ActionPerformed(evt);
            }
        });
        panel1.add(p32);
        p32.setBounds(610, 147, 90, 60);

        p34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 178, 90), 3));
        p34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p34ActionPerformed(evt);
            }
        });
        panel1.add(p34);
        p34.setBounds(610, 262, 90, 60);

        p37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 187), 3));
        p37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p37ActionPerformed(evt);
            }
        });
        panel1.add(p37);
        p37.setBounds(610, 435, 90, 60);

        p39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 114, 187), 3));
        p39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p39ActionPerformed(evt);
            }
        });
        panel1.add(p39);
        p39.setBounds(610, 550, 90, 60);

        p29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 242, 0), 3));
        p29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p29ActionPerformed(evt);
            }
        });
        panel1.add(p29);
        p29.setBounds(549, 0, 60, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SebastianCabarcas\\Documents\\NetBeansProjects\\Monopolio\\src\\monopolio\\81oc5pyhh2l-_sl1500_ (1).jpg")); // NOI18N
        panel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 700);

        casas.setFont(new java.awt.Font("Mistral", 1, 14)); // NOI18N
        panel1.add(casas);
        casas.setBounds(820, 560, 140, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopolio/squarel.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panel1.add(jLabel5);
        jLabel5.setBounds(700, 0, 260, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tirardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirardadosActionPerformed
        Random random1 = new Random();
        Random random2 = new Random();
        Random randomch = new Random();
        Random randomcq = new Random();
        //Nodo p;
        //NodoJug q;

        int mov, posx, posy;

        posy = 620;
        posx = 70;

        int valor1, valor2;

        valor1 = random1.nextInt(6 - 1 + 1) + 1;
        valor2 = random2.nextInt(6 - 1 + 1) + 1;

        mov = (valor1 + valor2);
        mov=1;

        dado1.setVisible(true);
        dado2.setVisible(true);
        dadosImagen(valor1, dado1);
        dadosImagen(valor2, dado2);
        if (turno % 2 == 0) {

            q = moverListaJug(ptr1, 1);

        } else {

            q = moverListaJug(ptr1, 2);

        }
        if (q.cartaprision == 1 && q.prisionero == 1) {
            q.cartaprision = 0;
            q.prisionero = 0;
            showMessageDialog(null, "Gracias al boleto que ganaste antes de salida gratis de la carcel ERES LIBRE!, disfruta de tu libertad");
        }
        if (intentosc < 3) {
            if (valor1 == valor2 && q.prisionero == 1) {
                intentosc = 0;
                q.prisionero = 0;
                showMessageDialog(null, "Has salido de la carcel, ERES LIBRE");
            } else {
                if (valor1 != valor2 && q.prisionero == 1) {
                    intentosc = intentosc + 1;
                    System.out.println("inte");
                    turnos.setVisible(true);
                }
            }

        }
        if (intentosc == 3) {

            tirardados.setVisible(false);
            daditos.setVisible(false);
            turnos.setVisible(true);
            Image turno = new ImageIcon(this.getClass().getResource("turno.png")).getImage();
            turnos.setIcon(new ImageIcon(turno));
            intentosc = 0;

        }
        if (q.prisionero == 0) {
            if (turno % 2 == 0) {
                mova1 = mov + mova1;
                p = moverLista(ptr, mova1);
                q = moverListaJug(ptr1, 1);
                idchance = randomch.nextInt(32 - 1 + 1) + 1;
                r = moverListaCh(ptr2, idchance);
            } else {
                mova2 = mov + mova2;
                p = moverLista(ptr, mova2);
                q = moverListaJug(ptr1, 2);
                idchance = randomch.nextInt(32 - 1 + 1) + 1;
                r = moverListaCh(ptr2, idchance);
            }
        }

        if (q.prisionero == 0) {
            if (turno % 2 == 0) {
                botonComprarcasa(ptr, 1);
                mova1 = moverJugador(player1, mova1, mov);
                if (!p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac")) {
                    cartas.setVisible(true);
                    Image casa = new ImageIcon(this.getClass().getResource(mova1 + ".png")).getImage();
                    cartas.setIcon(new ImageIcon(casa));

                }
                if (p.color.equalsIgnoreCase("ch")) {
                    pasarturno.setEnabled(false);
                   
                    chanceycommunity.setVisible(true);

                    if (r.flag.equalsIgnoreCase("AD") || r.flag.equalsIgnoreCase("AD") || r.flag.equalsIgnoreCase("AA") || r.flag.equalsIgnoreCase("AC") || r.flag.equalsIgnoreCase("A")) {
                        chanceycommunity.setText(r.descripcion);
                    }
                    if (r.flag.equalsIgnoreCase("C")) {
                        chanceycommunity.setText("GET $" + r.action);
                    }
                    if (r.flag.equalsIgnoreCase("P")) {
                        chanceycommunity.setText("PAY $" + r.action);
                    }
                    if (r.flag.equalsIgnoreCase("PA")) {
                        chanceycommunity.setText("PAY $" + (q.casas * 25 + q.hoteles * 100));
                    }
                    if (r.flag.equalsIgnoreCase("PJ")) {
                        chanceycommunity.setText("PAY $50");
                    }
                    if (r.flag.equalsIgnoreCase("L")) {
                        chanceycommunity.setText("KEPT CARD");
                    }
                    cartas.setVisible(true);
                    Image casa = new ImageIcon(this.getClass().getResource(r.id + ".jpg")).getImage();
                    cartas.setIcon(new ImageIcon(casa));
                }
                if (p.color.equalsIgnoreCase("ac")) {
                    pasarturno.setEnabled(false);
                    idcommunity = randomcq.nextInt(32 - 1 + 1) + 1;
                    s = moverListaCq(ptr3, idcommunity);
                    chanceycommunity.setVisible(true);

                    if (s.flag.equalsIgnoreCase("AC") || s.flag.equalsIgnoreCase("A")) {
                        chanceycommunity.setText(s.descripcion);
                    }
                    if (s.flag.equalsIgnoreCase("C")) {
                        chanceycommunity.setText("GET $" + s.action);
                    }
                    if (s.flag.equalsIgnoreCase("P")) {
                        chanceycommunity.setText("PAY $" + s.action);
                    }
                    if (s.flag.equalsIgnoreCase("PA")) {
                        chanceycommunity.setText("PAY $" + (q.casas * 40 + q.hoteles * 115));
                    }
                    if (s.flag.equalsIgnoreCase("CJ")) {
                        chanceycommunity.setText("GET $50");
                    }
                    if (s.flag.equalsIgnoreCase("L")) {
                        chanceycommunity.setText("KEPT CARD");
                    }
                    cartas.setVisible(true);
                    Image casa = new ImageIcon(this.getClass().getResource("C" + s.id + ".jpg")).getImage();
                    cartas.setIcon(new ImageIcon(casa));
                }

            } else {

                botonComprarcasa(ptr, 2);
                mova2 = moverJugador(player2, mova2, mov);
                if (!p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac")) {
                    cartas.setVisible(true);
                    Image casa = new ImageIcon(this.getClass().getResource(mova2 + ".png")).getImage();
                    cartas.setIcon(new ImageIcon(casa));

                }
                if (p.color.equalsIgnoreCase("ch")) {
                    pasarturno.setEnabled(false);
                    /*idchance = randomch.nextInt(32 - 1 + 1) + 1;
                r = moverListaCh(ptr2, idchance);*/
                    chanceycommunity.setVisible(true);

                    if (r.flag.equalsIgnoreCase("AD") || r.flag.equalsIgnoreCase("AD") || r.flag.equalsIgnoreCase("AA") || r.flag.equalsIgnoreCase("AC") || r.flag.equalsIgnoreCase("A")) {
                        chanceycommunity.setText(r.descripcion);
                    }
                    if (r.flag.equalsIgnoreCase("C")) {
                        chanceycommunity.setText("GET $" + r.action);
                    }
                    if (r.flag.equalsIgnoreCase("P")) {
                        chanceycommunity.setText("PAY $" + r.action);
                    }
                    if (r.flag.equalsIgnoreCase("PA")) {
                        chanceycommunity.setText("PAY $" + (q.casas * 25 + q.hoteles * 100));
                    }
                    if (r.flag.equalsIgnoreCase("PJ")) {
                        chanceycommunity.setText("PAY $50");
                    }
                    if (r.flag.equalsIgnoreCase("L")) {
                        chanceycommunity.setText("KEPT CARD");
                    }
                    cartas.setVisible(true);
                    Image casa = new ImageIcon(this.getClass().getResource(r.id + ".jpg")).getImage();
                    cartas.setIcon(new ImageIcon(casa));
                }
                if (p.color.equalsIgnoreCase("ac")) {
                    pasarturno.setEnabled(false);
                    idcommunity = randomcq.nextInt(32 - 1 + 1) + 1;
                    s = moverListaCq(ptr3, idcommunity);
                    //System.out.println(r.descripcion);
                    chanceycommunity.setVisible(true);

                    if (s.flag.equalsIgnoreCase("AC") || s.flag.equalsIgnoreCase("A")) {
                        chanceycommunity.setText(s.descripcion);
                    }
                    if (s.flag.equalsIgnoreCase("C")) {
                        chanceycommunity.setText("GET $" + s.action);
                    }
                    if (s.flag.equalsIgnoreCase("P")) {
                        chanceycommunity.setText("PAY $" + s.action);
                    }
                    if (s.flag.equalsIgnoreCase("PA")) {
                        chanceycommunity.setText("PAY $" + (q.casas * 40 + q.hoteles * 115));
                    }
                    if (s.flag.equalsIgnoreCase("CJ")) {
                        chanceycommunity.setText("GET $50");
                    }
                    if (s.flag.equalsIgnoreCase("L")) {
                        chanceycommunity.setText("KEPT CARD");
                    }
                    cartas.setVisible(true);
                    Image casa = new ImageIcon(this.getClass().getResource("C" + s.id + ".jpg")).getImage();
                    cartas.setIcon(new ImageIcon(casa));
                }

            }

            if (p.dueño != 0) {
                dueño.setVisible(true);
                dueño.setText("OWN: PLAYER" + p.dueño);
                casas.setVisible(true);
                if (p.color.equalsIgnoreCase("F")) {

                } else {

                    casas.setText("#CASAS: " + p.casas);
                }

            }

            if (p.comprabilidad == 1 && p.dueño == 0) {
                comprarpropiedad.setVisible(true);
            } else {
                if (p.dueño == q.jugador) {
                    venderpropiedad.setVisible(true);
                    npropiedades = buscarLista(ptr, p.color);
                    if (p.color.equalsIgnoreCase("F")) {
                        casas.setText("#FERROCARRILES: " + npropiedades);
                    }

                }
            }
            if (((p.dueño != 0) && (p.dueño != q.jugador)) || p.color.equalsIgnoreCase("pa")) {

                pay.setVisible(true);
                a = q.jugador;
                if (p.hotel == 0) {
                    switch (p.casas) {
                        case 0:
                            pay.setText("PAY $" + p.alquiler);
                            break;
                        case 1:
                            pay.setText("PAY $" + p.alquiler1);
                            break;
                        case 2:
                            pay.setText("PAY $" + p.alquiler2);
                            break;
                        case 3:
                            pay.setText("PAY $" + p.alquiler3);
                            break;
                        case 4:
                            pay.setText("PAY $" + p.alquiler4);
                            break;
                    }
                } else {
                    pay.setText("PAY $" + p.alquilerhotel);
                }
                q = moverListaJug(ptr1, p.dueño);
                npropiedades = buscarLista(ptr, p.color);
                if (p.color.equalsIgnoreCase("F")) {
                    casas.setText("#FERROCARRILES: " + npropiedades);
                    switch (npropiedades) {
                        case 0:

                            pay.setText("PAY $" + p.alquiler);
                            break;
                        case 1:

                            pay.setText("PAY $" + p.alquiler1);
                            break;
                        case 2:

                            pay.setText("PAY $" + p.alquiler2);
                            break;
                        case 3:

                            pay.setText("PAY $" + p.alquiler3);
                            break;
                        case 4:

                            pay.setText("PAY $" + p.alquiler4);
                            break;
                    }
                }
                if (p.color.equalsIgnoreCase("u")) {
                    if (npropiedades == 1) {
                        casas.setText("#SERVICIOS: " + npropiedades);
                        pay.setText("PAY $50");
                    } else {
                        if (npropiedades == 2) {
                            casas.setText("#SERVICIOS: " + npropiedades);
                            pay.setText("PAY $100");
                        }

                    }

                }
                q = moverListaJug(ptr1, a);
                pasarturno.setEnabled(false);
            }
            casanow = p.nombre;
            turnos.setVisible(true);
            Image turno = new ImageIcon(this.getClass().getResource("turno.png")).getImage();
            turnos.setIcon(new ImageIcon(turno));
            tirardados.setEnabled(false);
            tirardados.setVisible(false);
            daditos.setVisible(false);

        }
        if (p.color.equals("go")) {
            showMessageDialog(null, "Recibes $200 por parte del banco por llegar a GO");
            q.dinero = q.dinero + 200;
            a = q.jugador;
            q = moverListaJug(ptr1, 1);
            moneyp1.setText("" + q.dinero);
            q = moverListaJug(ptr1, 2);
            moneyp2.setText("" + q.dinero);
            q = moverListaJug(ptr1, a);
        }

    }//GEN-LAST:event_tirardadosActionPerformed

    private void pasarturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarturnoActionPerformed

        turno = turno + 1;
        if (turno % 2 == 0) {
            Image t = new ImageIcon(this.getClass().getResource("boot.png")).getImage();
            imagturno.setIcon(new ImageIcon(t));
            if (p.color.equalsIgnoreCase("goj")) {
                p = moverLista(ptr, 10);
                mova2=10;
                moverJugador(player2, 10, 0);
                q.prisionero = 1;
            }

        } else {
            Image t = new ImageIcon(this.getClass().getResource("dog.png")).getImage();
            imagturno.setIcon(new ImageIcon(t));
            if (p.color.equalsIgnoreCase("goj")) {
                p = moverLista(ptr, 10);
                mova1=10;
                moverJugador(player1, 10, 0);
                q.prisionero = 1;
            }

        }

        tirardados.setEnabled(true);
        tirardados.setVisible(true);
        daditos.setVisible(true);
        dado1.setVisible(false);
        dado2.setVisible(false);
        turnos.setVisible(false);
        cartas.setVisible(false);
        comprarpropiedad.setVisible(false);
        dueño.setVisible(false);
        casas.setVisible(false);
        venderpropiedad.setVisible(false);
        comprarcasa.setVisible(false);
        comprarhotel.setVisible(false);
        deshabilitarMonopolio(ptr, q.jugador);
        // TODO add your handling code here:
    }//GEN-LAST:event_pasarturnoActionPerformed

    private void comprarpropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarpropiedadActionPerformed

        if (turno % 2 == 0) {
            p = moverLista(ptr, mova1);
        } else {
            p = moverLista(ptr, mova2);
        }
        if (p.comprabilidad == 1) {
            if (p.costo <= q.dinero) {
                q.dinero = q.dinero - p.costo;
                p.dueño = q.jugador;
            } else {

                showMessageDialog(null, "Insufficient Money");
            }
        }
        a = q.jugador;
        botonComprarcasa(ptr, q.jugador);
        dueño.setVisible(true);
        dueño.setText("OWN: PLAYER" + p.dueño);
        casas.setVisible(true);
        npropiedades = buscarLista(ptr, p.color);
        if (p.color.equalsIgnoreCase("F")) {
            casas.setText("#FERROCARRILES: " + npropiedades);
        } else {

            casas.setText("#CASAS: " + p.casas);
        }
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);
        q = moverListaJug(ptr1, a);
        comprarpropiedad.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_comprarpropiedadActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        if (turno % 2 == 0) {
            p = moverLista(ptr, mova1);
        } else {
            p = moverLista(ptr, mova2);
        }

        if (!p.color.equalsIgnoreCase("F") && !p.color.equalsIgnoreCase("u")) {
            if (p.hotel == 0) {
                switch (p.casas) {
                    case 0:
                        q.dinero = q.dinero - p.alquiler;
                        break;
                    case 1:
                        q.dinero = q.dinero - p.alquiler1;

                        break;
                    case 2:
                        q.dinero = q.dinero - p.alquiler2;
                        break;
                    case 3:
                        q.dinero = q.dinero - p.alquiler3;
                        break;
                    case 4:
                        q.dinero = q.dinero - p.alquiler4;
                        break;
                }
            } else {
                q.dinero = q.dinero - p.alquilerhotel;
            }

        } else {

            if (p.color.equalsIgnoreCase("F")) {
                a = q.jugador;
                q = moverListaJug(ptr1, p.dueño);
                npropiedades = buscarLista(ptr, p.color);
                q = moverListaJug(ptr1, a);
                switch (npropiedades) {

                    case 0:
                        q.dinero = q.dinero - p.alquiler;
                        break;
                    case 1:
                        q.dinero = q.dinero - p.alquiler1;
                        break;
                    case 2:
                        q.dinero = q.dinero - p.alquiler2;
                        break;
                    case 3:
                        q.dinero = q.dinero - p.alquiler3;
                        break;
                    case 4:
                        q.dinero = q.dinero - p.alquiler4;
                        break;
                }
            }
            if (p.color.equalsIgnoreCase("u")) {
                switch (npropiedades) {

                    case 1:
                        q.dinero = q.dinero - 50;
                        break;
                    case 2:
                        q.dinero = q.dinero - 100;
                        break;
                }
            }

            if (p.dueño != 0) {
                q = moverListaJug(ptr1, p.dueño);
                if (p.hotel == 0) {

                    if (p.color.equalsIgnoreCase("F")) {
                        a = q.jugador;
                        q = moverListaJug(ptr1, p.dueño);
                        npropiedades = buscarLista(ptr, p.color);
                        q = moverListaJug(ptr1, a);
                        switch (npropiedades) {

                            case 0:
                                q.dinero = q.dinero + p.alquiler;
                                break;
                            case 1:
                                q.dinero = q.dinero + p.alquiler1;
                                break;
                            case 2:
                                q.dinero = q.dinero + p.alquiler2;
                                break;
                            case 3:
                                q.dinero = q.dinero + p.alquiler3;
                                break;
                            case 4:
                                q.dinero = q.dinero + p.alquiler4;
                                break;
                        }
                    } else {
                        switch (p.casas) {
                            case 0:
                                q.dinero = q.dinero + p.alquiler;
                                break;
                            case 1:
                                q.dinero = q.dinero + p.alquiler1;
                                break;
                            case 2:
                                q.dinero = q.dinero + p.alquiler2;
                                break;
                            case 3:
                                q.dinero = q.dinero + p.alquiler3;
                                break;
                            case 4:
                                q.dinero = q.dinero + p.alquiler4;
                                break;
                        }

                    }
                } else {
                    q.dinero = q.dinero + p.alquilerhotel;
                }
                if (p.color.equalsIgnoreCase("u")) {
                    switch (npropiedades) {

                        case 1:
                            q.dinero = q.dinero + 50;
                            break;
                        case 2:
                            q.dinero = q.dinero + 100;
                            break;
                    }
                }
            }
        }

        // TODO add your handling code here:
        pay.setVisible(false);
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);
        q = moverListaJug(ptr1, a);
        pasarturno.setEnabled(true);
    }//GEN-LAST:event_payActionPerformed

    private void chanceycommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanceycommunityActionPerformed
        if (p.color.equalsIgnoreCase("ch")) {
            if (q.jugador == 1) {

                switch (r.flag) {

                    case "A":

                        if (r.id == 1 || r.id == 2) {
                            mova1 = 24;
                            p = moverLista(ptr, mova1);
                            mova1 = moverJugador(player1, mova1, mov);
                        }
                        if (r.id == 25 || r.id == 26) {
                            mova1 = 11;
                            p = moverLista(ptr, mova1);
                            mova1 = moverJugador(player1, mova1, mov);
                        }
                        if (r.id == 27 || r.id == 28) {
                            mova1 = 0;
                            p = moverLista(ptr, mova1);
                            mova1 = moverJugador(player1, mova1, mov);
                            showMessageDialog(null, "Recibes $200 por parte del banco por llegar a GO");
                             q.dinero = q.dinero + 200;
           
                        }
                        if (r.id == 19 || r.id == 20) {
                            mova1 = 5;
                            p = moverLista(ptr, mova1);
                            mova1 = moverJugador(player1, mova1, mov);
                        }
                        if (r.id == 21 || r.id == 22) {
                            mova1 = 39;
                            p = moverLista(ptr, mova1);
                            mova1 = moverJugador(player1, mova1, mov);
                        }
                        if (p.dueño != 0) {
                            dueño.setVisible(true);
                            dueño.setText("OWN: PLAYER" + p.dueño);
                        }

                        if (p.comprabilidad == 1 && p.dueño == 0) {
                            comprarpropiedad.setVisible(true);
                        } else {
                            if (p.dueño == q.jugador) {
                                venderpropiedad.setVisible(true);
                            }
                        }
                        if ((p.dueño != 0) && (p.dueño != q.jugador)) {
                            pay.setVisible(true);
                            pay.setText("PAY $" + p.alquiler);

                        }
                        Image casa = new ImageIcon(this.getClass().getResource(mova1 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casa));
                        break;

                    case "AD":

                        if (r.id >= 5 && r.id <= 8) {
                            if (mova1 == 7) {
                                mova1 = 15;
                                p = moverLista(ptr, mova1);
                                mova1 = moverJugador(player1, mova1, mov);
                            } else {
                                if (mova1 == 22) {
                                    mova1 = 25;
                                    p = moverLista(ptr, mova1);
                                    mova1 = moverJugador(player1, mova1, mov);
                                } else {
                                    if (mova1 == 36) {
                                        mova1 = 5;
                                        p = moverLista(ptr, mova1);
                                        mova1 = moverJugador(player1, mova1, mov);
                                    }
                                }
                            }

                        }

                        if (r.id == 15 || r.id == 16) {
                            if (mova1 == 7) {
                                mova1 = 12;
                                p = moverLista(ptr, mova1);
                                mova1 = moverJugador(player1, mova1, mov);
                            } else {
                                if (mova1 == 22) {
                                    mova1 = 28;
                                    p = moverLista(ptr, mova1);
                                    mova1 = moverJugador(player1, mova1, mov);
                                } else {
                                    if (mova1 == 36) {
                                        mova1 = 12;
                                        p = moverLista(ptr, mova1);
                                        mova1 = moverJugador(player1, mova1, mov);
                                    }
                                }
                            }

                        }
                        if (p.dueño != 0) {
                            dueño.setVisible(true);
                            dueño.setText("OWN: PLAYER" + p.dueño);
                        }

                        if (p.comprabilidad == 1 && p.dueño == 0) {
                            comprarpropiedad.setVisible(true);
                        } else {
                            if (p.dueño == q.jugador) {
                                venderpropiedad.setVisible(true);
                            }
                        }
                        if ((p.dueño != 0) && (p.dueño != q.jugador)) {
                            pay.setVisible(true);
                            pay.setText("PAY $" + p.alquiler);

                        }
                        Image casaa = new ImageIcon(this.getClass().getResource(mova1 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casaa));
                        break;

                    case "C":
                        q.dinero = q.dinero + toint(r.action);
                        cartas.setVisible(false);
                        break;

                    case "P":
                        q.dinero = q.dinero - toint(r.action);
                        cartas.setVisible(false);
                        break;

                    case "L":
                        q.cartaprision = 1;
                        cartas.setVisible(false);

                        break;

                    case "AA":
                        mova1 = mova1 - 3;
                        p = moverLista(ptr, mova1);
                        mova1 = moverJugador(player1, mova1, mov);
                        if (p.dueño != 0) {
                            dueño.setVisible(true);
                            dueño.setText("OWN: PLAYER" + p.dueño);
                        }

                        if (p.comprabilidad == 1 && p.dueño == 0) {
                            comprarpropiedad.setVisible(true);
                        } else {
                            if (p.dueño == q.jugador) {
                                venderpropiedad.setVisible(true);
                            }
                        }
                        if ((p.dueño != 0) && (p.dueño != q.jugador)) {
                            pay.setVisible(true);
                            pay.setText("PAY $" + p.alquiler);

                        }
                        Image casaaa = new ImageIcon(this.getClass().getResource(mova1 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casaaa));
                        break;

                    case "AC":
                        q.prisionero = 1;
                        mova1 = 10;
                        p = moverLista(ptr, mova1);
                        mova1 = moverJugador(player1, mova1, mov);
                        showMessageDialog(null, "Has sido enviado a la carcel!, desde el proximo turno tienes 3 intentos para sacar un doble y SER LIBRE");
                        break;

                    case "PA":
                        q.dinero = q.dinero - (q.casas * 25 + q.hoteles * 100);
                        cartas.setVisible(false);
                        break;

                    case "PJ":
                        q.dinero = q.dinero - 50;
                        q = moverListaJug(ptr1, q.jugador + 1);
                        q.dinero = q.dinero + 50;
                        cartas.setVisible(false);
                        break;
                }
            } else {
                switch (r.flag) {

                    case "A":

                        if (r.id == 1 || r.id == 2) {
                            mova2 = 24;
                            p = moverLista(ptr, mova2);
                            mova2 = moverJugador(player2, mova2, mov);
                        }
                        if (r.id == 25 || r.id == 26) {
                            mova2 = 11;
                            p = moverLista(ptr, mova2);
                            mova2 = moverJugador(player2, mova2, mov);
                        }
                        if (r.id == 27 || r.id == 28) {
                            mova2 = 0;
                            p = moverLista(ptr, mova2);
                            mova1 = moverJugador(player2, mova2, mov);
                            showMessageDialog(null, "Recibes $200 por parte del banco por llegar a GO");
                             q.dinero = q.dinero + 200;
                        }
                        if (r.id == 19 || r.id == 20) {
                            mova2 = 5;
                            p = moverLista(ptr, mova2);
                            mova2 = moverJugador(player2, mova2, mov);
                        }
                        if (r.id == 21 || r.id == 22) {
                            mova2 = 39;
                            p = moverLista(ptr, mova2);
                            mova2 = moverJugador(player2, mova2, mov);
                        }
                        if (p.dueño != 0) {
                            dueño.setVisible(true);
                            dueño.setText("OWN: PLAYER" + p.dueño);
                        }

                        if (p.comprabilidad == 1 && p.dueño == 0) {
                            comprarpropiedad.setVisible(true);
                        } else {
                            if (p.dueño == q.jugador) {
                                venderpropiedad.setVisible(true);
                            }
                        }
                        if ((p.dueño != 0) && (p.dueño != q.jugador)) {
                            pay.setVisible(true);
                            pay.setText("PAY $" + p.alquiler);

                        }
                        Image casa = new ImageIcon(this.getClass().getResource(mova2 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casa));
                        break;

                    case "AD":

                        if (r.id >= 5 && r.id <= 8) {
                            if (mova2 == 7) {
                                mova2 = 15;
                                p = moverLista(ptr, mova2);
                                mova2 = moverJugador(player2, mova2, mov);
                            } else {
                                if (mova2 == 22) {
                                    mova2 = 25;
                                    p = moverLista(ptr, mova2);
                                    mova2 = moverJugador(player2, mova2, mov);
                                } else {
                                    if (mova2 == 36) {
                                        mova2 = 5;
                                        p = moverLista(ptr, mova2);
                                        mova2 = moverJugador(player2, mova2, mov);
                                    }
                                }
                            }

                        }

                        if (r.id == 15 || r.id == 16) {
                            if (mova2 == 7) {
                                mova2 = 12;
                                p = moverLista(ptr, mova1);
                                mova2 = moverJugador(player2, mova2, mov);
                            } else {
                                if (mova2 == 22) {
                                    mova2 = 28;
                                    p = moverLista(ptr, mova2);
                                    mova2 = moverJugador(player2, mova2, mov);
                                } else {
                                    if (mova2 == 36) {
                                        mova2 = 12;
                                        p = moverLista(ptr, mova2);
                                        mova2 = moverJugador(player2, mova2, mov);
                                    }
                                }
                            }

                        }
                        if (p.dueño != 0) {
                            dueño.setVisible(true);
                            dueño.setText("OWN: PLAYER" + p.dueño);
                        }

                        if (p.comprabilidad == 1 && p.dueño == 0) {
                            comprarpropiedad.setVisible(true);
                        } else {
                            if (p.dueño == q.jugador) {
                                venderpropiedad.setVisible(true);
                            }
                        }
                        if ((p.dueño != 0) && (p.dueño != q.jugador)) {
                            pay.setVisible(true);
                            pay.setText("PAY $" + p.alquiler);

                        }
                        Image casaa = new ImageIcon(this.getClass().getResource(mova2 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casaa));
                        break;

                    case "C":
                        q.dinero = q.dinero + toint(r.action);
                        cartas.setVisible(false);
                        break;

                    case "P":
                        q.dinero = q.dinero - toint(r.action);
                        cartas.setVisible(false);
                        break;

                    case "L":
                        q.cartaprision = 1;
                        cartas.setVisible(false);
                        break;

                    case "AA":
                        mova2 = mova1 - 3;
                        p = moverLista(ptr, mova2);
                        mova2 = moverJugador(player2, mova2, mov);
                        if (p.dueño != 0) {
                            dueño.setVisible(true);
                            dueño.setText("OWN: PLAYER" + p.dueño);
                        }

                        if (p.comprabilidad == 1 && p.dueño == 0) {
                            comprarpropiedad.setVisible(true);
                        } else {
                            if (p.dueño == q.jugador) {
                                venderpropiedad.setVisible(true);
                            }
                        }
                        if ((p.dueño != 0) && (p.dueño != q.jugador)) {
                            pay.setVisible(true);
                            pay.setText("PAY $" + p.alquiler);

                        }
                        Image casaaa = new ImageIcon(this.getClass().getResource(mova2 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casaaa));
                        break;

                    case "AC":
                        q.prisionero = 1;
                        mova2 = 10;
                        p = moverLista(ptr, mova2);
                        mova2 = moverJugador(player2, mova2, mov);
                        showMessageDialog(null, "Has sido enviado a la carcel!, desde el proximo turno tienes 3 intentos para sacar un doble y SER LIBRE");
                        break;

                    case "PA":
                        q.dinero = q.dinero - (q.casas * 25 + q.hoteles * 100);
                        cartas.setVisible(false);
                        break;

                    case "PJ":
                        q.dinero = q.dinero - 50;
                        q = moverListaJug(ptr1, q.jugador + 1);
                        q.dinero = q.dinero + 50;
                        cartas.setVisible(false);
                        break;
                }

            }
        }
        if (p.color.equalsIgnoreCase("ac")) {
            if (q.jugador == 1) {

                switch (s.flag) {

                    case "A":

                        mova1 = 0;
                        p = moverLista(ptr, mova1);
                        mova1 = moverJugador(player1, mova1, mov);
                        Image casa = new ImageIcon(this.getClass().getResource(mova1 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casa));
                        showMessageDialog(null, "Recibes $200 por parte del banco por llegar a GO");
                        q.dinero = q.dinero + 200;
                        break;

                    case "CJ":
                        q.dinero = q.dinero + 50;
                        q = moverListaJug(ptr1, q.jugador + 1);
                        q.dinero = q.dinero - 50;

                        break;

                    case "C":
                        q.dinero = q.dinero + toint(s.action);
                        cartas.setVisible(false);
                        break;

                    case "P":
                        q.dinero = q.dinero - toint(s.action);
                        cartas.setVisible(false);
                        break;

                    case "L":
                        q.cartaprision = 1;
                        cartas.setVisible(false);
                        break;

                    case "AC":
                        q.prisionero = 1;
                        mova1 = 10;
                        p = moverLista(ptr, mova1);
                        mova1 = moverJugador(player1, mova1, mov);
                        showMessageDialog(null, "Has sido enviado a la carcel!, desde el proximo turno tienes 3 intentos para sacar un doble y SER LIBRE");
                        break;

                    case "PA":
                        q.dinero = q.dinero - (q.casas * 40 + q.hoteles * 115);
                        cartas.setVisible(false);
                        break;

                }
            } else {
                switch (s.flag) {

                    case "A":

                        mova2 = 0;
                        p = moverLista(ptr, mova2);
                        mova2 = moverJugador(player2, mova2, mov);
                        Image casa = new ImageIcon(this.getClass().getResource(mova2 + ".png")).getImage();
                        cartas.setIcon(new ImageIcon(casa));
                        showMessageDialog(null, "Recibes $200 por parte del banco por llegar a GO");
                             q.dinero = q.dinero + 200;
                        break;

                    case "CJ":
                        q.dinero = q.dinero + 50;
                        q = moverListaJug(ptr1, q.jugador + 1);
                        q.dinero = q.dinero - 50;

                        break;

                    case "C":
                        q.dinero = q.dinero + toint(s.action);
                        cartas.setVisible(false);
                        break;

                    case "P":
                        q.dinero = q.dinero - toint(s.action);
                        cartas.setVisible(false);
                        break;

                    case "L":
                        q.cartaprision = 1;
                        cartas.setVisible(false);
                        break;

                    case "AC":
                        q.prisionero = 1;
                        mova2 = 10;
                        p = moverLista(ptr, mova2);
                        mova2 = moverJugador(player2, mova2, mov);
                        showMessageDialog(null, "Has sido enviado a la carcel!, desde el proximo turno tienes 3 intentos para sacar un doble y SER LIBRE");
                        break;

                    case "PA":
                        q.dinero = q.dinero - (q.casas * 40 + q.hoteles * 115);
                        cartas.setVisible(false);
                        break;

                }
            }
        }
        chanceycommunity.setVisible(false);
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);
        pasarturno.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_chanceycommunityActionPerformed

    private void venderpropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderpropiedadActionPerformed
        if (turno % 2 == 0) {
            p = moverLista(ptr, mova1);
        } else {
            p = moverLista(ptr, mova2);
        }
        q.dinero = q.dinero + p.hipoteca;
        p.dueño = 0;
        venderpropiedad.setVisible(false);
        dueño.setVisible(false);
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);
    }//GEN-LAST:event_venderpropiedadActionPerformed

    private void comprarcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarcasaActionPerformed
        buscarMonopolio(ptr, q.jugador);
        /*q.dinero = q.dinero - p.casc;
        p.casas = p.casas + 1;

        q.casas = q.casas + 1;*/
        a = q.jugador;
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);
        comprarcasa.setVisible(false);
        q = moverListaJug(ptr1, a);
        showMessageDialog(null, "Señale la propiedad a la que desea comprarle una casa, apareceran repitandas de su color las propiedades disponibles");
    }//GEN-LAST:event_comprarcasaActionPerformed

    private void comprarhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarhotelActionPerformed
        buscarHotel(ptr, q.jugador);
        h = 1;
        /*q.dinero = q.dinero - p.casc;
        p.casas = p.casas + 1;

        q.casas = q.casas + 1;*/
        a = q.jugador;
        q = moverListaJug(ptr1, 1);
        moneyp1.setText("" + q.dinero);
        q = moverListaJug(ptr1, 2);
        moneyp2.setText("" + q.dinero);
        comprarhotel.setVisible(false);
        q = moverListaJug(ptr1, a);
        showMessageDialog(null, "Señale la propiedad a la que desea comprarle un hotel, apareceran repitandas de su color las propiedades disponibles");

    }//GEN-LAST:event_comprarhotelActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed

        p = moverLista(ptr, 1);
        if (cp1 <= 3) {
            if (Cuadrosino("Desea comprar una casa en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE CASA")) {
                if (buscarCasas(ptr, p.color, cp1)) {
                    cp1 = cp1 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p1.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE HOTEL")) {
                    if (p.hotel == 0) {
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        p.hotel = 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                } else {
                    deshabilitarMonopolio(ptr, q.jugador);
                    comprarcasa.setVisible(true);
                }
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        p = moverLista(ptr, 3);
        if (cp3 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp3)) {
                    cp3 = cp3 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p3.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }


    }//GEN-LAST:event_p3ActionPerformed

    private void p19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19ActionPerformed
        p = moverLista(ptr, 19);
        if (cp19 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp19)) {
                    cp19 = cp19 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p19.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }


    }//GEN-LAST:event_p19ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        p = moverLista(ptr, 6);
        if (cp6 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp6)) {
                    cp6 = cp6 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p6.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }


    }//GEN-LAST:event_p6ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        p = moverLista(ptr, 8);
        if (cp8 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp8)) {
                    cp8 = cp8 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p8.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }


    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        p = moverLista(ptr, 9);
        if (cp9 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp9)) {
                    cp9 = cp9 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p9.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p9ActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        p = moverLista(ptr, 11);
        if (cp11 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp11)) {
                    cp11 = cp11 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p11.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p11ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        p = moverLista(ptr, 13);
        if (cp13 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp13)) {
                    cp13 = cp13 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p13.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p13ActionPerformed

    private void p14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14ActionPerformed
        p = moverLista(ptr, 14);
        if (cp14 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp14)) {
                    cp14 = cp14 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p14.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p14ActionPerformed

    private void p16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16ActionPerformed
        p = moverLista(ptr, 16);
        if (cp16 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp16)) {
                    cp16 = cp16 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p16.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }


    }//GEN-LAST:event_p16ActionPerformed

    private void p18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p18ActionPerformed
        p = moverLista(ptr, 18);
        if (cp18 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp18)) {
                    cp18 = cp18 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p18.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p18ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
        p = moverLista(ptr, 21);
        if (cp21 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp21)) {
                    cp21 = cp21 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p21.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p21ActionPerformed

    private void p23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p23ActionPerformed
        p = moverLista(ptr, 23);
        if (cp23 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp23)) {
                    cp23 = cp23 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p23.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p23ActionPerformed

    private void p24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p24ActionPerformed
        p = moverLista(ptr, 24);
        if (cp24 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp24)) {
                    cp24 = cp24 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p24.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p24ActionPerformed

    private void p26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p26ActionPerformed
        p = moverLista(ptr, 26);
        if (cp26 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp26)) {
                    cp26 = cp26 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p26.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p26ActionPerformed

    private void p27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p27ActionPerformed
        p = moverLista(ptr, 27);
        if (cp27 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp27)) {
                    cp27 = cp27 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p27.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p27ActionPerformed

    private void p29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p29ActionPerformed
        p = moverLista(ptr, 29);
        if (cp29 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp29)) {
                    cp29 = cp29 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p29.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p29ActionPerformed

    private void p31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p31ActionPerformed
        p = moverLista(ptr, 31);
        if (cp31 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp31)) {
                    cp31 = cp31 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p31.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p31ActionPerformed

    private void p32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p32ActionPerformed
        p = moverLista(ptr, 32);
        if (cp32 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp32)) {
                    cp32 = cp32 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p32.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p32ActionPerformed

    private void p34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p34ActionPerformed
        p = moverLista(ptr, 34);
        if (cp34 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp34)) {
                    cp34 = cp34 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p34.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p34ActionPerformed

    private void p37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p37ActionPerformed
        p = moverLista(ptr, 37);
        if (cp37 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp37)) {
                    cp37 = cp37 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p37.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p37ActionPerformed

    private void p39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p39ActionPerformed
        p = moverLista(ptr, 39);
        if (cp39 <= 3) {
            if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.casc, "COMPRA DE HOTEL")) {
                if (buscarCasas(ptr, p.color, cp39)) {
                    cp39 = cp39 + 1;
                    p.casas = p.casas + 1;
                    q.dinero = q.dinero - p.casc;
                    if (casanow.equals(p.nombre)) {
                        casas.setVisible(true);
                        casas.setText("#CASAS: " + p.casas);
                    }
                    deshabilitarMonopolio(ptr, q.jugador);
                    a = q.jugador;
                    q = moverListaJug(ptr1, 1);
                    moneyp1.setText("" + q.dinero);
                    q = moverListaJug(ptr1, 2);
                    moneyp2.setText("" + q.dinero);
                    comprarcasa.setVisible(true);
                    q = moverListaJug(ptr1, a);
                    p39.setVisible(false);
                    botonCompraHotel(ptr, q.jugador);
                    showMessageDialog(null, "Casa comprada");
                } else {
                    showMessageDialog(null, "El número de casas debe ser igual en todas las propiedades de este color");

                }
            } else {
                deshabilitarMonopolio(ptr, q.jugador);
                comprarcasa.setVisible(true);
            }
        } else {
            if (h == 0) {
                showMessageDialog(null, "Ya ha alcanzado el número máximo de casas en esta propiedad");
            } else {
                if (Cuadrosino("Desea comprar un hotel en " + p.nombre + " por el valor de $" + p.hotc, "COMPRA DE CASA")) {
                    if (p.hotel == 0) {
                        p.hotel = 1;
                        q.dinero = q.dinero - p.hotc;
                        q.hoteles = q.hoteles + 1;
                        comprarhotel.setVisible(true);
                        deshabilitarMonopolio(ptr, q.jugador);
                        showMessageDialog(null, "Hotel comprado");
                    } else {
                        showMessageDialog(null, "Ya ha alcanzado el número máximo de hoteles en esta propiedad");
                    }
                }
            }

        }

    }//GEN-LAST:event_p39ActionPerformed

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
            java.util.logging.Logger.getLogger(Monopolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monopolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monopolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monopolio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Monopolio().setVisible(true);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Monopolio.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    void datapropiedades() {

        String[] data = new String[50];
        // String data[] = line.split(";");    
    }

    int moverJugador(JLabel label, int mova, int mov) {
        int posx, posy;

        if (mova <= 10) {

            posx = 630 - (60 * mova);
            posy = 620;
            label.setLocation(posx, posy);
            mov = mov + mova;
        } else {
            if (mova <= 20 && mova >= 11) {
                mov = mova - 10;
                posx = 17;
                posy = 620 - (60 * mov);
                label.setLocation(posx, posy);
            } else {
                if (mova <= 30 && mova >= 21) {
                    mov = mova - 20;
                    posx = 17 + (60 * mov);
                    posy = 20;
                    label.setLocation(posx, posy);
                } else {
                    if (mova <= 40 && mova >= 31) {
                        mov = mova - 30;
                        posx = 630;
                        posy = 20 + (60 * mov);
                        label.setLocation(posx, posy);
                    } else {
                        if (mova > 40) {
                            mov = mova - 40;
                            mova = mova - 40;

                            posx = 630 - (60 * mov);
                            posy = 620;
                            label.setLocation(posx, posy);
                        }

                    }
                }
            }
        }

        return mova;
    }

    Nodo moverLista(Nodo ptr, int mova) {
        Nodo p = ptr;
        int u = 0;

        while (u < mova) {
            p = p.link;
            u = u + 1;
        }
        return p;
    }

    int buscarLista(Nodo ptr, String color) {
        Nodo p = ptr;
        int u = 0;
        p = p.link;
        while (p != ptr) {
            if (p.color.equalsIgnoreCase(color) && p.dueño == q.jugador) {
                u = u + 1;
            }
            p = p.link;

        }
        return u;
    }

    boolean buscarCasas(Nodo ptr, String color, int x) {
        Nodo p = ptr;
        // int u = 0;

        p = p.link;
        while (p != ptr) {
            if (p.color.equalsIgnoreCase(color) && p.casas < x) {
                return false;
            }
            p = p.link;

        }
        return true;
    }

    void buscarMonopolio(Nodo ptr, int jug) {
        Nodo p = ptr;
        int u = 0;
        Nodo q = p.link;
        p = q.link;

        while (p != ptr) {

            if (q.color.equalsIgnoreCase(p.color) && p.dueño == jug && q.dueño == jug) {
                u = u + 1;
            }
            if (!p.color.equalsIgnoreCase("u") && !p.color.equalsIgnoreCase("go") && !p.color.equalsIgnoreCase("no") && !p.color.equalsIgnoreCase("goj") && !p.color.equalsIgnoreCase("F") && !p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac") && !p.color.equalsIgnoreCase("pa")) {
                if (!q.color.equalsIgnoreCase(p.color)) {

                    if (!q.color.equalsIgnoreCase("hg") && !q.color.equalsIgnoreCase("db")) {
                        if (u == 2) {
                            if (buscarCasas(ptr, q.color, 4)) {
                                comprarhotel.setVisible(true);
                            }
                            u = 0;
                            if (q.color.equalsIgnoreCase("lb")) {
                                p6.setVisible(true);
                                p8.setVisible(true);
                                p9.setVisible(true);
                            }
                            if (q.color.equalsIgnoreCase("p")) {
                                p11.setVisible(true);
                                p13.setVisible(true);
                                p14.setVisible(true);
                            }
                            if (q.color.equalsIgnoreCase("o")) {
                                p16.setVisible(true);
                                p18.setVisible(true);
                                p19.setVisible(true);
                            }
                            if (q.color.equalsIgnoreCase("r")) {
                                p21.setVisible(true);
                                p23.setVisible(true);
                                p24.setVisible(true);
                            }
                            if (q.color.equalsIgnoreCase("a")) {
                                p26.setVisible(true);
                                p27.setVisible(true);
                                p29.setVisible(true);
                            }
                            if (q.color.equalsIgnoreCase("g")) {
                                p31.setVisible(true);
                                p32.setVisible(true);
                                p34.setVisible(true);
                            }
                        } else {
                            u = 0;
                        }
                        q = p;

                    } else {
                        if (u == 1) {
                            if (buscarCasas(ptr, q.color, 4)) {
                                comprarhotel.setVisible(true);
                            }
                            u = 0;
                            if (q.color.equalsIgnoreCase("hg")) {
                                p1.setVisible(true);
                                p3.setVisible(true);

                            }
                            if (q.color.equalsIgnoreCase("db")) {
                                p37.setVisible(true);
                                p39.setVisible(true);

                            }
                        } else {
                            u = 0;
                        }
                        q = p;
                    }
                }
            }
            p = p.link;

        }

        // return true;
    }

    void buscarHotel(Nodo ptr, int jug) {
        Nodo p = ptr;
        int u = 0;
        Nodo q = p.link;
        p = q.link;

        while (p != ptr) {

            if (q.color.equalsIgnoreCase(p.color) && p.dueño == jug) {
                u = u + 1;
            }
            if (!p.color.equalsIgnoreCase("u") && !p.color.equalsIgnoreCase("go") && !p.color.equalsIgnoreCase("no") && !p.color.equalsIgnoreCase("goj") && !p.color.equalsIgnoreCase("F") && !p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac") && !p.color.equalsIgnoreCase("pa")) {
                if (!q.color.equalsIgnoreCase(p.color)) {

                    if (!q.color.equalsIgnoreCase("hg") && !q.color.equalsIgnoreCase("db")) {
                        if (u == 2) {

                            u = 0;
                            if (q.color.equalsIgnoreCase("lb")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p6.setVisible(true);
                                    p8.setVisible(true);
                                    p9.setVisible(true);
                                }

                            }
                            if (q.color.equalsIgnoreCase("p")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p11.setVisible(true);
                                    p13.setVisible(true);
                                    p14.setVisible(true);
                                }
                            }
                            if (q.color.equalsIgnoreCase("o")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p16.setVisible(true);
                                    p18.setVisible(true);
                                    p19.setVisible(true);
                                }
                            }
                            if (q.color.equalsIgnoreCase("r")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p21.setVisible(true);
                                    p23.setVisible(true);
                                    p24.setVisible(true);
                                }
                            }
                            if (q.color.equalsIgnoreCase("a")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p26.setVisible(true);
                                    p27.setVisible(true);
                                    p29.setVisible(true);
                                }
                            }
                            if (q.color.equalsIgnoreCase("g")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p31.setVisible(true);
                                    p32.setVisible(true);
                                    p34.setVisible(true);
                                }
                            }
                        } else {
                            u = 0;
                        }
                        q = p;

                    } else {
                        if (u == 1) {

                            u = 0;
                            if (q.color.equalsIgnoreCase("hg")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p1.setVisible(true);
                                    p3.setVisible(true);
                                }
                            }
                            if (q.color.equalsIgnoreCase("db")) {
                                if (buscarCasas(ptr, q.color, 4)) {
                                    p37.setVisible(true);
                                    p39.setVisible(true);
                                }
                            }
                        } else {
                            u = 0;
                        }
                        q = p;
                    }
                }
            }
            p = p.link;

        }

        // return true;
    }

    void botonCompraHotel(Nodo ptr, int jug) {
        Nodo p = ptr;
        int u = 0;
        Nodo q = p.link;
        p = q.link;

        while (p != ptr) {

            if (q.color.equalsIgnoreCase(p.color) && p.dueño == jug && q.dueño == jug) {
                u = u + 1;
            }
            if (!p.color.equalsIgnoreCase("u") && !p.color.equalsIgnoreCase("go") && !p.color.equalsIgnoreCase("no") && !p.color.equalsIgnoreCase("goj") && !p.color.equalsIgnoreCase("F") && !p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac") && !p.color.equalsIgnoreCase("pa")) {
                if (!q.color.equalsIgnoreCase(p.color)) {

                    if (!q.color.equalsIgnoreCase("hg") && !q.color.equalsIgnoreCase("db")) {
                        if (u == 2) {
                            if (buscarCasas(ptr, q.color, 4)) {
                                comprarhotel.setVisible(true);
                            }

                            u = 0;

                        } else {
                            u = 0;
                        }
                        q = p;

                    } else {
                        if (u == 1) {
                            if (buscarCasas(ptr, q.color, 4)) {
                                comprarhotel.setVisible(true);
                            }
                            u = 0;

                        } else {
                            u = 0;
                        }
                        q = p;
                    }
                }
            }
            p = p.link;

        }

        // return true;
    }

    void deshabilitarMonopolio(Nodo ptr, int jug) {
        Nodo p = ptr;
        int u = 0;
        Nodo q = p.link;
        p = q.link;

        while (p != ptr) {

            if (q.color.equalsIgnoreCase(p.color) && p.dueño == jug) {
                u = u + 1;
            }
            if (!p.color.equalsIgnoreCase("u") && !p.color.equalsIgnoreCase("go") && !p.color.equalsIgnoreCase("no") && !p.color.equalsIgnoreCase("goj") && !p.color.equalsIgnoreCase("F") && !p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac") && !p.color.equalsIgnoreCase("pa")) {
                if (!q.color.equalsIgnoreCase(p.color)) {

                    if (!q.color.equalsIgnoreCase("hg") && !q.color.equalsIgnoreCase("db")) {
                        if (u == 2) {

                            u = 0;
                            if (q.color.equalsIgnoreCase("lb")) {
                                p6.setVisible(false);
                                p8.setVisible(false);
                                p9.setVisible(false);
                            }
                            if (q.color.equalsIgnoreCase("p")) {
                                p11.setVisible(false);
                                p13.setVisible(false);
                                p14.setVisible(false);
                            }
                            if (q.color.equalsIgnoreCase("o")) {
                                p16.setVisible(false);
                                p18.setVisible(false);
                                p19.setVisible(false);
                            }
                            if (q.color.equalsIgnoreCase("r")) {
                                p21.setVisible(false);
                                p23.setVisible(false);
                                p24.setVisible(false);
                            }
                            if (q.color.equalsIgnoreCase("a")) {
                                p26.setVisible(false);
                                p27.setVisible(false);
                                p29.setVisible(false);
                            }
                            if (q.color.equalsIgnoreCase("g")) {
                                p31.setVisible(false);
                                p32.setVisible(false);
                                p34.setVisible(false);
                            }
                        } else {
                            u = 0;
                        }
                        q = p;

                    } else {
                        if (u == 1) {

                            u = 0;
                            if (q.color.equalsIgnoreCase("hg")) {
                                p1.setVisible(false);
                                p3.setVisible(false);

                            }
                            if (q.color.equalsIgnoreCase("db")) {
                                p37.setVisible(false);
                                p39.setVisible(false);

                            }
                        } else {
                            u = 0;
                        }
                        q = p;
                    }
                }
            }
            p = p.link;

        }

        // return true;
    }

    void botonComprarcasa(Nodo ptr, int jug) {
        Nodo p = ptr;
        int u = 0;
        Nodo q = p.link;
        p = q.link;

        while (p != ptr) {

            if (q.color.equalsIgnoreCase(p.color) && p.dueño == jug && q.dueño == jug) {
                u = u + 1;
                System.out.println(p.nombre);
            }
            if (!p.color.equalsIgnoreCase("u") && !p.color.equalsIgnoreCase("go") && !p.color.equalsIgnoreCase("no") && !p.color.equalsIgnoreCase("goj") && !p.color.equalsIgnoreCase("F") && !p.color.equalsIgnoreCase("ch") && !p.color.equalsIgnoreCase("ac") && !p.color.equalsIgnoreCase("pa")) {
                if (!q.color.equalsIgnoreCase(p.color)) {

                    if (!q.color.equalsIgnoreCase("hg") && !q.color.equalsIgnoreCase("db")) {
                        if (u == 2) {

                            comprarcasa.setVisible(true);
                            u = 0;

                        } else {
                            u = 0;
                        }
                        q = p;

                    } else {
                        if (u == 1) {
                            comprarcasa.setVisible(true);
                            u = 0;

                        } else {
                            u = 0;
                        }
                        q = p;
                    }
                }
            }
            p = p.link;

        }

        // return true;
    }

    boolean Cuadrosino(String texto, String nombrecuadro) {
        int dialogButton = 0;
        dialogButton = JOptionPane.showConfirmDialog(null, texto, nombrecuadro, dialogButton);
        if (dialogButton == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    NodoJug moverListaJug(NodoJug ptr, int j) {
        NodoJug p = ptr;
        int u = 1;

        while (u < j) {
            p = p.link;
            u = u + 1;
        }
        return p;
    }

    NodoCh moverListaCh(NodoCh ptr, int ch) {
        NodoCh p = ptr;
        int u = 1;
        while (u < ch) {
            p = p.link;
            u = u + 1;
        }
        return p;
    }

    NodoCq moverListaCq(NodoCq ptr, int ch) {
        NodoCq p = ptr;
        int u = 1;
        while (u < ch) {
            p = p.link;
            u = u + 1;
        }
        return p;
    }

    int toint(String s) {
        int x;
        x = Integer.parseInt(s);
        return x;
    }

    void dadosImagen(int valor, JLabel label) {
        switch (valor) {
            case 1:
                Image dado1 = new ImageIcon(this.getClass().getResource("dado1.png")).getImage();
                label.setIcon(new ImageIcon(dado1));
                break;
            case 2:
                Image dado2 = new ImageIcon(this.getClass().getResource("dado2.png")).getImage();
                label.setIcon(new ImageIcon(dado2));
                break;
            case 3:
                Image dado3 = new ImageIcon(this.getClass().getResource("dado3.png")).getImage();
                label.setIcon(new ImageIcon(dado3));
                break;
            case 4:
                Image dado4 = new ImageIcon(this.getClass().getResource("dado4.png")).getImage();
                label.setIcon(new ImageIcon(dado4));
                break;
            case 5:
                Image dado5 = new ImageIcon(this.getClass().getResource("dado5.png")).getImage();
                label.setIcon(new ImageIcon(dado5));
                break;
            case 6:
                Image dado6 = new ImageIcon(this.getClass().getResource("dado6.png")).getImage();
                label.setIcon(new ImageIcon(dado6));
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartas;
    private javax.swing.JLabel casas;
    private javax.swing.JButton chanceycommunity;
    private javax.swing.JButton comprarcasa;
    private javax.swing.JButton comprarhotel;
    private javax.swing.JButton comprarpropiedad;
    private javax.swing.JLabel daditos;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dueño;
    private javax.swing.JLabel imagturno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel moneyp1;
    private javax.swing.JLabel moneyp2;
    private javax.swing.JButton p1;
    private javax.swing.JButton p11;
    private javax.swing.JButton p13;
    private javax.swing.JButton p14;
    private javax.swing.JButton p16;
    private javax.swing.JButton p18;
    private javax.swing.JButton p19;
    private javax.swing.JButton p21;
    private javax.swing.JButton p23;
    private javax.swing.JButton p24;
    private javax.swing.JButton p26;
    private javax.swing.JButton p27;
    private javax.swing.JButton p29;
    private javax.swing.JButton p3;
    private javax.swing.JButton p31;
    private javax.swing.JButton p32;
    private javax.swing.JButton p34;
    private javax.swing.JButton p37;
    private javax.swing.JButton p39;
    private javax.swing.JButton p6;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private java.awt.Panel panel1;
    private javax.swing.JButton pasarturno;
    private javax.swing.JButton pay;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel playern;
    private javax.swing.JLabel playern1;
    private javax.swing.JButton tirardados;
    private javax.swing.JLabel turnos;
    private javax.swing.JButton venderpropiedad;
    // End of variables declaration//GEN-END:variables
}
