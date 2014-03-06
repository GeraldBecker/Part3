package q4;

import javax.swing.JFrame;

/**
 * <p> Demonstrates a graphical user interface and event
 * listeners to tally votes for two candidates, Joe and Sam.
 * </p>
 *
 * @author Gerald Becker A00900309 1A
 * @version 1.0
 */
public class VoteCounter {
    /**
     * Creates the frame with a vote counter panel and displays it.
     * @param args not used
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
