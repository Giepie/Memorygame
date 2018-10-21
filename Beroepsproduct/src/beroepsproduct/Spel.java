package beroepsproduct;

import java.awt.Color;



public class Spel extends javax.swing.JDialog {
    public static int [][] plaats = {{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5}};
    public static int eersteI = 0;
    public static int eersteJ = 0;
    public static int optellen = 0;
    public static int score1 = 0;
    public static int score2 = 0;
    public static int totaalkeren = 0;
    public static int foutekeren = 0;
    public static int goed = 0;
    public static int teller = 0;
    
     
    
    public void resetgame() {
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        btn9.setVisible(true);
        btn10.setVisible(true);
        btn11.setVisible(true);
        btn12.setVisible(true);
        btn13.setVisible(true);
        btn14.setVisible(true);
        btn15.setVisible(true);
        btn16.setVisible(true);
        btn17.setVisible(true);
        btn18.setVisible(true);
        btn19.setVisible(true);
        btn20.setVisible(true);
        btn21.setVisible(true);
        btn22.setVisible(true);
        btn23.setVisible(true);
        btn24.setVisible(true);
        btn25.setVisible(true);
        btn26.setVisible(true);
        btn27.setVisible(true);
        btn28.setVisible(true);
        btn29.setVisible(true);
        btn30.setVisible(true);
        btn31.setVisible(true);
        btn32.setVisible(true);
        btn33.setVisible(true);
        btn34.setVisible(true);
        btn35.setVisible(true);
        btn36.setVisible(true);
        reset();
        score1 = 0;
        score2 = 0;
        lblScore3.setText(" "+ score1);
        lblScore4.setText(" "+ score2);
        btnBeurt1.setBackground(Color.GREEN);
        btnBeurt2.setBackground(Color.WHITE);
        foutekeren = 0;
        goed = 0;
        totaalkeren= 0;
        eersteI = 0;
        eersteJ = 0;
        teller = 0;
        
    }
    
    public void reset() {

        btn1.setLabel(" ");
        btn2.setLabel(" ");
        btn3.setLabel(" ");
        btn4.setLabel(" ");
        btn5.setLabel(" ");
        btn6.setLabel(" ");
        btn7.setLabel(" ");
        btn8.setLabel(" ");
        btn9.setLabel(" ");
        btn10.setLabel(" ");
        btn11.setLabel(" ");
        btn12.setLabel(" ");
        btn13.setLabel(" ");
        btn14.setLabel(" ");
        btn15.setLabel(" ");
        btn16.setLabel(" ");
        btn17.setLabel(" ");
        btn18.setLabel(" ");
        btn19.setLabel(" ");
        btn20.setLabel(" ");
        btn21.setLabel(" ");
        btn22.setLabel(" ");
        btn23.setLabel(" ");
        btn24.setLabel(" ");
        btn25.setLabel(" ");
        btn26.setLabel(" ");
        btn27.setLabel(" ");
        btn28.setLabel(" ");
        btn29.setLabel(" ");
        btn30.setLabel(" ");
        btn31.setLabel(" ");
        btn32.setLabel(" ");
        btn33.setLabel(" ");
        btn34.setLabel(" ");
        btn35.setLabel(" ");
        btn36.setLabel(" ");
        eersteI = 0;
        eersteJ = 0;
        

    }
    
    
    public Spel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblSpeler3.setText("" + start.txtNaam1.getText());
        lblSpeler4.setText("" + start.txtNaam2.getText());
        lblScore3.setText("" + score1);
        lblScore4.setText("" + score2);
        resetgame();
    }
    
    public void eindespel() {
    if((score1)+(score2)>= 18) {
        this.dispose();
        Eindespel scherm = new Eindespel();
        scherm.setVisible(true);
    }
    
}
    
    public void wait(int time) {
        try {
           Thread.sleep(time);
        } 
        catch(InterruptedException e) {
           throw new RuntimeException(" ", e);
        }
    }
    
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plSpelers = new java.awt.Panel();
        lblSpeler1 = new javax.swing.JLabel();
        lblSpeler2 = new javax.swing.JLabel();
        lblSpeler3 = new javax.swing.JLabel();
        lblSpeler4 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblScore3 = new javax.swing.JLabel();
        lblScore4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        plTop = new java.awt.Panel();
        btnAfsluiten = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBeurt1 = new javax.swing.JButton();
        btnBeurt2 = new javax.swing.JButton();
        btn1 = new java.awt.Button();
        btn2 = new java.awt.Button();
        btn3 = new java.awt.Button();
        btn4 = new java.awt.Button();
        btn5 = new java.awt.Button();
        btn6 = new java.awt.Button();
        btn7 = new java.awt.Button();
        btn8 = new java.awt.Button();
        btn9 = new java.awt.Button();
        btn10 = new java.awt.Button();
        btn11 = new java.awt.Button();
        btn12 = new java.awt.Button();
        btn13 = new java.awt.Button();
        btn14 = new java.awt.Button();
        btn15 = new java.awt.Button();
        btn16 = new java.awt.Button();
        btn17 = new java.awt.Button();
        btn18 = new java.awt.Button();
        btn19 = new java.awt.Button();
        btn20 = new java.awt.Button();
        btn21 = new java.awt.Button();
        btn22 = new java.awt.Button();
        btn23 = new java.awt.Button();
        btn24 = new java.awt.Button();
        btn25 = new java.awt.Button();
        btn26 = new java.awt.Button();
        btn27 = new java.awt.Button();
        btn28 = new java.awt.Button();
        btn29 = new java.awt.Button();
        btn30 = new java.awt.Button();
        btn31 = new java.awt.Button();
        btn32 = new java.awt.Button();
        btn33 = new java.awt.Button();
        btn34 = new java.awt.Button();
        btn35 = new java.awt.Button();
        btn36 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        plSpelers.setBackground(new java.awt.Color(0, 51, 102));

        lblSpeler1.setBackground(new java.awt.Color(255, 255, 255));
        lblSpeler1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSpeler1.setForeground(new java.awt.Color(255, 255, 255));
        lblSpeler1.setText("Speler 1:");

        lblSpeler2.setBackground(new java.awt.Color(255, 255, 255));
        lblSpeler2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSpeler2.setForeground(new java.awt.Color(255, 255, 255));
        lblSpeler2.setText("Speler 2:");

        lblSpeler3.setBackground(new java.awt.Color(255, 255, 255));
        lblSpeler3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSpeler3.setForeground(new java.awt.Color(255, 255, 255));
        lblSpeler3.setText(" ");

        lblSpeler4.setBackground(new java.awt.Color(255, 255, 255));
        lblSpeler4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSpeler4.setForeground(new java.awt.Color(255, 255, 255));
        lblSpeler4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSpeler4.setText(" ");

        lblScore1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore1.setForeground(new java.awt.Color(255, 255, 255));
        lblScore1.setText("Score:");

        lblScore2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore2.setForeground(new java.awt.Color(255, 255, 255));
        lblScore2.setText("Score:");

        lblScore3.setBackground(new java.awt.Color(255, 255, 255));
        lblScore3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore3.setForeground(new java.awt.Color(255, 255, 255));
        lblScore3.setText(" ");

        lblScore4.setBackground(new java.awt.Color(255, 255, 255));
        lblScore4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore4.setForeground(new java.awt.Color(255, 255, 255));
        lblScore4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblScore4.setText(" ");

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alle kaarten op? druk nog een keer op beurt om resultaaten te krijgen!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout plSpelersLayout = new javax.swing.GroupLayout(plSpelers);
        plSpelers.setLayout(plSpelersLayout);
        plSpelersLayout.setHorizontalGroup(
            plSpelersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSpelersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSpelersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plSpelersLayout.createSequentialGroup()
                        .addComponent(lblSpeler1)
                        .addGap(80, 80, 80)
                        .addComponent(lblScore1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblScore2))
                    .addGroup(plSpelersLayout.createSequentialGroup()
                        .addComponent(lblSpeler3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblScore4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addGroup(plSpelersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSpeler2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSpeler4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plSpelersLayout.setVerticalGroup(
            plSpelersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSpelersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSpelersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeler1)
                    .addComponent(lblSpeler2)
                    .addComponent(lblScore1)
                    .addComponent(lblScore2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(plSpelersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeler3)
                    .addComponent(lblSpeler4)
                    .addComponent(lblScore3)
                    .addComponent(lblScore4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        plTop.setBackground(new java.awt.Color(0, 51, 102));
        plTop.setForeground(new java.awt.Color(204, 204, 204));

        btnAfsluiten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAfsluiten.setText("Afsluiten");
        btnAfsluiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfsluitenActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setMaximumSize(new java.awt.Dimension(83, 25));
        btnReset.setMinimumSize(new java.awt.Dimension(83, 25));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBeurt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBeurt1.setText("Beurt");
        btnBeurt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeurt1ActionPerformed(evt);
            }
        });

        btnBeurt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBeurt2.setText("Beurt");
        btnBeurt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeurt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plTopLayout = new javax.swing.GroupLayout(plTop);
        plTop.setLayout(plTopLayout);
        plTopLayout.setHorizontalGroup(
            plTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBeurt1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAfsluiten, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnBeurt2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        plTopLayout.setVerticalGroup(
            plTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnAfsluiten)
                    .addComponent(btnBeurt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBeurt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plSpelers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(plTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(plSpelers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfsluitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfsluitenActionPerformed
        
        this.dispose();
        start scherm = new start();
        scherm.setVisible(true);
        
    }//GEN-LAST:event_btnAfsluitenActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn1.setLabel("H");
            eersteI = 0;
            eersteJ = 0;
        }
        else {
            btn1.setLabel("H");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[2]) && (plaats[eersteJ]) == (plaats[4])){
                    btn1.setVisible(false);
                    btn16.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        } 
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn16.setLabel("H");
            eersteI = 2;
            eersteJ = 4;
        }
        else {
            btn16.setLabel("H");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
               if((plaats[eersteI]) == (plaats[0]) && (plaats[eersteJ]) == (plaats[0])){
                    btn1.setVisible(false);
                    btn16.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        } 
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn2.setLabel("C");
            eersteI = 0;
            eersteJ = 1;
        }
        else {
            btn2.setLabel("C");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[3]) && (plaats[eersteJ]) == (plaats[5])){
                    btn2.setVisible(false);
                    btn24.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }  
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn24.setLabel("C");
            eersteI = 3;
            eersteJ = 5;
        }
        else {
            btn24.setLabel("C");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[0]) && (plaats[eersteJ]) == (plaats[1])){
                    btn2.setVisible(false);
                    btn24.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn3.setLabel("R");
            eersteI = 0;
            eersteJ = 2;
        }
        else {
            btn3.setLabel("R");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[1]) && (plaats[eersteJ]) == (plaats[4])){
                    btn3.setVisible(false);
                    btn11.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn11.setLabel("R");
            eersteI = 1;
            eersteJ = 4;
        }
        else {
            btn11.setLabel("R");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[0]) && (plaats[eersteJ]) == (plaats[2])){
                    btn3.setVisible(false);
                    btn11.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn4.setLabel("M");
            eersteI = 0;
            eersteJ = 3;
        }
        else {
            btn4.setLabel("M");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[5]) && (plaats[eersteJ]) == (plaats[5])){
                    btn4.setVisible(false);
                    btn36.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        if(optellen == 0) {
            optellen++;
            btn36.setLabel("M");
            eersteI = 5;
            eersteJ = 5;
        }
        else {
            btn36.setLabel("M");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
               if((plaats[eersteI]) == (plaats[0]) && (plaats[eersteJ]) == (plaats[3])){
                    btn4.setVisible(false);
                    btn36.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
    if(optellen == 0) {
            optellen++;
            btn5.setLabel("F");
            eersteI = 0;
            eersteJ = 4;
        }
        else {
            btn5.setLabel("F");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[3]) && (plaats[eersteJ]) == (plaats[2])){
                    btn5.setVisible(false);
                    btn21.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }   
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
    if(optellen == 0) {
            optellen++;
            btn21.setLabel("F");
            eersteI = 3;
            eersteJ = 2;
        }
        else {
            btn21.setLabel("F");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[0]) && (plaats[eersteJ]) == (plaats[4])){
                    btn5.setVisible(false);
                    btn21.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetgame();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBeurt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeurt1ActionPerformed
        btnBeurt2.setBackground(Color.GREEN);
        btnBeurt1.setBackground(Color.WHITE);
        
        
        if( foutekeren > 1) {
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);


        } 
        else {
            if(totaalkeren == foutekeren){
              totaalkeren = 0;
              foutekeren = 0;
              goed = 0;
            }
            else{
                score1+=goed;
                lblScore3.setText("" + score1);
                goed = 0;
                foutekeren = 0;
                totaalkeren = 0;
                eindespel();

            }
        }
    }//GEN-LAST:event_btnBeurt1ActionPerformed

    private void btnBeurt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeurt2ActionPerformed
        btnBeurt1.setBackground(Color.GREEN);
        btnBeurt2.setBackground(Color.WHITE);
        
        if( foutekeren > 1) {
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);


        } 
        else {
            if(totaalkeren == foutekeren){
              totaalkeren = 0;
              foutekeren = 0;
              goed = 0;
            }
            else{
                score2+=goed;
                lblScore4.setText("" + score2);
                goed = 0;
                foutekeren = 0;
                totaalkeren = 0;
                eindespel();

            }
        }
    }//GEN-LAST:event_btnBeurt2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
            if(optellen == 0) {
            optellen++;
            btn6.setLabel("W");
            eersteI = 0;
            eersteJ = 5;
        }
        else {
            btn6.setLabel("W");
            wait(1500);
            totaalkeren++;
            if (foutekeren >= 1){
                this.dispose();
                Valsspeler scherm = new Valsspeler();
                scherm.setVisible(true);
            }
                if((plaats[eersteI]) == (plaats[4]) && (plaats[eersteJ]) == (plaats[0])){
                    btn6.setVisible(false);
                    btn25.setVisible(false);
                    goed++;
                    teller++;
                    optellen = 0;
                    eindespel();
                } 
                else {
                    reset();
                    foutekeren++;
                    optellen = 0;
                }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn25.setLabel("W");
        eersteI = 4;
        eersteJ = 0;
        }
    else {
        btn25.setLabel("W");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[0]) && (plaats[eersteJ]) == (plaats[5])){
                btn6.setVisible(false);
                btn25.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn7.setLabel("U");
        eersteI = 1;
        eersteJ = 0;
        }
    else {
        btn7.setLabel("U");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[5]) && (plaats[eersteJ]) == (plaats[0])){
                btn7.setVisible(false);
                btn31.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn31.setLabel("U");
        eersteI = 5;
        eersteJ = 0;
        }
    else {
        btn31.setLabel("U");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[1]) && (plaats[eersteJ]) == (plaats[0])){
                btn7.setVisible(false);
                btn31.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn8.setLabel("L");
        eersteI = 1;
        eersteJ = 1;
        }
    else {
        btn8.setLabel("L");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[3]) && (plaats[eersteJ]) == (plaats[3])){
                btn8.setVisible(false);
                btn22.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn22.setLabel("L");
        eersteI = 3;
        eersteJ = 3;
        }
    else {
        btn22.setLabel("L");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[1]) && (plaats[eersteJ]) == (plaats[1])){
                btn8.setVisible(false);
                btn22.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn9.setLabel("B");
        eersteI = 1;
        eersteJ = 2;
        }
    else {
        btn9.setLabel("B");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[4]) && (plaats[eersteJ]) == (plaats[1])){
                btn9.setVisible(false);
                btn26.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn26.setLabel("B");
        eersteI = 4;
        eersteJ = 1;
        }
    else {
        btn26.setLabel("B");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[1]) && (plaats[eersteJ]) == (plaats[2])){
                btn9.setVisible(false);
                btn26.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn10.setLabel("I");
        eersteI = 1;
        eersteJ = 3;
        }
    else {
        btn10.setLabel("I");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[3]) && (plaats[eersteJ]) == (plaats[1])){
                btn10.setVisible(false);
                btn20.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn20.setLabel("I");
        eersteI = 3;
        eersteJ = 1;
        }
    else {
        btn20.setLabel("I");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[1]) && (plaats[eersteJ]) == (plaats[3])){
                btn10.setVisible(false);
                btn20.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn12.setLabel("Q");
        eersteI = 1;
        eersteJ = 5;
        }
    else {
        btn12.setLabel("Q");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[5]) && (plaats[eersteJ]) == (plaats[1])){
                btn12.setVisible(false);
                btn32.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn32.setLabel("Q");
        eersteI = 5;
        eersteJ = 1;
        }
    else {
        btn32.setLabel("Q");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[1]) && (plaats[eersteJ]) == (plaats[5])){
                btn12.setVisible(false);
                btn32.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn13.setLabel("G");
        eersteI = 2;
        eersteJ = 0;
        }
    else {
        btn13.setLabel("G");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[4]) && (plaats[eersteJ]) == (plaats[5])){
                btn13.setVisible(false);
                btn30.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn30.setLabel("G");
        eersteI = 4;
        eersteJ = 5;
        }
    else {
        btn30.setLabel("G");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
           if((plaats[eersteI]) == (plaats[2]) && (plaats[eersteJ]) == (plaats[0])){
                btn13.setVisible(false);
                btn30.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn14.setLabel("A");
        eersteI = 2;
        eersteJ = 1;
        }
    else {
        btn14.setLabel("A");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[4]) && (plaats[eersteJ]) == (plaats[4])){
                btn14.setVisible(false);
                btn29.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn29.setLabel("A");
        eersteI = 4;
        eersteJ = 4;
        }
    else {
        btn29.setLabel("A");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[2]) && (plaats[eersteJ]) == (plaats[1])){
                btn14.setVisible(false);
                btn29.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn15.setLabel("Y");
        eersteI = 2;
        eersteJ = 2;
        }
    else {
        btn15.setLabel("Y");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[2]) && (plaats[eersteJ]) == (plaats[4])){
                btn15.setVisible(false);
                btn17.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn17.setLabel("Y");
        eersteI = 2;
        eersteJ = 4;
        }
    else {
        btn17.setLabel("Y");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[2]) && (plaats[eersteJ]) == (plaats[2])){
                btn15.setVisible(false);
                btn17.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn18.setLabel("D");
        eersteI = 2;
        eersteJ = 5;
        }
    else {
        btn18.setLabel("D");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[5]) && (plaats[eersteJ]) == (plaats[3])){
                btn18.setVisible(false);
                btn34.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn34.setLabel("D");
        eersteI = 5;
        eersteJ = 3;
        }
    else {
        btn34.setLabel("D");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[2]) && (plaats[eersteJ]) == (plaats[5])){
                btn18.setVisible(false);
                btn34.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn19.setLabel("S");
        eersteI = 3;
        eersteJ = 0;
        }
    else {
        btn19.setLabel("S");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[5]) && (plaats[eersteJ]) == (plaats[4])){
                btn19.setVisible(false);
                btn35.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn23.setLabel("Z");
        eersteI = 3;
        eersteJ = 4;
        }
    else {
        btn23.setLabel("Z");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[4]) && (plaats[eersteJ]) == (plaats[2])){
                btn23.setVisible(false);
                btn27.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn27.setLabel("Z");
        eersteI = 4;
        eersteJ = 2;
        }
    else {
        btn27.setLabel("Z");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[3]) && (plaats[eersteJ]) == (plaats[4])){
                btn23.setVisible(false);
                btn27.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn35.setLabel("S");
        eersteI = 5;
        eersteJ = 4;
        }
    else {
        btn35.setLabel("S");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[3]) && (plaats[eersteJ]) == (plaats[0])){
                btn19.setVisible(false);
                btn35.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
    if(optellen == 0) {
        optellen++;
        btn28.setLabel("E");
        eersteI = 4;
        eersteJ = 3;
        }
    else {
        btn28.setLabel("E");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[5]) && (plaats[eersteJ]) == (plaats[2])){
                btn28.setVisible(false);
                btn33.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        if(optellen == 0) {
        optellen++;
        btn33.setLabel("E");
        eersteI = 5;
        eersteJ = 2;
        }
    else {
        btn33.setLabel("E");
        wait(1500);
        totaalkeren++;
        if (foutekeren >= 1){
            this.dispose();
            Valsspeler scherm = new Valsspeler();
            scherm.setVisible(true);
        }
            if((plaats[eersteI]) == (plaats[4]) && (plaats[eersteJ]) == (plaats[3])){
                btn28.setVisible(false);
                btn33.setVisible(false);
                goed++;
                teller++;
                optellen = 0;
                eindespel();
            } 
            else {
                reset();
                foutekeren++;
                optellen = 0;
            }
        }
    }//GEN-LAST:event_btn33ActionPerformed
       
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Spel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Spel dialog = new Spel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn1;
    private java.awt.Button btn10;
    private java.awt.Button btn11;
    private java.awt.Button btn12;
    private java.awt.Button btn13;
    private java.awt.Button btn14;
    private java.awt.Button btn15;
    private java.awt.Button btn16;
    private java.awt.Button btn17;
    private java.awt.Button btn18;
    private java.awt.Button btn19;
    private java.awt.Button btn2;
    private java.awt.Button btn20;
    private java.awt.Button btn21;
    private java.awt.Button btn22;
    private java.awt.Button btn23;
    private java.awt.Button btn24;
    private java.awt.Button btn25;
    private java.awt.Button btn26;
    private java.awt.Button btn27;
    private java.awt.Button btn28;
    private java.awt.Button btn29;
    private java.awt.Button btn3;
    private java.awt.Button btn30;
    private java.awt.Button btn31;
    private java.awt.Button btn32;
    private java.awt.Button btn33;
    private java.awt.Button btn34;
    private java.awt.Button btn35;
    private java.awt.Button btn36;
    private java.awt.Button btn4;
    private java.awt.Button btn5;
    private java.awt.Button btn6;
    private java.awt.Button btn7;
    private java.awt.Button btn8;
    private java.awt.Button btn9;
    private javax.swing.JButton btnAfsluiten;
    private javax.swing.JButton btnBeurt1;
    private javax.swing.JButton btnBeurt2;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    public static javax.swing.JLabel lblScore3;
    public static javax.swing.JLabel lblScore4;
    public static javax.swing.JLabel lblSpeler1;
    public static javax.swing.JLabel lblSpeler2;
    public static javax.swing.JLabel lblSpeler3;
    public static javax.swing.JLabel lblSpeler4;
    private java.awt.Panel plSpelers;
    private java.awt.Panel plTop;
    // End of variables declaration//GEN-END:variables
}
