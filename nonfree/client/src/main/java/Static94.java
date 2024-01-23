import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!lc;")
	public static Class98 aClass98_56;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "J")
	public static long aLong80 = 0L;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "[I")
	public static int[] anIntArray209 = new int[1000];

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	public static int anInt1945 = -1;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	public static int anInt1947 = 0;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 method1510() {
		@Pc(13) int local13 = Static46.anIntArray120[0] * Static159.anIntArray285[0];
		@Pc(17) byte[] local17 = Static274.aByteArrayArray20[0];
		@Pc(77) Class4_Sub2_Sub1_Sub1 local77;
		if (Static296.aBooleanArray13[0]) {
			@Pc(25) byte[] local25 = Static239.aByteArrayArray18[0];
			@Pc(28) int[] local28 = new int[local13];
			for (@Pc(30) int local30 = 0; local30 < local13; local30++) {
				local28[local30] = (local25[local30] & 0xFF) << 24 | Static6.anIntArray14[local17[local30] & 0xFF];
			}
			local77 = new Class4_Sub2_Sub1_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], local28);
		} else {
			@Pc(82) int[] local82 = new int[local13];
			for (@Pc(84) int local84 = 0; local84 < local13; local84++) {
				local82[local84] = Static6.anIntArray14[local17[local84] & 0xFF];
			}
			local77 = new Class4_Sub2_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], local82);
		}
		Static268.method4006();
		return local77;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public static void method1514() {
		anIntArray209 = null;
		anIntArray208 = null;
		aClass98_56 = null;
		anIntArray210 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZII)V")
	public static void method1516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static142.aClass4_Sub17_Sub1_3.method1905(157);
			Static142.aClass4_Sub17_Sub1_3.method1861(5);
		}
		if (arg1 == 1) {
			Static142.aClass4_Sub17_Sub1_3.method1905(202);
			Static142.aClass4_Sub17_Sub1_3.method1861(19);
		}
		Static142.aClass4_Sub17_Sub1_3.method1876(arg2 + Static239.anInt4613);
		Static142.aClass4_Sub17_Sub1_3.method1897(Static170.anInt3385 + arg0);
		Static142.aClass4_Sub17_Sub1_3.method1861(Static96.aBooleanArray15[82] ? 1 : 0);
		Static207.anInt4065 = arg0;
		Static296.anInt1762 = arg2;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
	public static void method1517() {
		if (!Static148.aBoolean198 && Static251.anInt4743 != 2) {
			try {
				Static301.method121(Static114.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1518(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static231.anInt4525; local12++) {
			if (arg0.equalsIgnoreCase(Static196.aStringArray31[local12])) {
				return local12;
			}
		}
		return -1;
	}
}
