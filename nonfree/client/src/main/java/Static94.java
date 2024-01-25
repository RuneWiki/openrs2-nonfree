import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static94 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt1386;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
	public static boolean method1358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
