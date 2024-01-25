import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_36 = new Class25(59, 0);

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZLclient!wq;)V")
	public static void method1309(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class11_Sub5_Sub2_Sub2 arg1) {
		if (Static377.anInt6585 >= 400) {
			return;
		}
		@Pc(19) Class82 local19 = arg1.aClass82_1;
		if (local19.anIntArray149 != null) {
			local19 = local19.method1888(Static63.aClass120_2);
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean115) {
			return;
		}
		@Pc(37) String local37 = local19.aString14;
		if (local19.anInt1955 != 0) {
			@Pc(53) String local53 = Static201.aClass200_4 == Static10.aClass200_1 ? Static10.aClass231_2.method5261(Static80.anInt6195) : Static300.aClass231_94.method5261(Static80.anInt6195);
			local37 = local37 + Static195.method2781(Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410, local19.anInt1955) + " (" + local53 + local19.anInt1955 + ")";
		}
		if (!Static11.aBoolean7) {
			if (!arg0) {
				@Pc(83) String[] local83 = local19.aStringArray20;
				if (Static355.aBoolean432) {
					local83 = Static423.method5791(local83);
				}
				@Pc(93) int local93;
				if (local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && (local19.aByte20 == 0 || !local83[local93].equalsIgnoreCase(Static349.aClass231_110.method5261(Static80.anInt6195)))) {
							@Pc(113) byte local113 = 0;
							if (local93 == 0) {
								local113 = 20;
							}
							@Pc(119) int local119 = Static385.anInt6687;
							if (local93 == 1) {
								local113 = 19;
							}
							if (local93 == 2) {
								local113 = 17;
							}
							if (local93 == 3) {
								local113 = 11;
							}
							if (local93 == local19.anInt1960) {
								local119 = local19.anInt1941;
							}
							if (local93 == 4) {
								local113 = 6;
							}
							if (local19.anInt1965 == local93) {
								local119 = local19.anInt1956;
							}
							Static202.method2833((long) arg1.anInt7670, 0, true, false, "<col=ffff00>" + local37, -1, 0, local83[local93], local113, local83[local93].equalsIgnoreCase(Static349.aClass231_110.method5261(Static80.anInt6195)) ? local19.anInt1969 : local119);
						}
					}
				}
				if (local19.aByte20 == 1 && local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && local83[local93].equalsIgnoreCase(Static349.aClass231_110.method5261(Static80.anInt6195))) {
							@Pc(230) short local230 = 0;
							if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410 < local19.anInt1955) {
								local230 = 2000;
							}
							@Pc(243) short local243 = 0;
							if (local93 == 0) {
								local243 = 20;
							}
							if (local93 == 1) {
								local243 = 19;
							}
							if (local93 == 2) {
								local243 = 17;
							}
							if (local93 == 3) {
								local243 = 11;
							}
							if (local93 == 4) {
								local243 = 6;
							}
							if (local243 != 0) {
								local243 += local230;
							}
							Static202.method2833((long) arg1.anInt7670, 0, true, false, "<col=ffff00>" + local37, -1, 0, local83[local93], local243, local19.anInt1969);
						}
					}
				}
			}
			Static202.method2833((long) arg1.anInt7670, 0, true, arg0, "<col=ffff00>" + local37, -1, 0, Static195.aClass231_65.method5261(Static80.anInt6195), 1004, Static229.anInt3813);
		} else if (!arg0) {
			@Pc(351) Class198 local351 = Static456.anInt7598 == -1 ? null : Static275.aClass235_1.method5382(Static456.anInt7598);
			if ((Static331.anInt5940 & 0x2) != 0) {
				if (local351 == null || local19.method1890(Static456.anInt7598, local351.anInt5653) != local351.anInt5653) {
					Static202.method2833((long) arg1.anInt7670, 0, true, false, Static359.aString66 + " -> <col=ffff00>" + local37, -1, 0, Static88.aString38, 48, Static252.anInt4355);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public static void method1310() {
		Static457.aClass227_6.method5237();
		Static171.aClass210_6.method4904();
		Static421.aClass174_2.method3700();
		Static249.aClass39_2.method749();
		Static227.aClass54_2.method1123();
		Static413.aClass271_2.method6191();
		Static37.aClass80_1.method1873();
		Static399.aClass100_2.method2201();
		Static371.aClass211_1.method4910();
		Static361.aClass267_1.method6046();
		Static257.aClass262_1.method5912();
		Static386.aClass230_7.method5255();
		Static54.aClass84_2.method1951();
		Static461.aClass34_1.method627();
		Static275.aClass235_1.method5380();
		Static174.aClass147_1.method3054();
		Static388.aClass35_1.method651();
		Static379.aClass152_2.method3071();
		Static39.aClass73_1.method1449();
		Static236.aClass55_1.method1138();
		Static215.method3036();
		Static54.method895();
		Static284.method4032();
		Static37.method583();
		Static348.aClass188_47.method4154();
		Static59.aClass188_48.method4154();
		Static452.aClass188_10.method4154();
		Static442.aClass188_57.method4154();
		Static76.aClass188_16.method4154();
	}
}
