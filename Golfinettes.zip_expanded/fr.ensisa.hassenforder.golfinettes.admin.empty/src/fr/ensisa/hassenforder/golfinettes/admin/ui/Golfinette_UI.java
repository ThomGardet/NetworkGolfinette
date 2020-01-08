/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ensisa.hassenforder.golfinettes.admin.ui;

import fr.ensisa.hassenforder.golfinettes.admin.model.Golfinette;

/**
 *
 * @author Hassenforder
 */
public class Golfinette_UI extends javax.swing.JPanel {

	private Golfinette golfinette;
	
	/**
     * Creates new form Event_UI
     */
    public Golfinette_UI(Golfinette golfinette) {
    	this.golfinette = golfinette;
    	initComponents();
        updateView ();
    }

    public Golfinette getGolfinette() {
		return golfinette;
	}

	public void updateView () {
		jGolfinette.setText(golfinette.toString());
    	this.revalidate();
        this.repaint();
    }

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGolfinette = new javax.swing.JLabel();

        jGolfinette.setText("jLabel20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jGolfinette, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jGolfinette)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jGolfinette;
    // End of variables declaration//GEN-END:variables

}
