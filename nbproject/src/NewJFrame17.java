import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame17.java
 *
 * Created on 2 Feb, 2017, 11:33:50 AM
 */

/**
 *
 * @author shivam
 */
public class NewJFrame17 extends javax.swing.JFrame {

    /** Creates new form NewJFrame17 */
    public NewJFrame17() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList();
        jTextField9 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Drinks");

        jList7.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList7.setForeground(new java.awt.Color(102, 51, 0));
        jList7.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Tea", "Coffee", "Soft Drinks", "Cold Coffee", "Cold Coffee with Ice-Cream" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jList7);

        jTextField8.setFont(new java.awt.Font("Arial", 0, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("Salad");

        jList8.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList8.setForeground(new java.awt.Color(51, 102, 0));
        jList8.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Green Salad", "Cucumber Salad", "Fruit Salad", "Dry Papad", "Fry Papad" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList8MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jList8);

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14));

        jList1.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList1.setForeground(new java.awt.Color(255, 153, 51));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Paneer masala dosa", "Onion sada dosa", "Masala dosa", "Paper roast dosa", "Butter sada dosa", "Onion vada", "Sada vada", "Veg upma", "Sada upma", "Halwa(Sweet)", "Alu chop", "Idli", "Sambhar idli" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList2.setForeground(new java.awt.Color(204, 204, 0));
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Dal fry", "Dal tadka", "Dal makini", "Mix vegetable curry", "Vegetable kurma", "Aloo dum", "Malai kofta", "Paneer tikka masala", "Kadai paneer", "Paneer butter masala", "Paneer bharta", "Aloo kobi", "Kobi masala" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList3.setForeground(new java.awt.Color(255, 102, 102));
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Veg sweet corn soup", "Hot/soup", "Lemon noodles soup", "Manchurian soup", "Tomato soup", "Mushroom soup", "Manchurian", "Noodles", "Veg haka noodles" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList4.setForeground(new java.awt.Color(0, 153, 0));
        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Veg-American chopsuey", "Mushroom chilly", "Baby corn chilly", "Potato chilly", "Gobi chilly", "Chana masala", "Mattar paneer", "Mushroom curry", "Palak cream" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        jList5.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList5.setForeground(new java.awt.Color(153, 153, 153));
        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Plain rice", "Veg pulao", "Green peas pulao", "Sajan pulao", "Kashmiri pulao", "Veg fried rice", "Veg-biryani", "Jira-rice", "Lemon rice" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList5);

        jList6.setFont(new java.awt.Font("Arial Black", 0, 11));
        jList6.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "None", "Tawa roti", "Tandoor roti", "Butter roti", "Plain nan", "Butter nan", "Plain kulcha", "Masala kulcha", "Tandoori lachha paratha", "Kashmiri nan" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jList6);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("South");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("North");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Chinese");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Veg");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Rice");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14));
        jLabel8.setText("Tandoor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField5)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Colonna MT", 3, 72));
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Menu");

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11));
        jButton1.setForeground(new java.awt.Color(51, 0, 0));
        jButton1.setText("Total Amount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Arial Black", 0, 11));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18));
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Order");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18));
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)))
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
        Object[]Selected=jList7.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Tea"))
                total=total+40;
            else   if(Value.equals("Coffee"))
                total=total+50;
            else if(Value.equals("Soft Drinks"))
                total=total+60;
            else if(Value.equals("Cold Coffee"))
                total=total+90;
            else if(Value.equals("Cold Coffee with Ice-Cream"))
                total=total+120;

        } jTextField8.setText(total+"");        // TODO add your handling code here:
}//GEN-LAST:event_jList7MouseClicked

    private void jList8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList8MouseClicked
        Object[]Selected=jList8.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Green Salad"))
                total=total+40;
            else   if(Value.equals("Cucumber Salad"))
                total=total+50;
            else if(Value.equals("Fruit Salad"))
                total=total+110;
            else if(Value.equals("Dry Papad"))
                total=total+45;
            else if(Value.equals("Fry Papad"))
                total=total+55;

        } jTextField9.setText(total+"");   // TODO add your handling code here:
}//GEN-LAST:event_jList8MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        Object[]Selected=jList1.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Paneer masala dosa"))
                total=total+150;
            else   if(Value.equals("Onion sada dosa"))
                total=total+140;
            else if(Value.equals("Masala dosa"))
                total=total+130;
            else if(Value.equals("Paper roast dosa"))
                total=total+190;
            else if(Value.equals("Butter sada dosa"))
                total=total+150;
            else if(Value.equals("Onion vada"))
                total=total+145;
            else if(Value.equals("Sada vada"))
                total=total+165;
            else if(Value.equals("Veg upma"))
                total=total+185;
            else if(Value.equals("Sada upma"))
                total=total+130;
            else if(Value.equals("Halwa(Sweet)"))
                total=total+180;
            else if(Value.equals("Alu chop"))
                total=total+140;
            else if(Value.equals("Idli"))
                total=total+165;
            else if(Value.equals("Sambhar idli"))
                total=total+185;
        }
        jTextField1.setText(total+"");      // TODO add your handling code here:
}//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        Object[]Selected=jList2.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Dal fry"))
                total=total+120;
            else   if(Value.equals("Dal tadka"))
                total=total+130;
            else if(Value.equals("Dal makini"))
                total=total+130;
            else if(Value.equals("Mix vegetable curry"))
                total=total+190;
            else if(Value.equals("Vegetable kurma"))
                total=total+150;
            else if(Value.equals("Aloo dum"))
                total=total+145;
            else if(Value.equals("Malai kofta"))
                total=total+165;
            else if(Value.equals("Paneer tikka masala"))
                total=total+185;
            else if(Value.equals("Kadai paneer"))
                total=total+145;
            else if(Value.equals("Paneer butter masala"))
                total=total+180;
            else if(Value.equals("Paneer bharta"))
                total=total+140;
            else if(Value.equals("Aloo kobi"))
                total=total+165;
            else if(Value.equals("Kobi masala"))
                total=total+185;
        }
        jTextField2.setText(total+"");       // TODO add your handling code here:
}//GEN-LAST:event_jList2MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        Object[]Selected=jList3.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Veg sweet corn soup"))
                total=total+178;
            else   if(Value.equals("Hot/soup"))
                total=total+140;
            else if(Value.equals("Lemon noodles soup"))
                total=total+130;
            else if(Value.equals("Manchurian soup"))
                total=total+190;
            else if(Value.equals("Tomato soup"))
                total=total+185;
            else if(Value.equals("Mushroom soup"))
                total=total+200;
            else if(Value.equals("Manchurian"))
                total=total+150;
            else if(Value.equals("Noodles"))
                total=total+145;
            else if(Value.equals("Veg haka noodles"))
                total=total+165;
        }
        jTextField3.setText(total+"");      // TODO add your handling code here:
}//GEN-LAST:event_jList3MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        Object[]Selected=jList4.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Veg-American chopsuey"))
                total=total+220;
            else   if(Value.equals("Mushroom chilly"))
                total=total+186;
            else if(Value.equals("Baby corn chilly"))
                total=total+178;
            else if(Value.equals("Potato chilly"))
                total=total+190;
            else if(Value.equals("Gobi chilly"))
                total=total+185;
            else if(Value.equals("Chana masala"))
                total=total+177;
            else if(Value.equals("Mattar paneer"))
                total=total+210;
            else if(Value.equals("Mushroom curry"))
                total=total+230;
            else if(Value.equals("Palak cream"))
                total=total+250;
        }
        jTextField4.setText(total+"");   // TODO add your handling code here:
}//GEN-LAST:event_jList4MouseClicked

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
        Object[]Selected=jList5.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Plain rice"))
                total=total+150;
            else   if(Value.equals("Veg pulao"))
                total=total+140;
            else if(Value.equals("Green peas pulao"))
                total=total+130;
            else if(Value.equals("Sajan pulao"))
                total=total+190;
            else if(Value.equals("Kashmiri pulao"))
                total=total+195;
            else if(Value.equals("Veg fried rice"))
                total=total+185;
            else if(Value.equals("Veg-biryani"))
                total=total+150;
            else if(Value.equals("Jira-rice"))
                total=total+148;
            else if(Value.equals("Lemon rice"))
                total=total+145;
        } jTextField5.setText(total+"");      // TODO add your handling code here:
}//GEN-LAST:event_jList5MouseClicked

    private void jList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList6MouseClicked
        Object[]Selected=jList6.getSelectedValues();
        int l=Selected.length;
        int total=0;
        for(int i=0; i<l; i++) {
            String Value=(String)Selected[i];
            if(Value.equals("Tawa roti"))
                total=total+85;
            else   if(Value.equals("Tandoor roti"))
                total=total+140;
            else if(Value.equals("Butter roti"))
                total=total+120;
            else if(Value.equals("Plain nan"))
                total=total+185;
            else if(Value.equals("Butter nan"))
                total=total+195;
            else if(Value.equals("Plain kulcha"))
                total=total+185;
            else if(Value.equals("Masala kulcha"))
                total=total+200;
            else if(Value.equals("Tandoori lachha paratha"))
                total=total+210;
            else if(Value.equals("Kashmiri nan"))
                total=total+160;
        } jTextField6.setText(total+"");     // TODO add your handling code here:
}//GEN-LAST:event_jList6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int t1=Integer.parseInt(jTextField1.getText());
            int t2=Integer.parseInt(jTextField2.getText());
            int t3=Integer.parseInt(jTextField3.getText());
            int t4=Integer.parseInt(jTextField4.getText());
            int t5=Integer.parseInt(jTextField5.getText());
            int t6=Integer.parseInt(jTextField6.getText());
            int t7=Integer.parseInt(jTextField8.getText());
            int t8=Integer.parseInt(jTextField9.getText());
            int t=t1+t2+t3+t4+t5+t6+t7+t8;

            jTextField7.setText(t+"");
            jButton2.setEnabled(true);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Please select all the fields"); }
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new NewJFrame18().setVisible(true);     // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new NewJFrame19().setVisible(true);     // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JList jList5;
    private javax.swing.JList jList6;
    private javax.swing.JList jList7;
    private javax.swing.JList jList8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
