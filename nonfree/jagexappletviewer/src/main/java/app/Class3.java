package app;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/ba")
final class Class3 implements ActionListener {

	@OriginalMember(owner = "jagexappletviewer!app/ba", name = "a", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "jagexappletviewer!app/ba", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V")
	public final void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(new URI(this.aString2));
			} catch (@Pc(12) Exception local12) {
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/ba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class3(@OriginalArg(0) String arg0) {
		this.aString2 = arg0;
	}
}
