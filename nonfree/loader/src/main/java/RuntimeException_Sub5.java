import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!l")
final class RuntimeException_Sub5 extends RuntimeException {

	@OriginalMember(owner = "loader!l", name = "b", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable2;

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "Ljava/lang/String;")
	String aString250;

	@OriginalMember(owner = "loader!l", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 4)
	RuntimeException_Sub5(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString250 = arg1;
		this.initCause(arg0);
	}
}
