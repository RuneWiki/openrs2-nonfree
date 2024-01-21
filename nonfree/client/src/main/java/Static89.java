import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!ee;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt2464;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1151 = Static87.method1648("glow3:");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1152 = Static87.method1648("as it was used to break our rules)3");

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1153 = aClass27_1151;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1154 = aClass27_1152;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1155 = Static87.method1648("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1156 = Static87.method1648("scape main");

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean121 = true;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1157 = Static87.method1648("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11 = new byte[4][104][104];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!m;)Z")
	public static boolean method1691(@OriginalArg(1) Class3_Sub3_Sub6 arg0) {
		if (arg0.anIntArray271 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray271.length; local12++) {
			@Pc(19) int local19 = Static10.method229(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray272[local12];
			if (arg0.anIntArray271[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray271[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray271[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1692() {
		aClass27_1152 = null;
		aClass27_1155 = null;
		aByteArrayArrayArray11 = null;
		aBooleanArray13 = null;
		aClass3_Sub3_Sub2_Sub1_3 = null;
		aClass27_1154 = null;
		aClass27_1151 = null;
		aClass27_1156 = null;
		aClass27_1153 = null;
		aClass27_1157 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!td;I)Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 method1693(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1) {
		return Static90.method1709(arg0, arg1) ? Static108.method1905() : null;
	}
}
