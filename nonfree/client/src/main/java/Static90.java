import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
	public static int anInt2301;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "[Lclient!ka;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "[Lclient!wd;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	private static int anInt2303;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
	public static int anInt2305;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "[Lclient!f;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "[Lclient!hd;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
	private static int anInt2308;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "[I")
	public static int[] anIntArray251;

	@OriginalMember(owner = "client!pf", name = "db", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "Z")
	private static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	public static void method1625() {
		aByteArray33 = null;
		aClass21Array1 = null;
		aClass83Array1 = null;
		aClass43Array1 = null;
		aClass32Array1 = null;
		aBooleanArray23 = null;
		anIntArray250 = null;
		aFloatArray5 = null;
		aFloatArray1 = null;
		aFloatArray6 = null;
		aFloatArray8 = null;
		aFloatArray7 = null;
		aFloatArray2 = null;
		aFloatArray4 = null;
		anIntArray252 = null;
		anIntArray251 = null;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()I")
	public static int method1626() {
		@Pc(7) int local7 = aByteArray33[anInt2303] >> anInt2308 & 0x1;
		anInt2308++;
		anInt2303 += anInt2308 >> 3;
		anInt2308 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)V")
	public static void method1627(@OriginalArg(0) byte[] arg0) {
		aByteArray33 = arg0;
		anInt2303 = 0;
		anInt2308 = 0;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I")
	public static int method1628(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2308) {
			local8 = 8 - anInt2308;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray33[anInt2303] >> anInt2308 & local14) << local3;
			anInt2308 = 0;
			anInt2303++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray33[anInt2303] >> anInt2308 & local8) << local3;
			anInt2308 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!fd;)Z")
	private static boolean method1630(@OriginalArg(0) Class24 arg0) {
		if (!aBoolean179) {
			@Pc(7) byte[] local7 = arg0.method1931(0, 0);
			if (local7 == null) {
				return false;
			}
			method1634(local7);
			aBoolean179 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!fd;II)Lclient!pf;")
	public static Class2_Sub19 method1632(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1630(arg0)) {
			@Pc(16) byte[] local16 = arg0.method1931(arg2, arg1);
			return local16 == null ? null : new Class2_Sub19(local16);
		} else {
			arg0.method1924(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)F")
	public static float method1633(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([B)V")
	private static void method1634(@OriginalArg(0) byte[] arg0) {
		method1627(arg0);
		anInt2305 = 0x1 << method1628(4);
		anInt2301 = 0x1 << method1628(4);
		aFloatArray5 = new float[anInt2301];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2305 : anInt2301;
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
			local191 = Static19.method380(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static111.method1871(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray1 = local39;
				aFloatArray6 = local84;
				aFloatArray8 = local136;
				anIntArray252 = local185;
			} else {
				aFloatArray7 = local39;
				aFloatArray2 = local84;
				aFloatArray4 = local136;
				anIntArray251 = local185;
			}
		}
		local24 = method1628(8) + 1;
		aClass21Array1 = new Class21[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass21Array1[local28] = new Class21();
		}
		local32 = method1628(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1628(16);
		}
		@Pc(269) int local269 = method1628(6) + 1;
		aClass83Array1 = new Class83[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass83Array1[local41] = new Class83();
		}
		@Pc(290) int local290 = method1628(6) + 1;
		aClass43Array1 = new Class43[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass43Array1[local86] = new Class43();
		}
		@Pc(311) int local311 = method1628(6) + 1;
		aClass32Array1 = new Class32[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass32Array1[local138] = new Class32();
		}
		@Pc(332) int local332 = method1628(6) + 1;
		aBooleanArray23 = new boolean[local332];
		anIntArray250 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray23[local191] = method1626() != 0;
			method1628(16);
			method1628(16);
			anIntArray250[local191] = method1628(8);
		}
	}
}
