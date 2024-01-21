import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!jh", name = "Cb", descriptor = "I")
	public static int anInt1945;

	@OriginalMember(owner = "client!jh", name = "Wb", descriptor = "I")
	public static int anInt1947;

	@OriginalMember(owner = "client!jh", name = "Zb", descriptor = "I")
	public static int anInt1948;

	@OriginalMember(owner = "client!jh", name = "mb", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub1_Sub4_Sub1 aClass1_Sub2_Sub1_Sub4_Sub1_1 = new Class1_Sub2_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!jh", name = "wb", descriptor = "[B")
	public static byte[] aByteArray15 = new byte[1];

	@OriginalMember(owner = "client!jh", name = "zb", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub1_Sub4_Sub1 aClass1_Sub2_Sub1_Sub4_Sub1_2 = new Class1_Sub2_Sub1_Sub4_Sub1();

	@OriginalMember(owner = "client!jh", name = "Bb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[4096];

	@OriginalMember(owner = "client!jh", name = "Db", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[1];

	@OriginalMember(owner = "client!jh", name = "Eb", descriptor = "[I")
	public static int[] anIntArray200 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "Fb", descriptor = "[I")
	public static int[] anIntArray201 = Class1_Sub2_Sub2_Sub1.anIntArray30;

	@OriginalMember(owner = "client!jh", name = "Gb", descriptor = "[I")
	public static int[] anIntArray202 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "Hb", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[12][2000];

	@OriginalMember(owner = "client!jh", name = "Ib", descriptor = "[I")
	public static int[] anIntArray203 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "Jb", descriptor = "[I")
	public static int[] anIntArray204 = new int[12];

	@OriginalMember(owner = "client!jh", name = "Kb", descriptor = "[I")
	public static int[] anIntArray205 = new int[2000];

	@OriginalMember(owner = "client!jh", name = "Lb", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!jh", name = "Mb", descriptor = "[I")
	public static int[] anIntArray206 = Class1_Sub2_Sub2_Sub1.anIntArray33;

	@OriginalMember(owner = "client!jh", name = "Nb", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[1600][512];

	@OriginalMember(owner = "client!jh", name = "Ob", descriptor = "[I")
	public static int[] anIntArray207 = new int[10];

	@OriginalMember(owner = "client!jh", name = "Pb", descriptor = "[I")
	public static int[] anIntArray208 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "Qb", descriptor = "[I")
	public static int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "Rb", descriptor = "[I")
	public static int[] anIntArray210 = new int[2000];

	@OriginalMember(owner = "client!jh", name = "Tb", descriptor = "[I")
	public static int[] anIntArray211 = Static22.anIntArray29;

	@OriginalMember(owner = "client!jh", name = "Ub", descriptor = "[I")
	public static int[] anIntArray212 = new int[4096];

	@OriginalMember(owner = "client!jh", name = "Vb", descriptor = "[I")
	public static int[] anIntArray213 = Class1_Sub2_Sub2_Sub1.anIntArray31;

	@OriginalMember(owner = "client!jh", name = "Xb", descriptor = "[I")
	public static int[] anIntArray214 = new int[10];

	@OriginalMember(owner = "client!jh", name = "Yb", descriptor = "[I")
	public static int[] anIntArray215 = new int[10];

	@OriginalMember(owner = "client!jh", name = "ac", descriptor = "[I")
	public static int[] anIntArray216 = new int[1600];

	@OriginalMember(owner = "client!jh", name = "bc", descriptor = "[I")
	public static int[] anIntArray217 = new int[12];

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I")
	public static int method1464(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method1466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "()V")
	public static void method1468() {
		aClass1_Sub2_Sub1_Sub4_Sub1_1 = null;
		aByteArray15 = null;
		aClass1_Sub2_Sub1_Sub4_Sub1_2 = null;
		aByteArray16 = null;
		aBooleanArray10 = null;
		aBooleanArray9 = null;
		anIntArray212 = null;
		anIntArray203 = null;
		anIntArray202 = null;
		anIntArray209 = null;
		anIntArray200 = null;
		anIntArray208 = null;
		anIntArray216 = null;
		anIntArrayArray17 = null;
		anIntArray217 = null;
		anIntArrayArray16 = null;
		anIntArray210 = null;
		anIntArray205 = null;
		anIntArray204 = null;
		anIntArray207 = null;
		anIntArray215 = null;
		anIntArray214 = null;
		anIntArray201 = null;
		anIntArray206 = null;
		anIntArray211 = null;
		anIntArray213 = null;
	}
}
