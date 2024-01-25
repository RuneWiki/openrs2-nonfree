import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
	public static int anInt1938;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Z")
	public static volatile boolean aBoolean161 = true;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!gk;I[IB[I)Lclient!io;")
	public static Class32_Sub2 method1562(@OriginalArg(0) int arg0, @OriginalArg(1) Class75_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg4[local17] + local17 * arg2;
			for (@Pc(29) int local29 = 0; local29 < arg3[local17]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class32_Sub2(arg1, arg2, arg0, local10);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Lclient!su;")
	public static Class215 method1566(@OriginalArg(1) int arg0) {
		@Pc(6) Class215[] local6 = Static337.method4899();
		for (@Pc(13) int local13 = 0; local13 < local6.length; local13++) {
			@Pc(18) Class215 local18 = local6[local13];
			if (local18.anInt6609 == arg0) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	public static void method1567() {
		if (Static151.anInt3305 == 0) {
			return;
		}
		try {
			if (++Static123.anInt2661 > 1500) {
				if (Static122.aClass27_1 != null) {
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
				}
				if (Static161.anInt3447 >= 1) {
					Static151.anInt3305 = 0;
					Static287.anInt5252 = -5;
					return;
				}
				if (Static262.anInt4960 == Static446.anInt7542) {
					Static446.anInt7542 = Static301.anInt5507;
				} else {
					Static446.anInt7542 = Static262.anInt4960;
				}
				Static123.anInt2661 = 0;
				Static161.anInt3447++;
				Static151.anInt3305 = 1;
			}
			if (Static151.anInt3305 == 1) {
				Static358.aClass190_8 = Static295.aClass103_5.method2834(Static266.aString50, Static446.anInt7542);
				Static151.anInt3305 = 2;
			}
			@Pc(114) int local114;
			if (Static151.anInt3305 == 2) {
				if (Static358.aClass190_8.anInt5799 == 2) {
					throw new IOException();
				}
				if (Static358.aClass190_8.anInt5799 != 1) {
					return;
				}
				Static122.aClass27_1 = new Class27((Socket) Static358.aClass190_8.anObject7, Static295.aClass103_5);
				Static358.aClass190_8 = null;
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
				Static212.method3428();
				local114 = Static122.aClass27_1.method890();
				Static212.method3428();
				if (local114 != 101) {
					Static151.anInt3305 = 0;
					Static287.anInt5252 = local114;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
					return;
				}
				Static151.anInt3305 = 3;
			}
			if (Static151.anInt3305 == 3 && Static122.aClass27_1.method894() >= 2) {
				local114 = Static122.aClass27_1.method890() << 8 | Static122.aClass27_1.method890();
				Static251.method3840(local114);
				if (Static379.anInt2076 == -1) {
					Static287.anInt5252 = 6;
					Static151.anInt3305 = 0;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
				} else {
					Static151.anInt3305 = 0;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
					Static82.method1419();
				}
			}
		} catch (@Pc(181) IOException local181) {
			if (Static122.aClass27_1 != null) {
				Static122.aClass27_1.method893();
				Static122.aClass27_1 = null;
			}
			if (Static161.anInt3447 >= 1) {
				Static287.anInt5252 = -4;
				Static151.anInt3305 = 0;
			} else {
				if (Static446.anInt7542 == Static262.anInt4960) {
					Static446.anInt7542 = Static301.anInt5507;
				} else {
					Static446.anInt7542 = Static262.anInt4960;
				}
				Static123.anInt2661 = 0;
				Static161.anInt3447++;
				Static151.anInt3305 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
	public static void method1568() {
		for (@Pc(13) Class3_Sub36 local13 = (Class3_Sub36) Static455.aClass229_37.method5328(); local13 != null; local13 = (Class3_Sub36) Static455.aClass229_37.method5325()) {
			if (local13.aBoolean431) {
				local13.method4863();
			}
		}
		for (@Pc(32) Class3_Sub36 local32 = (Class3_Sub36) Static437.aClass229_47.method5328(); local32 != null; local32 = (Class3_Sub36) Static437.aClass229_47.method5325()) {
			if (local32.aBoolean431) {
				local32.method4863();
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method1571(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static355.aClass75_10 = arg0;
		Static325.anInt5923 = arg1;
		Static275.aClass106_3 = arg3;
		Static283.aBoolean384 = Static355.aClass75_10.method2584() > 0;
		Static444.anInt7531 = arg4 >> Static287.anInt5248;
		Static340.anInt6288 = arg6 >> Static287.anInt5248;
		Static28.anInt787 = arg4;
		anInt1938 = arg6;
		Static365.anInt6534 = arg5;
		Static16.anInt537 = Static444.anInt7531 - Static251.anInt4730;
		if (Static16.anInt537 < 0) {
			Static24.anInt727 = -Static16.anInt537;
			Static16.anInt537 = 0;
		} else {
			Static24.anInt727 = 0;
		}
		Static341.anInt6226 = Static340.anInt6288 - Static251.anInt4730;
		if (Static341.anInt6226 < 0) {
			Static286.anInt6051 = -Static341.anInt6226;
			Static341.anInt6226 = 0;
		} else {
			Static286.anInt6051 = 0;
		}
		Static454.anInt7692 = Static444.anInt7531 + Static251.anInt4730;
		if (Static454.anInt7692 > Static177.anInt3621) {
			Static454.anInt7692 = Static177.anInt3621;
		}
		Static169.anInt3554 = Static340.anInt6288 + Static251.anInt4730;
		if (Static169.anInt3554 > Static57.anInt1411) {
			Static169.anInt3554 = Static57.anInt1411;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static251.anInt4730 + Static251.anInt4730 + 2; local74++) {
			for (local77 = 0; local77 < Static251.anInt4730 + Static251.anInt4730 + 2; local77++) {
				local84 = Static444.anInt7531 + local74 - Static251.anInt4730;
				local90 = Static340.anInt6288 + local77 - Static251.anInt4730;
				if (local84 >= 0 && local90 >= 0 && local84 < Static177.anInt3621 && local90 < Static57.anInt1411) {
					@Pc(104) int local104 = local84 << Static287.anInt5248;
					@Pc(108) int local108 = local90 << Static287.anInt5248;
					@Pc(124) int local124 = Static205.aClass64Array2[Static205.aClass64Array2.length - 1].I(local84, local90) - (0x3E8 << Static287.anInt5248 - 7);
					@Pc(144) int local144 = Static401.aClass64Array3 == null ? Static205.aClass64Array2[0].I(local84, local90) + Static122.anInt2633 : Static401.aClass64Array3[0].I(local84, local90) + Static122.anInt2633;
					Static435.aBooleanArrayArray6[local74][local77] = Static355.aClass75_10.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static435.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static251.anInt4730 + Static251.anInt4730 + 1; local77++) {
			for (local84 = 0; local84 < Static251.anInt4730 + Static251.anInt4730 + 1; local84++) {
				Static200.aBooleanArrayArray2[local77][local84] = Static435.aBooleanArrayArray6[local77][local84] || Static435.aBooleanArrayArray6[local77 + 1][local84] || Static435.aBooleanArrayArray6[local77][local84 + 1] || Static435.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static121.anIntArray283 = arg8;
		Static20.anIntArray42 = arg9;
		Static106.anIntArray200 = arg10;
		Static433.anIntArray558 = arg11;
		Static6.anIntArray10 = arg12;
		Static35.method4617();
		Static87.method3007();
		for (@Pc(260) Class13_Sub7 local260 = (Class13_Sub7) Static201.aClass40_4.method1188(); local260 != null; local260 = (Class13_Sub7) Static201.aClass40_4.method1195()) {
			local260.method5934();
			Static406.method5483(local260);
		}
		if (Static283.aBoolean384) {
			for (local90 = 0; local90 < Static298.anInt5454; local90++) {
				Static303.aClass54Array1[local90].method1353(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static355.aClass75_10.method2630(0);
			if (Static137.aClass6_1 == null || Static137.aClass6_1 instanceof Class6_Sub2) {
				Static137.aClass6_1 = new Class6_Sub1();
			}
		} else if (Static137.aClass6_1 == null || Static137.aClass6_1 instanceof Class6_Sub1) {
			Static137.aClass6_1 = new Class6_Sub2();
		}
		Static137.aClass6_1.method4733(arg2);
		Static137.aClass6_1.method4729();
		if (Static93.aClass217ArrayArrayArray2 != null) {
			Static41.method922(true);
			Static137.aClass6_1.method4736(22);
			Static123.method2189(arg2, null, 0, (byte) 0, arg15, arg16);
			Static137.aClass6_1.method4729();
			Static137.aClass6_1.method4736(23);
			Static41.method922(false);
		}
		Static123.method2189(arg2, arg7, arg13, arg14, arg15, arg16);
		Static137.aClass6_1.method4729();
		Static137.aClass6_1.method4735();
		Static137.aClass6_1.method4729();
		if (arg2 > 1) {
			Static355.aClass75_10.method2606(0);
		}
		Static355.aClass75_10.method2628(0, null);
	}
}
