import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyWin extends Frame implements ActionListener {

	Button b1, b2;
	Panel p;
	TextField tf;

	MyWin() {

		p = new Panel();
		p.setBackground(Color.gray);
		p.setFont(new Font("Arial", Font.BOLD, 24));

		b1 = new Button("Tom");
		b2 = new Button("Jerry");
		tf = new TextField(20);

		p.add(b1);
		p.add(b2);
		p.add(tf);

		add(p);

		b1.addActionListener(this);
		b2.addActionListener(this);

		setSize(500, 500);
		setVisible(true);

		// addWindowListener(new A());

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		p.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent me) {
				System.out.println(me.getX());
				tf.setText(me.getX() + ", " + me.getY());
			}
		});
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {
			if (b2.isVisible())
				b2.setVisible(false);
			else
				b2.setVisible(true);
		}

		if (ae.getSource() == b2) {
			if (b1.isVisible())
				b1.setVisible(false);
			else
				b1.setVisible(true);
		}

	}

	class A extends WindowAdapter {

		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MyWin();
	}

}
