import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray46;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString102 = "Close";

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
	public static int anInt2030 = 255;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
	public static int anInt2031 = 7759444;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
	public static int anInt2033 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIILclient!r;)Lclient!r;")
	public static Class36_Sub2 method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class36_Sub2 arg5) {
		@Pc(8) long local8 = (long) arg0;
		@Pc(14) Class36_Sub2 local14 = (Class36_Sub2) Static28.aClass46_5.method1074(local8);
		if (local14 == null) {
			@Pc(21) Class36_Sub6 local21 = Static252.method4038(Static233.aClass84_105, arg0);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method4049(64, 768, -50, -10, -50);
			Static28.aClass46_5.method1071(local14, local8);
		}
		@Pc(42) int local42 = arg5.method3847();
		@Pc(45) int local45 = arg5.method3841();
		@Pc(48) int local48 = arg5.method3852();
		@Pc(51) int local51 = arg5.method3848();
		local14 = local14.method3856(true, true, true);
		if (arg2 != 0) {
			local14.method3844(arg2);
		}
		@Pc(104) int local104;
		if (Static60.aBoolean106) {
			@Pc(68) Class36_Sub2_Sub1 local68 = (Class36_Sub2_Sub1) local14;
			if (arg4 != Static99.method1894(Static208.anInt4335, local48 + arg1, local42 + arg3) || Static99.method1894(Static208.anInt4335, local51 + arg1, arg3 - -local45) != arg4) {
				for (local104 = 0; local104 < local68.anInt1109; local104++) {
					local68.anIntArray83[local104] += Static99.method1894(Static208.anInt4335, local68.anIntArray86[local104] + arg1, arg3 + local68.anIntArray87[local104]) - arg4;
				}
				local68.aClass157_1.aBoolean411 = false;
				local68.aClass105_1.aBoolean261 = false;
			}
		} else {
			@Pc(151) Class36_Sub2_Sub2 local151 = (Class36_Sub2_Sub2) local14;
			if (Static99.method1894(Static208.anInt4335, arg1 + local48, arg3 - -local42) != arg4 || Static99.method1894(Static208.anInt4335, arg1 + local51, arg3 + local45) != arg4) {
				for (local104 = 0; local104 < local151.anInt4749; local104++) {
					local151.anIntArray401[local104] += Static99.method1894(Static208.anInt4335, local151.anIntArray403[local104] + arg1, arg3 + local151.anIntArray409[local104]) - arg4;
				}
				local151.aBoolean400 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Z")
	public static boolean method1715(@OriginalArg(1) int arg0) {
		@Pc(36) int local36;
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (Static133.aClass2_Sub3_Sub1_Sub1_2 == null) {
			if (Static60.aBoolean106 || Static166.aClass2_Sub3_Sub1_6 == null) {
				Static133.aClass2_Sub3_Sub1_Sub1_2 = new Class2_Sub3_Sub1_Sub1(512, 512);
			} else {
				Static133.aClass2_Sub3_Sub1_Sub1_2 = (Class2_Sub3_Sub1_Sub1) Static166.aClass2_Sub3_Sub1_6;
			}
			@Pc(31) int[] local31 = Static133.aClass2_Sub3_Sub1_Sub1_2.anIntArray479;
			@Pc(34) int local34 = local31.length;
			for (local36 = 0; local36 < local34; local36++) {
				local31[local36] = 1;
			}
			for (local36 = 1; local36 < 103; local36++) {
				local68 = 4 * 512 * (103 - local36) + 24628;
				for (local72 = 1; local72 < 103; local72++) {
					if ((Static134.aByteArrayArrayArray9[arg0][local72][local36] & 0x18) == 0) {
						Static54.method1081(local31, local68, arg0, local72, local36);
					}
					if (arg0 < 3 && (Static134.aByteArrayArrayArray9[arg0 + 1][local72][local36] & 0x8) != 0) {
						Static54.method1081(local31, local68, arg0 + 1, local72, local36);
					}
					local68 += 4;
				}
			}
			Static215.anInt4472 = 0;
			for (local36 = 0; local36 < 104; local36++) {
				for (local68 = 0; local68 < 104; local68++) {
					@Pc(156) long local156 = Static219.method3696(Static208.anInt4335, local36 + 0, local68);
					if (local156 != 0L) {
						@Pc(170) Class143 local170 = Static218.method3692(Integer.MAX_VALUE & (int) (local156 >>> 32));
						@Pc(173) int local173 = local170.anInt4486;
						@Pc(179) int local179;
						if (local170.anIntArray372 != null) {
							for (local179 = 0; local179 < local170.anIntArray372.length; local179++) {
								if (local170.anIntArray372[local179] != -1) {
									@Pc(202) Class143 local202 = Static218.method3692(local170.anIntArray372[local179]);
									if (local202.anInt4486 >= 0) {
										local173 = local202.anInt4486;
										break;
									}
								}
							}
						}
						if (local173 >= 0) {
							local179 = local36;
							@Pc(226) int local226 = local68;
							if (local173 != 22 && local173 != 29 && local173 != 34 && local173 != 36 && local173 != 46 && local173 != 47 && local173 != 48) {
								@Pc(260) int[][] local260 = Static98.aClass52Array1[Static208.anInt4335].anIntArrayArray14;
								for (@Pc(262) int local262 = 0; local262 < 10; local262++) {
									@Pc(270) int local270 = (int) (Math.random() * 4.0D);
									if (local270 == 0 && local179 > 0 && local179 > local36 - 3 && (local260[local179 - 1][local226] & 0x2C0108) == 0) {
										local179--;
									}
									if (local270 == 1 && local179 < 103 && local179 < local36 + 3 && (local260[local179 + 1][local226] & 0x2C0180) == 0) {
										local179++;
									}
									if (local270 == 2 && local226 > 0 && local226 > local68 - 3 && (local260[local179][local226 - 1] & 0x2C0102) == 0) {
										local226--;
									}
									if (local270 == 3 && local226 < 103 && local226 < local68 + 3 && (local260[local179][local226 + 1] & 0x2C0120) == 0) {
										local226++;
									}
								}
							}
							Static84.anIntArray53[Static215.anInt4472] = local170.anInt4488;
							Static9.anIntArray13[Static215.anInt4472] = local179;
							Static158.anIntArray236[Static215.anInt4472] = local226;
							Static215.anInt4472++;
						}
					}
				}
			}
		}
		Static133.aClass2_Sub3_Sub1_Sub1_2.method4389();
		@Pc(449) int local449 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10;
		local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local68 = 1; local68 < 103; local68++) {
			for (local72 = 1; local72 < 103; local72++) {
				if ((Static134.aByteArrayArrayArray9[arg0][local72][local68] & 0x18) == 0 && !Static99.method1892(local36, arg0, local68, local72, local449)) {
					if (Static60.aBoolean106) {
						Static160.anIntArray254 = null;
					} else {
						Static170.aClass14_1.method1192();
					}
					return false;
				}
				if (arg0 < 3 && (Static134.aByteArrayArrayArray9[arg0 + 1][local72][local68] & 0x8) != 0 && !Static99.method1892(local36, arg0 + 1, local68, local72, local449)) {
					if (Static60.aBoolean106) {
						Static160.anIntArray254 = null;
					} else {
						Static170.aClass14_1.method1192();
					}
					return false;
				}
			}
		}
		if (Static60.aBoolean106) {
			@Pc(566) int[] local566 = Static133.aClass2_Sub3_Sub1_Sub1_2.anIntArray479;
			local72 = local566.length;
			for (@Pc(571) int local571 = 0; local571 < local72; local571++) {
				if (local566[local571] == 0) {
					local566[local571] = 1;
				}
			}
			Static166.aClass2_Sub3_Sub1_6 = new Class2_Sub3_Sub1_Sub2(Static133.aClass2_Sub3_Sub1_Sub1_2);
		} else {
			Static166.aClass2_Sub3_Sub1_6 = Static133.aClass2_Sub3_Sub1_Sub1_2;
		}
		if (Static60.aBoolean106) {
			Static160.anIntArray254 = null;
		} else {
			Static170.aClass14_1.method1192();
		}
		Static133.aClass2_Sub3_Sub1_Sub1_2 = null;
		return true;
	}
}
