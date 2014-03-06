package q4;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * <p> Panel for the GUI that tallies votes for two candidates,
 * Joe and Sam. Displays who is winning or if they are tied.
 * </p>
 *
 * @author Gerald Becker A00900309 1A
 * @version 1.0
 */
public class VoteCounterPanel extends JPanel {
    /**
     * The width of the panel.
     */
    static final int WIDTH = 300;
    
    /**
     * The height of the panel.
     */
    static final int HEIGHT = 90;
    
    /**
     * Serial for class.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Amount of votes for Joe.
     */
    private int votesForJoe;
    
    /**
     * Amount of votes for Sam.
     */
    private int votesForSam;
    
    /**
     * Button to click for Joe.
     */
    private JButton joe;
    
    /**
     * Button to click for Sam.
     */
    private JButton sam;
    
    /**
     * Label stating to vote for Joe.
     */
    private JLabel labelJoe;
    
    /**
     * Label stating to vote for Sam.
     */
    private JLabel labelSam;
    
    /**
     * Label stating who is winning.
     */
    private JLabel labelWinning;
    
    /**
     * Constructor: Sets up the GUI.
     */
    public VoteCounterPanel() {
        // set up text for Joe
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new VoteButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        
        // set up text for Sam
        votesForSam = 0;
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new VoteButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        
        // set the default text as being tied
        labelWinning = new JLabel("Both candidates are currently tied.");
        
        // add buttons and labels
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        add(labelWinning);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.cyan);
    }
    
    /**
     * Represents a listener for button push (action) events.
     * 
     * @author Gerald
     *
     */
    private class VoteButtonListener implements ActionListener {
        /**
         * Updates the appropriate vote counter when a
         * button is pushed for one of the candidates.
         * @param event 
         */
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            } else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }
            if (votesForJoe > votesForSam) {
                labelWinning.setText("Joe is currently winning with " 
                        + votesForJoe + " votes!");
            } else if (votesForJoe < votesForSam) {
                labelWinning.setText("Sam is currently winning with " 
                        + votesForSam + " votes!");
            } else {
                labelWinning.setText("Both candidates are currently tied.");
            }
        }
    }
}
