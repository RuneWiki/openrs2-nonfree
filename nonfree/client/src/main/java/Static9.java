import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!al", name = "j", descriptor = "[Lclient!ab;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "[F")
	public static float[] aFloatArray1;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	public static int anInt187;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "I")
	private static int anInt190;

	@OriginalMember(owner = "client!al", name = "B", descriptor = "I")
	public static int anInt192;

	@OriginalMember(owner = "client!al", name = "C", descriptor = "I")
	private static int anInt193;

	@OriginalMember(owner = "client!al", name = "E", descriptor = "[Lclient!uf;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!al", name = "F", descriptor = "[Lclient!km;")
	public static Class93[] aClass93Array1;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!al", name = "I", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!al", name = "J", descriptor = "[Lclient!lg;")
	public static Class100[] aClass100Array1;

	@OriginalMember(owner = "client!al", name = "K", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Z")
	private static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I")
	public static int method163(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(12) int local12;
		while (arg0 >= 8 - anInt193) {
			local12 = 8 - anInt193;
			@Pc(18) int local18 = (0x1 << local12) - 1;
			local1 += (aByteArray1[anInt190] >> anInt193 & local18) << local3;
			anInt193 = 0;
			anInt190++;
			local3 += local12;
			arg0 -= local12;
		}
		if (arg0 > 0) {
			local12 = (0x1 << arg0) - 1;
			local1 += (aByteArray1[anInt190] >> anInt193 & local12) << local3;
			anInt193 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!lc;II)Lclient!al;")
	public static Class4_Sub4 method164(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method168(arg0)) {
			@Pc(16) byte[] local16 = arg0.method2396(arg2, arg1);
			return local16 == null ? null : new Class4_Sub4(local16);
		} else {
			arg0.method2382(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([BI)V")
	public static void method166(@OriginalArg(0) byte[] arg0) {
		aByteArray1 = arg0;
		anInt190 = 0;
		anInt193 = 0;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "([B)V")
	private static void method167(@OriginalArg(0) byte[] arg0) {
		method166(arg0);
		anInt187 = 0x1 << method163(4);
		anInt192 = 0x1 << method163(4);
		aFloatArray5 = new float[anInt192];
		@Pc(17) int local17;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (local17 = 0; local17 < 2; local17++) {
			local26 = local17 == 0 ? anInt187 : anInt192;
			local30 = local26 >> 1;
			local34 = local26 >> 2;
			local38 = local26 >> 3;
			@Pc(41) float[] local41 = new float[local30];
			for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
				local41[local43 * 2] = (float) Math.cos((double) (local43 * 4) * 3.141592653589793D / (double) local26);
				local41[local43 * 2 + 1] = -((float) Math.sin((double) (local43 * 4) * 3.141592653589793D / (double) local26));
			}
			@Pc(86) float[] local86 = new float[local30];
			for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
				local86[local88 * 2] = (float) Math.cos((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
				local86[local88 * 2 + 1] = (float) Math.sin((double) (local88 * 2 + 1) * 3.141592653589793D / (double) (local26 * 2));
			}
			@Pc(138) float[] local138 = new float[local34];
			for (@Pc(140) int local140 = 0; local140 < local38; local140++) {
				local138[local140 * 2] = (float) Math.cos((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26);
				local138[local140 * 2 + 1] = -((float) Math.sin((double) (local140 * 4 + 2) * 3.141592653589793D / (double) local26));
			}
			@Pc(187) int[] local187 = new int[local38];
			@Pc(193) int local193 = Static201.method3113(local38 - 1);
			for (@Pc(195) int local195 = 0; local195 < local38; local195++) {
				local187[local195] = Static273.method914(local195, local193);
			}
			if (local17 == 0) {
				aFloatArray1 = local41;
				aFloatArray2 = local86;
				aFloatArray3 = local138;
				anIntArray19 = local187;
			} else {
				aFloatArray8 = local41;
				aFloatArray4 = local86;
				aFloatArray7 = local138;
				anIntArray18 = local187;
			}
		}
		local17 = method163(8) + 1;
		aClass100Array1 = new Class100[local17];
		for (local26 = 0; local26 < local17; local26++) {
			aClass100Array1[local26] = new Class100();
		}
		local26 = method163(6) + 1;
		for (local30 = 0; local30 < local26; local30++) {
			method163(16);
		}
		local26 = method163(6) + 1;
		aClass93Array1 = new Class93[local26];
		for (local30 = 0; local30 < local26; local30++) {
			aClass93Array1[local30] = new Class93();
		}
		local30 = method163(6) + 1;
		aClass170Array1 = new Class170[local30];
		for (local34 = 0; local34 < local30; local34++) {
			aClass170Array1[local34] = new Class170();
		}
		local34 = method163(6) + 1;
		aClass2Array1 = new Class2[local34];
		for (local38 = 0; local38 < local34; local38++) {
			aClass2Array1[local38] = new Class2();
		}
		local38 = method163(6) + 1;
		aBooleanArray2 = new boolean[local38];
		anIntArray17 = new int[local38];
		for (@Pc(340) int local340 = 0; local340 < local38; local340++) {
			aBooleanArray2[local340] = method169() != 0;
			method163(16);
			method163(16);
			anIntArray17[local340] = method163(8);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!lc;)Z")
	private static boolean method168(@OriginalArg(0) Class98 arg0) {
		if (!aBoolean4) {
			@Pc(7) byte[] local7 = arg0.method2396(0, 0);
			if (local7 == null) {
				return false;
			}
			method167(local7);
			aBoolean4 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "()I")
	public static int method169() {
		@Pc(7) int local7 = aByteArray1[anInt190] >> anInt193 & 0x1;
		anInt193++;
		anInt190 += anInt193 >> 3;
		anInt193 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "()V")
	public static void method170() {
		aByteArray1 = null;
		aClass100Array1 = null;
		aClass93Array1 = null;
		aClass170Array1 = null;
		aClass2Array1 = null;
		aBooleanArray2 = null;
		anIntArray17 = null;
		aFloatArray5 = null;
		aFloatArray1 = null;
		aFloatArray2 = null;
		aFloatArray3 = null;
		aFloatArray8 = null;
		aFloatArray4 = null;
		aFloatArray7 = null;
		anIntArray19 = null;
		anIntArray18 = null;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)F")
	public static float method172(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
