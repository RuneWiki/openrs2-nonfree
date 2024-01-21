import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!q", name = "U", descriptor = "Lclient!od;")
	public static Class60 aClass60_869 = Static41.method597("Fertigkeit)2");

	@OriginalMember(owner = "client!q", name = "pb", descriptor = "Lclient!od;")
	private static Class60 aClass60_877 = Static41.method597("Checking for updates )2 ");

	@OriginalMember(owner = "client!q", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_870 = aClass60_877;

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "Lclient!od;")
	private static Class60 aClass60_871 = Static41.method597("flash1:");

	@OriginalMember(owner = "client!q", name = "db", descriptor = "Lclient!od;")
	public static Class60 aClass60_872 = aClass60_871;

	@OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
	public static int anInt2122 = 0;

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "Lclient!od;")
	private static Class60 aClass60_873 = Static41.method597("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!q", name = "jb", descriptor = "Lclient!od;")
	public static Class60 aClass60_874 = Static41.method597("Versteckt");

	@OriginalMember(owner = "client!q", name = "kb", descriptor = "Lclient!od;")
	public static Class60 aClass60_875 = aClass60_871;

	@OriginalMember(owner = "client!q", name = "ob", descriptor = "Lclient!od;")
	public static Class60 aClass60_876 = aClass60_873;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!od;ILclient!od;)V")
	public static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		Static2.method8(null, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBII)V")
	public static void method1470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static132.anInt2950; local15++) {
			if (Static102.anIntArray309[local15] + Static107.anIntArray324[local15] > arg3 && arg2 + arg3 > Static102.anIntArray309[local15] && Static68.anIntArray193[local15] + Static78.anIntArray219[local15] > arg1 && arg0 + arg1 > Static78.anIntArray219[local15]) {
				Static108.aBooleanArray17[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
	public static void method1471() {
		aClass60_877 = null;
		aClass60_870 = null;
		aClass60_872 = null;
		aClass60_869 = null;
		aClass60_873 = null;
		aClass60_871 = null;
		aClass60_875 = null;
		aClass60_876 = null;
		aClass60_874 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIII)V")
	public static void method1472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == Static121.anInt2776 && arg3 == Static47.anInt1153 && (Static91.anInt2145 == arg1 || !Static8.aBoolean3)) {
			return;
		}
		Static121.anInt2776 = arg0;
		Static47.anInt1153 = arg3;
		Static91.anInt2145 = arg1;
		if (!Static8.aBoolean3) {
			Static91.anInt2145 = 0;
		}
		Static32.method496(25);
		Static101.method1991(true, Static37.aClass60_378);
		@Pc(44) int local44 = Static49.anInt1207;
		Static49.anInt1207 = arg0 * 8 - 48;
		@Pc(55) int local55 = Static49.anInt1207 - local44;
		@Pc(57) int local57 = Static60.anInt2956;
		Static60.anInt2956 = (arg3 - 6) * 8;
		@Pc(70) int local70 = Static60.anInt2956 - local57;
		for (@Pc(74) int local74 = 0; local74 < 32768; local74++) {
			@Pc(80) Class4_Sub3_Sub1_Sub2_Sub2 local80 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local74];
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < 10; local84++) {
					local80.anIntArray137[local84] -= local55;
					local80.anIntArray135[local84] -= local70;
				}
				local80.anInt1440 -= local55 * 128;
				local80.anInt1407 -= local70 * 128;
			}
		}
		for (@Pc(130) int local130 = 0; local130 < 2048; local130++) {
			@Pc(136) Class4_Sub3_Sub1_Sub2_Sub1 local136 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local130];
			if (local136 != null) {
				for (@Pc(140) int local140 = 0; local140 < 10; local140++) {
					local136.anIntArray137[local140] -= local55;
					local136.anIntArray135[local140] -= local70;
				}
				local136.anInt1407 -= local70 * 128;
				local136.anInt1440 -= local55 * 128;
			}
		}
		Static77.anInt1866 = arg1;
		Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method856(false, arg2, arg4);
		@Pc(192) byte local192 = 0;
		@Pc(194) byte local194 = 104;
		@Pc(196) byte local196 = 0;
		@Pc(198) byte local198 = 104;
		@Pc(200) byte local200 = 1;
		@Pc(202) byte local202 = 1;
		if (local70 < 0) {
			local196 = 103;
			local200 = -1;
			local198 = -1;
		}
		if (local55 < 0) {
			local192 = 103;
			local202 = -1;
			local194 = -1;
		}
		for (@Pc(226) int local226 = local192; local226 != local194; local226 += local202) {
			for (@Pc(230) int local230 = local196; local230 != local198; local230 += local200) {
				@Pc(236) int local236 = local226 + local55;
				@Pc(240) int local240 = local230 + local70;
				for (@Pc(242) int local242 = 0; local242 < 4; local242++) {
					if (local236 >= 0 && local240 >= 0 && local236 < 104 && local240 < 104) {
						Static48.aClass45ArrayArrayArray1[local242][local226][local230] = Static48.aClass45ArrayArrayArray1[local242][local236][local240];
					} else {
						Static48.aClass45ArrayArrayArray1[local242][local226][local230] = null;
					}
				}
			}
		}
		for (@Pc(306) Class4_Sub23 local306 = (Class4_Sub23) Static14.aClass45_1.method982(); local306 != null; local306 = (Class4_Sub23) Static14.aClass45_1.method986()) {
			local306.anInt2916 -= local55;
			local306.anInt2925 -= local70;
			if (local306.anInt2916 < 0 || local306.anInt2925 < 0 || local306.anInt2916 >= 104 || local306.anInt2925 >= 104) {
				local306.method1989();
			}
		}
		Static67.aBoolean60 = false;
		Static118.anInt2731 = 0;
		Static117.anInt2725 = -1;
		if (Static106.anInt2495 != 0) {
			Static127.anInt1133 -= local70;
			Static106.anInt2495 -= local55;
		}
		Static66.aClass45_12.method984();
		Static69.aClass45_13.method984();
	}
}
