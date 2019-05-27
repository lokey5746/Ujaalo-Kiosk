/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujaalo;

import Student.BillGeneration;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Kshitij Bajagain
 */


//This class will creates the events jframe
public class Events extends javax.swing.JFrame {

	/**
	 * This class is not working right now
	 * @author User
	 * @version 1.0
	 * @updated 20-May-2019 3:22:45 PM
	 */
	

    
    Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs = null;
    
    /**
     * Creates new form Events
     */
    
    
    public Events() {
        initComponents();
        
        EventList();
        ShowDate();
        
        
        
    }

   
   
    public void BookingValidation(){
        
       // BookDate.
        
        
    }
    
    
    
    public void AfterBooking(){
        
        
        //This will decrease the value of previous total no. of seats 
       //And Update again in that specific EventID
       
       DefaultTableModel model = (DefaultTableModel)EventsList.getModel();
       
       // get the selected row index
       int selectedRowIndex = EventsList.getSelectedRow();
      
       //Validating and updating the table by changing
       String EID = model.getValueAt(selectedRowIndex,0).toString();
       String TotalSeats=model.getValueAt(selectedRowIndex, 5).toString();
       
       String value1=Events.NoSeats.getSelectedItem().toString();
       int Seats = Integer.parseInt(value1);
       
       
       int result = Integer.parseInt(TotalSeats);	
        int a = result-Seats;
        //System.out.println(a);
        
        
        String remainingSeats = new Integer(a).toString();
        
        
        //now updating the number of seats in Database
       
       
       
        conn = OracleDatabase.ConnectDb();
       
       
        try{
           
           String sql = "UPDATE Events SET NoOfSeats=? WHERE EventID=?";
           pst = (OraclePreparedStatement) conn.prepareStatement(sql);
           
           //This will the update the number of table again
           
           pst.setString(1,remainingSeats);
           pst.setString(2,EID);
           
           
   
           
           rs =(OracleResultSet) pst.executeQuery();
           
           
           
       }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
     void ShowDate(){
        
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        BookDate.setText(s.format(d));
        
    }
    
    
    
    
public void EventList(){
    
    DefaultTableModel table = new DefaultTableModel();
    
  
   
    
    table.addColumn("Event ID");
    table.addColumn("Event Name");
    table.addColumn("Category");
    table.addColumn("Description");
    //table.addColumn("Venue");
    table.addColumn("Event Date");
    table.addColumn("Total Seats");
    table.addColumn("PriceRate");
    
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
                //rs.getString(6)
            });
        }
        EventsList.setModel(table);
        EventsList.setShowHorizontalLines(true); 
        EventsList.setGridColor(Color.white);
        
       
        // TableColumnModel cmodel = EventsList.getColumnModel(); 
         
    
        
        
        
        
        
        
    }catch(Exception e){
        
    }
    
    
   

    
   
}
    



public void Booking(){
     // Databse connectivity with our permanent OracleDatabase class such that it will be more agile(dyanmic)
         conn = OracleDatabase.ConnectDb();
         
          DefaultTableModel model = (DefaultTableModel)EventsList.getModel();

        // get the selected row index
        int selectedRowIndex = EventsList.getSelectedRow();
        String TotalSeats=model.getValueAt(selectedRowIndex, 5).toString();
        int TotalSeat=Integer.parseInt(TotalSeats);
        
        String value=NoSeats.getSelectedItem().toString();
        int BookSeat=Integer.parseInt(value);
        
        // String book = 

        try{

            String sql = "insert into Booking (UniversityID,EventID,EventsName,Category,EventDate,NoOfSeats,BookedDate,PriceRate) values(?,?,?,?,?,?,?,?)";
            
            //String sql1 = 
            //String value=NoSeats.getSelectedItem().toString();
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,Login.txt_unID.getText());
            pst.setString(2,EventID.getText());
            
            //pst.setString(2,Login.txt_unID.getText());
            pst.setString(3,EventName.getText());
           
            pst.setString(4,Category.getText());
            
            pst.setString(5,EventDate.getText());
           
            String value1=NoSeats.getSelectedItem().toString();
            pst.setString(6, value1);
            
            pst.setString(7,BookDate.getText());
            
            pst.setString(8,Rate.getText());
            rs =(OracleResultSet) pst.executeQuery();

            if (TotalSeat>BookSeat)
            {
                JOptionPane.showMessageDialog(null,"Booking Successful.Now you will be redirected to events page");
                
                AfterBooking();
                
                EventList();
                
                
                
                BillGeneration ef= new BillGeneration();
                ef.setVisible(true);
                
                //AfterBooking();
                //EventList();
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Booking Unsuccessful.Please fill the booking form carefully!! Seat cannot exceed total available seat");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
 
    
}














    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EventPanel = new javax.swing.JPanel();
        MainEventPanel = new javax.swing.JPanel();
        AITitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NoOfSeats = new javax.swing.JLabel();
        eventdate = new javax.swing.JLabel();
        btn_book = new javax.swing.JButton();
        NoSeats = new javax.swing.JComboBox<>();
        EventDate = new javax.swing.JTextField();
        bookDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EventsList = new javax.swing.JTable();
        eventname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventName = new javax.swing.JTextArea();
        txt_EventID = new javax.swing.JLabel();
        EventID = new javax.swing.JTextField();
        txt_EventID1 = new javax.swing.JLabel();
        Category = new javax.swing.JTextField();
        SelectEvent = new javax.swing.JLabel();
        Rate = new javax.swing.JTextField();
        txt_EventID2 = new javax.swing.JLabel();
        EventDetails = new javax.swing.JLabel();
        BookDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        EventPanel.setBackground(new java.awt.Color(99, 110, 114));
        EventPanel.setMaximumSize(new java.awt.Dimension(1366, 768));
        EventPanel.setMinimumSize(new java.awt.Dimension(1368, 768));
        EventPanel.setPreferredSize(new java.awt.Dimension(1366, 768));

        MainEventPanel.setBackground(new java.awt.Color(237, 28, 36));

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

        javax.swing.GroupLayout MainEventPanelLayout = new javax.swing.GroupLayout(MainEventPanel);
        MainEventPanel.setLayout(MainEventPanelLayout);
        MainEventPanelLayout.setHorizontalGroup(
            MainEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainEventPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AITitle)
                .addGap(360, 360, 360))
        );

        MainEventPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        MainEventPanelLayout.setVerticalGroup(
            MainEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainEventPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MainEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainEventPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainEventPanelLayout.createSequentialGroup()
                        .addGroup(MainEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AITitle)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        NoOfSeats.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        NoOfSeats.setForeground(new java.awt.Color(255, 255, 255));
        NoOfSeats.setText("No. of Seats");

        eventdate.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        eventdate.setForeground(new java.awt.Color(255, 255, 255));
        eventdate.setText("Event Date");

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

        bookDate.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        bookDate.setForeground(new java.awt.Color(255, 255, 255));
        bookDate.setText("Booked Date");

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
        EventsList.setUpdateSelectionOnSort(false);
        EventsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EventsList);

        eventname.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        eventname.setForeground(new java.awt.Color(255, 255, 255));
        eventname.setText("Event Name");
        eventname.setAutoscrolls(true);

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
        txt_EventID.setText("Event ID");

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

        SelectEvent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SelectEvent.setForeground(new java.awt.Color(255, 255, 255));
        SelectEvent.setText("Select the desired event below for booking.");

        Rate.setEditable(false);
        Rate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        Rate.setPreferredSize(new java.awt.Dimension(38, 31));
        Rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateActionPerformed(evt);
            }
        });

        txt_EventID2.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        txt_EventID2.setForeground(new java.awt.Color(255, 255, 255));
        txt_EventID2.setText("Price Rate");

        EventDetails.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        EventDetails.setForeground(new java.awt.Color(255, 255, 255));
        EventDetails.setText("Event Details");

        BookDate.setEditable(false);
        BookDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BookDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        BookDate.setPreferredSize(new java.awt.Dimension(38, 31));

        javax.swing.GroupLayout EventPanelLayout = new javax.swing.GroupLayout(EventPanel);
        EventPanel.setLayout(EventPanelLayout);
        EventPanelLayout.setHorizontalGroup(
            EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainEventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EventPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1)
                .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventPanelLayout.createSequentialGroup()
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EventPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eventdate)
                                    .addComponent(bookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_EventID)
                                    .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_EventID1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eventname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NoOfSeats))
                                    .addComponent(txt_EventID2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NoSeats, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EventDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(EventID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BookDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(EventPanelLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(EventDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
            .addGroup(EventPanelLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(SelectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPanelLayout.setVerticalGroup(
            EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanelLayout.createSequentialGroup()
                .addComponent(MainEventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(EventPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(EventDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_EventID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EventID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_EventID1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoOfSeats))
                        .addGap(15, 15, 15)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(EventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_EventID2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
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

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void EventIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventIDActionPerformed

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

        String TotalSeats=model.getValueAt(selectedRowIndex, 5).toString();

    }//GEN-LAST:event_EventsListMouseClicked

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed

        // Databse connectivity with our permanent OracleDatabase class such that it will be more agile(dyanmic)
         conn = OracleDatabase.ConnectDb();
         
          DefaultTableModel model = (DefaultTableModel)EventsList.getModel();

        // get the selected row index
        int selectedRowIndex = EventsList.getSelectedRow();
        String TotalSeats=model.getValueAt(selectedRowIndex, 5).toString();
        int TotalSeat=Integer.parseInt(TotalSeats);
        
        String value=NoSeats.getSelectedItem().toString();
        int BookSeat=Integer.parseInt(value);
        
        // String book = 

        try{

            String sql = "insert into Booking (UniversityID,EventID,EventsName,Category,EventDate,NoOfSeats,BookedDate,PriceRate) values(?,?,?,?,?,?,?,?)";
            
            //String sql1 = 
            //String value=NoSeats.getSelectedItem().toString();
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,Login.txt_unID.getText());
            pst.setString(2,EventID.getText());
            
            //pst.setString(2,Login.txt_unID.getText());
            pst.setString(3,EventName.getText());
           
            pst.setString(4,Category.getText());
            
            pst.setString(5,EventDate.getText());
           
            String value1=NoSeats.getSelectedItem().toString();
            pst.setString(6, value1);
            
            pst.setString(7,BookDate.getText());
            
            pst.setString(8,Rate.getText());
            rs =(OracleResultSet) pst.executeQuery();

            if (TotalSeat>BookSeat)
            {
                JOptionPane.showMessageDialog(null,"Booking Successful.Now you will be redirected to events page");
                
                AfterBooking();
                
                EventList();
                
                
                
                BillGeneration ef= new BillGeneration();
                ef.setVisible(true);
                
                //AfterBooking();
                //EventList();
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Booking Unsuccessful.Please fill the booking form carefully!! Seat cannot exceed total available seat");
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
        
    }//GEN-LAST:event_btn_bookActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        StudentDashboard ogf= new StudentDashboard();
        ogf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        StudentDashboard ogf= new StudentDashboard();
        ogf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Events().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AITitle;
    public static javax.swing.JTextField BookDate;
    public static javax.swing.JTextField Category;
    public static javax.swing.JTextField EventDate;
    private javax.swing.JLabel EventDetails;
    public static javax.swing.JTextField EventID;
    public static javax.swing.JTextArea EventName;
    private javax.swing.JPanel EventPanel;
    private javax.swing.JTable EventsList;
    private javax.swing.JPanel MainEventPanel;
    private javax.swing.JLabel NoOfSeats;
    public static javax.swing.JComboBox<String> NoSeats;
    public static javax.swing.JTextField Rate;
    private javax.swing.JLabel SelectEvent;
    private javax.swing.JLabel bookDate;
    private javax.swing.JButton btn_book;
    private javax.swing.JLabel eventdate;
    private javax.swing.JLabel eventname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txt_EventID;
    private javax.swing.JLabel txt_EventID1;
    private javax.swing.JLabel txt_EventID2;
    // End of variables declaration//GEN-END:variables
}
