package app;

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jagexappletviewer!app/l")
final class Class13 {

	@OriginalMember(owner = "jagexappletviewer!app/l", name = "a", descriptor = "Ljava/lang/String;")
	String aString4;

	@OriginalMember(owner = "jagexappletviewer!app/l", name = "b", descriptor = "Ljava/awt/Rectangle;")
	Rectangle aRectangle1 = new Rectangle();

	@OriginalMember(owner = "jagexappletviewer!app/l", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class13(@OriginalArg(0) String arg0) {
		this.aString4 = arg0;
	}
}
