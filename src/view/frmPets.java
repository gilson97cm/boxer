/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ChangePanel;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author GILSON
 */
public class frmPets extends javax.swing.JPanel {

    /**
     * Creates new form frmHome
     */
    public frmPets() {
        initComponents();
        this.dateCH.setDatoFecha(new Date());
        txtSearchPet.setPlaceholder("Número de Historia");
    }

    public void openClinicHistory() {
        frmClinicHistory form = new frmClinicHistory();
        form.show();
        form.setLocationRelativeTo(this);
    }

    private void changePlaceHolderSearch() {
        if (this.cmbPet.getSelectedIndex() == 0) {
            txtSearchPet.setPlaceholder("Número de Historia");
        } else if (this.cmbPet.getSelectedIndex() == 1) {
            txtSearchPet.setPlaceholder("Nombre de la Mascota");
        }else if (this.cmbPet.getSelectedIndex() == 2) {
            txtSearchPet.setPlaceholder("Nombre del Propietario");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        basicDatePickerUI1 = new org.jdesktop.swingx.plaf.basic.BasicDatePickerUI();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cmbPet = new rojerusan.RSComboMetro();
        txtSearchPet = new rojeru_san.RSMTextFull();
        rSButton7 = new rojeru_san.RSButton();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rSMTextFull1 = new rojeru_san.RSMTextFull();
        rSMTextFull3 = new rojeru_san.RSMTextFull();
        rSMTextFull4 = new rojeru_san.RSMTextFull();
        rSMTextFull5 = new rojeru_san.RSMTextFull();
        rSMTextFull6 = new rojeru_san.RSMTextFull();
        rSRadioButtonMaterial1 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial2 = new RSMaterialComponent.RSRadioButtonMaterial();
        dateCH = new rojeru_san.rsdate.RSDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtNameOwner = new rojeru_san.RSMTextFull();
        txtAdressOwner = new rojeru_san.RSMTextFull();
        txtPhoneOwner = new rojeru_san.RSMTextFull();
        rSButton1 = new rojeru_san.RSButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        rSDesktopPane1 = new rojeru_san.rspanel.RSDesktopPane();
        btnNewPet = new rojeru_san.RSButton();
        btnSavePet = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();

        setBackground(new java.awt.Color(239, 238, 244));

        jPanel4.setBackground(new java.awt.Color(239, 238, 244));

        jPanel5.setBackground(new java.awt.Color(239, 238, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        cmbPet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Historia", "Mascota", "Propietario" }));
        cmbPet.setColorArrow(new java.awt.Color(51, 153, 103));
        cmbPet.setColorBorde(new java.awt.Color(51, 153, 103));
        cmbPet.setColorFondo(new java.awt.Color(51, 153, 103));
        cmbPet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPetActionPerformed(evt);
            }
        });

        txtSearchPet.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchPet.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        txtSearchPet.setBotonColor(new java.awt.Color(51, 153, 103));
        txtSearchPet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearchPet.setPlaceholder("");

        rSButton7.setBackground(new java.awt.Color(239, 238, 244));
        rSButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/papel (6).png"))); // NOI18N
        rSButton7.setColorHover(new java.awt.Color(239, 238, 244));
        rSButton7.setColorText(new java.awt.Color(239, 238, 244));
        rSButton7.setColorTextHover(new java.awt.Color(239, 238, 244));
        rSButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/papel (7).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cmbPet, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(239, 238, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(239, 238, 244));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("N° Historia:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Nombre:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Especie:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Raza:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Edad:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Color:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Sexo:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("*");

        rSMTextFull1.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull1.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        rSMTextFull1.setBotonColor(new java.awt.Color(51, 153, 103));
        rSMTextFull1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rSMTextFull1.setPlaceholder("");

        rSMTextFull3.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull3.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        rSMTextFull3.setBotonColor(new java.awt.Color(51, 153, 103));
        rSMTextFull3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rSMTextFull3.setPlaceholder("");

        rSMTextFull4.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull4.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        rSMTextFull4.setBotonColor(new java.awt.Color(51, 153, 103));
        rSMTextFull4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rSMTextFull4.setPlaceholder("");

        rSMTextFull5.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull5.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        rSMTextFull5.setBotonColor(new java.awt.Color(51, 153, 103));
        rSMTextFull5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rSMTextFull5.setPlaceholder("");

        rSMTextFull6.setForeground(new java.awt.Color(0, 0, 0));
        rSMTextFull6.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        rSMTextFull6.setBotonColor(new java.awt.Color(51, 153, 103));
        rSMTextFull6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rSMTextFull6.setPlaceholder("");

        buttonGroup1.add(rSRadioButtonMaterial1);
        rSRadioButtonMaterial1.setForeground(new java.awt.Color(0, 0, 0));
        rSRadioButtonMaterial1.setText("Hembra");
        rSRadioButtonMaterial1.setColorCheck(new java.awt.Color(51, 153, 103));
        rSRadioButtonMaterial1.setColorUnCheck(new java.awt.Color(0, 0, 0));
        rSRadioButtonMaterial1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        buttonGroup1.add(rSRadioButtonMaterial2);
        rSRadioButtonMaterial2.setForeground(new java.awt.Color(0, 0, 0));
        rSRadioButtonMaterial2.setText("Macho");
        rSRadioButtonMaterial2.setColorCheck(new java.awt.Color(51, 153, 103));
        rSRadioButtonMaterial2.setColorUnCheck(new java.awt.Color(0, 0, 0));
        rSRadioButtonMaterial2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dateCH.setColorBackground(new java.awt.Color(51, 153, 103));
        dateCH.setColorForeground(new java.awt.Color(0, 0, 0));
        dateCH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateCH.setFuente(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateCH.setPlaceholder("");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("*");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSMTextFull5, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)))
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addComponent(rSMTextFull1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(rSMTextFull3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(rSMTextFull4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSMTextFull6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(rSRadioButtonMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSRadioButtonMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dateCH, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSMTextFull1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSMTextFull4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSMTextFull6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSMTextFull5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(239, 238, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Propietario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(239, 238, 244));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Nombre:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Dirección");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Teléfono:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("*");

        txtNameOwner.setForeground(new java.awt.Color(0, 0, 0));
        txtNameOwner.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        txtNameOwner.setBotonColor(new java.awt.Color(51, 153, 103));
        txtNameOwner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNameOwner.setPlaceholder("");

        txtAdressOwner.setForeground(new java.awt.Color(0, 0, 0));
        txtAdressOwner.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        txtAdressOwner.setBotonColor(new java.awt.Color(51, 153, 103));
        txtAdressOwner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAdressOwner.setPlaceholder("");

        txtPhoneOwner.setForeground(new java.awt.Color(0, 0, 0));
        txtPhoneOwner.setBordeColorFocus(new java.awt.Color(51, 153, 103));
        txtPhoneOwner.setBotonColor(new java.awt.Color(51, 153, 103));
        txtPhoneOwner.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPhoneOwner.setPlaceholder("");

        rSButton1.setBackground(new java.awt.Color(41, 182, 246));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/carpeta.png"))); // NOI18N
        rSButton1.setText("Historia");
        rSButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButton1.setIconTextGap(8);
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(239, 238, 244));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(239, 238, 244));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(txtAdressOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhoneOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtAdressOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleName("");

        rSDesktopPane1.setBackground(new java.awt.Color(239, 238, 244));

        btnNewPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/anadir (1).png"))); // NOI18N
        btnNewPet.setText("Nuevo");
        btnNewPet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewPet.setIconTextGap(8);
        btnNewPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPetActionPerformed(evt);
            }
        });
        rSDesktopPane1.add(btnNewPet);
        btnNewPet.setBounds(200, 10, 200, 40);

        btnSavePet.setBackground(new java.awt.Color(76, 175, 80));
        btnSavePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/seguro (1).png"))); // NOI18N
        btnSavePet.setText("Guardar");
        btnSavePet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSavePet.setIconTextGap(8);
        btnSavePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePetActionPerformed(evt);
            }
        });
        rSDesktopPane1.add(btnSavePet);
        btnSavePet.setBounds(420, 10, 200, 40);

        rSButton4.setBackground(new java.awt.Color(255, 152, 0));
        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/papel (5).png"))); // NOI18N
        rSButton4.setText("Editar");
        rSButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButton4.setIconTextGap(8);
        rSDesktopPane1.add(rSButton4);
        rSButton4.setBounds(640, 10, 200, 40);

        rSButton5.setBackground(new java.awt.Color(244, 67, 54));
        rSButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/papel (4).png"))); // NOI18N
        rSButton5.setText("Eliminar");
        rSButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rSButton5.setIconTextGap(8);
        rSDesktopPane1.add(rSButton5);
        rSButton5.setBounds(860, 10, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
                    .addComponent(rSDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPetActionPerformed
        System.out.println("Nueva mascota");
    }//GEN-LAST:event_btnNewPetActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        openClinicHistory();
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void btnSavePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePetActionPerformed
        openClinicHistory();
    }//GEN-LAST:event_btnSavePetActionPerformed

    private void cmbPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPetActionPerformed
          changePlaceHolderSearch();
    }//GEN-LAST:event_cmbPetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.plaf.basic.BasicDatePickerUI basicDatePickerUI1;
    private rojeru_san.RSButton btnNewPet;
    private rojeru_san.RSButton btnSavePet;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojerusan.RSComboMetro cmbPet;
    private rojeru_san.rsdate.RSDateChooser dateCH;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel pnlPrincipal;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    private rojeru_san.RSButton rSButton7;
    private rojeru_san.rspanel.RSDesktopPane rSDesktopPane1;
    private rojeru_san.RSMTextFull rSMTextFull1;
    private rojeru_san.RSMTextFull rSMTextFull3;
    private rojeru_san.RSMTextFull rSMTextFull4;
    private rojeru_san.RSMTextFull rSMTextFull5;
    private rojeru_san.RSMTextFull rSMTextFull6;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial1;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial2;
    public static rojeru_san.RSMTextFull txtAdressOwner;
    public static rojeru_san.RSMTextFull txtNameOwner;
    public static rojeru_san.RSMTextFull txtPhoneOwner;
    private rojeru_san.RSMTextFull txtSearchPet;
    // End of variables declaration//GEN-END:variables
}
