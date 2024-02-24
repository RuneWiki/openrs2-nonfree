package app;

import java.awt.Graphics;
import java.awt.Panel;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jagexappletviewer!app/q")
final class Panel_Sub1 extends Panel {

	@OriginalMember(owner = "jagexappletviewer!app/q", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	public final void paint(@OriginalArg(0) Graphics arg0) {
		arg0.setColor(this.getBackground());
		arg0.fillRect(0, 0, this.getWidth(), this.getHeight());
		super.paint(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/q", name = "<init>", descriptor = "()V")
	public Panel_Sub1() {
	}
}
