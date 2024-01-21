import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!me;")
	public static Class4_Sub3_Sub6_Sub1_Sub1 aClass4_Sub3_Sub6_Sub1_Sub1_5;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt2272 = 0;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!cb;")
	public static Class12 aClass12_21 = new Class12(64);

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!cb;")
	public static Class12 aClass12_22 = new Class12(50);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!ie;")
	public static Class4_Sub9_Sub1 aClass4_Sub9_Sub1_2 = new Class4_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "I")
	public static int anInt2277 = 0;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!od;")
	private static Class60 aClass60_918 = Static41.method597("Loading textures )2 ");

	@OriginalMember(owner = "client!r", name = "D", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "Lclient!od;")
	public static Class60 aClass60_919 = aClass60_918;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1564() {
		aClass12_21 = null;
		aClass4_Sub9_Sub1_2 = null;
		aClass12_22 = null;
		aClass4_Sub3_Sub6_Sub1_Sub1_5 = null;
		aClass60_918 = null;
		aClass60_919 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	public static void method1566(@OriginalArg(1) int arg0) {
		if (Static118.method1894(arg0)) {
			Static33.method500(-1, Static82.aClass4_Sub14ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!c;Lclient!c;Z)V")
	public static void method1567(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		Static8.aClass10_6 = arg1;
		Static10.aClass10_7 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lclient!eb;")
	public static Class19 method1568() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)V")
	public static void method1570(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(11) int local11 = Static25.anIntArray87[arg0];
		@Pc(15) int local15 = Static82.anIntArray226[arg0];
		if (local15 >= 2000) {
			local15 -= 2000;
		}
		@Pc(23) int local23 = Static130.anIntArray342[arg0];
		@Pc(27) int local27 = Static61.anIntArray178[arg0];
		@Pc(38) Class4_Sub14 local38;
		if (local15 == 39) {
			@Pc(34) boolean local34 = true;
			local38 = Static61.method991(local27);
			if (local38.anInt2432 > 0) {
				local34 = Static40.method587(local38);
			}
			if (local34) {
				Static14.aClass4_Sub9_Sub1_1.method826(161);
				Static14.aClass4_Sub9_Sub1_1.method808(local27);
			}
		}
		@Pc(69) Class4_Sub3_Sub1_Sub2_Sub1 local69;
		if (local15 == 5) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static69.anInt1722 = 2;
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static24.anInt833 = Static122.anInt2791;
				Static14.aClass4_Sub9_Sub1_1.method826(168);
				Static14.aClass4_Sub9_Sub1_1.method772(local23);
			}
		}
		if (local15 == 31) {
			Static14.aClass4_Sub9_Sub1_1.method826(78);
			Static14.aClass4_Sub9_Sub1_1.method808(local27);
			Static14.aClass4_Sub9_Sub1_1.method803(local11);
			Static14.aClass4_Sub9_Sub1_1.method803(local23);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 25) {
			Static83.method1326(local11, local23, local27);
			Static14.aClass4_Sub9_Sub1_1.method826(93);
			Static14.aClass4_Sub9_Sub1_1.method786(local27 + Static60.anInt2956);
			Static14.aClass4_Sub9_Sub1_1.method796(local11 + Static49.anInt1207);
			Static14.aClass4_Sub9_Sub1_1.method803(local23 >> 14 & 0x7FFF);
		}
		if (local15 == 16) {
			Static14.aClass4_Sub9_Sub1_1.method826(45);
			Static14.aClass4_Sub9_Sub1_1.method803(local23);
			Static14.aClass4_Sub9_Sub1_1.method786(local11);
			Static14.aClass4_Sub9_Sub1_1.method775(local27);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 42) {
			Static14.aClass4_Sub9_Sub1_1.method826(72);
			Static14.aClass4_Sub9_Sub1_1.method820(local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
			Static14.aClass4_Sub9_Sub1_1.method772(local11);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		@Pc(278) boolean local278;
		if (local15 == 36) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static69.anInt1722 = 2;
			Static115.anInt2693 = Static63.anInt1591;
			Static66.anInt1659 = 0;
			Static24.anInt833 = Static122.anInt2791;
			Static14.aClass4_Sub9_Sub1_1.method826(119);
			Static14.aClass4_Sub9_Sub1_1.method803(Static60.anInt2956 + local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
			Static14.aClass4_Sub9_Sub1_1.method786(local11 + Static49.anInt1207);
		}
		if (local15 == 38) {
			Static14.aClass4_Sub9_Sub1_1.method826(241);
			Static14.aClass4_Sub9_Sub1_1.method772(Static9.anInt125);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static14.aClass4_Sub9_Sub1_1.method808(Static108.anInt2580);
			Static14.aClass4_Sub9_Sub1_1.method820(local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local11);
			Static14.aClass4_Sub9_Sub1_1.method803(Static124.anInt2803);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 22) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static66.anInt1659 = 0;
				Static115.anInt2693 = Static63.anInt1591;
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(87);
				Static14.aClass4_Sub9_Sub1_1.method808(Static108.anInt2580);
				Static14.aClass4_Sub9_Sub1_1.method796(Static9.anInt125);
				Static14.aClass4_Sub9_Sub1_1.method796(local23);
				Static14.aClass4_Sub9_Sub1_1.method786(Static124.anInt2803);
			}
		}
		if (local15 == 21) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static115.anInt2693 = Static63.anInt1591;
			Static66.anInt1659 = 0;
			Static69.anInt1722 = 2;
			Static24.anInt833 = Static122.anInt2791;
			Static14.aClass4_Sub9_Sub1_1.method826(69);
			Static14.aClass4_Sub9_Sub1_1.method772(Static60.anInt2956 + local27);
			Static14.aClass4_Sub9_Sub1_1.method796(Static49.anInt1207 + local11);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
		}
		if (local15 == 32) {
			Static51.method830();
		}
		if (local15 == 1006) {
			Static115.anInt2693 = Static63.anInt1591;
			Static66.anInt1659 = 0;
			Static24.anInt833 = Static122.anInt2791;
			Static69.anInt1722 = 2;
			Static14.aClass4_Sub9_Sub1_1.method826(102);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
		}
		@Pc(568) Class4_Sub3_Sub1_Sub2_Sub2 local568;
		if (local15 == 13) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static24.anInt833 = Static122.anInt2791;
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(48);
				Static14.aClass4_Sub9_Sub1_1.method786(local23);
			}
		}
		if (local15 == 26) {
			Static14.aClass4_Sub9_Sub1_1.method826(6);
			Static14.aClass4_Sub9_Sub1_1.method772(local11);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
			Static14.aClass4_Sub9_Sub1_1.method808(local27);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 3) {
			local38 = Static53.method867(local27, local11);
			if (local38 != null) {
				Static115.method1871();
				Static119.method1902(Static43.method616(Static38.method575(local38)), local27, local11);
				Static44.anInt2167 = 0;
				Static124.aClass60_1108 = Static71.method1230(local38);
				if (Static124.aClass60_1108 == null) {
					Static124.aClass60_1108 = Static37.aClass60_380;
				}
				if (local38.aBoolean95) {
					Static12.aClass60_998 = Static12.method1761(new Class60[] { local38.aClass60_953, Static72.aClass60_755 });
					return;
				}
				Static12.aClass60_998 = Static12.method1761(new Class60[] { Static71.aClass60_748, local38.aClass60_955, Static72.aClass60_755 });
			}
			return;
		}
		if (local15 == 12) {
			Static14.aClass4_Sub9_Sub1_1.method826(47);
			Static14.aClass4_Sub9_Sub1_1.method781(local27);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static14.aClass4_Sub9_Sub1_1.method772(local11);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 40) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static24.anInt833 = Static122.anInt2791;
				Static66.anInt1659 = 0;
				Static69.anInt1722 = 2;
				Static115.anInt2693 = Static63.anInt1591;
				Static14.aClass4_Sub9_Sub1_1.method826(166);
				Static14.aClass4_Sub9_Sub1_1.method803(local23);
			}
		}
		if (local15 == 51) {
			Static83.method1326(local11, local23, local27);
			Static14.aClass4_Sub9_Sub1_1.method826(225);
			Static14.aClass4_Sub9_Sub1_1.method772(local23 >> 14 & 0x7FFF);
			Static14.aClass4_Sub9_Sub1_1.method786(local27 + Static60.anInt2956);
			Static14.aClass4_Sub9_Sub1_1.method803(Static49.anInt1207 + local11);
		}
		if (local15 == 33) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static66.anInt1659 = 0;
				Static69.anInt1722 = 2;
				Static24.anInt833 = Static122.anInt2791;
				Static115.anInt2693 = Static63.anInt1591;
				Static14.aClass4_Sub9_Sub1_1.method826(33);
				Static14.aClass4_Sub9_Sub1_1.method781(Static45.anInt1122);
				Static14.aClass4_Sub9_Sub1_1.method803(Static49.anInt1204);
				Static14.aClass4_Sub9_Sub1_1.method803(local23);
			}
		}
		@Pc(950) int local950;
		if (local15 == 19) {
			Static14.aClass4_Sub9_Sub1_1.method826(161);
			Static14.aClass4_Sub9_Sub1_1.method808(local27);
			local38 = Static61.method991(local27);
			if (local38.anIntArrayArray71 != null && local38.anIntArrayArray71[0][0] == 5) {
				local950 = local38.anIntArrayArray71[0][1];
				if (local38.anIntArray306[0] != Static53.anIntArray141[local950]) {
					Static53.anIntArray141[local950] = local38.anIntArray306[0];
					Static1.method5(local950);
				}
			}
		}
		if (local15 == 11) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static115.anInt2693 = Static63.anInt1591;
				Static69.anInt1722 = 2;
				Static24.anInt833 = Static122.anInt2791;
				Static66.anInt1659 = 0;
				Static14.aClass4_Sub9_Sub1_1.method826(60);
				Static14.aClass4_Sub9_Sub1_1.method772(local23);
			}
		}
		if (local15 == 23 && Static27.aClass4_Sub14_6 == null) {
			Static80.method1283(local11, local27);
			Static27.aClass4_Sub14_6 = Static53.method867(local27, local11);
			Static36.method558(Static27.aClass4_Sub14_6);
		}
		if (local15 == 44) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static115.anInt2693 = Static63.anInt1591;
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static66.anInt1659 = 0;
				Static14.aClass4_Sub9_Sub1_1.method826(245);
				Static14.aClass4_Sub9_Sub1_1.method796(local23);
			}
		}
		if (local15 == 50) {
			Static14.aClass4_Sub9_Sub1_1.method826(185);
			Static14.aClass4_Sub9_Sub1_1.method781(local27);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static14.aClass4_Sub9_Sub1_1.method772(local11);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 9) {
			Static14.aClass4_Sub9_Sub1_1.method826(101);
			Static14.aClass4_Sub9_Sub1_1.method772(local11);
			Static14.aClass4_Sub9_Sub1_1.method820(local27);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 46) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static24.anInt833 = Static122.anInt2791;
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(28);
				Static14.aClass4_Sub9_Sub1_1.method796(local23);
			}
		}
		if (local15 == 58 && Static83.method1326(local11, local23, local27)) {
			Static14.aClass4_Sub9_Sub1_1.method826(129);
			Static14.aClass4_Sub9_Sub1_1.method775(Static45.anInt1122);
			Static14.aClass4_Sub9_Sub1_1.method796(Static49.anInt1207 + local11);
			Static14.aClass4_Sub9_Sub1_1.method796(Static49.anInt1204);
			Static14.aClass4_Sub9_Sub1_1.method772(local23 >> 14 & 0x7FFF);
			Static14.aClass4_Sub9_Sub1_1.method786(Static60.anInt2956 + local27);
		}
		if (local15 == 37) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static69.anInt1722 = 2;
				Static24.anInt833 = Static122.anInt2791;
				Static66.anInt1659 = 0;
				Static115.anInt2693 = Static63.anInt1591;
				Static14.aClass4_Sub9_Sub1_1.method826(149);
				Static14.aClass4_Sub9_Sub1_1.method803(local23);
			}
		}
		if (local15 == 1) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static66.anInt1659 = 0;
				Static115.anInt2693 = Static63.anInt1591;
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(30);
				Static14.aClass4_Sub9_Sub1_1.method796(local23);
				Static14.aClass4_Sub9_Sub1_1.method781(Static108.anInt2580);
				Static14.aClass4_Sub9_Sub1_1.method803(Static9.anInt125);
				Static14.aClass4_Sub9_Sub1_1.method803(Static124.anInt2803);
			}
		}
		if (local15 == 41) {
			Static83.method1326(local11, local23, local27);
			Static14.aClass4_Sub9_Sub1_1.method826(113);
			Static14.aClass4_Sub9_Sub1_1.method772(local23 >> 14 & 0x7FFF);
			Static14.aClass4_Sub9_Sub1_1.method803(local11 + Static49.anInt1207);
			Static14.aClass4_Sub9_Sub1_1.method786(Static60.anInt2956 + local27);
		}
		if (local15 == 1007) {
			Static69.anInt1722 = 2;
			Static115.anInt2693 = Static63.anInt1591;
			Static24.anInt833 = Static122.anInt2791;
			Static66.anInt1659 = 0;
			Static14.aClass4_Sub9_Sub1_1.method826(109);
			Static14.aClass4_Sub9_Sub1_1.method803(local23 >> 14 & 0x7FFF);
		}
		if (local15 == 15) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static24.anInt833 = Static122.anInt2791;
			Static66.anInt1659 = 0;
			Static69.anInt1722 = 2;
			Static115.anInt2693 = Static63.anInt1591;
			Static14.aClass4_Sub9_Sub1_1.method826(61);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
			Static14.aClass4_Sub9_Sub1_1.method786(Static49.anInt1207 + local11);
			Static14.aClass4_Sub9_Sub1_1.method796(Static60.anInt2956 + local27);
		}
		if (local15 == 1002) {
			Static83.method1326(local11, local23, local27);
			Static14.aClass4_Sub9_Sub1_1.method826(231);
			Static14.aClass4_Sub9_Sub1_1.method796(local23 >> 14 & 0x7FFF);
			Static14.aClass4_Sub9_Sub1_1.method772(local11 + Static49.anInt1207);
			Static14.aClass4_Sub9_Sub1_1.method796(local27 + Static60.anInt2956);
		}
		if (local15 == 49) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static69.anInt1722 = 2;
				Static24.anInt833 = Static122.anInt2791;
				Static66.anInt1659 = 0;
				Static115.anInt2693 = Static63.anInt1591;
				Static14.aClass4_Sub9_Sub1_1.method826(187);
				Static14.aClass4_Sub9_Sub1_1.method803(local23);
			}
		}
		if (local15 == 30) {
			Static83.method1326(local11, local23, local27);
			Static14.aClass4_Sub9_Sub1_1.method826(204);
			Static14.aClass4_Sub9_Sub1_1.method786(local27 + Static60.anInt2956);
			Static14.aClass4_Sub9_Sub1_1.method772(local23 >> 14 & 0x7FFF);
			Static14.aClass4_Sub9_Sub1_1.method772(Static49.anInt1207 + local11);
		}
		if (local15 == 48) {
			Static14.aClass4_Sub9_Sub1_1.method826(161);
			Static14.aClass4_Sub9_Sub1_1.method808(local27);
			local38 = Static61.method991(local27);
			if (local38.anIntArrayArray71 != null && local38.anIntArrayArray71[0][0] == 5) {
				local950 = local38.anIntArrayArray71[0][1];
				Static53.anIntArray141[local950] = 1 - Static53.anIntArray141[local950];
				Static1.method5(local950);
			}
		}
		if (local15 == 34) {
			Static14.aClass4_Sub9_Sub1_1.method826(247);
			Static14.aClass4_Sub9_Sub1_1.method786(local23);
			Static14.aClass4_Sub9_Sub1_1.method775(local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local11);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 24) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static14.aClass4_Sub9_Sub1_1.method826(135);
				Static14.aClass4_Sub9_Sub1_1.method786(local23);
			}
		}
		if (local15 == 29) {
			Static30.aClass48_1.method1016(Static77.anInt1866, local11, local27);
		}
		if (local15 == 8) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static115.anInt2693 = Static63.anInt1591;
			Static66.anInt1659 = 0;
			Static24.anInt833 = Static122.anInt2791;
			Static69.anInt1722 = 2;
			Static14.aClass4_Sub9_Sub1_1.method826(39);
			Static14.aClass4_Sub9_Sub1_1.method808(Static45.anInt1122);
			Static14.aClass4_Sub9_Sub1_1.method796(local27 + Static60.anInt2956);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static14.aClass4_Sub9_Sub1_1.method796(Static49.anInt1207 + local11);
			Static14.aClass4_Sub9_Sub1_1.method786(Static49.anInt1204);
		}
		if (local15 == 7) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static66.anInt1659 = 0;
				Static115.anInt2693 = Static63.anInt1591;
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(42);
				Static14.aClass4_Sub9_Sub1_1.method772(local23);
			}
		}
		if (local15 == 6) {
			Static14.aClass4_Sub9_Sub1_1.method826(144);
			Static14.aClass4_Sub9_Sub1_1.method808(local27);
			Static14.aClass4_Sub9_Sub1_1.method808(Static45.anInt1122);
			Static14.aClass4_Sub9_Sub1_1.method786(Static49.anInt1204);
			Static14.aClass4_Sub9_Sub1_1.method772(local11);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 47) {
			Static115.method1871();
			local38 = Static61.method991(local27);
			Static108.anInt2580 = local27;
			Static9.anInt125 = local11;
			Static124.anInt2803 = local23;
			Static44.anInt2167 = 1;
			Static36.method558(local38);
			Static108.aClass60_1004 = Static12.method1761(new Class60[] { Static115.aClass60_1048, Static112.method1854(local23).aClass60_1128, Static72.aClass60_755 });
			if (Static108.aClass60_1004 == null) {
				Static108.aClass60_1004 = Static31.aClass60_319;
			}
			return;
		}
		if (local15 == 45) {
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				Static36.method564(local568.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local568.anIntArray137[0], 2);
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static14.aClass4_Sub9_Sub1_1.method826(59);
				Static14.aClass4_Sub9_Sub1_1.method786(local23);
			}
		}
		if (local15 == 17) {
			Static14.aClass4_Sub9_Sub1_1.method826(139);
			Static14.aClass4_Sub9_Sub1_1.method803(local23);
			Static14.aClass4_Sub9_Sub1_1.method775(local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local11);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 43) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static115.anInt2693 = Static63.anInt1591;
			Static24.anInt833 = Static122.anInt2791;
			Static66.anInt1659 = 0;
			Static69.anInt1722 = 2;
			Static14.aClass4_Sub9_Sub1_1.method826(3);
			Static14.aClass4_Sub9_Sub1_1.method796(Static49.anInt1207 + local11);
			Static14.aClass4_Sub9_Sub1_1.method772(Static60.anInt2956 + local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local23);
		}
		if (local15 == 18) {
			Static14.aClass4_Sub9_Sub1_1.method826(126);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static14.aClass4_Sub9_Sub1_1.method781(local27);
			Static14.aClass4_Sub9_Sub1_1.method796(local11);
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 10) {
			Static14.aClass4_Sub9_Sub1_1.method826(38);
			Static14.aClass4_Sub9_Sub1_1.method803(Static49.anInt1204);
			Static14.aClass4_Sub9_Sub1_1.method781(local27);
			Static14.aClass4_Sub9_Sub1_1.method781(Static45.anInt1122);
			Static14.aClass4_Sub9_Sub1_1.method803(local11);
		}
		if (local15 == 28) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(53);
				Static14.aClass4_Sub9_Sub1_1.method803(local23);
			}
		}
		if (local15 == 1003) {
			Static69.anInt1722 = 2;
			Static66.anInt1659 = 0;
			Static24.anInt833 = Static122.anInt2791;
			Static115.anInt2693 = Static63.anInt1591;
			local568 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23];
			if (local568 != null) {
				@Pc(2378) Class4_Sub3_Sub13 local2378 = local568.aClass4_Sub3_Sub13_1;
				if (local2378.anIntArray282 != null) {
					local2378 = local2378.method1526();
				}
				if (local2378 != null) {
					Static14.aClass4_Sub9_Sub1_1.method826(66);
					Static14.aClass4_Sub9_Sub1_1.method803(local2378.anInt2203);
				}
			}
		}
		if (local15 == 14) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static66.anInt1659 = 0;
			Static24.anInt833 = Static122.anInt2791;
			Static69.anInt1722 = 2;
			Static115.anInt2693 = Static63.anInt1591;
			Static14.aClass4_Sub9_Sub1_1.method826(188);
			Static14.aClass4_Sub9_Sub1_1.method786(Static124.anInt2803);
			Static14.aClass4_Sub9_Sub1_1.method772(local11 + Static49.anInt1207);
			Static14.aClass4_Sub9_Sub1_1.method786(Static9.anInt125);
			Static14.aClass4_Sub9_Sub1_1.method786(Static60.anInt2956 + local27);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
			Static14.aClass4_Sub9_Sub1_1.method820(Static108.anInt2580);
		}
		if (local15 == 57) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static69.anInt1722 = 2;
				Static24.anInt833 = Static122.anInt2791;
				Static66.anInt1659 = 0;
				Static115.anInt2693 = Static63.anInt1591;
				Static14.aClass4_Sub9_Sub1_1.method826(226);
				Static14.aClass4_Sub9_Sub1_1.method786(local23);
			}
		}
		if (local15 == 35) {
			local69 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local23];
			if (local69 != null) {
				Static36.method564(local69.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local69.anIntArray137[0], 2);
				Static115.anInt2693 = Static63.anInt1591;
				Static66.anInt1659 = 0;
				Static24.anInt833 = Static122.anInt2791;
				Static69.anInt1722 = 2;
				Static14.aClass4_Sub9_Sub1_1.method826(100);
				Static14.aClass4_Sub9_Sub1_1.method775(Static45.anInt1122);
				Static14.aClass4_Sub9_Sub1_1.method772(local23);
				Static14.aClass4_Sub9_Sub1_1.method803(Static49.anInt1204);
			}
		}
		if (local15 == 1004) {
			local38 = Static61.method991(local27);
			if (local38 == null || local38.anIntArray311[local11] < 100000) {
				Static14.aClass4_Sub9_Sub1_1.method826(102);
				Static14.aClass4_Sub9_Sub1_1.method772(local23);
			} else {
				Static90.method1469(0, Static23.aClass60_253, Static12.method1761(new Class60[] { Static65.method1051(local38.anIntArray311[local11]), Static55.aClass60_535, Static112.method1854(local23).aClass60_1128 }));
			}
			Static66.anInt1661 = 0;
			Static23.aClass4_Sub14_5 = Static61.method991(local27);
			Static110.anInt2618 = local11;
		}
		if (local15 == 20) {
			local278 = Static36.method564(local27, 0, 0, 0, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			if (!local278) {
				Static36.method564(local27, 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local11, 2);
			}
			Static24.anInt833 = Static122.anInt2791;
			Static115.anInt2693 = Static63.anInt1591;
			Static69.anInt1722 = 2;
			Static66.anInt1659 = 0;
			Static14.aClass4_Sub9_Sub1_1.method826(196);
			Static14.aClass4_Sub9_Sub1_1.method803(Static60.anInt2956 + local27);
			Static14.aClass4_Sub9_Sub1_1.method796(Static49.anInt1207 + local11);
			Static14.aClass4_Sub9_Sub1_1.method772(local23);
		}
		if (local15 == 2 || local15 == 1001) {
			Static14.method286(Static128.aClass60Array20[arg0], local27, local11, local23);
		}
		if (local15 == 4 && Static83.method1326(local11, local23, local27)) {
			Static14.aClass4_Sub9_Sub1_1.method826(117);
			Static14.aClass4_Sub9_Sub1_1.method786(Static124.anInt2803);
			Static14.aClass4_Sub9_Sub1_1.method786(local11 + Static49.anInt1207);
			Static14.aClass4_Sub9_Sub1_1.method772(Static9.anInt125);
			Static14.aClass4_Sub9_Sub1_1.method775(Static108.anInt2580);
			Static14.aClass4_Sub9_Sub1_1.method786(local23 >> 14 & 0x7FFF);
			Static14.aClass4_Sub9_Sub1_1.method803(Static60.anInt2956 + local27);
		}
		if (Static44.anInt2167 != 0) {
			Static44.anInt2167 = 0;
			Static36.method558(Static61.method991(Static108.anInt2580));
		}
		if (Static86.aBoolean71) {
			Static115.method1871();
		}
		if (Static23.aClass4_Sub14_5 != null && Static66.anInt1661 == 0) {
			Static36.method558(Static23.aClass4_Sub14_5);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!c;BI)Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 method1572(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		return Static53.method865(arg1, arg0) ? Static3.method29() : null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBILclient!c;)Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 method1573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2) {
		return Static110.method1825(arg1, arg0, arg2) ? Static3.method29() : null;
	}
}
