package app;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/b")
final class WindowAdapter_Sub1 extends WindowAdapter implements ActionListener {

	@OriginalMember(owner = "jagexappletviewer!app/b", name = "a", descriptor = "Ljava/awt/Dialog;")
	private Dialog aDialog2 = new Dialog(appletviewer.aFrame1, appletviewer.method11(102, "information"), true);

	@OriginalMember(owner = "jagexappletviewer!app/b", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V")
	public final void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		this.aDialog2.setVisible(false);
	}

	@OriginalMember(owner = "jagexappletviewer!app/b", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.aDialog2.setVisible(false);
	}

	@OriginalMember(owner = "jagexappletviewer!app/b", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	WindowAdapter_Sub1(@OriginalArg(0) String arg0) {
		@Pc(17) TextArea local17 = new TextArea();
		local17.setText(appletviewer.method11(112, "copy_paste_url") + ":\n" + arg0);
		local17.setEditable(false);
		this.aDialog2.add(local17);
		@Pc(46) Button local46 = new Button(appletviewer.method11(82, "ok"));
		local46.addActionListener(this);
		@Pc(53) Panel_Sub1 local53 = new Panel_Sub1();
		local53.setLayout(new FlowLayout(1));
		local53.add(local46);
		this.aDialog2.addWindowListener(this);
		this.aDialog2.add(local53, "South");
		this.aDialog2.setResizable(false);
		this.aDialog2.setSize(400, 150);
		this.aDialog2.setLocationRelativeTo(appletviewer.aFrame1);
		this.aDialog2.setVisible(true);
	}
}
