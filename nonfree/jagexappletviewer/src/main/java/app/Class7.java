package app;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jagexappletviewer!app/e")
final class Class7 {

	@OriginalMember(owner = "jagexappletviewer!app/e", name = "a", descriptor = "Ljagexappletviewer!app/l;")
	Class13 aClass13_1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/e", name = "b", descriptor = "Ljava/lang/String;")
	String aString3;

	@OriginalMember(owner = "jagexappletviewer!app/e", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class7(@OriginalArg(0) String arg0) {
		this.aString3 = arg0;
	}

	@OriginalMember(owner = "jagexappletviewer!app/e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	Class7(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		this.aString3 = arg0;
		this.aClass13_1 = new Class13(arg1);
	}
}
