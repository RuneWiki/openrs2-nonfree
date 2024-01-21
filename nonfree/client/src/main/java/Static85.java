import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[Lclient!fd;")
	public static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "I")
	private static int anInt1826;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	public static int anInt1827;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "[B")
	private static byte[] aByteArray25;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!of", name = "D", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "[Lclient!i;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!of", name = "I", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!of", name = "M", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array1;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "[I")
	public static int[] anIntArray245;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "I")
	private static int anInt1833;

	@OriginalMember(owner = "client!of", name = "T", descriptor = "I")
	public static int anInt1835;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "[Lclient!he;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "Z")
	private static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!na;II)Lclient!of;")
	public static Class2_Sub12 method1373(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1375(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1666(arg2, arg1);
			return local16 == null ? null : new Class2_Sub12(local16);
		} else {
			arg0.method1670(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BI)V")
	public static void method1374(@OriginalArg(0) byte[] arg0) {
		aByteArray25 = arg0;
		anInt1833 = 0;
		anInt1826 = 0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!na;)Z")
	private static boolean method1375(@OriginalArg(0) Class56 arg0) {
		if (!aBoolean72) {
			@Pc(7) byte[] local7 = arg0.method1666(0, 0);
			if (local7 == null) {
				return false;
			}
			method1382(local7);
			aBoolean72 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)F")
	public static float method1377(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)I")
	public static int method1379(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1826) {
			local8 = 8 - anInt1826;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray25[anInt1833] >> anInt1826 & local14) << local3;
			anInt1826 = 0;
			anInt1833++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray25[anInt1833] >> anInt1826 & local8) << local3;
			anInt1826 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	public static void method1380() {
		aByteArray25 = null;
		aClass37Array1 = null;
		aClass73Array1 = null;
		aClass36Array1 = null;
		aClass26Array1 = null;
		aBooleanArray13 = null;
		anIntArray245 = null;
		aFloatArray7 = null;
		aFloatArray2 = null;
		aFloatArray5 = null;
		aFloatArray1 = null;
		aFloatArray8 = null;
		aFloatArray4 = null;
		aFloatArray3 = null;
		anIntArray243 = null;
		anIntArray244 = null;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()I")
	public static int method1381() {
		@Pc(7) int local7 = aByteArray25[anInt1833] >> anInt1826 & 0x1;
		anInt1826++;
		anInt1833 += anInt1826 >> 3;
		anInt1826 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([B)V")
	private static void method1382(@OriginalArg(0) byte[] arg0) {
		method1374(arg0);
		anInt1835 = 0x1 << method1379(4);
		anInt1827 = 0x1 << method1379(4);
		aFloatArray7 = new float[anInt1827];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1835 : anInt1827;
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
			local191 = Static104.method2060(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static4.method858(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray2 = local39;
				aFloatArray5 = local84;
				aFloatArray1 = local136;
				anIntArray243 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray4 = local84;
				aFloatArray3 = local136;
				anIntArray244 = local185;
			}
		}
		local24 = method1379(8) + 1;
		aClass37Array1 = new Class37[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass37Array1[local28] = new Class37();
		}
		local32 = method1379(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1379(16);
		}
		@Pc(269) int local269 = method1379(6) + 1;
		aClass73Array1 = new Class73[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass73Array1[local41] = new Class73();
		}
		@Pc(290) int local290 = method1379(6) + 1;
		aClass36Array1 = new Class36[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass36Array1[local86] = new Class36();
		}
		@Pc(311) int local311 = method1379(6) + 1;
		aClass26Array1 = new Class26[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass26Array1[local138] = new Class26();
		}
		@Pc(332) int local332 = method1379(6) + 1;
		aBooleanArray13 = new boolean[local332];
		anIntArray245 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray13[local191] = method1381() != 0;
			method1379(16);
			method1379(16);
			anIntArray245[local191] = method1379(8);
		}
	}
}
