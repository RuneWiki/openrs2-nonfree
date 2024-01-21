import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array10;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!gd;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_1438 = Static6.method100(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!he;")
	private static Class26 aClass26_1439 = Static6.method100("Type");

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1440 = aClass26_1439;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	public static int anInt2630 = 0;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public static int anInt2631 = 0;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1441 = Static6.method100("<col=ffff00>*V");

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Z")
	public static boolean aBoolean150 = true;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method1797(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg1;
			return arg0 ? Static75.method1354(local21) : local21;
		} else if (arg1 instanceof Class45) {
			@Pc(35) Class45 local35 = (Class45) arg1;
			return local35.method1677();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1799() {
		aClass3_Sub1_Sub4_Sub1Array10 = null;
		aClass26_1438 = null;
		aClass26_1440 = null;
		aByteArrayArrayArray7 = null;
		aClass26_1441 = null;
		aClass22_4 = null;
		aClass26_1439 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public static void method1800() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static56.anInt1695 - 1; local13++) {
				if (Static132.anIntArray411[local13] < 1000 && Static132.anIntArray411[local13 + 1] > 1000) {
					local7 = false;
					@Pc(33) Class26 local33 = Static29.aClass26Array7[local13];
					Static29.aClass26Array7[local13] = Static29.aClass26Array7[local13 + 1];
					Static29.aClass26Array7[local13 + 1] = local33;
					@Pc(51) Class26 local51 = Static56.aClass26Array13[local13];
					Static56.aClass26Array13[local13] = Static56.aClass26Array13[local13 + 1];
					Static56.aClass26Array13[local13 + 1] = local51;
					@Pc(69) int local69 = Static132.anIntArray411[local13];
					Static132.anIntArray411[local13] = Static132.anIntArray411[local13 + 1];
					Static132.anIntArray411[local13 + 1] = local69;
					@Pc(87) int local87 = Static67.anIntArray338[local13];
					Static67.anIntArray338[local13] = Static67.anIntArray338[local13 + 1];
					Static67.anIntArray338[local13 + 1] = local87;
					@Pc(105) int local105 = Static64.anIntArray178[local13];
					Static64.anIntArray178[local13] = Static64.anIntArray178[local13 + 1];
					Static64.anIntArray178[local13 + 1] = local105;
					@Pc(123) int local123 = Static7.anIntArray16[local13];
					Static7.anIntArray16[local13] = Static7.anIntArray16[local13 + 1];
					Static7.anIntArray16[local13 + 1] = local123;
				}
			}
		}
	}
}
