import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static int anInt1765;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method1676(@OriginalArg(0) int arg0) {
		Static210.anInt3780 = arg0;
		Static152.aClass231_64.method6240();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)Z")
	public static boolean method1677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static412.method6448(arg0, arg1) || Static342.method5379(arg1, arg0);
	}
}
