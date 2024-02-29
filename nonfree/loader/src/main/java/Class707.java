import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
class Class707 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "I")
	static int anInt5913;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Z")
	public static boolean aBoolean876;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILloader!d;)Ljava/net/URL;", line = 4)
	static final URL method36606(@OriginalArg(0) int arg0, @OriginalArg(1) Class707 arg1) {
		anInt5913++;
		if (arg0 == -28662) {
			throw new IllegalStateException();
		}
		return (URL) null;
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(I)V", line = 15)
	Class707(@OriginalArg(0) int arg0) {
	}
}
