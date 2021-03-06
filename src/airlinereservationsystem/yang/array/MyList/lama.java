
package airlinereservationsystem.yang.array.MyList;

import static airlinereservationsystem.yang.array.MyList.MyListArray.al;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class lama extends javax.swing.JFrame {
File user=new File("C:/reservation.txt");

    public lama() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        menu.show();
        add.hide();
        view.hide();
        edit.hide();
        search.hide();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        reservation = new javax.swing.JButton();
        flightdata = new javax.swing.JButton();
        editdata = new javax.swing.JButton();
        searchdata = new javax.swing.JButton();
        deletedata = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameadd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passnoadd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        destinationadd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        seatnoadd = new javax.swing.JTextField();
        addAdd = new javax.swing.JButton();
        menuAdd = new javax.swing.JButton();
        resetAdd = new javax.swing.JButton();
        view = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuView = new javax.swing.JButton();
        edit = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        passnoedit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        destinationedit = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        seatnoedit = new javax.swing.JTextField();
        menuEdit = new javax.swing.JButton();
        nameedit = new javax.swing.JTextField();
        resetEdit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        updateEdit = new javax.swing.JButton();
        search = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        namesearch = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        passportnosearch = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        destinationsearch = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        seatnosearch = new javax.swing.JTextField();
        menuSearch = new javax.swing.JButton();
        resetSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Reservation System");
        setBackground(new java.awt.Color(255, 255, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 0));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservation.setBackground(new java.awt.Color(255, 255, 255));
        reservation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reservation.setText("ADD RESERVATION");
        reservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationActionPerformed(evt);
            }
        });
        menu.add(reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 124, 211, 35));

        flightdata.setBackground(new java.awt.Color(255, 255, 255));
        flightdata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightdata.setText("VIEW RESERVATION");
        flightdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flightdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightdataActionPerformed(evt);
            }
        });
        menu.add(flightdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 177, 211, 35));

        editdata.setBackground(new java.awt.Color(255, 255, 255));
        editdata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editdata.setText("EDIT RESERVATION");
        editdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdataActionPerformed(evt);
            }
        });
        menu.add(editdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 230, 211, 35));

        searchdata.setBackground(new java.awt.Color(255, 255, 255));
        searchdata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchdata.setText("SEARCH RESERVATION");
        searchdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdataActionPerformed(evt);
            }
        });
        menu.add(searchdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 283, 211, 35));

        deletedata.setBackground(new java.awt.Color(255, 255, 255));
        deletedata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletedata.setText("DELETE RESERVATION");
        deletedata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedataActionPerformed(evt);
            }
        });
        menu.add(deletedata, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 336, 211, 35));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("AIRLINE RESERVATION SYSTEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 0, -1, 71));

        menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        add.setBackground(new java.awt.Color(255, 255, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ADD RESERVATION");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NAME");

        nameadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameaddActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("PASSPORT NO");

        passnoadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passnoadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passnoaddActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("DESTINATION");

        destinationadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        destinationadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationaddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("SEAT NO");

        seatnoadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seatnoadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatnoaddActionPerformed(evt);
            }
        });

        addAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addAdd.setText("ADD");
        addAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAddActionPerformed(evt);
            }
        });

        menuAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuAdd.setText("MENU");
        menuAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddActionPerformed(evt);
            }
        });

        resetAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetAdd.setText("RESET");
        resetAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destinationadd)
                            .addComponent(passnoadd)
                            .addComponent(seatnoadd)
                            .addComponent(nameadd, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel5))
                    .addGroup(addLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(addAdd)
                        .addGap(18, 18, 18)
                        .addComponent(menuAdd)
                        .addGap(18, 18, 18)
                        .addComponent(resetAdd)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addGap(49, 49, 49)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passnoadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(destinationadd)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatnoadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdd)
                    .addComponent(menuAdd)
                    .addComponent(resetAdd))
                .addGap(72, 72, 72))
        );

        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        view.setBackground(new java.awt.Color(255, 255, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("VIEW RESERVATION");

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Passport No", "Destination", "Seat No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        menuView.setBackground(new java.awt.Color(255, 255, 255));
        menuView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuView.setText("MENU");
        menuView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel10))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(menuView)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(menuView)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        edit.setBackground(new java.awt.Color(255, 255, 0));
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("EDIT RESERVATION");
        edit.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("PASSPORT NO");
        edit.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        passnoedit.setEditable(false);
        passnoedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passnoedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passnoeditActionPerformed(evt);
            }
        });
        edit.add(passnoedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 220, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("DESTINATION");
        edit.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        destinationedit.setEditable(false);
        destinationedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit.add(destinationedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 220, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("SEAT NO");
        edit.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        seatnoedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit.add(seatnoedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 220, -1));

        menuEdit.setBackground(new java.awt.Color(255, 255, 255));
        menuEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuEdit.setText("MENU");
        menuEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditActionPerformed(evt);
            }
        });
        edit.add(menuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        nameedit.setEditable(false);
        nameedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameeditActionPerformed(evt);
            }
        });
        edit.add(nameedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 220, -1));

        resetEdit.setBackground(new java.awt.Color(255, 255, 255));
        resetEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetEdit.setText("RESET");
        resetEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetEditActionPerformed(evt);
            }
        });
        edit.add(resetEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("NAME");
        edit.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 30));

        updateEdit.setBackground(new java.awt.Color(255, 255, 255));
        updateEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateEdit.setText("UPDATE");
        updateEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEditActionPerformed(evt);
            }
        });
        edit.add(updateEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        search.setBackground(new java.awt.Color(255, 255, 0));
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("SEARCH RESERVATION");
        search.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("NAME");
        search.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        namesearch.setEditable(false);
        namesearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.add(namesearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 329, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("PASSPORT NO");
        search.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        passportnosearch.setEditable(false);
        passportnosearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.add(passportnosearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 329, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("DESTINATION");
        search.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        destinationsearch.setEditable(false);
        destinationsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.add(destinationsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 329, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("SEAT NO");
        search.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        seatnosearch.setEditable(false);
        seatnosearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.add(seatnosearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 329, -1));

        menuSearch.setBackground(new java.awt.Color(255, 255, 255));
        menuSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuSearch.setText("MENU");
        menuSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchActionPerformed(evt);
            }
        });
        search.add(menuSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        resetSearch.setBackground(new java.awt.Color(255, 255, 255));
        resetSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetSearch.setText("RESET");
        resetSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSearchActionPerformed(evt);
            }
        });
        search.add(resetSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationActionPerformed
        add.show();
        menu.hide();
        view.hide();
        edit.hide();
        search.hide();

    }//GEN-LAST:event_reservationActionPerformed

    private void flightdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightdataActionPerformed
       
        if(al.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No Records Found!", "Info", 1);
            return;
        }
        else
        {
            view.show();
            add.hide();
            menu.hide();
            edit.hide();
            search.hide();
        }
    }//GEN-LAST:event_flightdataActionPerformed

    private void editdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdataActionPerformed
       String passport = JOptionPane.showInputDialog("Enter passport no");
        Boolean found = false;
      
       for(orang o: al)
       {
           if(o.getPassport().equals(passport))
           {
               found=true;
               passnoedit.setText(passport);
               nameedit.setText(o.getName());
               destinationedit.setText(o.getDestination());
               seatnoedit.setText(o.getSeat());
               edit.show();
               menu.hide();
           }
       }
       if(!found)
       {
           JOptionPane.showMessageDialog(null, "No Records Found!", "Info", 1);
       }
    }//GEN-LAST:event_editdataActionPerformed

    private void searchdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdataActionPerformed
        String passport = JOptionPane.showInputDialog("Enter passport no");
        Boolean found = false;
        
       for(orang o: al)
       {    
           if(o.getPassport().equals(passport))
           {
               found=true;
               passportnosearch.setText(passport);
               namesearch.setText(o.getName());
               destinationsearch.setText(o.getDestination());
               seatnosearch.setText(o.getSeat());
               search.show();
               menu.hide();
           }
       }
       if(!found)
       {
           JOptionPane.showMessageDialog(null, "No Records Found!", "Info", 1);
       }
    }//GEN-LAST:event_searchdataActionPerformed

    private void deletedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedataActionPerformed


        String passport = JOptionPane.showInputDialog("Enter passport No");
        Boolean found = false;
        
        if(al.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No Records Found!", "Info", 1);
            return;
        }
       for(orang o: al)
       {
           if(o.getPassport().equals(passport))
           {
               found=true;
               al.remove(passport);
               JOptionPane.showMessageDialog(null, "Entry has been deleted!", "Info", 1);
               break;
           }
       }
       if(!found)
       {
           JOptionPane.showMessageDialog(null, "Passport not Found!", "Info", 1);
       }

    }//GEN-LAST:event_deletedataActionPerformed

    private void nameaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameaddActionPerformed

    private void passnoaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passnoaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passnoaddActionPerformed

    private void passnoeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passnoeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passnoeditActionPerformed

    private void destinationaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationaddActionPerformed

    private void seatnoaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatnoaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatnoaddActionPerformed

    private void addAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAddActionPerformed
        
        String name, passport, destination, seat;

        name = nameadd.getText();
        passport = passnoadd.getText();
        destination = destinationadd.getText();
        seat = seatnoadd.getText();

        Boolean found = false;
        if(!al.isEmpty())
        {
            for(orang o: al)
            {
                if(o.getPassport().equals(passport))
                {
                    found=true;
                    JOptionPane.showMessageDialog(null, "Reservation already exists!", "Info", 1);
                    break;
                }
                if(o.getSeat().equals(seat) && o.getDestination().equals(destination))
                {
                    found=true;
                    JOptionPane.showMessageDialog(null, "Seat already book!", "Info", 1);
                    break;
                }
            }
        }
        if(!found)
        {
            orang o = new orang();
            o.setName(name);
            o.setPassport(passport);
            o.setDestination(destination);
            o.setSeat(seat);
            al.add(o);
            orang.sum++;
            
            Object[] row ={nameadd.getText(),passnoadd.getText(),destinationadd.getText(),seatnoadd.getText()};
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            model.addRow(row);
            
            try
            {
                FileWriter out=new FileWriter(user,true);
                PrintWriter outstream=new PrintWriter(out);
                outstream.println(name+" , "+passport+" , "+destination+" , "+seat);
                outstream.println();
                outstream.close();
            }
            catch(Exception exc)
            {
                exc.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Reservation has been added!", "Thank you", 1);
        }
    }//GEN-LAST:event_addAddActionPerformed

    private void menuSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchActionPerformed
        search.hide();
        menu.show();
        add.hide();
        view.hide();
        edit.hide();
        search.hide();
    }//GEN-LAST:event_menuSearchActionPerformed

    private void menuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddActionPerformed
        search.hide();
        menu.show();
        add.hide();
        view.hide();
        edit.hide();
        search.hide();
    }//GEN-LAST:event_menuAddActionPerformed

    private void resetAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAddActionPerformed
        nameadd.setText(null);
        passnoadd.setText(null);
        destinationadd.setText(null);
        seatnoadd.setText(null);
    }//GEN-LAST:event_resetAddActionPerformed

    private void menuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditActionPerformed
        edit.hide();
        menu.show();
    }//GEN-LAST:event_menuEditActionPerformed

    private void menuViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewActionPerformed
        view.hide();
        menu.show();
    }//GEN-LAST:event_menuViewActionPerformed

    private void nameeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameeditActionPerformed

    private void resetEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetEditActionPerformed

        nameedit.setText(null);
        passnoedit.setText(null);
        destinationedit.setText(null);
        seatnoedit.setText(null);
        
    }//GEN-LAST:event_resetEditActionPerformed

    private void updateEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEditActionPerformed
        
        
        String name, passport, destination, seat;

        name = nameadd.getText();
        passport = passnoadd.getText();
        destination = destinationadd.getText();
        seat = seatnoadd.getText();
        
        Boolean found = false;
        if(!al.isEmpty())
        {
            for(orang o : al) 
            {
                if(o.getSeat().equals(seat) && o.getDestination().equals(destination))
                {
                    JOptionPane.showMessageDialog(null, "Seat already book!", "Info", 1);
                    break;
                }
                if(o.getSeat().equals(seat))
                {
                    o.setName(nameadd.getText());
                    o.setPassport(passnoadd.getText());
                    o.setDestination(destinationadd.getText());
                    o.setSeat(seatnoadd.getText());   
                    JOptionPane.showMessageDialog(null, "Reservation has been updated!", "Thank you", 1);
                    edit.hide();
                    menu.show();
                }
            }
        }
        else
        {
            for(orang o : al) 
            {

            }
        }
    }//GEN-LAST:event_updateEditActionPerformed

    private void resetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSearchActionPerformed

        namesearch.setText(null);
        passportnosearch.setText(null);
        destinationsearch.setText(null);
        seatnosearch.setText(null);
        
    }//GEN-LAST:event_resetSearchActionPerformed

    public static void main(String args[]) {
        MyListArray.load();
             SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                new lama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JButton addAdd;
    private javax.swing.JButton deletedata;
    private javax.swing.JTextField destinationadd;
    private javax.swing.JTextField destinationedit;
    private javax.swing.JTextField destinationsearch;
    private javax.swing.JPanel edit;
    private javax.swing.JButton editdata;
    private javax.swing.JButton flightdata;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menuAdd;
    private javax.swing.JButton menuEdit;
    private javax.swing.JButton menuSearch;
    private javax.swing.JButton menuView;
    private javax.swing.JTextField nameadd;
    private javax.swing.JTextField nameedit;
    private javax.swing.JTextField namesearch;
    private javax.swing.JTextField passnoadd;
    private javax.swing.JTextField passnoedit;
    private javax.swing.JTextField passportnosearch;
    private javax.swing.JButton reservation;
    private javax.swing.JButton resetAdd;
    private javax.swing.JButton resetEdit;
    private javax.swing.JButton resetSearch;
    private javax.swing.JPanel search;
    private javax.swing.JButton searchdata;
    private javax.swing.JTextField seatnoadd;
    private javax.swing.JTextField seatnoedit;
    private javax.swing.JTextField seatnosearch;
    private javax.swing.JButton updateEdit;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
