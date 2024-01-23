import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
	public static boolean aBoolean101;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt2312;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public static int anInt2313;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
	public static void method1865(@OriginalArg(1) int arg0) {
		if (Static19.anInt400 == 0) {
			Static203.aClass1_Sub12_Sub3_2.method2610(arg0);
		} else {
			Static63.anInt1254 = arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public static void method1866() {
		for (@Pc(3) int local3 = 0; local3 < Static80.anInt1584; local3++) {
			@Pc(9) int local9 = Static164.anIntArray360[local3];
			@Pc(13) Class20_Sub3_Sub2 local13 = Static78.aClass20_Sub3_Sub2Array1[local9];
			@Pc(17) int local17 = Static97.aClass1_Sub17_Sub1_2.method2142();
			if ((local17 & 0x10) != 0) {
				local13.aClass50_1013 = Static97.aClass1_Sub17_Sub1_2.method2125();
				local13.anInt3066 = 100;
			}
			@Pc(40) int local40;
			@Pc(51) int local51;
			if ((local17 & 0x2) != 0) {
				local40 = Static97.aClass1_Sub17_Sub1_2.method2131();
				if (local40 == 65535) {
					local40 = -1;
				}
				local51 = Static97.aClass1_Sub17_Sub1_2.method2142();
				Static141.method3012(local13, local40, local51);
			}
			if ((local17 & 0x20) != 0) {
				if (local13.aClass105_1.method3121()) {
					Static121.method1932(local13);
				}
				local13.aClass105_1 = Static162.method2710(Static97.aClass1_Sub17_Sub1_2.method2178());
				local13.anInt3024 = local13.aClass105_1.anInt3908;
				local13.anInt3064 = local13.aClass105_1.anInt3923;
				local13.anInt3034 = local13.aClass105_1.anInt3889;
				local13.anInt3036 = local13.aClass105_1.anInt3894;
				local13.anInt3057 = local13.aClass105_1.anInt3911;
				local13.anInt3044 = local13.aClass105_1.anInt3904;
				local13.anInt3039 = local13.aClass105_1.anInt3895;
				local13.anInt3040 = local13.aClass105_1.anInt3890;
				local13.anInt3050 = local13.aClass105_1.anInt3925;
				if (local13.aClass105_1.method3121()) {
					Static95.method1496(Static212.anInt4195, null, local13.anIntArray313[0], local13, 0, null, local13.anIntArray311[0]);
				}
			}
			if ((local17 & 0x1) != 0) {
				local40 = Static97.aClass1_Sub17_Sub1_2.method2139();
				local51 = Static97.aClass1_Sub17_Sub1_2.method2129();
				local13.method2469(local40, Static107.anInt2132, local51);
			}
			if ((local17 & 0x4) != 0) {
				local13.anInt3023 = Static97.aClass1_Sub17_Sub1_2.method2131();
				local13.anInt3065 = Static97.aClass1_Sub17_Sub1_2.method2178();
			}
			if ((local17 & 0x8) != 0) {
				local40 = Static97.aClass1_Sub17_Sub1_2.method2139();
				local51 = Static97.aClass1_Sub17_Sub1_2.method2129();
				local13.method2469(local40, Static107.anInt2132, local51);
				local13.anInt3013 = Static107.anInt2132 + 300;
				local13.anInt3056 = Static97.aClass1_Sub17_Sub1_2.method2142();
			}
			if ((local17 & 0x80) != 0) {
				local13.anInt3058 = Static97.aClass1_Sub17_Sub1_2.method2134();
				local40 = Static97.aClass1_Sub17_Sub1_2.method2140();
				local13.anInt3045 = (local40 & 0xFFFF) + Static107.anInt2132;
				local13.anInt3025 = 0;
				if (local13.anInt3058 == 65535) {
					local13.anInt3058 = -1;
				}
				local13.anInt3037 = local40 >> 16;
				local13.anInt3019 = 0;
				if (local13.anInt3045 > Static107.anInt2132) {
					local13.anInt3019 = -1;
				}
			}
			if ((local17 & 0x40) != 0) {
				local13.anInt3010 = Static97.aClass1_Sub17_Sub1_2.method2178();
				if (local13.anInt3010 == 65535) {
					local13.anInt3010 = -1;
				}
			}
		}
	}
}
