import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!i", name = "w", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "[Lclient!da;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "I")
	public static int anInt1987;

	@OriginalMember(owner = "client!i", name = "C", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "I")
	private static int anInt1988;

	@OriginalMember(owner = "client!i", name = "F", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "[Lclient!nd;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	public static int anInt1991;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "[B")
	private static byte[] aByteArray30;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "I")
	private static int anInt1992;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "[Lclient!jj;")
	public static Class54[] aClass54Array1;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "[Lclient!wh;")
	public static Class113[] aClass113Array1;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "[Z")
	public static boolean[] aBooleanArray63;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "Z")
	private static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
	public static int method1563() {
		@Pc(7) int local7 = aByteArray30[anInt1992] >> anInt1988 & 0x1;
		anInt1988++;
		anInt1992 += anInt1988 >> 3;
		anInt1988 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)I")
	public static int method1567(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt1988) {
			local8 = 8 - anInt1988;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray30[anInt1992] >> anInt1988 & local14) << local3;
			anInt1988 = 0;
			anInt1992++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray30[anInt1992] >> anInt1988 & local8) << local3;
			anInt1988 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([BI)V")
	public static void method1568(@OriginalArg(0) byte[] arg0) {
		aByteArray30 = arg0;
		anInt1992 = 0;
		anInt1988 = 0;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)F")
	public static float method1570(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "([B)V")
	private static void method1571(@OriginalArg(0) byte[] arg0) {
		method1568(arg0);
		anInt1991 = 0x1 << method1567(4);
		anInt1987 = 0x1 << method1567(4);
		aFloatArray8 = new float[anInt1987];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt1991 : anInt1987;
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
			local191 = Static102.method1744(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static132.method2405(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray5 = local39;
				aFloatArray4 = local84;
				aFloatArray6 = local136;
				anIntArray354 = local185;
			} else {
				aFloatArray3 = local39;
				aFloatArray1 = local84;
				aFloatArray7 = local136;
				anIntArray352 = local185;
			}
		}
		local24 = method1567(8) + 1;
		aClass54Array1 = new Class54[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass54Array1[local28] = new Class54();
		}
		local32 = method1567(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method1567(16);
		}
		@Pc(269) int local269 = method1567(6) + 1;
		aClass67Array1 = new Class67[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass67Array1[local41] = new Class67();
		}
		@Pc(290) int local290 = method1567(6) + 1;
		aClass113Array1 = new Class113[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass113Array1[local86] = new Class113();
		}
		@Pc(311) int local311 = method1567(6) + 1;
		aClass22Array1 = new Class22[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass22Array1[local138] = new Class22();
		}
		@Pc(332) int local332 = method1567(6) + 1;
		aBooleanArray63 = new boolean[local332];
		anIntArray353 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray63[local191] = method1563() != 0;
			method1567(16);
			method1567(16);
			anIntArray353[local191] = method1567(8);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oe;)Z")
	private static boolean method1572(@OriginalArg(0) Class72 arg0) {
		if (!aBoolean77) {
			@Pc(7) byte[] local7 = arg0.method3197(0, 0);
			if (local7 == null) {
				return false;
			}
			method1571(local7);
			aBoolean77 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oe;II)Lclient!i;")
	public static Class2_Sub17 method1573(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1572(arg0)) {
			@Pc(16) byte[] local16 = arg0.method3197(arg2, arg1);
			return local16 == null ? null : new Class2_Sub17(local16);
		} else {
			arg0.method3192(arg2, arg1);
			return null;
		}
	}
}
