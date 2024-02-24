package app;

import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jagexappletviewer!app/s")
final class Class17 {

	@OriginalMember(owner = "jagexappletviewer!app/s", name = "a", descriptor = "Ljava/lang/String;")
	String aString7;

	@OriginalMember(owner = "jagexappletviewer!app/s", name = "b", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable9 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/s", name = "c", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable10 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/s", name = "d", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable11 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/s", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class17(@OriginalArg(0) String arg0) {
		this.aString7 = arg0;
	}
}
