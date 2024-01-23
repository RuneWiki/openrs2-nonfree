import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Lclient!ti;")
	public static Class4_Sub2_Sub9_Sub2 aClass4_Sub2_Sub9_Sub2_1;

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Lclient!ul;")
	public static Class172 aClass172_17 = new Class172(64);

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "Lclient!nb;")
	public static Class111 aClass111_5 = new Class111(64);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZIILclient!cg;I)V")
	public static void method1557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class22 arg2) {
		Static127.aClass22_43 = arg2;
		Static8.anInt148 = arg1;
		Static156.anInt3218 = arg0;
		Static99.anInt1951 = 10000;
		Static55.anInt1252 = 1;
		Static266.anInt5231 = 0;
		Static287.aBoolean385 = false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method1558(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static63.aCharArray1[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					local70 = ' ';
					@Pc(81) int local81 = local48.length() - 1;
					local48.setCharAt(local81, Character.toUpperCase(local48.charAt(local81)));
				}
				local48.append(local70);
			}
			local48.reverse();
			local48.setCharAt(0, Character.toUpperCase(local48.charAt(0)));
			return local48.toString();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIZ)I")
	public static int method1561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) Class4_Sub33 local20 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local20 == null) {
			return 0;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local20.anIntArray463.length; local29++) {
			if (local20.anIntArray463[local29] >= 0 && local20.anIntArray463[local29] < anInt1868) {
				@Pc(53) Class29 local53 = Static187.method3128(local20.anIntArray463[local29]);
				if (local53.aClass163_14 != null) {
					@Pc(66) Class4_Sub25 local66 = (Class4_Sub25) local53.aClass163_14.method4188((long) arg1);
					if (local66 != null) {
						if (arg2) {
							local27 += local20.anIntArray464[local29] * local66.anInt3892;
						} else {
							local27 += local66.anInt3892;
						}
					}
				}
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(CB)C")
	public static char method1562(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	public static void method1563(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && Static213.aBooleanArray29.length > arg0) {
			Static213.aBooleanArray29[arg0] = !Static213.aBooleanArray29[arg0];
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static246.anInt4853 * 128) {
			arg0 = Static246.anInt4853 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static64.anInt1393 * 128) {
			arg2 = Static64.anInt1393 * 128 - 1;
		}
		Static45.anInt1014 = Class174.anIntArray444[arg3];
		Static99.anInt1944 = Class174.anIntArray443[arg3];
		Static174.anInt3534 = Class174.anIntArray444[arg4];
		Static222.anInt4454 = Class174.anIntArray443[arg4];
		Static54.anInt1239 = arg0;
		Static222.anInt4471 = arg1;
		Static179.anInt3613 = arg2;
		Static279.anInt5465 = arg0 / 128;
		Static91.anInt1810 = arg2 / 128;
		Static65.anInt5706 = Static279.anInt5465 - Static133.anInt2661;
		if (Static65.anInt5706 < 0) {
			Static65.anInt5706 = 0;
		}
		Static274.anInt5441 = Static91.anInt1810 - Static133.anInt2661;
		if (Static274.anInt5441 < 0) {
			Static274.anInt5441 = 0;
		}
		Static67.anInt1406 = Static279.anInt5465 + Static133.anInt2661;
		if (Static67.anInt1406 > Static246.anInt4853) {
			Static67.anInt1406 = Static246.anInt4853;
		}
		Static158.anInt3235 = Static91.anInt1810 + Static133.anInt2661;
		if (Static158.anInt3235 > Static64.anInt1393) {
			Static158.anInt3235 = Static64.anInt1393;
		}
		@Pc(99) short local99;
		if (Static251.aBoolean330) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static133.anInt2661 + Static133.anInt2661 + 2; local104++) {
			for (local113 = 0; local113 < Static133.anInt2661 + Static133.anInt2661 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static133.anInt2661 << 7) - (Static54.anInt1239 & 0x7F);
				@Pc(140) int local140 = (local113 - Static133.anInt2661 << 7) - (Static179.anInt3613 & 0x7F);
				@Pc(146) int local146 = Static279.anInt5465 + local104 - Static133.anInt2661;
				@Pc(152) int local152 = Static91.anInt1810 + local113 - Static133.anInt2661;
				if (local146 >= 0 && local152 >= 0 && local146 < Static246.anInt4853 && local152 < Static64.anInt1393) {
					@Pc(176) int local176;
					if (Static127.anIntArrayArrayArray3 == null) {
						local176 = Static230.anIntArrayArrayArray12[0][local146][local152] + 128 - Static222.anInt4471;
					} else {
						local176 = Static127.anIntArrayArrayArray3[0][local146][local152] + 128 - Static222.anInt4471;
					}
					@Pc(201) int local201 = Static230.anIntArrayArrayArray12[3][local146][local152] - Static222.anInt4471 - 1000;
					Static15.aBooleanArrayArray1[local104][local113] = Static255.method3943(local130, local201, local176, local140, local99);
				} else {
					Static15.aBooleanArrayArray1[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static133.anInt2661 + Static133.anInt2661 + 1; local104++) {
			for (local113 = 0; local113 < Static133.anInt2661 + Static133.anInt2661 + 1; local113++) {
				Static202.aBooleanArrayArray4[local104][local113] = Static15.aBooleanArrayArray1[local104][local113] || Static15.aBooleanArrayArray1[local104 + 1][local113] || Static15.aBooleanArrayArray1[local104][local113 + 1] || Static15.aBooleanArrayArray1[local104 + 1][local113 + 1];
			}
		}
		Static209.anIntArray341 = arg6;
		Static244.anIntArray381 = arg7;
		Static173.anIntArray294 = arg8;
		Static208.anIntArray339 = arg9;
		Static8.anIntArray6 = arg10;
		Static242.method3715();
		if (Static199.aClass4_Sub21ArrayArrayArray3 != null) {
			Static158.method2543(true);
			Static191.method3153(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static251.aBoolean330) {
				Static43.aBoolean58 = false;
				Static126.method2046(0, 0);
				Static290.method4525(null);
				Static142.method2279();
			}
			Static158.method2543(false);
		}
		Static191.method3153(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
