import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[Lclient!oe;")
	public static Class65[] aClass65Array1;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "[B")
	private static byte[] aByteArray28;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "[Lclient!ef;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public static int anInt2673;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	private static int anInt2675;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "[Lclient!hg;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	private static int anInt2677;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "[Lclient!ud;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
	public static int anInt2681;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "Z")
	private static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	public static void method1925() {
		aByteArray28 = null;
		aClass18Array1 = null;
		aClass65Array1 = null;
		aClass85Array1 = null;
		aClass33Array1 = null;
		aBooleanArray35 = null;
		anIntArray254 = null;
		aFloatArray3 = null;
		aFloatArray7 = null;
		aFloatArray4 = null;
		aFloatArray6 = null;
		aFloatArray8 = null;
		aFloatArray5 = null;
		aFloatArray2 = null;
		anIntArray255 = null;
		anIntArray256 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ag;II)Lclient!kf;")
	public static Class1_Sub14 method1927(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1933(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2243(arg1, arg2);
			return local16 == null ? null : new Class1_Sub14(local16);
		} else {
			arg0.method2247(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BI)V")
	public static void method1928(@OriginalArg(0) byte[] arg0) {
		aByteArray28 = arg0;
		anInt2675 = 0;
		anInt2677 = 0;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)F")
	public static float method1930(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)I")
	public static int method1932(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2677) {
			local8 = 8 - anInt2677;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray28[anInt2675] >> anInt2677 & local14) << local3;
			anInt2677 = 0;
			anInt2675++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray28[anInt2675] >> anInt2677 & local8) << local3;
			anInt2677 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ag;)Z")
	private static boolean method1933(@OriginalArg(0) Class4 arg0) {
		if (!aBoolean199) {
			@Pc(7) byte[] local7 = arg0.method2243(0, 0);
			if (local7 == null) {
				return false;
			}
			method1935(local7);
			aBoolean199 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
	public static int method1934() {
		@Pc(7) int local7 = aByteArray28[anInt2675] >> anInt2677 & 0x1;
		anInt2677++;
		anInt2675 += anInt2677 >> 3;
		anInt2677 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "([B)V")
	private static void method1935(@OriginalArg(0) byte[] arg0) {
		method1928(arg0);
		anInt2681 = 0x1 << method1932(4);
		anInt2673 = 0x1 << method1932(4);
		aFloatArray3 = new float[anInt2673];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt2681 : anInt2673;
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
			local191 = Static155.method3050(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static142.method2535(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray7 = local39;
				aFloatArray4 = local84;
				aFloatArray6 = local136;
				anIntArray255 = local185;
			} else {
				aFloatArray8 = local39;
				aFloatArray5 = local84;
				aFloatArray2 = local136;
				anIntArray256 = local185;
			}
		}
		local24 = method1932(8) + 1;
		aClass18Array1 = new Class18[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass18Array1[local28] = new Class18();
		}
		local32 = method1932(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1932(16);
		}
		@Pc(269) int local269 = method1932(6) + 1;
		aClass65Array1 = new Class65[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass65Array1[local41] = new Class65();
		}
		@Pc(290) int local290 = method1932(6) + 1;
		aClass85Array1 = new Class85[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass85Array1[local86] = new Class85();
		}
		@Pc(311) int local311 = method1932(6) + 1;
		aClass33Array1 = new Class33[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass33Array1[local138] = new Class33();
		}
		@Pc(332) int local332 = method1932(6) + 1;
		aBooleanArray35 = new boolean[local332];
		anIntArray254 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray35[local191] = method1934() != 0;
			method1932(16);
			method1932(16);
			anIntArray254[local191] = method1932(8);
		}
	}
}
