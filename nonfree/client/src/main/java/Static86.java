import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
	private static int anInt2066;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "[Lclient!bf;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "[Lclient!sf;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "[Lclient!bb;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "[Lclient!hf;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "[B")
	private static byte[] aByteArray43;

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
	public static int anInt2072;

	@OriginalMember(owner = "client!oe", name = "V", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
	private static int anInt2075;

	@OriginalMember(owner = "client!oe", name = "R", descriptor = "Z")
	private static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!la;II)Lclient!oe;")
	public static Class4_Sub16 method1445(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1453(arg0)) {
			@Pc(16) byte[] local16 = arg0.method290(arg1, arg2);
			return local16 == null ? null : new Class4_Sub16(local16);
		} else {
			arg0.method300(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	public static void method1446() {
		aByteArray43 = null;
		aClass32Array1 = null;
		aClass9Array1 = null;
		aClass67Array1 = null;
		aClass6Array1 = null;
		aBooleanArray12 = null;
		anIntArray286 = null;
		aFloatArray7 = null;
		aFloatArray9 = null;
		aFloatArray3 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		aFloatArray4 = null;
		aFloatArray8 = null;
		anIntArray285 = null;
		anIntArray287 = null;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "()I")
	public static int method1447() {
		@Pc(7) int local7 = aByteArray43[anInt2075] >> anInt2066 & 0x1;
		anInt2066++;
		anInt2075 += anInt2066 >> 3;
		anInt2066 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([B)V")
	private static void method1448(@OriginalArg(0) byte[] arg0) {
		method1450(arg0);
		anInt2071 = 0x1 << method1454(4);
		anInt2072 = 0x1 << method1454(4);
		aFloatArray7 = new float[anInt2072];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2071 : anInt2072;
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
			local191 = Static39.method766(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static118.method1797(local193, local191);
			}
			if (local17 == 0) {
				aFloatArray9 = local39;
				aFloatArray3 = local84;
				aFloatArray5 = local136;
				anIntArray285 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray4 = local84;
				aFloatArray8 = local136;
				anIntArray287 = local185;
			}
		}
		local24 = method1454(8) + 1;
		aClass32Array1 = new Class32[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass32Array1[local28] = new Class32();
		}
		local32 = method1454(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1454(16);
		}
		@Pc(269) int local269 = method1454(6) + 1;
		aClass9Array1 = new Class9[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass9Array1[local41] = new Class9();
		}
		@Pc(290) int local290 = method1454(6) + 1;
		aClass67Array1 = new Class67[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass67Array1[local86] = new Class67();
		}
		@Pc(311) int local311 = method1454(6) + 1;
		aClass6Array1 = new Class6[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass6Array1[local138] = new Class6();
		}
		@Pc(332) int local332 = method1454(6) + 1;
		aBooleanArray12 = new boolean[local332];
		anIntArray286 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray12[local191] = method1447() != 0;
			method1454(16);
			method1454(16);
			anIntArray286[local191] = method1454(8);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)V")
	public static void method1450(@OriginalArg(0) byte[] arg0) {
		aByteArray43 = arg0;
		anInt2075 = 0;
		anInt2066 = 0;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)F")
	public static float method1452(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!la;)Z")
	private static boolean method1453(@OriginalArg(0) Class17 arg0) {
		if (!aBoolean127) {
			@Pc(7) byte[] local7 = arg0.method290(0, 0);
			if (local7 == null) {
				return false;
			}
			method1448(local7);
			aBoolean127 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)I")
	public static int method1454(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2066) {
			local8 = 8 - anInt2066;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray43[anInt2075] >> anInt2066 & local14) << local3;
			anInt2066 = 0;
			anInt2075++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray43[anInt2075] >> anInt2066 & local8) << local3;
			anInt2066 += arg0;
		}
		return local1;
	}
}
