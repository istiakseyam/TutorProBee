
package base;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class InformationS extends javax.swing.JInternalFrame {
 ArrayList<Student> s = new ArrayList<>();
    ArrayList<Person> p = new ArrayList<>();
     private static String online;
    private static String fn;
    private static String ps;
    private static String deg;
    
    public InformationS() {
        initComponents();
        BasicInternalFrameTitlePane tp = (BasicInternalFrameTitlePane)((BasicInternalFrameUI)this.getUI()).getNorthPane();
        this.remove(tp);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(760, 410));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Enter Your Detailed Information");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 529, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Full Name :");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 20));
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("User Name :");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 20));
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 230, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Age :");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jTextField10.setToolTipText("Enter your age");
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 220, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Password :");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel5.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Contact No. :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Email :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 194, -1, 20));
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 220, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Teacher/Student :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jTextField13.setEditable(false);
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 180, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Full Address :");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 220, 100));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Local Area Name : ");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Continue");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 90, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        int d = evt.getClickCount();
        if(d==1)
        {
            //reedit();
            checkP();
            checkS();
            JOptionPane.showMessageDialog(this, "Successfully Updated!! Please Log in again to see the changes to your profile.");

        }
    }//GEN-LAST:event_jLabel19MouseClicked

    public void catchV(String n,String u,String p,String cst)
    {
        String line;
        deg = cst;
        jTextField13.setText(deg);
        fn = n;
        jTextField8.setText(n);
        online = u;
        jTextField9.setText(u);
        ps = p;
        jPasswordField1.setText(p);
        try
        {
            FileReader fr = new FileReader("Student.txt");
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine())!=null)
            {
                StringTokenizer t = new StringTokenizer(line,"/");
                while(t.hasMoreTokens())
                {
                    if(n.equals(t.nextToken())&&u.equals(t.nextToken())&&p.equals(t.nextToken()))
                    {
                        t.nextToken();
                        jTextField10.setText(t.nextToken());
                        jTextField11.setText(t.nextToken());
                        jTextField12.setText(t.nextToken());
                        jTextField15.setText(t.nextToken());
                        jTextField14.setText(t.nextToken());
                    }
                }
            }
            br.close();
            fr.close();
        }
        catch(IOException et)
        {
            et.printStackTrace();
        }
        
    }
    public void fillArrayP()
    {
         String line = null;
        try
        {
        FileReader fw = new FileReader("LOGIN.txt");
        BufferedReader bw = new BufferedReader(fw);
       
        while((line = bw.readLine())!=null)
        {
            StringTokenizer t = new StringTokenizer(line,"/");
            while(t.hasMoreTokens())
            {
                String n = t.nextToken();
                String u = t.nextToken();
                String pw = t.nextToken();
                String d_g = t.nextToken();
                p.add(new Person(n,u,pw,d_g));
                
            }
        }
        fw.close();
        bw.close();
        }
        catch(IOException et)
                {
                   et.printStackTrace();
                }
    }
    private void checkP()
    {
        
        String newfn = jTextField8.getText();
            String newonline = jTextField9.getText();
            String newps = jPasswordField1.getText();
        
        String line = null;
        fillArrayP();
        
        
        for(int i =0;i<p.size();i++)
        {
            if(p.get(i).getU().equals(online) && p.get(i).getP().equals(ps))
            {
                p.remove(i);
                break;
            }
        }
        p.add(new Person(newfn,newonline,newps,deg));
        try
        {
            FileWriter fe = new FileWriter("LOGIN.txt",false);
            fe.close();
            FileWriter fw = new FileWriter("LOGIN.txt",true);
            
            for(int i = 0;i<p.size();i++)
            {
                fw.write(p.get(i).getN() + "/" + p.get(i).getU() + "/" + p.get(i).getP() + "/"+ p.get(i).getD()+ "\n");
                
            }
             fw.close();
        }
        catch(IOException we)
        {
            we.printStackTrace();
        }
    }
    public void fillArrayS()
    {
        String line = null;
        try
        {
        FileReader fr = new FileReader("Student.txt");
        BufferedReader br = new BufferedReader(fr);
        while((line = br.readLine())!=null)
        {
            StringTokenizer t = new StringTokenizer(line,"/");
            while(t.hasMoreTokens())
            {
                String n = t.nextToken();
                String u = t.nextToken();
                String pw = t.nextToken();
                String d_g = t.nextToken();
                int ag = Integer.parseInt(t.nextToken());
                int c_n = Integer.parseInt(t.nextToken());
                String e = t.nextToken();
                String ar = t.nextToken();
                String far = t.nextToken();
                s.add(new Student(n,u,pw,d_g,ag,c_n,e,ar,far));
            }
        }
        
        fr.close();
        br.close();
        }
        catch(IOException et)
                {
                   et.printStackTrace();
                }
    }
    private void checkS()
    {
        String newfn = jTextField8.getText();
            String newonline = jTextField9.getText();
            String newps = jPasswordField1.getText();
        int age = Integer.parseInt(jTextField10.getText());
        int c_n = Integer.parseInt(jTextField11.getText());
        String e = jTextField12.getText();
        String a = jTextField15.getText();
        String f_a = jTextField14.getText();
        String line = null;
        fillArrayS();
        
        for(int i =0;i<s.size();i++)
        {
            if(s.get(i).getU().equals(online) && s.get(i).getP().equals(ps))
            {
                s.remove(i);
                break;
            }
        }
        s.add(new Student(newfn,newonline,newps,deg,age,c_n,e,a,f_a));
        try
        {
            FileWriter fr = new FileWriter("Student.txt",false);
            fr.close();
            FileWriter w = new FileWriter("Student.txt",true);
            for(int i = 0;i<s.size();i++)
            {
                
                w.write(s.get(i).getN() + "/" + s.get(i).getU() + "/" + s.get(i).getP() + "/"+ s.get(i).getD()+"/"+s.get(i).getA()+"/"+s.get(i).getCN()+"/"+s.get(i).getEm()+"/"+s.get(i).getAd()+"/"+s.get(i).getF_Ad()+"\n");
               
            }
             w.close();
        }
        catch(IOException we)
        {
            we.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
