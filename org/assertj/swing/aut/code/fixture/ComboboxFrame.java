package org.assertj.swing.aut.code.fixture;

import static org.assertj.swing.aut.util.swing.ComboBoxUtil.newBox;
import static javax.swing.SwingUtilities.invokeAndWait;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import org.assertj.swing.aut.components.SampleFrame;

public class ComboboxFrame extends SampleFrame {
	private static final long serialVersionUID = 1L;

	public ComboboxFrame() {
		final JComboBox<String> box = newBox("combobox", "a", "b", "c");

		add(box);
		pack();
	}
	
//	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
//		invokeAndWait(new Runnable() {
//			public void run() {
//				JFrame frame = new ComboboxFrame();
//				frame.setVisible(true);
//			}
//		});
//	}
}
