import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "Lclient!km;")
	public static Class91 aClass91_82;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString132 = "Loaded fonts";

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Z")
	public static boolean method1837(@OriginalArg(1) int arg0) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(68) int local68;
		@Pc(72) int local72;
		if (Static84.aClass1_Sub2_Sub11_Sub2_1 == null) {
			if (Static277.aBoolean412 || Static24.aClass1_Sub2_Sub11_18 == null) {
				Static84.aClass1_Sub2_Sub11_Sub2_1 = new Class1_Sub2_Sub11_Sub2(512, 512);
			} else {
				Static84.aClass1_Sub2_Sub11_Sub2_1 = (Class1_Sub2_Sub11_Sub2) Static24.aClass1_Sub2_Sub11_18;
			}
			@Pc(32) int[] local32 = Static84.aClass1_Sub2_Sub11_Sub2_1.anIntArray426;
			local35 = local32.length;
			for (local37 = 0; local37 < local35; local37++) {
				local32[local37] = 1;
			}
			for (local37 = 1; local37 < 103; local37++) {
				local68 = (103 - local37) * 512 * 4 + 24628;
				for (local72 = 1; local72 < 103; local72++) {
					if ((Static260.aByteArrayArrayArray25[arg0][local72][local37] & 0x18) == 0) {
						Static32.method3622(local32, local68, arg0, local72, local37);
					}
					if (arg0 < 3 && (Static260.aByteArrayArrayArray25[arg0 + 1][local72][local37] & 0x8) != 0) {
						Static32.method3622(local32, local68, arg0 + 1, local72, local37);
					}
					local68 += 4;
				}
			}
			Static55.anInt1210 = 0;
			for (local37 = 0; local37 < 104; local37++) {
				for (local68 = 0; local68 < 104; local68++) {
					@Pc(154) long local154 = Static151.method4444(Static140.anInt3034, local37 + 0, local68);
					if (local154 != 0L) {
						@Pc(169) Class181 local169 = Static183.method3511(Integer.MAX_VALUE & (int) (local154 >>> 32));
						@Pc(172) int local172 = local169.anInt5567;
						@Pc(178) int local178;
						if (local169.anIntArray552 != null) {
							for (local178 = 0; local178 < local169.anIntArray552.length; local178++) {
								if (local169.anIntArray552[local178] != -1) {
									@Pc(202) Class181 local202 = Static183.method3511(local169.anIntArray552[local178]);
									if (local202.anInt5567 >= 0) {
										local172 = local202.anInt5567;
										break;
									}
								}
							}
						}
						if (local172 >= 0) {
							local178 = local37;
							@Pc(223) int local223 = local68;
							if (local172 != 22 && local172 != 29 && local172 != 34 && local172 != 36 && local172 != 46 && local172 != 47 && local172 != 48) {
								@Pc(255) int[][] local255 = Static88.aClass92Array1[Static140.anInt3034].anIntArrayArray15;
								for (@Pc(257) int local257 = 0; local257 < 10; local257++) {
									@Pc(265) int local265 = (int) (Math.random() * 4.0D);
									if (local265 == 0 && local178 > 0 && local178 > local37 - 3 && (local255[local178 - 1][local223] & 0x2C0108) == 0) {
										local178--;
									}
									if (local265 == 1 && local178 < 103 && local178 < local37 + 3 && (local255[local178 + 1][local223] & 0x2C0180) == 0) {
										local178++;
									}
									if (local265 == 2 && local223 > 0 && local223 > local68 - 3 && (local255[local178][local223 - 1] & 0x2C0102) == 0) {
										local223--;
									}
									if (local265 == 3 && local223 < 103 && local223 < local68 + 3 && (local255[local178][local223 + 1] & 0x2C0120) == 0) {
										local223++;
									}
								}
							}
							Static52.anIntArray125[Static55.anInt1210] = local169.anInt5578;
							Static85.anIntArray176[Static55.anInt1210] = local178;
							Static171.anIntArray328[Static55.anInt1210] = local223;
							Static55.anInt1210++;
						}
					}
				}
			}
		}
		@Pc(442) int local442 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (10 - (((int) (Math.random() * 20.0D) - 10) + 238 << 8) - ((int) (Math.random() * 20.0D)) - 238);
		Static84.aClass1_Sub2_Sub11_Sub2_1.method3782();
		local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local37 = 1; local37 < 103; local37++) {
			for (local68 = 1; local68 < 103; local68++) {
				if ((Static260.aByteArrayArrayArray25[arg0][local68][local37] & 0x18) == 0 && !Static267.method4057(local35, local442, local68, arg0, local37)) {
					if (Static277.aBoolean412) {
						Static50.anIntArray107 = null;
					} else {
						Static72.aClass99_1.method3516();
					}
					return false;
				}
				if (arg0 < 3 && (Static260.aByteArrayArrayArray25[arg0 + 1][local68][local37] & 0x8) != 0 && !Static267.method4057(local35, local442, local68, arg0 + 1, local37)) {
					if (Static277.aBoolean412) {
						Static50.anIntArray107 = null;
					} else {
						Static72.aClass99_1.method3516();
					}
					return false;
				}
			}
		}
		if (Static277.aBoolean412) {
			@Pc(563) int[] local563 = Static84.aClass1_Sub2_Sub11_Sub2_1.anIntArray426;
			local68 = local563.length;
			for (local72 = 0; local72 < local68; local72++) {
				if (local563[local72] == 0) {
					local563[local72] = 1;
				}
			}
			Static24.aClass1_Sub2_Sub11_18 = new Class1_Sub2_Sub11_Sub1(Static84.aClass1_Sub2_Sub11_Sub2_1);
		} else {
			Static24.aClass1_Sub2_Sub11_18 = Static84.aClass1_Sub2_Sub11_Sub2_1;
		}
		if (Static277.aBoolean412) {
			Static50.anIntArray107 = null;
		} else {
			Static72.aClass99_1.method3516();
		}
		Static84.aClass1_Sub2_Sub11_Sub2_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Lclient!ge;")
	public static Class1_Sub2_Sub9 method1840(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub9 local12 = (Class1_Sub2_Sub9) Static29.aClass49_2.method1381((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static164.aClass91_129.method2495(arg0, 0);
		if (local24 == null) {
			return null;
		}
		local12 = new Class1_Sub2_Sub9();
		@Pc(44) Class1_Sub11 local44 = new Class1_Sub11(local24);
		local44.anInt3264 = local44.aByteArray47.length - 2;
		@Pc(55) int local55 = local44.method2691();
		@Pc(66) int local66 = local44.aByteArray47.length - local55 - 12 - 2;
		local44.anInt3264 = local66;
		@Pc(73) int local73 = local44.method2643();
		local12.anInt1903 = local44.method2691();
		local12.anInt1904 = local44.method2691();
		local12.anInt1905 = local44.method2691();
		local12.anInt1907 = local44.method2691();
		@Pc(97) int local97 = local44.method2690();
		@Pc(105) int local105;
		@Pc(116) int local116;
		if (local97 > 0) {
			local12.aClass70Array1 = new Class70[local97];
			for (local105 = 0; local105 < local97; local105++) {
				local116 = local44.method2691();
				@Pc(123) Class70 local123 = new Class70(Static161.method2789(local116));
				local12.aClass70Array1[local105] = local123;
				while (local116-- > 0) {
					@Pc(138) int local138 = local44.method2643();
					@Pc(142) int local142 = local44.method2643();
					local123.method2084((long) local138, new Class1_Sub29(local142));
				}
			}
		}
		local44.anInt3264 = 0;
		local105 = 0;
		local12.aString109 = local44.method2679();
		local12.aStringArray24 = new String[local73];
		local12.anIntArray177 = new int[local73];
		local12.anIntArray175 = new int[local73];
		while (local66 > local44.anInt3264) {
			local116 = local44.method2691();
			if (local116 == 3) {
				local12.aStringArray24[local105] = local44.method2629().intern();
			} else if (local116 >= 100 || local116 == 21 || local116 == 38 || local116 == 39) {
				local12.anIntArray177[local105] = local44.method2690();
			} else {
				local12.anIntArray177[local105] = local44.method2643();
			}
			local12.anIntArray175[local105++] = local116;
		}
		Static29.aClass49_2.method1385(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 < 0 || arg3 < 0 || arg2 >= 103 || arg3 >= 103) {
			return;
		}
		@Pc(46) int local46;
		if (arg1 == 0) {
			@Pc(36) Class72 local36 = Static126.method1527(arg0, arg2, arg3);
			if (local36 != null) {
				local46 = (int) (local36.aLong105 >>> 32) & Integer.MAX_VALUE;
				if (arg4 == 2) {
					local36.aClass14_10 = new Class14_Sub1(local46, 2, arg6 + 4, arg0, arg2, arg3, arg5, false, local36.aClass14_10);
					local36.aClass14_9 = new Class14_Sub1(local46, 2, arg6 + 1 & 0x3, arg0, arg2, arg3, arg5, false, local36.aClass14_9);
				} else {
					local36.aClass14_10 = new Class14_Sub1(local46, arg4, arg6, arg0, arg2, arg3, arg5, false, local36.aClass14_10);
				}
			}
		}
		if (arg1 == 1) {
			@Pc(113) Class67 local113 = Static118.method2117(arg0, arg2, arg3);
			if (local113 != null) {
				local46 = Integer.MAX_VALUE & (int) (local113.aLong97 >>> 32);
				if (arg4 == 4 || arg4 == 5) {
					local113.aClass14_7 = new Class14_Sub1(local46, 4, arg6, arg0, arg2, arg3, arg5, false, local113.aClass14_7);
				} else if (arg4 == 6) {
					local113.aClass14_7 = new Class14_Sub1(local46, 4, arg6 + 4, arg0, arg2, arg3, arg5, false, local113.aClass14_7);
				} else if (arg4 == 7) {
					local113.aClass14_7 = new Class14_Sub1(local46, 4, (arg6 + 2 & 0x3) + 4, arg0, arg2, arg3, arg5, false, local113.aClass14_7);
				} else if (arg4 == 8) {
					local113.aClass14_7 = new Class14_Sub1(local46, 4, arg6 + 4, arg0, arg2, arg3, arg5, false, local113.aClass14_7);
					local113.aClass14_8 = new Class14_Sub1(local46, 4, (arg6 + 2 & 0x3) + 4, arg0, arg2, arg3, arg5, false, local113.aClass14_8);
				}
			}
		}
		if (arg1 == 2) {
			@Pc(250) Class25 local250 = Static90.method1590(arg0, arg2, arg3);
			if (arg4 == 11) {
				arg4 = 10;
			}
			if (local250 != null) {
				local250.aClass14_1 = new Class14_Sub1(Integer.MAX_VALUE & (int) (local250.aLong39 >>> 32), arg4, arg6, arg0, arg2, arg3, arg5, false, local250.aClass14_1);
			}
		}
		if (arg1 == 3) {
			@Pc(287) Class44 local287 = Static117.method2110(arg0, arg2, arg3);
			if (local287 != null) {
				local287.aClass14_6 = new Class14_Sub1(Integer.MAX_VALUE & (int) (local287.aLong55 >>> 32), 22, arg6, arg0, arg2, arg3, arg5, false, local287.aClass14_6);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)V")
	public static void method1844(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZJ)V")
	public static void method1846(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static49.anInt1128; local19++) {
			if (arg0 == Static298.aLongArray11[local19]) {
				Static49.anInt1128--;
				for (@Pc(38) int local38 = local19; local38 < Static49.anInt1128; local38++) {
					Static149.aStringArray43[local38] = Static149.aStringArray43[local38 + 1];
					Static117.anIntArray242[local38] = Static117.anIntArray242[local38 + 1];
					Static59.aStringArray51[local38] = Static59.aStringArray51[local38 + 1];
					Static298.aLongArray11[local38] = Static298.aLongArray11[local38 + 1];
					Static100.anIntArray211[local38] = Static100.anIntArray211[local38 + 1];
					Static15.aBooleanArray7[local38] = Static15.aBooleanArray7[local38 + 1];
				}
				Static67.anInt1414 = Static23.anInt471;
				Static283.aClass1_Sub11_Sub1_3.method2697(205);
				Static283.aClass1_Sub11_Sub1_3.method2673(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
	public static String method1847(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(38) int local38 = 2;
		@Pc(42) int local42 = arg0 / 10;
		while (local42 != 0) {
			local42 /= 10;
			local38++;
		}
		@Pc(57) char[] local57 = new char[local38];
		local57[0] = '+';
		for (@Pc(65) int local65 = local38 - 1; local65 > 0; local65--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 < 10) {
				local57[local65] = (char) (local83 + 48);
			} else {
				local57[local65] = (char) (local83 + 87);
			}
		}
		return new String(local57);
	}
}
