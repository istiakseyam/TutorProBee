/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.*;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    ArrayList<Person> p = new ArrayList<>();
    ArrayList<Tutor> tr = new ArrayList<>();
    ArrayList<Student> sr = new ArrayList<>();
    private static String online;
    private static String fn;
    private static String ps;
    private static String c_st;
    private static String e;
    //private static boolean isST;
    //private static boolean isTT;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        SystemTime();
        
    }
    
    public void WelcomeScreen(String n,String u,String p,String st)
    {
        InformationS i = new InformationS();
        InformationT it = new InformationT();
        //Profile pf = new Profile();
        fn = n;
        ps = p;
        online = u;
        c_st = st;
        WC.setText("Welcome" + " " + online);
       /* if(c_st.equalsIgnoreCase("Student"))
        {
            i.catchV(fn, online,ps,c_st);
            jDesktopPane1.add(i);
            //jPanel3.add(pf);
        }
       else
        {
           // jPanel3.add(i)
        }*/
        
        
    }
   public  void SystemTime()
    {
        Thread clock = new Thread()
                {
                    @Override
                    public void run()
                {
                    try
                {    for(;;)
                {
                      Calendar c = new GregorianCalendar();
                      int day = c.get(Calendar.DAY_OF_MONTH);
                      int month = c.get(Calendar.MONTH);
                      int year = c.get(Calendar.YEAR);
       
                      int hour = c.get(Calendar.HOUR);
                      int minute = c.get(Calendar.MINUTE);
                      int second = c.get(Calendar.SECOND);
                      //jLabel1.setText("Date :" + " " + day + "/" + month + "/" + year);
                      jLabel2.setText("Time :" + " " + hour + ":" + minute + ":" + second);
                      sleep(1000);
                }
                }
                    catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                }
                };
       clock.start();
       
    }
   public void fillArrayP()
    {
        //p.removeAll(p);
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
        
        
        int i;
        String line = null;
        fillArrayP();
        
        
        for(i =0;i<p.size();i++)
        {
            if(p.get(i).getU().equals(online) && p.get(i).getP().equals(ps))
            {
                p.remove(i);
                break;
            }
        }
        try
        {
            FileWriter fe = new FileWriter("LOGIN.txt",false);
            fe.close();
            FileWriter fw = new FileWriter("LOGIN.txt",true);
            
            for(i =0;i<p.size();i++)
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
     public void fillArrayT()
    {
        //tr.removeAll(tr);
        String line = null;
        try
        {
        FileReader fr = new FileReader("Tutor.txt");
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
                int c_n = Integer.parseInt(t.nextToken());
                String e = t.nextToken();
                String c1 = t.nextToken();
                String c2 = t.nextToken();
                String ar = t.nextToken();
                String far = t.nextToken();
                tr.add(new Tutor(n,u,pw,d_g,c_n,e,c1,c2,ar,far));
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
      private void checkT()
    {
      
        fillArrayT();
        
        for(int i =0;i<tr.size();i++)
        {
            if(tr.get(i).getU().equals(online) && tr.get(i).getP().equals(ps))
            {
                tr.remove(i);
                break;
            }
        }
       // tr.add(new Tutor(newfn,newonline,newps,deg,c_n,e,c1,c2,a,f_a));
        try
        {
            FileWriter fr = new FileWriter("Tutor.txt",false);
            fr.close();
            FileWriter w = new FileWriter("Tutor.txt",true);
            for(int i = 0;i<tr.size();i++)
            {
                
                w.write(tr.get(i).getN()+"/"+tr.get(i).getU()+"/"+tr.get(i).getP()+"/"+tr.get(i).getD()+"/"+tr.get(i).getC()+"/"+tr.get(i).getEm()+"/"+tr.get(i).getC1()+"/"+tr.get(i).getC2()+"/"+tr.get(i).getAd()+"/"+tr.get(i).getFAd()+"\n");
               
            }
             w.close();
        }
        catch(IOException we)
        {
            we.printStackTrace();
        }
        
    }
      public void fillArrayS()
    {
        //sr.removeAll(sr);
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
                 e = t.nextToken();
                String ar = t.nextToken();
                String far = t.nextToken();
                sr.add(new Student(n,u,pw,d_g,ag,c_n,e,ar,far));
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
        
        String line = null;
        fillArrayS();
        
        for(int i =0;i<sr.size();i++)
        {
            if(sr.get(i).getU().equals(online) && sr.get(i).getP().equals(ps))
            {
                sr.remove(i);
                break;
            }
        }
        //s.add(new Student(newfn,newonline,newps,deg,age,c_n,e,a,f_a));
        try
        {
            FileWriter fr = new FileWriter("Student.txt",false);
            fr.close();
            FileWriter w = new FileWriter("Student.txt",true);
            for(int i = 0;i<sr.size();i++)
            {
                
                w.write(sr.get(i).getN() + "/" + sr.get(i).getU() + "/" + sr.get(i).getP() + "/"+ sr.get(i).getD()+"/"+sr.get(i).getA()+"/"+sr.get(i).getCN()+"/"+sr.get(i).getEm()+"/"+sr.get(i).getAd()+"/"+sr.get(i).getF_Ad()+"\n");
               
            }
             w.close();
        }
        catch(IOException we)
        {
            we.printStackTrace();
        }
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WC = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(29, 49, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WC.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        WC.setForeground(new java.awt.Color(204, 204, 204));
        WC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(WC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/das.jpg"))); // NOI18N
        jLabel3.setText("Dashboard");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/Pro.jpg"))); // NOI18N
        jLabel4.setText("   Profile");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/ed.jpg"))); // NOI18N
        jLabel5.setText("     Edit Info");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/hm.jpg"))); // NOI18N
        jLabel6.setText("      Home");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/del.jpg"))); // NOI18N
        jLabel7.setText("   Delete ID");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/logout.jpg"))); // NOI18N
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 160, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 160, 30));

        jDesktopPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/jkl.png"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 410));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        ProfileS pr = new ProfileS();
        ProfileT pt = new ProfileT();
       // jPanel3.removeAll();
        if(c_st.equalsIgnoreCase("Student"))
        {
             pr.contents(fn, online, ps);
            //jPanel3.repaint();
            //jPanel3.revalidate();
            jDesktopPane1.add(pr).setVisible(true);
        }
        else
        {
            pt.contnts(fn, online, ps);
             jDesktopPane1.add(pt).setVisible(true);
        }
            
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        InformationS i = new InformationS();
        InformationT it = new InformationT();
        if(c_st.equalsIgnoreCase("Student"))
        {
            i.catchV(fn, online,ps,c_st);
            //i.reedit();
            //jPanel3.removeAll();
            //jPanel3.repaint();
            //jPanel3.revalidate();
            
            jDesktopPane1.add(i).setVisible(true);
            //jPanel3.repaint();
            //jPanel3.revalidate();
            
        }
        else
        {
            it.cachV(fn, online, ps, c_st);
            jDesktopPane1.add(it).setVisible(true);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        int f = evt.getClickCount();
        if(f==1)
        {
            checkP();
            if(c_st.equalsIgnoreCase("Student"))
            {
                checkS();
            }
            else
            {
                checkT();
            }
            JOptionPane.showMessageDialog(this, "Account deleted successfully!!");
            Login l = new Login();
            l.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Search s = new Search();
        s.catv(fn,e);
        int f = evt.getClickCount();
        if(c_st.equalsIgnoreCase("Student"))
        {
            jDesktopPane1.add(s).setVisible(true);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        int f = evt.getClickCount();
        Login lr = new Login();
        if(f==1)
        {
            JOptionPane.showMessageDialog(this, "Logged out successfully!!");
            lr.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WC;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
