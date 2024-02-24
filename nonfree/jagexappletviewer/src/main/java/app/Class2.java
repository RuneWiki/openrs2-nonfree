package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/a")
final class Class2 implements ActionListener, WindowListener {

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "a", descriptor = "Ljava/awt/List;")
	private List aList1;

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "b", descriptor = "Ljava/awt/Dialog;")
	private Dialog aDialog1;

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "c", descriptor = "I")
	private int anInt1;

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V")
	public final void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		if (arg0.getActionCommand().equals("ok")) {
			this.anInt1 = this.aList1.getSelectedIndex();
			this.aDialog1.setVisible(false);
		} else {
			this.method3(-1);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.method3(-1);
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class2(@OriginalArg(0) String arg0) {
		@Pc(7) Panel local7 = new Panel();
		this.aList1 = new List();
		local7.setLayout(new BorderLayout());
		local7.add(this.aList1, "Center");
		@Pc(26) Panel local26 = new Panel();
		local26.setLayout(new GridLayout(1, 2));
		local7.add(local26, "South");
		@Pc(44) Button local44 = new Button(appletviewer.method11(86, "ok"));
		local44.setActionCommand("ok");
		local44.addActionListener(this);
		@Pc(57) Button local57 = new Button(appletviewer.method11(115, "cancel"));
		local57.setActionCommand("cancel");
		local57.addActionListener(this);
		local26.add(local44);
		local26.add(local57);
		this.aDialog1 = new Dialog(appletviewer.aFrame1, arg0, true);
		this.aDialog1.addWindowListener(this);
		this.aDialog1.setSize(200, 150);
		this.aDialog1.add(local7);
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	final void method2(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1) {
		this.aList1.removeAll();
		for (@Pc(6) int local6 = arg0; local6 < arg1.length; local6++) {
			@Pc(14) String local14 = arg1[local6];
			if (local14 != null) {
				this.aList1.add(local14);
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "a", descriptor = "(I)V")
	private final void method3(@OriginalArg(0) int arg0) {
		this.anInt1 = arg0;
		this.aDialog1.setVisible(false);
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/a", name = "a", descriptor = "(B)I")
	final int method4(@OriginalArg(0) byte arg0) {
		this.aDialog1.setLocationRelativeTo(appletviewer.aFrame1);
		if (arg0 >= -69) {
			this.windowClosing(null);
		}
		this.aDialog1.setVisible(true);
		return this.anInt1;
	}
}
