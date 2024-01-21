import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!of", name = "F", descriptor = "Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 aClass1_Sub1_Sub2_Sub3_Sub1_7;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!id;")
	private static Class34 aClass34_1581 = Static9.method266(" ");

	@OriginalMember(owner = "client!of", name = "J", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "Lclient!id;")
	public static Class34 aClass34_1582 = Static9.method266("<col=00ffff>");

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
	public static int anInt3112 = 0;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "Lclient!id;")
	public static Class34 aClass34_1583 = Static9.method266("<col=ffb000>");

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1584 = null;

	@OriginalMember(owner = "client!of", name = "db", descriptor = "Lclient!id;")
	public static Class34 aClass34_1585 = aClass34_1581;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
	public static void method2047() {
		for (@Pc(8) int local8 = 0; local8 < Static31.anInt924; local8++) {
			@Pc(14) int local14 = Static30.anIntArray90[local8]--;
			if (Static30.anIntArray90[local8] >= -10) {
				@Pc(87) Class72 local87 = Static7.aClass72Array1[local8];
				if (local87 == null) {
					local87 = Static139.method1828(Static133.aClass35_Sub1_29, Static114.anIntArray345[local8], 0);
					if (local87 == null) {
						continue;
					}
					Static30.anIntArray90[local8] += local87.method1829();
					Static7.aClass72Array1[local8] = local87;
				}
				if (Static30.anIntArray90[local8] < 0) {
					@Pc(122) int local122;
					if (Static100.anIntArray316[local8] == 0) {
						local122 = Static60.anInt1655;
					} else {
						@Pc(132) int local132 = (Static100.anIntArray316[local8] & 0xFF) * 128;
						@Pc(140) int local140 = Static100.anIntArray316[local8] >> 16 & 0xFF;
						@Pc(150) int local150 = local140 * 128 + 64 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428;
						@Pc(158) int local158 = Static100.anIntArray316[local8] >> 8 & 0xFF;
						@Pc(168) int local168 = local158 * 128 + 64 - Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405;
						if (local150 < 0) {
							local150 = -local150;
						}
						if (local168 < 0) {
							local168 = -local168;
						}
						@Pc(190) int local190 = local150 + local168 - 128;
						if (local132 < local190) {
							Static30.anIntArray90[local8] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local122 = (local132 - local190) * Static66.anInt1753 / local132;
					}
					if (local122 > 0) {
						@Pc(223) Class1_Sub17_Sub1 local223 = local87.method1826().method1299(Static110.aClass43_2);
						@Pc(228) Class1_Sub4_Sub3 local228 = Static137.method1235(local223, local122);
						local228.method1239(Static17.anIntArray66[local8] - 1);
						Static30.aClass1_Sub4_Sub4_2.method1905(local228);
					}
					Static30.anIntArray90[local8] = -100;
				}
			} else {
				Static31.anInt924--;
				for (@Pc(30) int local30 = local8; local30 < Static31.anInt924; local30++) {
					Static114.anIntArray345[local30] = Static114.anIntArray345[local30 + 1];
					Static7.aClass72Array1[local30] = Static7.aClass72Array1[local30 + 1];
					Static17.anIntArray66[local30] = Static17.anIntArray66[local30 + 1];
					Static30.anIntArray90[local30] = Static30.anIntArray90[local30 + 1];
					Static100.anIntArray316[local30] = Static100.anIntArray316[local30 + 1];
				}
				local8--;
			}
		}
		if (Static64.aBoolean94 && !Static36.method655()) {
			if (Static7.anInt426 != 0 && Static5.anInt361 != -1) {
				Static87.method1485(Static5.anInt361, 0, Static32.aClass35_Sub1_12, Static7.anInt426);
			}
			Static64.aBoolean94 = false;
		}
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V")
	public static void method2058() {
		aClass34_1581 = null;
		aClass34_1582 = null;
		aClass34_1583 = null;
		aClass34_1585 = null;
		aClass1_Sub1_Sub2_Sub3_Sub1_7 = null;
		aClass34_1584 = null;
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(B)Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 method2071() {
		@Pc(7) Class1_Sub1_Sub2_Sub2 local7 = new Class1_Sub1_Sub2_Sub2();
		local7.anInt879 = Static123.anInt2913;
		local7.anIntArray87 = Static32.anIntArray150;
		local7.aByteArray12 = Static77.aByteArrayArray7[0];
		local7.anInt882 = Static78.anInt2092;
		local7.anInt881 = Static87.anIntArray297[0];
		local7.anInt883 = Static91.anIntArray298[0];
		local7.anInt878 = Static78.anIntArray244[0];
		local7.anInt880 = Static116.anIntArray351[0];
		Static5.method212();
		return local7;
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(II)Z")
	public static boolean method2085(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static78.anIntArray245[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1004;
	}
}
