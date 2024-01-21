import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt2625;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[F")
	public static float[] aFloatArray2;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lclient!bb;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[Lclient!bc;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt2626;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[F")
	public static float[] aFloatArray3;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "[Lclient!vb;")
	public static Class78[] aClass78Array1;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public static int anInt2627;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[F")
	public static float[] aFloatArray4;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "[F")
	public static float[] aFloatArray5;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	private static int anInt2631;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "[F")
	public static float[] aFloatArray6;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "[F")
	public static float[] aFloatArray7;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public static int anInt2632;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "[F")
	public static float[] aFloatArray8;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "[Lclient!he;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "[B")
	private static byte[] aByteArray69;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "[F")
	public static float[] aFloatArray9;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray57;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	private static int anInt2634;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Z")
	private static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([B)V")
	private static void method1694(@OriginalArg(0) byte[] arg0) {
		method1701(arg0);
		anInt2627 = 0x1 << method1697(4);
		anInt2632 = 0x1 << method1697(4);
		aFloatArray4 = new float[anInt2632];
		aFloatArray9 = new float[anInt2632];
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(89) int local89;
		@Pc(141) int local141;
		@Pc(194) int local194;
		for (@Pc(20) int local20 = 0; local20 < 2; local20++) {
			local27 = local20 == 0 ? anInt2627 : anInt2632;
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
			local194 = Static98.method1859(local39 - 1);
			for (@Pc(196) int local196 = 0; local196 < local39; local196++) {
				local188[local196] = Static53.method1132(local194, local196);
			}
			if (local20 == 0) {
				aFloatArray8 = local42;
				aFloatArray2 = local87;
				aFloatArray3 = local139;
				anIntArray281 = local188;
			} else {
				aFloatArray7 = local42;
				aFloatArray5 = local87;
				aFloatArray6 = local139;
				anIntArray280 = local188;
			}
		}
		local27 = method1697(8) + 1;
		aClass8Array1 = new Class8[local27];
		for (local31 = 0; local31 < local27; local31++) {
			aClass8Array1[local31] = new Class8();
		}
		local35 = method1697(6) + 1;
		for (local39 = 0; local39 < local35; local39++) {
			method1697(16);
		}
		@Pc(272) int local272 = method1697(6) + 1;
		aClass27Array1 = new Class27[local272];
		for (local44 = 0; local44 < local272; local44++) {
			aClass27Array1[local44] = new Class27();
		}
		@Pc(293) int local293 = method1697(6) + 1;
		aClass78Array1 = new Class78[local293];
		for (local89 = 0; local89 < local293; local89++) {
			aClass78Array1[local89] = new Class78();
		}
		@Pc(314) int local314 = method1697(6) + 1;
		aClass9Array1 = new Class9[local314];
		for (local141 = 0; local141 < local314; local141++) {
			aClass9Array1[local141] = new Class9();
		}
		@Pc(335) int local335 = method1697(6) + 1;
		aBooleanArray57 = new boolean[local335];
		anIntArray282 = new int[local335];
		for (local194 = 0; local194 < local335; local194++) {
			aBooleanArray57[local194] = method1695() != 0;
			method1697(16);
			method1697(16);
			anIntArray282[local194] = method1697(8);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
	public static int method1695() {
		@Pc(7) int local7 = aByteArray69[anInt2631] >> anInt2634 & 0x1;
		anInt2634++;
		anInt2631 += anInt2634 >> 3;
		anInt2634 &= 0x7;
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
	public static void method1696() {
		aByteArray69 = null;
		aClass8Array1 = null;
		aClass27Array1 = null;
		aClass78Array1 = null;
		aClass9Array1 = null;
		aBooleanArray57 = null;
		anIntArray282 = null;
		aFloatArray9 = null;
		aFloatArray4 = null;
		aFloatArray8 = null;
		aFloatArray2 = null;
		aFloatArray3 = null;
		aFloatArray7 = null;
		aFloatArray5 = null;
		aFloatArray6 = null;
		anIntArray281 = null;
		anIntArray280 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
	public static int method1697(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt2634) {
			local8 = 8 - anInt2634;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray69[anInt2631] >> anInt2634 & local14) << local3;
			anInt2634 = 0;
			anInt2631++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray69[anInt2631] >> anInt2634 & local8) << local3;
			anInt2634 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!jb;II)Lclient!pd;")
	public static Class54 method1699(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method1700(arg0)) {
			@Pc(16) byte[] local16 = arg0.method931(arg2, arg1);
			return local16 == null ? null : new Class54(local16);
		} else {
			arg0.method918(arg1, arg2);
			return null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!jb;)Z")
	private static boolean method1700(@OriginalArg(0) Class25 arg0) {
		if (!aBoolean94) {
			@Pc(7) byte[] local7 = arg0.method931(0, 0);
			if (local7 == null) {
				return false;
			}
			method1694(local7);
			aBoolean94 = true;
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)V")
	public static void method1701(@OriginalArg(0) byte[] arg0) {
		aByteArray69 = arg0;
		anInt2631 = 0;
		anInt2634 = 0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)F")
	public static float method1703(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}
}
