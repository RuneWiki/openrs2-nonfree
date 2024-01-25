import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!el", name = "l", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public static int anInt1775;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public static int anInt1777;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "[Lclient!rb;")
	public static Class201[] aClass201Array1;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "[Lclient!oc;")
	public static Class173[] aClass173Array1;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "[Lclient!at;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!el", name = "z", descriptor = "I")
	private static int anInt1780;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray33;

	@OriginalMember(owner = "client!el", name = "B", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!el", name = "D", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!el", name = "E", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!el", name = "G", descriptor = "I")
	private static int anInt1781;

	@OriginalMember(owner = "client!el", name = "H", descriptor = "[Lclient!go;")
	public static Class94[] aClass94Array1;

	@OriginalMember(owner = "client!el", name = "K", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!el", name = "N", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!el", name = "O", descriptor = "[F")
	public static float[] aFloatArray10;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "Z")
	private static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)F")
	public static float method1442(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([BI)V")
	public static void method1443(@OriginalArg(0) byte[] arg0) {
		aByteArray31 = arg0;
		anInt1780 = 0;
		anInt1781 = 0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()I")
	public static int method1445() {
		@Pc(7) int local7 = aByteArray31[anInt1780] >> anInt1781 & 0x1;
		anInt1781++;
		anInt1780 += anInt1781 >> 3;
		anInt1781 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!b;)Z")
	private static boolean method1446(@OriginalArg(0) Class20 arg0) {
		if (!aBoolean138) {
			@Pc(7) byte[] local7 = arg0.method253(0, 0);
			if (local7 == null) {
				return false;
			}
			method1451(local7);
			aBoolean138 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)I")
	public static int method1447(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1781) {
			local8 = 8 - anInt1781;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray31[anInt1780] >> anInt1781 & local14) << local3;
			anInt1781 = 0;
			anInt1780++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray31[anInt1780] >> anInt1781 & local8) << local3;
			anInt1781 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!b;II)Lclient!el;")
	public static Class3_Sub11 method1448(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1446(arg0)) {
			@Pc(16) byte[] local16 = arg0.method253(arg2, arg1);
			return local16 == null ? null : new Class3_Sub11(local16);
		} else {
			arg0.method233(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([B)V")
	private static void method1451(@OriginalArg(0) byte[] arg0) {
		method1443(arg0);
		anInt1775 = 0x1 << method1447(4);
		anInt1777 = 0x1 << method1447(4);
		aFloatArray3 = new float[anInt1777];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1775 : anInt1777;
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
			local191 = Static25.method311(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static91.method2649(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray8 = local39;
				aFloatArray5 = local84;
				aFloatArray10 = local136;
				anIntArray173 = local185;
			} else {
				aFloatArray6 = local39;
				aFloatArray9 = local84;
				aFloatArray4 = local136;
				anIntArray174 = local185;
			}
		}
		local24 = method1447(8) + 1;
		aClass173Array1 = new Class173[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass173Array1[local28] = new Class173();
		}
		local32 = method1447(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1447(16);
		}
		@Pc(269) int local269 = method1447(6) + 1;
		aClass18Array1 = new Class18[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass18Array1[local41] = new Class18();
		}
		@Pc(290) int local290 = method1447(6) + 1;
		aClass94Array1 = new Class94[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass94Array1[local86] = new Class94();
		}
		@Pc(311) int local311 = method1447(6) + 1;
		aClass201Array1 = new Class201[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass201Array1[local138] = new Class201();
		}
		@Pc(332) int local332 = method1447(6) + 1;
		aBooleanArray33 = new boolean[local332];
		anIntArray172 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray33[local191] = method1445() != 0;
			method1447(16);
			method1447(16);
			anIntArray172[local191] = method1447(8);
		}
	}
}
