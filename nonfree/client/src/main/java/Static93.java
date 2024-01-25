import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!dp", name = "C", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
	public static int anInt1565 = 0;

	@OriginalMember(owner = "client!dp", name = "I", descriptor = "I")
	public static int anInt1570 = 999999;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
	public static boolean method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
