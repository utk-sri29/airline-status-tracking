package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    public Home() {
        setLayout(null);

        // Background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.JPG"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);

        // Italic, large heading, shifted toward seat
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(700, 100, 1000, 60);  // x, y, width, height - shifted right and down
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Serif", Font.ITALIC, 40));  // Italic style, larger font
        image.add(heading);

        // Menu bar setup
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu details = new JMenu("Details");
        menubar.add(details);

        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);

        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);

        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);

        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);

        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);

        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);

        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();

        switch (text) {
            case "Add Customer Details" -> new AddCustomer();
            case "Flight Details" -> new FlightInfo();
            case "Book Flight" -> new BookFlight();
            case "Journey Details" -> new JourneyDetails();
            case "Cancel Ticket" -> new Cancel();
            default -> {
            }
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
