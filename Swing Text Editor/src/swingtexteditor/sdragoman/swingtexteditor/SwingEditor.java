package sdragoman.swingtexteditor;

public class SwingEditor {

	public static void main(String[] args) {
		//the proper way to start a Swing application
		//this ensures the event-dispatching thread will be used
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingTextEditor();

			}
		});

	}
}
