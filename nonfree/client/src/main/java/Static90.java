import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLclient!vj;ZI)V")
	public static void method1606(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub43 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt6979;
		@Pc(12) int local12 = (int) arg1.aLong224;
		arg1.method5684();
		if (arg0) {
			Static201.method4602(local8);
		}
		Static447.method5629(local8);
		@Pc(27) Class247 local27 = Static392.method5121(local12);
		if (local27 != null) {
			Static63.method1142(local27);
		}
		Static214.method3224();
		if (!arg2 && Static334.anInt5766 != -1) {
			Static310.method4165(Static334.anInt5766, 1);
		}
		@Pc(58) Class25 local58 = new Class25(Static325.aClass102_29);
		for (@Pc(63) Class4_Sub43 local63 = (Class4_Sub43) local58.method641(); local63 != null; local63 = (Class4_Sub43) local58.method640()) {
			if (!local63.method5683()) {
				local63 = (Class4_Sub43) local58.method641();
				if (local63 == null) {
					return;
				}
			}
			if (local63.anInt6981 == 3) {
				@Pc(85) int local85 = (int) local63.aLong224;
				if (local85 >>> 16 == local8) {
					method1606(true, local63, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public static void method1608(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg0, 3);
		local8.method2608();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILclient!fs;I)Lclient!cn;")
	public static Class4_Sub1_Sub5 method1609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(16) Class4_Sub12 local16 = new Class4_Sub12(arg2.method2104(arg1, arg0));
		@Pc(49) Class4_Sub1_Sub5 local49 = new Class4_Sub1_Sub5(arg1, local16.method2537(), local16.method2537(), local16.method2529(), local16.method2529(), local16.method2490() == 1, local16.method2490(), local16.method2490());
		@Pc(53) int local53 = local16.method2490();
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local49.aClass183_4.method4137(new Class4_Sub41(local16.method2490(), local16.method2536(), local16.method2536(), local16.method2536(), local16.method2536(), local16.method2536(), local16.method2536(), local16.method2536(), local16.method2536()));
		}
		local49.method933();
		return local49;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ya;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method1610(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static390.aClass19_37 = arg0;
		Static326.anInt5665 = arg1;
		Static261.aClass31_3 = arg3;
		Static280.aBoolean470 = Static390.aClass19_37.method4260() > 0;
		Static431.anInt7073 = arg4 >> Static231.anInt4434;
		Static93.anInt1887 = arg6 >> Static231.anInt4434;
		Static153.anInt3073 = arg4;
		Static209.anInt3921 = arg6;
		Static220.anInt4098 = arg5;
		Static105.anInt2325 = Static431.anInt7073 - Static230.anInt4431;
		if (Static105.anInt2325 < 0) {
			Static453.anInt7371 = -Static105.anInt2325;
			Static105.anInt2325 = 0;
		} else {
			Static453.anInt7371 = 0;
		}
		Static243.anInt4530 = Static93.anInt1887 - Static230.anInt4431;
		if (Static243.anInt4530 < 0) {
			Static59.anInt1088 = -Static243.anInt4530;
			Static243.anInt4530 = 0;
		} else {
			Static59.anInt1088 = 0;
		}
		Static343.anInt775 = Static431.anInt7073 + Static230.anInt4431;
		if (Static343.anInt775 > Static422.anInt6945) {
			Static343.anInt775 = Static422.anInt6945;
		}
		Static153.anInt3087 = Static93.anInt1887 + Static230.anInt4431;
		if (Static153.anInt3087 > Static171.anInt3361) {
			Static153.anInt3087 = Static171.anInt3361;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static230.anInt4431 + Static230.anInt4431 + 2; local74++) {
			for (local77 = 0; local77 < Static230.anInt4431 + Static230.anInt4431 + 2; local77++) {
				local84 = Static431.anInt7073 + local74 - Static230.anInt4431;
				local90 = Static93.anInt1887 + local77 - Static230.anInt4431;
				if (local84 >= 0 && local90 >= 0 && local84 < Static422.anInt6945 && local90 < Static171.anInt3361) {
					@Pc(104) int local104 = local84 << Static231.anInt4434;
					@Pc(108) int local108 = local90 << Static231.anInt4434;
					@Pc(124) int local124 = Static67.aClass65Array1[Static67.aClass65Array1.length - 1].l(local84, local90) - (0x3E8 << Static231.anInt4434 - 7);
					@Pc(144) int local144 = Static285.aClass65Array3 == null ? Static67.aClass65Array1[0].l(local84, local90) + Static4.anInt5935 : Static285.aClass65Array3[0].l(local84, local90) + Static4.anInt5935;
					Static440.aBooleanArrayArray6[local74][local77] = Static390.aClass19_37.JA(local104, local124, local108, local104, local144, local108);
				} else {
					Static440.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static230.anInt4431 + Static230.anInt4431 + 1; local77++) {
			for (local84 = 0; local84 < Static230.anInt4431 + Static230.anInt4431 + 1; local84++) {
				Static252.aBooleanArrayArray4[local77][local84] = Static440.aBooleanArrayArray6[local77][local84] || Static440.aBooleanArrayArray6[local77 + 1][local84] || Static440.aBooleanArrayArray6[local77][local84 + 1] || Static440.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static29.anIntArray34 = arg8;
		Static248.anIntArray303 = arg9;
		Static85.anIntArray143 = arg10;
		Static64.anIntArray106 = arg11;
		Static223.anIntArray284 = arg12;
		Static455.method4292();
		Static260.method3772();
		for (@Pc(260) Class3_Sub3 local260 = (Class3_Sub3) Static18.aClass84_2.method2312(); local260 != null; local260 = (Class3_Sub3) Static18.aClass84_2.method2309()) {
			local260.method5676();
			Static41.method727(local260);
		}
		if (Static280.aBoolean470) {
			for (local90 = 0; local90 < Static43.anInt7322; local90++) {
				Static106.aClass191Array1[local90].method4332(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static390.aClass19_37.method4303(0);
			if (Static433.aClass70_1 == null || Static433.aClass70_1 instanceof Class70_Sub2) {
				Static433.aClass70_1 = new Class70_Sub1();
			}
		} else if (Static433.aClass70_1 == null || Static433.aClass70_1 instanceof Class70_Sub1) {
			Static433.aClass70_1 = new Class70_Sub2();
		}
		Static433.aClass70_1.method5075(arg2);
		Static433.aClass70_1.method5074();
		if (Static2.aClass164ArrayArrayArray1 != null) {
			Static86.method1547(true);
			Static433.aClass70_1.method5077(22);
			Static301.method5344(arg2, null, 0, (byte) 0, arg15, arg16);
			Static433.aClass70_1.method5074();
			Static433.aClass70_1.method5077(23);
			Static86.method1547(false);
		}
		Static301.method5344(arg2, arg7, arg13, arg14, arg15, arg16);
		Static433.aClass70_1.method5074();
		Static433.aClass70_1.method5073();
		Static433.aClass70_1.method5074();
		if (arg2 > 1) {
			Static390.aClass19_37.method4273(0);
		}
		Static390.aClass19_37.method4238(0, null);
	}
}
