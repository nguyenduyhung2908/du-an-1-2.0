/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.nhomsau.service.IKyService;
import com.nhomsau.service.impl.KyService;
import com.nhomsau.viewmodel.QuanLyKy;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FormKy extends javax.swing.JPanel {

    /**
     * Creates new form FormKy
     */
    DefaultTableModel model;
    IKyService iKyService;
    public FormKy() {
        initComponents();
        TxtId.setLabelText("Id");
        txtMaKy.setLabelText("Mã kỳ");
        txtTenKy.setLabelText("Tên kỳ");
        txtNamHoc.setLabelText("năm học");
        model = (DefaultTableModel) tblKy.getModel();
        iKyService = new KyService();
        loadTable(iKyService.findAll());
    }
    
    private void loadTable(List<QuanLyKy> list) {
        model.setRowCount(0);
        for (QuanLyKy ky : list) {
            model.addRow(new Object[]{ky.getMa(), ky.getTen(), ky.getNam()});
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

        txtNamHoc = new com.raven.swing.textfield.TextField();
        btnThem = new com.raven.swing.button.Button();
        btnSua = new com.raven.swing.button.Button();
        btnXoa = new com.raven.swing.button.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKy = new com.raven.swing.table.Table();
        TxtId = new com.raven.swing.textfield.TextField();
        txtMaKy = new com.raven.swing.textfield.TextField();
        txtTenKy = new com.raven.swing.textfield.TextField();

        txtNamHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamHocActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblKy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã kỳ", "Tên kỳ", "Năm học"
            }
        ));
        tblKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKy);

        TxtId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addComponent(TxtId, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(txtTenKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        QuanLyKy qlk = validateKy();
        if (qlk != null) {
            this.iKyService.insert(qlk);
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
        loadTable(this.iKyService.findAll());
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int selectRow = tblKy.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn 1 dòng trên bảng");
        } else {
            QuanLyKy qlk = validateKySua();
            if (qlk != null) {
                qlk.setId(TxtId.getText());
                this.iKyService.update(qlk);
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
            loadTable(this.iKyService.findAll());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectRow = tblKy.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn 1 dòng trên bảng");
        } else {
            String id = tblKy.getValueAt(selectRow, 0).toString();
            int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xác nhận Xóa", JOptionPane.YES_NO_OPTION);
            if (kq == JOptionPane.YES_OPTION) {
                this.iKyService.delete(id);
                loadTable(this.iKyService.findAll());
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                clear();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKyMouseClicked
        // TODO add your handling code here:
        int selectRow = tblKy.getSelectedRow();
        txtMaKy.setText(tblKy.getValueAt(selectRow, 0).toString());
        txtTenKy.setText(tblKy.getValueAt(selectRow, 1).toString());
        txtNamHoc.setText(tblKy.getValueAt(selectRow, 2).toString());
        if(selectRow >= 0){
            String maKy = tblKy.getValueAt(selectRow, 0).toString();
            String idKy = iKyService.getIdKy(maKy);
            String tenKy = tblKy.getValueAt(selectRow, 1).toString();
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormThemMonVaoKy formThemMonVaoKy = new FormThemMonVaoKy();
                formThemMonVaoKy.setIdKy(idKy);
                formThemMonVaoKy.loadDaCo();
                formThemMonVaoKy.loadChuaCo();
                formThemMonVaoKy.setVisible(true);
                formThemMonVaoKy.setTitle(tenKy);
            }
        });
        }
    }//GEN-LAST:event_tblKyMouseClicked

    private void txtNamHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamHocActionPerformed

        private void clear() {
        TxtId.setText("");
        txtMaKy.setText("");
        txtTenKy.setText("");
        txtNamHoc.setText("");
    }

    private QuanLyKy validateKy() {
        String id = "";
        String maKy = txtMaKy.getText();
        if (maKy.isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã kỳ");
            return null;
        }
        for (QuanLyKy ky : this.iKyService.findAll()) {
            if (maKy.equalsIgnoreCase(ky.getMa())) {
                JOptionPane.showMessageDialog(this, "Mã kỳ đã tồn tại");
                return null;
            }
        }
        String tenKy = txtTenKy.getText();
        if (tenKy.isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên kỳ");
            return null;
        }
        String namHocString = txtNamHoc.getText();
        if (namHocString.isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống năm học");
            return null;
        }
        int namHoc = 0;
        try {
            namHoc = Integer.valueOf(namHocString);
            if (namHoc <= 0) {
                JOptionPane.showMessageDialog(this, "Năm học không được âm");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nam học phải thuộc kiểu số");
            return null;
        }
        return new QuanLyKy(maKy, id, tenKy, namHoc);
    }
    
    private QuanLyKy validateKySua() {
        String id = "";
        String maKy = "";
        String tenKy = txtTenKy.getText();
        if (tenKy.isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên kỳ");
            return null;
        }
        String namHocString = txtNamHoc.getText();
        if (namHocString.isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được để trống năm học");
            return null;
        }
        int namHoc = 0;
        try {
            namHoc = Integer.valueOf(namHocString);
            if (namHoc <= 0) {
                JOptionPane.showMessageDialog(this, "Năm học không được âm");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nam học phải thuộc kiểu số");
            return null;
        }
        return new QuanLyKy(maKy, id, tenKy, namHoc);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.textfield.TextField TxtId;
    private com.raven.swing.button.Button btnSua;
    private com.raven.swing.button.Button btnThem;
    private com.raven.swing.button.Button btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.table.Table tblKy;
    private com.raven.swing.textfield.TextField txtMaKy;
    private com.raven.swing.textfield.TextField txtNamHoc;
    private com.raven.swing.textfield.TextField txtTenKy;
    // End of variables declaration//GEN-END:variables

}
