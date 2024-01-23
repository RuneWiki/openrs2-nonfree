import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "Lclient!kj;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_666 = Static184.method2923("(Y");

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "Z")
	public static boolean aBoolean119 = true;

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "Lclient!i;")
	public static Class41 aClass41_667 = Static184.method2923("Stufe)2");

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "Lclient!i;")
	public static Class41 aClass41_668 = Static184.method2923("Lade Sprites )2 ");

	@OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
	public static int anInt2267 = 0;

	@OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
	public static int anInt2268 = -1;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)I")
	public static int method1599() {
		return 6;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)Z")
	public static boolean method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static63.anInt1690; local1++) {
			@Pc(6) Class8 local6 = Static144.aClass8Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt406 == 1) {
				local15 = local6.anInt386 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt392 + (local6.anInt399 * local15 >> 8);
					local37 = local6.anInt405 + (local6.anInt387 * local15 >> 8);
					local47 = local6.anInt390 + (local6.anInt389 * local15 >> 8);
					local57 = local6.anInt397 + (local6.anInt401 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt406 == 2) {
				local15 = arg0 - local6.anInt386;
				if (local15 > 0) {
					local27 = local6.anInt392 + (local6.anInt399 * local15 >> 8);
					local37 = local6.anInt405 + (local6.anInt387 * local15 >> 8);
					local47 = local6.anInt390 + (local6.anInt389 * local15 >> 8);
					local57 = local6.anInt397 + (local6.anInt401 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt406 == 3) {
				local15 = local6.anInt392 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt386 + (local6.anInt398 * local15 >> 8);
					local37 = local6.anInt394 + (local6.anInt396 * local15 >> 8);
					local47 = local6.anInt390 + (local6.anInt389 * local15 >> 8);
					local57 = local6.anInt397 + (local6.anInt401 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt406 == 4) {
				local15 = arg2 - local6.anInt392;
				if (local15 > 0) {
					local27 = local6.anInt386 + (local6.anInt398 * local15 >> 8);
					local37 = local6.anInt394 + (local6.anInt396 * local15 >> 8);
					local47 = local6.anInt390 + (local6.anInt389 * local15 >> 8);
					local57 = local6.anInt397 + (local6.anInt401 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt406 == 5) {
				local15 = arg1 - local6.anInt390;
				if (local15 > 0) {
					local27 = local6.anInt386 + (local6.anInt398 * local15 >> 8);
					local37 = local6.anInt394 + (local6.anInt396 * local15 >> 8);
					local47 = local6.anInt392 + (local6.anInt399 * local15 >> 8);
					local57 = local6.anInt405 + (local6.anInt387 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIIII)V")
	public static void method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static202.anInt1737 < 100) {
			Static167.method2703();
		}
		Static64.method1166(arg2, arg3, arg0 + arg2, arg1 + arg3);
		@Pc(26) int local26;
		@Pc(39) int local39;
		if (Static202.anInt1737 < 100) {
			local26 = arg0 / 2 + arg2;
			local39 = arg1 / 2 + arg3 - 38;
			Static64.method1164(arg2, arg3, arg0, arg1, 0);
			Static64.method1162(local26 - 152, local39, 304, 34, 9179409);
			Static64.method1162(local26 - 151, local39 + 1, 302, 32, 0);
			Static64.method1164(local26 - 150, local39 + 2, Static202.anInt1737 * 3, 30, 9179409);
			Static64.method1164(local26 + Static202.anInt1737 * 3 - 150, local39 - -2, 300 - Static202.anInt1737 * 3, 30, 0);
			Static49.aClass2_Sub2_Sub4_3.method771(Static173.aClass41_1071, local26, local39 + 20, 16777215, -1);
			return;
		}
		Static36.anInt949 = Static111.anInt2664 - (int) ((double) arg0 / Static54.aDouble1);
		@Pc(123) int local123 = Static111.anInt2664 - (int) ((double) arg0 / Static54.aDouble1);
		Static39.anInt1059 = Static142.anInt3263 - (int) ((double) arg1 / Static54.aDouble1);
		Static147.anInt3347 = (int) ((double) (arg1 * 2) / Static54.aDouble1);
		local26 = Static142.anInt3263 - (int) ((double) arg1 / Static54.aDouble1);
		Static63.anInt1688 = (int) ((double) (arg0 * 2) / Static54.aDouble1);
		local39 = (int) ((double) arg0 / Static54.aDouble1) + Static111.anInt2664;
		@Pc(175) int local175 = (int) ((double) arg1 / Static54.aDouble1) + Static142.anInt3263;
		Static42.method210(arg1 + arg3, arg2 - -arg0, arg2, arg3, local175, local123, local39, local26);
		Static198.method3076(arg3, arg2, arg2 + arg0, arg1 + arg3, local26, local39, local123, local175);
		if (Static49.anInt1395 > 0) {
			Static49.anInt1395--;
		}
		if (!Static133.aBoolean166) {
			return;
		}
		@Pc(218) int local218 = arg2 + arg0 - 5;
		@Pc(224) int local224 = arg1 + arg3 - 8;
		Static3.aClass2_Sub2_Sub4_1.method780(Static149.method2324(new Class41[] { Static48.aClass41_412, Static152.method2471(Static12.anInt393) }), local218, local224, 16776960, -1);
		@Pc(245) int local245 = local224 - 15;
		@Pc(247) Runtime local247 = Runtime.getRuntime();
		@Pc(256) int local256 = (int) ((local247.totalMemory() - local247.freeMemory()) / 1024L);
		@Pc(258) int local258 = 16776960;
		if (local256 > 65536) {
			local258 = 16711680;
		}
		Static3.aClass2_Sub2_Sub4_1.method780(Static149.method2324(new Class41[] { Static63.aClass41_533, Static152.method2471(local256), Static67.aClass41_556 }), local218, local245, local258, -1);
		local224 = local245 - 15;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIB)Lclient!pe;")
	public static Class2_Sub21 method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class2_Sub21 local3 = new Class2_Sub21();
		local3.anInt3439 = arg0;
		local3.anInt3435 = arg2;
		Static113.aClass70_8.method2208((long) arg1, local3);
		Static134.method2137(arg2);
		@Pc(33) Class80 local33 = Static212.method3256(arg1);
		if (local33 != null) {
			Static176.method2833(local33);
		}
		if (Static48.aClass80_5 != null) {
			Static176.method2833(Static48.aClass80_5);
			Static48.aClass80_5 = null;
		}
		Static94.aBoolean123 = false;
		Static179.anInt4150 = 0;
		Static111.method1901(Static43.anInt1299, Static210.anInt4696, Static208.anInt4650, Static75.anInt3784);
		if (local33 != null) {
			Static96.method1670(false, local33);
		}
		Static131.method2084(arg2);
		if (Static39.anInt1055 != -1) {
			Static122.method2038(Static39.anInt1055, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!u;I)V")
	public static void method1603(@OriginalArg(0) Class12_Sub3 arg0) {
		arg0.aBoolean243 = false;
		@Pc(17) Class2_Sub2_Sub9 local17;
		if (arg0.anInt3935 != -1) {
			local17 = Static14.method299(arg0.anInt3935);
			if (local17 == null || local17.anIntArray233 == null) {
				arg0.anInt3935 = -1;
			} else {
				arg0.anInt3940++;
				if (arg0.anInt3955 < local17.anIntArray233.length && local17.anIntArray235[arg0.anInt3955] < arg0.anInt3940) {
					arg0.anInt3940 = 1;
					arg0.anInt3955++;
					Static55.method1083(arg0 == Static213.aClass12_Sub3_Sub1_1, arg0.anInt3949, arg0.anInt3955, arg0.anInt3961, local17);
				}
				if (arg0.anInt3955 >= local17.anIntArray233.length) {
					arg0.anInt3955 = 0;
					arg0.anInt3940 = 0;
					Static55.method1083(arg0 == Static213.aClass12_Sub3_Sub1_1, arg0.anInt3949, arg0.anInt3955, arg0.anInt3961, local17);
				}
			}
		}
		if (arg0.anInt3911 != -1 && Static103.anInt2511 >= arg0.anInt3913) {
			if (arg0.anInt3908 < 0) {
				arg0.anInt3908 = 0;
			}
			@Pc(124) int local124 = Static56.method1110(arg0.anInt3911).anInt727;
			if (local124 == -1) {
				arg0.anInt3911 = -1;
			} else {
				@Pc(131) Class2_Sub2_Sub9 local131 = Static14.method299(local124);
				if (local131 == null || local131.anIntArray233 == null) {
					arg0.anInt3911 = -1;
				} else {
					arg0.anInt3948++;
					if (local131.anIntArray233.length > arg0.anInt3908 && local131.anIntArray235[arg0.anInt3908] < arg0.anInt3948) {
						arg0.anInt3908++;
						arg0.anInt3948 = 1;
						Static55.method1083(Static213.aClass12_Sub3_Sub1_1 == arg0, arg0.anInt3949, arg0.anInt3908, arg0.anInt3961, local131);
					}
					if (arg0.anInt3908 >= local131.anIntArray233.length) {
						arg0.anInt3911 = -1;
					}
				}
			}
		}
		if (arg0.anInt3910 != -1 && arg0.anInt3965 <= 1) {
			local17 = Static14.method299(arg0.anInt3910);
			if (local17.anInt2350 == 1 && arg0.anInt3962 > 0 && arg0.anInt3959 <= Static103.anInt2511 && Static103.anInt2511 > arg0.anInt3957) {
				arg0.anInt3965 = 1;
				return;
			}
		}
		if (arg0.anInt3910 != -1 && arg0.anInt3965 == 0) {
			local17 = Static14.method299(arg0.anInt3910);
			if (local17 == null || local17.anIntArray233 == null) {
				arg0.anInt3910 = -1;
			} else {
				arg0.anInt3927++;
				if (arg0.anInt3930 < local17.anIntArray233.length && local17.anIntArray235[arg0.anInt3930] < arg0.anInt3927) {
					arg0.anInt3927 = 1;
					arg0.anInt3930++;
					Static55.method1083(arg0 == Static213.aClass12_Sub3_Sub1_1, arg0.anInt3949, arg0.anInt3930, arg0.anInt3961, local17);
				}
				if (arg0.anInt3930 >= local17.anIntArray233.length) {
					arg0.anInt3958++;
					arg0.anInt3930 -= local17.anInt2342;
					if (arg0.anInt3958 >= local17.anInt2341) {
						arg0.anInt3910 = -1;
					} else if (arg0.anInt3930 >= 0 && arg0.anInt3930 < local17.anIntArray233.length) {
						Static55.method1083(arg0 == Static213.aClass12_Sub3_Sub1_1, arg0.anInt3949, arg0.anInt3930, arg0.anInt3961, local17);
					} else {
						arg0.anInt3910 = -1;
					}
				}
				arg0.aBoolean243 = local17.aBoolean125;
			}
		}
		if (arg0.anInt3965 > 0) {
			arg0.anInt3965--;
		}
	}
}
