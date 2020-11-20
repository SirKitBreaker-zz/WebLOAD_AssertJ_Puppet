package org.assertj.swing.aut.components;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

public class DisabledTableFrame extends SampleFrame {
	private static final long serialVersionUID = 985196688365744882L;

	public DisabledTableFrame() {
		JTable table = new JTable();
		add(table);

		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				mouseReleased(e);
			}

			@Override
			@SuppressWarnings("unused")
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					new PopupMenu();
				}
			}
		});

		table.setEnabled(false);
		setSize(200, 300);
		setVisible(true);
	}

	private class PopupMenu extends JPopupMenu {
		private static final long serialVersionUID = 4795464046242912087L;

		public PopupMenu() {

			JMenuItem menuItem = new JMenuItem("TEST");
			add(menuItem);
			setVisible(true);
		}
	}
}