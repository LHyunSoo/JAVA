import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasketTest extends JFrame{
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(10,25);	//행, 열
	BasketTest(){
		setTitle("장바구니");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JPanel jp=new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(new JLabel("구매항목"));
		jp.add(tf);
		
		cp.add(jp);
		cp.add(new JScrollPane(ta));
		
		tf.addActionListener(new MyAction());
		setSize(300,280);
		setVisible(true);
	}
	class MyAction implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			ta.append(tf.getText()+"\n");
			tf.setText("");
		}
		
	}
	public static void main(String[] args) {
		new BasketTest();
	}
}
	