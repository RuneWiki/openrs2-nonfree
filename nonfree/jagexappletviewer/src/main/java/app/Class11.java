package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/j")
final class Class11 implements ActionListener {

	@OriginalMember(owner = "jagexappletviewer!app/j", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V")
	public final void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		@Pc(6) int local6 = appletviewer.anIntArray1[arg0.getID()];
		if (local6 == 0) {
			if (appletviewer.method8(-1) >= 0) {
				Class16.method40(appletviewer.method11(90, "changes_on_restart"), -122);
			}
		} else if (local6 == 1) {
			appletviewer.method9((byte) -93);
		}
	}
}
