/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import Ujaalo.KioskMain;
import Ujaalo.Login;
import Ujaalo.OracleDatabase;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author User
 */
public class EventsNormal extends javax.swing.JFrame {

    /**
     * Creates new form EventsNormal
     */
    
    Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs = null;
    
    
    public EventsNormal() {
        initComponents();
        
        EventList();
    }

    
    public void EventList(){
    
    DefaultTableModel table = new DefaultTableModel();
    
        //TableColumnModel cmodel = EventsList.getColumnModel(); 
         
        //TextAreaRenderer table = new TextAreaRenderer(); 
   
    
    table.addColumn("Event ID");
    table.addColumn("Event Name");
    table.addColumn("Category");
    table.addColumn("Description");
    //table.addColumn("Venue");
    table.addColumn("Event Date");
    table.addColumn("Total Seats");
     table.addColumn("Price Rate");
    
    conn = OracleDatabase.ConnectDb();
    try
    {
        //conn = OracleDatabase.ConnectDb();
        String sql = "SELECT EventID,EventsName,Category,Description,EventDate,NoOfSeats,PriceRate FROM Events";
        
        pst = (OraclePreparedStatement) conn.prepareStatement(sql);
        
        
        rs =(OracleResultSet) pst.executeQuery();
        
        //ResultSet R = S.executeQuery(sql);
        
        while(rs.next()){
            table.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                //txtCourse.setText(rs.getString(2));
            });
        }
        EventsList.setModel(table);
        EventsList.setShowHorizontalLines(true); 
        EventsList.setGridColor(Color.white);
        
        
        //TableColumnModel cmodel = EventsList.getColumnModel(); 
         
        //TextAreaRenderer textAreaRenderer = new TextAreaRenderer(); 
        //cmodel.getColumn(1).setCellRenderer(table);
        
        //TextAreaRenderer textAreaRenderer = new TextAreaRenderer();
       // cmodel.getColumn(3).setCellRenderer(table); 
        
        // devashish.kumar@lbef.edu.np 
        
        
        
    }catch(Exception e){
        
    }
   
}
    
    
    
    public void imagedetails(){
        conn = OracleDatabase.ConnectDb();
    
        String EID=EventID.getText();
        try
    {
        //conn = OracleDatabase.ConnectDb();
        String sql = "SELECT EventImage FROM Events WHERE EventID=?";
        
        pst = (OraclePreparedStatement) conn.prepareStatement(sql);
        pst.setString(1,EID);
        
        rs =(OracleResultSet) pst.executeQuery();
        
       
        
       while(rs.next())
           {
              
               //String LoginDate=(rs.getString(1));
               //txtLogIn.setText(rs.getString(1));
               //txtCourse.setText(rs.getString(2));
                
           }
           
            
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
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

        EventPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AITitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_book = new javax.swing.JButton();
        NoSeats = new javax.swing.JComboBox<>();
        EventDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BookDate = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        EventsList = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventName = new javax.swing.JTextArea();
        txt_EventID = new javax.swing.JLabel();
        EventID = new javax.swing.JTextField();
        txt_EventID1 = new javax.swing.JLabel();
        Category = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_EventID2 = new javax.swing.JLabel();
        Rate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        EventPanel.setBackground(new java.awt.Color(99, 110, 114));
        EventPanel.setMaximumSize(new java.awt.Dimension(1366, 768));
        EventPanel.setMinimumSize(new java.awt.Dimension(1368, 768));
        EventPanel.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(237, 28, 36));

        AITitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        AITitle.setForeground(new java.awt.Color(255, 255, 255));
        AITitle.setText("Campus And Community Events");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AITitle)
                .addGap(360, 360, 360))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AITitle)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. of Seats");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Event Date");

        btn_book.setBackground(new java.awt.Color(51, 51, 255));
        btn_book.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_book.setText("Book");
        btn_book.setBorder(null);
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });

        NoSeats.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NoSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        NoSeats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));

        EventDate.setEditable(false);
        EventDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EventDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        EventDate.setPreferredSize(new java.awt.Dimension(38, 31));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Booked Date");

        BookDate.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(255, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    BookDate.setCalendarBackground(new java.awt.Color(255, 255, 255));
    BookDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED,
        (java.awt.Color)null,
        (java.awt.Color)null,
        (java.awt.Color)null,
        (java.awt.Color)null));
BookDate.setCalendarPreferredSize(new java.awt.Dimension(376, 330));
try {
    BookDate.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2019, 3, 23),
        new java.util.GregorianCalendar(2019, 3, 23))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
e1.printStackTrace();
}
BookDate.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 13));
BookDate.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 10));

EventsList.setAutoCreateRowSorter(true);
EventsList.setBackground(new java.awt.Color(99, 110, 114));
EventsList.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 51, 51)));
EventsList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
EventsList.setForeground(new java.awt.Color(255, 255, 255));
EventsList.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
    },
    new String [] {
        "Event ID", "Event Name", "Category", "Description", "Event Date", "Total Seats"
    }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    EventsList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    EventsList.setRowHeight(150);
    EventsList.setRowMargin(2);
    EventsList.setRowSorter(null);
    EventsList.setSelectionForeground(new java.awt.Color(255, 255, 255));
    EventsList.setUpdateSelectionOnSort(false);
    EventsList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            EventsListMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(EventsList);

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Event Name");
    jLabel8.setAutoscrolls(true);

    EventName.setEditable(false);
    EventName.setColumns(20);
    EventName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    EventName.setLineWrap(true);
    EventName.setRows(5);
    EventName.setWrapStyleWord(true);
    EventName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
    jScrollPane2.setViewportView(EventName);

    txt_EventID.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
    txt_EventID.setForeground(new java.awt.Color(255, 255, 255));
    txt_EventID.setText("Price Rate");

    EventID.setEditable(false);
    EventID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    EventID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
    EventID.setPreferredSize(new java.awt.Dimension(38, 31));
    EventID.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            EventIDActionPerformed(evt);
        }
    });

    txt_EventID1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
    txt_EventID1.setForeground(new java.awt.Color(255, 255, 255));
    txt_EventID1.setText("Category");

    Category.setEditable(false);
    Category.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    Category.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
    Category.setPreferredSize(new java.awt.Dimension(38, 31));
    Category.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            CategoryActionPerformed(evt);
        }
    });

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Select the desired event below for booking.");

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Events Details");

    txt_EventID2.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
    txt_EventID2.setForeground(new java.awt.Color(255, 255, 255));
    txt_EventID2.setText("Event ID");

    Rate.setEditable(false);
    Rate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    Rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
    Rate.setPreferredSize(new java.awt.Dimension(38, 31));
    Rate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RateActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout EventPanelLayout = new javax.swing.GroupLayout(EventPanel);
    EventPanel.setLayout(EventPanelLayout);
    EventPanelLayout.setHorizontalGroup(
        EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(EventPanelLayout.createSequentialGroup()
            .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EventPanelLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jScrollPane1))
                .addGroup(EventPanelLayout.createSequentialGroup()
                    .addGap(277, 277, 277)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventPanelLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(123, 123, 123))
                .addGroup(EventPanelLayout.createSequentialGroup()
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EventPanelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_EventID)
                                .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_EventID1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addComponent(txt_EventID2))
                            .addGap(17, 17, 17)
                            .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BookDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(NoSeats, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EventDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(EventID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(EventPanelLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(jLabel9)))
                    .addGap(25, 25, 25))))
    );
    EventPanelLayout.setVerticalGroup(
        EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(EventPanelLayout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EventPanelLayout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EventID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_EventID2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_EventID1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NoSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(15, 15, 15)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_EventID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventPanelLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(EventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(EventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed

        // Databse connectivity with our permanent OracleDatabase class such that it will be more agile(dyanmic)
/**
        conn = OracleDatabase.ConnectDb();

        try{

            String sql = "insert into Book (EventID,EventsName,Category,EventDate,NoOfSeats,BookDate) values(?,?,?,?,?,?)";

            //String sql1 =
            //String value=NoSeats.getSelectedItem().toString();

            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,EventID.getText());
            pst.setString(2,EventName.getText());

            pst.setString(3,Category.getText());

            pst.setString(4,EventDate.getText());

            String value1=NoSeats.getSelectedItem().toString();
            pst.setString(5, value1);

            pst.setString(6,BookDate.getText());
            rs =(OracleResultSet) pst.executeQuery();

            if (rs.next())
            {
                JOptionPane.showMessageDialog(null,"Booking Successful.Now you will be redirected to events page");

                Events ef= new Events();
                ef.setVisible(true);
                this.dispose();
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Booking Unsuccessful.Please fill the booking form carefully!!");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

        //Validation Starts from here

        //if (txt_Password.getText().trim().isEmpty() && txt_UniID.getText().trim().isEmpty() && txt_Email.getText().trim().isEmpty() &//& txt_EnrolledCourses.getText().trim().isEmpty()){
            //lbl_validate.setText("*One or more required information is empty.");
            //}
**/

        JOptionPane.showMessageDialog(null,"Booking Unsuccessful. You need to be login for booking available events.");

                Login lgf = new Login();
                lgf.setVisible(true);
                //this.dispose();
    }//GEN-LAST:event_btn_bookActionPerformed

    private void EventsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsListMouseClicked
        // TODO add your handling code here:

        // get the model from the jtable
        DefaultTableModel model = (DefaultTableModel)EventsList.getModel();

        // get the selected row index
        int selectedRowIndex = EventsList.getSelectedRow();

        // set the selected row data into jtextfields
        EventID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        EventName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        EventDate.setText(model.getValueAt(selectedRowIndex, 4).toString());
        Category.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Rate.setText(model.getValueAt(selectedRowIndex, 6).toString());

    }//GEN-LAST:event_EventsListMouseClicked

    private void EventIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventIDActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void RateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RateActionPerformed

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
            java.util.logging.Logger.getLogger(EventsNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventsNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventsNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventsNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventsNormal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AITitle;
    private datechooser.beans.DateChooserCombo BookDate;
    private javax.swing.JTextField Category;
    private javax.swing.JTextField EventDate;
    private javax.swing.JTextField EventID;
    private javax.swing.JTextArea EventName;
    private javax.swing.JPanel EventPanel;
    private javax.swing.JTable EventsList;
    private javax.swing.JComboBox<String> NoSeats;
    private javax.swing.JTextField Rate;
    private javax.swing.JButton btn_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txt_EventID;
    private javax.swing.JLabel txt_EventID1;
    private javax.swing.JLabel txt_EventID2;
    // End of variables declaration//GEN-END:variables
}
