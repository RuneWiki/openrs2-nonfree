import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
	public static int anInt2630;

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "J")
	public static final long aLong59 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
	public static int anInt2628 = -60;

	@OriginalMember(owner = "client!dha", name = "l", descriptor = "I")
	public static int anInt2635 = -2;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BZLclient!pk;)V")
	public static void method2231(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15_Sub1_Sub2_Sub2_Sub2 arg1) {
		if (Static548.anInt9471 >= 400) {
			return;
		}
		@Pc(14) Class300 local14 = arg1.aClass300_1;
		if (local14.anIntArray498 != null) {
			local14 = local14.method7306(Static420.aClass77_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean627) {
			return;
		}
		@Pc(36) String local36 = local14.aString91;
		if (local14.anInt8894 != 0) {
			@Pc(55) String local55 = Static281.aClass217_4 == Static18.aClass217_1 ? Static121.aClass84_30.method2710(Static372.anInt7083) : Static121.aClass84_28.method2710(Static372.anInt7083);
			local36 = local36 + Static181.method3453(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300, local14.anInt8894) + " (" + local55 + local14.anInt8894 + ")";
		}
		if (Static147.aBoolean270 && !arg0) {
			@Pc(93) Class82 local93 = Static330.anInt4199 == -1 ? null : Static144.aClass274_1.method6933(Static330.anInt4199);
			if ((Static328.anInt9771 & 0x2) != 0 && (local93 == null || local14.method7313(local93.anInt3023, Static330.anInt4199) != local93.anInt3023)) {
				Static192.method3629((long) arg1.anInt8075, false, -1, false, (long) arg1.anInt8075, 59, Static598.aString17, 0, 0, true, Static500.anInt8805, Static4.aString2 + " -> <col=ffff00>" + local36);
			}
		}
		if (!arg0) {
			@Pc(148) String[] local148 = local14.aStringArray30;
			if (Static246.aBoolean401) {
				local148 = Static314.method5190(local148);
			}
			@Pc(158) int local158;
			if (local148 != null) {
				for (local158 = 4; local158 >= 0; local158--) {
					if (local148[local158] != null && (local14.aByte101 == 0 || !local148[local158].equalsIgnoreCase(Static121.aClass84_23.method2710(Static372.anInt7083)))) {
						@Pc(178) byte local178 = 0;
						@Pc(180) int local180 = Static394.anInt7610;
						if (local158 == 0) {
							local178 = 4;
						}
						if (local158 == 1) {
							local178 = 23;
						}
						if (local158 == 2) {
							local178 = 49;
						}
						if (local158 == 3) {
							local178 = 30;
						}
						if (local14.anInt8913 == local158) {
							local180 = local14.anInt8883;
						}
						if (local158 == 4) {
							local178 = 16;
						}
						if (local158 == local14.anInt8895) {
							local180 = local14.anInt8903;
						}
						Static192.method3629((long) arg1.anInt8075, false, -1, false, (long) arg1.anInt8075, local178, local148[local158], 0, 0, true, local148[local158].equalsIgnoreCase(Static121.aClass84_23.method2710(Static372.anInt7083)) ? local14.anInt8887 : local180, "<col=ffff00>" + local36);
					}
				}
			}
			if (local14.aByte101 == 1 && local148 != null) {
				for (local158 = 4; local158 >= 0; local158--) {
					if (local148[local158] != null && local148[local158].equalsIgnoreCase(Static121.aClass84_23.method2710(Static372.anInt7083))) {
						@Pc(297) short local297 = 0;
						if (local14.anInt8894 > Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt3300) {
							local297 = 2000;
						}
						@Pc(306) short local306 = 0;
						if (local158 == 0) {
							local306 = 4;
						}
						if (local158 == 1) {
							local306 = 23;
						}
						if (local158 == 2) {
							local306 = 49;
						}
						if (local158 == 3) {
							local306 = 30;
						}
						if (local158 == 4) {
							local306 = 16;
						}
						if (local306 != 0) {
							local306 += local297;
						}
						Static192.method3629((long) arg1.anInt8075, false, -1, false, (long) arg1.anInt8075, local306, local148[local158], 0, 0, true, local14.anInt8887, "<col=ffff00>" + local36);
					}
				}
			}
		}
		Static192.method3629((long) arg1.anInt8075, false, -1, arg0, (long) arg1.anInt8075, 1011, Static121.aClass84_22.method2710(Static372.anInt7083), 0, 0, true, Static468.anInt10558, "<col=ffff00>" + local36);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V")
	public static void method2232() {
		if (!Static82.aBoolean187) {
			return;
		}
		while (true) {
			while (Static313.aClass98_Sub1Array1.length > Static570.anInt9810) {
				@Pc(21) Class98_Sub1 local21 = Static313.aClass98_Sub1Array1[Static570.anInt9810];
				if (local21 != null && local21.anInt3681 == -1) {
					if (Static104.aClass8_Sub48_1 == null) {
						Static104.aClass8_Sub48_1 = Static62.aClass182_1.method4826(local21.aString39);
					}
					@Pc(45) int local45 = Static104.aClass8_Sub48_1.anInt10047;
					if (local45 == -1) {
						return;
					}
					Static104.aClass8_Sub48_1 = null;
					local21.anInt3681 = local45;
					Static570.anInt9810++;
				} else {
					Static570.anInt9810++;
				}
			}
			return;
		}
	}
}
