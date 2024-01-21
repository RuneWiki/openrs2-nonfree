import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "[Lclient!ab;")
	public static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[Lclient!eb;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[B")
	private static byte[] aByteArray36;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	private static int anInt2610;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt2612;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Z")
	public static boolean aBoolean118;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
	private static int anInt2613;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "[Lclient!p;")
	public static Class55[] aClass55Array1;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	public static int anInt2616;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Z")
	private static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V")
	private static void method1784(@OriginalArg(0) byte[] arg0) {
		method1791(arg0);
		anInt2616 = 0x1 << method1793(4);
		anInt2607 = 0x1 << method1793(4);
		aFloatArray3 = new float[anInt2607];
		aFloatArray2 = new float[anInt2607];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2616 : anInt2607;
			local31 = local27 >> 1;
			local35 = local27 >> 2;
			local39 = local27 >> 3;
			@Pc(42) float[] local42 = new float[local31];
			for (local44 = 0; local44 < local35; local44++) {
				local42[local44 * 2] = (float) Math.cos((double) (local44 * 4) * 3.141592653589793D / (double) local27);
				local42[local44 * 2 + 1] = -((float) Math.sin((double) (local44 * 4) * 3.141592653589793D / (double) local27));
			}
			@Pc(87) float[] local87 = new float[local31];
			for (local89 = 0; local89 < local35; local89++) {
				local87[local89 * 2] = (float) Math.cos((double) (local89 * 2 + 1) * 3.141592653589793D / (double) (local27 * 2));
				local87[local89 * 2 + 1] = (float) Math.sin((double) (local89 * 2 + 1) * 3.141592653589793D / (double) (local27 * 2));
			}
			@Pc(139) float[] local139 = new float[local35];
			for (local141 = 0; local141 < local39; local141++) {
				local139[local141 * 2] = (float) Math.cos((double) (local141 * 4 + 2) * 3.141592653589793D / (double) local27);
				local139[local141 * 2 + 1] = -((float) Math.sin((double) (local141 * 4 + 2) * 3.141592653589793D / (double) local27));
			}
			@Pc(188) int[] local188 = new int[local39];
			local194 = Static77.method1479(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static119.method2129(local196, local194);
			}
			if (local20 == 0) {
				aFloatArray7 = local42;
				aFloatArray5 = local87;
				aFloatArray4 = local139;
				anIntArray394 = local188;
			} else {
				aFloatArray6 = local42;
				aFloatArray9 = local87;
				aFloatArray8 = local139;
				anIntArray395 = local188;
			}
		}
		local27 = method1793(8) + 1;
		aClass3Array1 = new Class3[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass3Array1[local31] = new Class3();
		}
		local35 = method1793(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1793(16);
		}
		@Pc(272) int local272 = method1793(6) + 1;
		aClass55Array1 = new Class55[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass55Array1[local44] = new Class55();
		}
		@Pc(293) int local293 = method1793(6) + 1;
		aClass18Array1 = new Class18[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass18Array1[local89] = new Class18();
		}
		@Pc(314) int local314 = method1793(6) + 1;
		aClass64Array1 = new Class64[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass64Array1[local141] = new Class64();
		}
		@Pc(335) int local335 = method1793(6) + 1;
		aBooleanArray23 = new boolean[local335];
		anIntArray393 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray23[local194] = method1785() != 0;
			method1793(16);
			method1793(16);
			anIntArray393[local194] = method1793(8);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
	public static int method1785() {
		@Pc(7) int local7 = aByteArray36[anInt2613] >> anInt2610 & 0x1;
		anInt2610++;
		anInt2613 += anInt2610 >> 3;
		anInt2610 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
	public static void method1788() {
		aByteArray36 = null;
		aClass3Array1 = null;
		aClass55Array1 = null;
		aClass18Array1 = null;
		aClass64Array1 = null;
		aBooleanArray23 = null;
		anIntArray393 = null;
		aFloatArray2 = null;
		aFloatArray3 = null;
		aFloatArray7 = null;
		aFloatArray5 = null;
		aFloatArray4 = null;
		aFloatArray6 = null;
		aFloatArray9 = null;
		aFloatArray8 = null;
		anIntArray394 = null;
		anIntArray395 = null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)F")
	public static float method1789(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)V")
	public static void method1791(@OriginalArg(0) byte[] arg0) {
		aByteArray36 = arg0;
		anInt2613 = 0;
		anInt2610 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!sd;I)Lclient!rb;")
	public static Class62 method1792(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		if (method1794(arg0)) {
			@Pc(14) byte[] local14 = arg0.method745(arg1);
			return local14 == null ? null : new Class62(local14);
		} else {
			arg0.method761(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)I")
	public static int method1793(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2610) {
			local8 = 8 - anInt2610;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray36[anInt2613] >> anInt2610 & local14) << local3;
			anInt2610 = 0;
			anInt2613++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray36[anInt2613] >> anInt2610 & local8) << local3;
			anInt2610 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!sd;)Z")
	private static boolean method1794(@OriginalArg(0) Class29 arg0) {
		if (!aBoolean120) {
			@Pc(7) byte[] local7 = arg0.method733(0, 0);
			if (local7 == null) {
				return false;
			}
			method1784(local7);
			aBoolean120 = true;
		}
		return true;
	}
}
