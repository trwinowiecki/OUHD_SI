public class Main {
	public static void main(String[] args) {
		// Start GUI
		MainGUI gui = new MainGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(gui);
        frame.pack();
        frame.setVisible(true);
	}
}