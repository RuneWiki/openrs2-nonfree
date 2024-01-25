import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!di;")
	public static Class48 aClass48_1 = new Class48();

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public static int anInt1622 = 0;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString59 = "red:";

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZ)V")
	public static void method1490(@OriginalArg(1) boolean arg0) {
		Static334.aBoolean408 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(39) int local39;
		@Pc(47) int local47;
		@Pc(57) int local57;
		@Pc(91) int local91;
		@Pc(173) int local173;
		@Pc(184) int local184;
		@Pc(193) int local193;
		if (!Static334.aBoolean408) {
			local18 = Static142.aClass6_Sub10_Sub1_3.method3995();
			local22 = Static142.aClass6_Sub10_Sub1_3.method3995();
			local26 = Static142.aClass6_Sub10_Sub1_3.method3980();
			@Pc(35) boolean local35 = Static142.aClass6_Sub10_Sub1_3.method3980() == 1;
			local39 = Static142.aClass6_Sub10_Sub1_3.method3980();
			local47 = (Static31.anInt578 - Static142.aClass6_Sub10_Sub1_3.anInt4188) / 16;
			Static243.anIntArrayArray160 = new int[local47][4];
			for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
				for (local57 = 0; local57 < 4; local57++) {
					Static243.anIntArrayArray160[local53][local57] = Static142.aClass6_Sub10_Sub1_3.method4005();
				}
			}
			local57 = Static142.aClass6_Sub10_Sub1_3.method3994();
			local91 = Static142.aClass6_Sub10_Sub1_3.method3994();
			Static40.method686(local26);
			Static303.anIntArray647 = new int[local47];
			Static227.aByteArrayArray14 = null;
			Static271.anIntArray542 = new int[local47];
			Static324.anIntArray681 = new int[local47];
			Static49.anIntArray108 = null;
			Static308.aByteArrayArray18 = new byte[local47][];
			Static179.aByteArrayArray11 = new byte[local47][];
			Static303.aByteArrayArray17 = new byte[local47][];
			Static101.anIntArray259 = new int[local47];
			Static83.aByteArrayArray4 = new byte[local47][];
			Static237.anIntArray495 = new int[local47];
			@Pc(127) boolean local127 = false;
			if ((local57 / 8 == 48 || local57 / 8 == 49) && local91 / 8 == 48) {
				local127 = true;
			}
			if (local57 / 8 == 48 && local91 / 8 == 148) {
				local127 = true;
			}
			local47 = 0;
			for (local173 = (local57 - (Static153.anInt2883 >> 4)) / 8; local173 <= (local57 + (Static153.anInt2883 >> 4)) / 8; local173++) {
				for (local184 = (local91 - (Static246.anInt4606 >> 4)) / 8; local184 <= ((Static246.anInt4606 >> 4) + local91) / 8; local184++) {
					local193 = (local173 << 8) + local184;
					if (local127 && (local184 == 49 || local184 == 149 || local184 == 147 || local173 == 50 || local173 == 49 && local184 == 47)) {
						Static303.anIntArray647[local47] = local193;
						Static271.anIntArray542[local47] = -1;
						Static237.anIntArray495[local47] = -1;
						Static101.anIntArray259[local47] = -1;
						Static324.anIntArray681[local47] = -1;
					} else {
						Static303.anIntArray647[local47] = local193;
						Static271.anIntArray542[local47] = Static71.aClass53_36.method1037("m" + local173 + "_" + local184);
						Static237.anIntArray495[local47] = Static71.aClass53_36.method1037("l" + local173 + "_" + local184);
						Static101.anIntArray259[local47] = Static71.aClass53_36.method1037("um" + local173 + "_" + local184);
						Static324.anIntArray681[local47] = Static71.aClass53_36.method1037("ul" + local173 + "_" + local184);
					}
					local47++;
				}
			}
			Static292.method4993(local18, local91, local22, local57, local39, local35, false);
			return;
		}
		local18 = Static142.aClass6_Sub10_Sub1_3.method3989();
		local22 = Static142.aClass6_Sub10_Sub1_3.method4011();
		local26 = Static142.aClass6_Sub10_Sub1_3.method3989();
		@Pc(374) int local374 = Static142.aClass6_Sub10_Sub1_3.method3977();
		local39 = Static142.aClass6_Sub10_Sub1_3.method3989();
		local47 = Static142.aClass6_Sub10_Sub1_3.method3995();
		@Pc(391) boolean local391 = Static142.aClass6_Sub10_Sub1_3.method3977() == 1;
		Static40.method686(local374);
		Static142.aClass6_Sub10_Sub1_3.method2887();
		@Pc(407) int local407;
		for (local57 = 0; local57 < 4; local57++) {
			for (local91 = 0; local91 < Static153.anInt2883 >> 3; local91++) {
				for (local407 = 0; local407 < Static246.anInt4606 >> 3; local407++) {
					local173 = Static142.aClass6_Sub10_Sub1_3.method2883(1);
					if (local173 == 1) {
						Static176.anIntArrayArrayArray5[local57][local91][local407] = Static142.aClass6_Sub10_Sub1_3.method2883(26);
					} else {
						Static176.anIntArrayArrayArray5[local57][local91][local407] = -1;
					}
				}
			}
		}
		Static142.aClass6_Sub10_Sub1_3.method2884();
		local91 = (Static31.anInt578 - Static142.aClass6_Sub10_Sub1_3.anInt4188) / 16;
		Static243.anIntArrayArray160 = new int[local91][4];
		for (local407 = 0; local407 < local91; local407++) {
			for (local173 = 0; local173 < 4; local173++) {
				Static243.anIntArrayArray160[local407][local173] = Static142.aClass6_Sub10_Sub1_3.method3979();
			}
		}
		Static271.anIntArray542 = new int[local91];
		Static303.anIntArray647 = new int[local91];
		Static303.aByteArrayArray17 = new byte[local91][];
		Static179.aByteArrayArray11 = new byte[local91][];
		Static83.aByteArrayArray4 = new byte[local91][];
		Static237.anIntArray495 = new int[local91];
		Static308.aByteArrayArray18 = new byte[local91][];
		Static49.anIntArray108 = null;
		Static101.anIntArray259 = new int[local91];
		Static227.aByteArrayArray14 = null;
		Static324.anIntArray681 = new int[local91];
		local91 = 0;
		for (local173 = 0; local173 < 4; local173++) {
			for (local184 = 0; local184 < Static153.anInt2883 >> 3; local184++) {
				for (local193 = 0; local193 < Static246.anInt4606 >> 3; local193++) {
					@Pc(556) int local556 = Static176.anIntArrayArrayArray5[local173][local184][local193];
					if (local556 != -1) {
						@Pc(565) int local565 = local556 >> 14 & 0x3FF;
						@Pc(571) int local571 = local556 >> 3 & 0x7FF;
						@Pc(582) int local582 = (local565 / 8 << 8) + (local571 / 8);
						for (@Pc(584) int local584 = 0; local584 < local91; local584++) {
							if (local582 == Static303.anIntArray647[local584]) {
								local582 = -1;
								break;
							}
						}
						if (local582 != -1) {
							Static303.anIntArray647[local91] = local582;
							@Pc(617) int local617 = local582 >> 8 & 0xFF;
							@Pc(621) int local621 = local582 & 0xFF;
							Static271.anIntArray542[local91] = Static71.aClass53_36.method1037("m" + local617 + "_" + local621);
							Static237.anIntArray495[local91] = Static71.aClass53_36.method1037("l" + local617 + "_" + local621);
							Static101.anIntArray259[local91] = Static71.aClass53_36.method1037("um" + local617 + "_" + local621);
							Static324.anIntArray681[local91] = Static71.aClass53_36.method1037("ul" + local617 + "_" + local621);
							local91++;
						}
					}
				}
			}
		}
		Static292.method4993(local18, local26, local39, local47, local22, local391, false);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
	public static int method1492(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1493(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) String local17 = Static205.method5718(arg0);
		if (local17 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static71.anInt1344; local22++) {
			@Pc(30) String local30 = Static205.method5718(Static39.aStringArray3[local22]);
			if (local30 != null && local30.equals(local17)) {
				Static71.anInt1344--;
				for (@Pc(42) int local42 = local22; local42 < Static71.anInt1344; local42++) {
					Static39.aStringArray3[local42] = Static39.aStringArray3[local42 + 1];
					Static238.aStringArray34[local42] = Static238.aStringArray34[local42 + 1];
					Static215.aStringArray26[local42] = Static215.aStringArray26[local42 + 1];
					Static76.aStringArray18[local42] = Static76.aStringArray18[local42 + 1];
					Static125.aBooleanArray21[local42] = Static125.aBooleanArray21[local42 + 1];
				}
				Static138.anInt4574 = Static234.anInt36;
				Static131.aClass6_Sub10_Sub1_2.method2886(34);
				Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(arg0));
				Static131.aClass6_Sub10_Sub1_2.method3966(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!dp;)V")
	public static void method1494(@OriginalArg(1) Class53 arg0) {
		Static240.aClass53_101 = arg0;
	}
}
