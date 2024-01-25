import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "[Lclient!sca;")
	public static Class314[] aClass314Array1;

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
	private static int anInt2118;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
	public static int anInt2122;

	@OriginalMember(owner = "client!dfa", name = "x", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!dfa", name = "z", descriptor = "[Lclient!cka;")
	public static Class59[] aClass59Array1;

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "[F")
	public static float[] aFloatArray11;

	@OriginalMember(owner = "client!dfa", name = "C", descriptor = "[F")
	public static float[] aFloatArray12;

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "[Lclient!jt;")
	public static Class190[] aClass190Array1;

	@OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
	private static int anInt2124;

	@OriginalMember(owner = "client!dfa", name = "H", descriptor = "[Lclient!gk;")
	public static Class126[] aClass126Array1;

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "[F")
	public static float[] aFloatArray13;

	@OriginalMember(owner = "client!dfa", name = "L", descriptor = "[F")
	public static float[] aFloatArray14;

	@OriginalMember(owner = "client!dfa", name = "M", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!dfa", name = "P", descriptor = "I")
	public static int anInt2126;

	@OriginalMember(owner = "client!dfa", name = "s", descriptor = "Z")
	private static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BI)V")
	public static void method1789(@OriginalArg(0) byte[] arg0) {
		aByteArray33 = arg0;
		anInt2124 = 0;
		anInt2118 = 0;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!wia;)Z")
	private static boolean method1790(@OriginalArg(0) Class386 arg0) {
		if (!aBoolean174) {
			@Pc(7) byte[] local7 = arg0.method9196(0, 0);
			if (local7 == null) {
				return false;
			}
			method1795(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)I")
	public static int method1791(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2118) {
			local8 = 8 - anInt2118;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray33[anInt2124] >> anInt2118 & local14) << local3;
			anInt2118 = 0;
			anInt2124++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray33[anInt2124] >> anInt2118 & local8) << local3;
			anInt2118 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)F")
	public static float method1793(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([B)V")
	private static void method1795(@OriginalArg(0) byte[] arg0) {
		method1789(arg0);
		anInt2122 = 0x1 << method1791(4);
		anInt2126 = 0x1 << method1791(4);
		aFloatArray14 = new float[anInt2126];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2122 : anInt2126;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static296.method5214(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static620.method8696(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray13 = local39;
				aFloatArray8 = local84;
				aFloatArray11 = local136;
				anIntArray162 = local185;
			} else {
				aFloatArray9 = local39;
				aFloatArray12 = local84;
				aFloatArray10 = local136;
				anIntArray161 = local185;
			}
		}
		local24 = method1791(8) + 1;
		aClass314Array1 = new Class314[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass314Array1[local28] = new Class314();
		}
		local32 = method1791(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1791(16);
		}
		@Pc(269) int local269 = method1791(6) + 1;
		aClass126Array1 = new Class126[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass126Array1[local41] = new Class126();
		}
		@Pc(290) int local290 = method1791(6) + 1;
		aClass59Array1 = new Class59[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass59Array1[local86] = new Class59();
		}
		@Pc(311) int local311 = method1791(6) + 1;
		aClass190Array1 = new Class190[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass190Array1[local138] = new Class190();
		}
		@Pc(332) int local332 = method1791(6) + 1;
		aBooleanArray8 = new boolean[local332];
		anIntArray163 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray8[local191] = method1797() != 0;
			method1791(16);
			method1791(16);
			anIntArray163[local191] = method1791(8);
		}
		aBoolean174 = true;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!wia;I)Lclient!dfa;")
	public static Class14_Sub13 method1796(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		if (method1790(arg0)) {
			@Pc(14) byte[] local14 = arg0.method9192(arg1);
			return local14 == null ? null : new Class14_Sub13(local14);
		} else {
			arg0.method9206(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "()I")
	public static int method1797() {
		@Pc(7) int local7 = aByteArray33[anInt2124] >> anInt2118 & 0x1;
		anInt2118++;
		anInt2124 += anInt2118 >> 3;
		anInt2118 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!wia;II)Lclient!dfa;")
	public static Class14_Sub13 method1800(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1790(arg0)) {
			@Pc(16) byte[] local16 = arg0.method9196(arg2, arg1);
			return local16 == null ? null : new Class14_Sub13(local16);
		} else {
			arg0.method9216(arg1, arg2);
			return null;
		}
	}
}
