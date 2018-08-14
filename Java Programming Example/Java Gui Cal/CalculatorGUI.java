/*
 * CPSC 211: Lab 7
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * A GUI for the RPN Calculator
 * 
 * Class Invariant:
 *   calculator != null
 */
public class CalculatorGUI implements ActionListener {
    
    // The calculator for actually calculating!
    private RPNCalculator calculator;
    
    // The main frame for the GUI
    private JFrame frame;
    
    // The menubar for the GUI
    private JMenuBar menuBar;
    
    // Areas for numbers and operators
    private JPanel numKeysPane;
    private JPanel opKeysPane;
    
    private String input;
    final String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
    final String[] operations = { "+", "-", "*", "/" };

    /**
     * Constructor
     */
    public CalculatorGUI() {
        // Initialize the calculator
        calculator = new RPNCalculator();
    }

    /**
     * Initialize and display the calculator
     */
    public void showCalculator() {

        String buttonValue;
        JButton button;
        JMenu menu;
        JMenuItem menuItem;

        // Create the main GUI components
        frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numKeysPane = new JPanel(new GridLayout(4, 3));
        opKeysPane = new JPanel(new GridLayout(2, 2));

        initializeMenu();
        initializeNumberPad();

        // Create the components to go into the frame and
        // stick them in a container named contents
        frame.getContentPane().add(numKeysPane, BorderLayout.CENTER);
        frame.getContentPane().add(opKeysPane, BorderLayout.LINE_END);

        // Finish setting up the frame, and show it.
        frame.pack();
        frame.setVisible(true);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {
    } 

    /**
     * Initialize the number pad for the calculator
     */
    private void initializeNumberPad() {
        JButton button;
        for (int i = 0; i < numbers.length; i++) {
            button = new JButton(numbers[i]);
            button.addActionListener(this);
            numKeysPane.add(button);
        }
    }

    /**
     * Initialize the menu for the GUI
     */
    private void initializeMenu() {
        JMenu menu;
        JMenuItem menuItem;
        
        // Create a menu with one item, Quit
        menu = new JMenu("Calculator");
        menuItem = new JMenuItem("Quit");
        // When quit is selected, destroy the application
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // A trace message so you can see this
                // is invoked.
                System.err.println("Close window");
                frame.setVisible(false);
                frame.dispose();
            }
        });
        menu.add(menuItem);
        
        // Create the menu bar
        menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
    }
    
    /**
     * Helper method for displaying an error as a pop-up
     * @param message The message to display 
     */
    private static void errorPopup(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
