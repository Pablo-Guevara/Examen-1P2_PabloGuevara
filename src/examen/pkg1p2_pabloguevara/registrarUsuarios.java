package examen.pkg1p2_pabloguevara;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class registrarUsuarios extends javax.swing.JFrame {

    private String nombreUsuario;
    private String contraseña;
    private Date fechaNacimiento;
    private int numeroTelefonico;
    private String correoElec;
    private String nombreCompleto;
    private String generoFavoritoLec;
    private ArrayList<Usuarios> ListaAmigos = new ArrayList();
    private ArrayList<Libros> ListaLibros = new ArrayList();

    ArrayList<Usuarios> listaUsuarios = new ArrayList();

    public registrarUsuarios() {
        initComponents();

    }

    public registrarUsuarios(String nombreUsuario, String contraseña, Date fechaNacimiento, int numeroTelefonico, String correoElec, String nombreCompleto, String generoFavoritoLec) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElec = correoElec;
        this.nombreCompleto = nombreCompleto;
        this.generoFavoritoLec = generoFavoritoLec;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGeneroFavoritoLec() {
        return generoFavoritoLec;
    }

    public void setGeneroFavoritoLec(String generoFavoritoLec) {
        this.generoFavoritoLec = generoFavoritoLec;
    }

    public ArrayList<Usuarios> getListaAmigos() {
        return ListaAmigos;
    }

    public void setListaAmigos(ArrayList<Usuarios> ListaAmigos) {
        this.ListaAmigos = ListaAmigos;
    }

    public ArrayList<Libros> getListaLibros() {
        return ListaLibros;
    }

    public void setListaLibros(ArrayList<Libros> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextnombreUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextContraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombleCompleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxGeneroFav = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCorreoElec = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrarse");

        jLabel2.setText("Nombre de usuario:");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Número telefónico");

        jLabel6.setText("Nombre completo:");

        jLabel7.setText("Género favorito de lectura:");

        jComboBoxGeneroFav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasía", "Romance", "Acción", "Historia" }));
        jComboBoxGeneroFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroFavActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo electronico:");

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextnombreUsu)
                            .addComponent(jTextContraseña)
                            .addComponent(jTextFieldNumTel)
                            .addComponent(jTextFieldNombleCompleto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooserFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxGeneroFav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 81, Short.MAX_VALUE))
                            .addComponent(jTextFieldCorreoElec))))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(75, 75, 75)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextnombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooserFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNombleCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCorreoElec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxGeneroFav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxGeneroFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroFavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroFavActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextnombreUsu.getText().equals("") || jTextContraseña.getText().equals("") || jDateChooserFechaNac == null
                || jTextFieldNumTel.getText().equals("")
                || jTextFieldNombleCompleto.getText().equals("") || jTextFieldCorreoElec.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor rellene todos los campos");
        } else {
            nombreUsuario = jTextnombreUsu.getText();
            contraseña = jTextContraseña.getText();
            fechaNacimiento = jDateChooserFechaNac.getDate();

            numeroTelefonico = Integer.parseInt(jTextFieldNumTel.getText());

            correoElec = jTextFieldCorreoElec.getText();
            nombreCompleto = jTextFieldNombleCompleto.getText();
            generoFavoritoLec = jComboBoxGeneroFav.getSelectedItem().toString();

            Usuarios Users = new Usuarios(nombreUsuario, contraseña, fechaNacimiento, numeroTelefonico, correoElec, nombreCompleto, generoFavoritoLec);
            listaUsuarios.add(Users);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxGeneroFav;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextContraseña;
    private javax.swing.JTextField jTextFieldCorreoElec;
    private javax.swing.JTextField jTextFieldNombleCompleto;
    private javax.swing.JTextField jTextFieldNumTel;
    private javax.swing.JTextField jTextnombreUsu;
    // End of variables declaration//GEN-END:variables
}
