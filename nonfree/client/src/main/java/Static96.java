import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "[Lclient!bp;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "[Lclient!wb;")
	public static Class212[] aClass212Array1;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "[Lclient!j;")
	public static Class101[] aClass101Array1;

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
	public static int anInt2002;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "[Lclient!wm;")
	public static Class216[] aClass216Array1;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
	private static int anInt2004;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
	private static int anInt2008;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Z")
	private static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()I")
	public static int method1625() {
		@Pc(7) int local7 = aByteArray33[anInt2004] >> anInt2008 & 0x1;
		anInt2008++;
		anInt2004 += anInt2008 >> 3;
		anInt2008 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ir;)Z")
	private static boolean method1627(@OriginalArg(0) Class100 arg0) {
		if (!aBoolean100) {
			@Pc(7) byte[] local7 = arg0.method2319(0, 0);
			if (local7 == null) {
				return false;
			}
			method1630(local7);
			aBoolean100 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V")
	public static void method1628(@OriginalArg(0) byte[] arg0) {
		aByteArray33 = arg0;
		anInt2004 = 0;
		anInt2008 = 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ir;II)Lclient!fo;")
	public static Class3_Sub19 method1629(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1627(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2319(arg1, arg2);
			return local16 == null ? null : new Class3_Sub19(local16);
		} else {
			arg0.method2298(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([B)V")
	private static void method1630(@OriginalArg(0) byte[] arg0) {
		method1628(arg0);
		anInt2002 = 0x1 << method1635(4);
		anInt1998 = 0x1 << method1635(4);
		aFloatArray3 = new float[anInt1998];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2002 : anInt1998;
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
			local191 = Static329.method5377(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static263.method4430(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray9 = local39;
				aFloatArray8 = local84;
				aFloatArray4 = local136;
				anIntArray116 = local185;
			} else {
				aFloatArray10 = local39;
				aFloatArray5 = local84;
				aFloatArray6 = local136;
				anIntArray117 = local185;
			}
		}
		local24 = method1635(8) + 1;
		aClass216Array1 = new Class216[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass216Array1[local28] = new Class216();
		}
		local32 = method1635(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1635(16);
		}
		@Pc(269) int local269 = method1635(6) + 1;
		aClass25Array1 = new Class25[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass25Array1[local41] = new Class25();
		}
		@Pc(290) int local290 = method1635(6) + 1;
		aClass101Array1 = new Class101[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass101Array1[local86] = new Class101();
		}
		@Pc(311) int local311 = method1635(6) + 1;
		aClass212Array1 = new Class212[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass212Array1[local138] = new Class212();
		}
		@Pc(332) int local332 = method1635(6) + 1;
		aBooleanArray8 = new boolean[local332];
		anIntArray118 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray8[local191] = method1625() != 0;
			method1635(16);
			method1635(16);
			anIntArray118[local191] = method1635(8);
		}
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)F")
	public static float method1634(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)I")
	public static int method1635(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2008) {
			local8 = 8 - anInt2008;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray33[anInt2004] >> anInt2008 & local14) << local3;
			anInt2008 = 0;
			anInt2004++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray33[anInt2004] >> anInt2008 & local8) << local3;
			anInt2008 += arg0;
		}
		return local1;
	}
}
