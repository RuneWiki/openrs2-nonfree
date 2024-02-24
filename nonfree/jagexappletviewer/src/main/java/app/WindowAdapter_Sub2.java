package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jagexappletviewer!app/f")
final class WindowAdapter_Sub2 extends WindowAdapter implements ActionListener {

	@OriginalMember(owner = "jagexappletviewer!app/f", name = "a", descriptor = "Ljagexappletviewer!app/f;")
	private static WindowAdapter_Sub2 aWindowAdapter_Sub2_1;

	@OriginalMember(owner = "jagexappletviewer!app/f", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		appletviewer.method22(0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/f", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V")
	public final void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		appletviewer.method22(0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/f", name = "<init>", descriptor = "()V")
	private WindowAdapter_Sub2() {
	}

	@OriginalMember(owner = "jagexappletviewer!app/f", name = "a", descriptor = "(B)Ljagexappletviewer!app/f;")
	static final WindowAdapter_Sub2 method27(@OriginalArg(0) byte arg0) {
		if (arg0 != -42) {
			aWindowAdapter_Sub2_1 = null;
		}
		if (aWindowAdapter_Sub2_1 == null) {
			aWindowAdapter_Sub2_1 = new WindowAdapter_Sub2();
		}
		return aWindowAdapter_Sub2_1;
	}
}
