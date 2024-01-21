import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt2072;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!lg;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!tg;")
	private static Class81 aClass81_730 = Static120.method2057("New User");

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_729 = aClass81_730;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt2073 = 500;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1581() {
		aClass81_729 = null;
		aClass36_1 = null;
		anIntArrayArray19 = null;
		aByteArrayArray4 = null;
		aClass81_730 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!rh;I)Lclient!rh;")
	public static Class77 method1584(@OriginalArg(0) Class77 arg0) {
		@Pc(16) int local16 = Static41.method803(Static165.method2894(arg0));
		if (local16 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local16; local22++) {
			arg0 = Static41.method800(arg0.anInt3196);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1586() {
		Static131.aClass59_21.method1967();
		Static172.aClass59_28.method1967();
	}
}
