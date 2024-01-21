import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static91 {

	@OriginalMember(owner = "client!kc", name = "Ob", descriptor = "I")
	public static int anInt1940;

	@OriginalMember(owner = "client!kc", name = "dc", descriptor = "I")
	public static int anInt1941;

	@OriginalMember(owner = "client!kc", name = "jc", descriptor = "I")
	public static int anInt1942;

	@OriginalMember(owner = "client!kc", name = "Ab", descriptor = "Lclient!kc;")
	public static final Class3_Sub1_Sub5_Sub3_Sub1 aClass3_Sub1_Sub5_Sub3_Sub1_1 = new Class3_Sub1_Sub5_Sub3_Sub1();

	@OriginalMember(owner = "client!kc", name = "Mb", descriptor = "Lclient!kc;")
	public static final Class3_Sub1_Sub5_Sub3_Sub1 aClass3_Sub1_Sub5_Sub3_Sub1_2 = new Class3_Sub1_Sub5_Sub3_Sub1();

	@OriginalMember(owner = "client!kc", name = "Nb", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[1];

	@OriginalMember(owner = "client!kc", name = "Pb", descriptor = "[B")
	public static byte[] aByteArray18 = new byte[1];

	@OriginalMember(owner = "client!kc", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray253 = Class3_Sub1_Sub4_Sub2.anIntArray190;

	@OriginalMember(owner = "client!kc", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray254 = new int[12];

	@OriginalMember(owner = "client!kc", name = "Sb", descriptor = "[I")
	public static final int[] anIntArray255 = Class3_Sub1_Sub4_Sub2.anIntArray185;

	@OriginalMember(owner = "client!kc", name = "Tb", descriptor = "[I")
	public static final int[] anIntArray256 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "Ub", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[1600][512];

	@OriginalMember(owner = "client!kc", name = "Vb", descriptor = "[I")
	public static final int[] anIntArray257 = new int[10];

	@OriginalMember(owner = "client!kc", name = "Wb", descriptor = "[I")
	public static final int[] anIntArray258 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "Xb", descriptor = "[I")
	public static final int[] anIntArray259 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "Yb", descriptor = "[I")
	public static final int[] anIntArray260 = new int[10];

	@OriginalMember(owner = "client!kc", name = "Zb", descriptor = "[I")
	public static final int[] anIntArray261 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "ac", descriptor = "[I")
	public static final int[] anIntArray262 = new int[12];

	@OriginalMember(owner = "client!kc", name = "bc", descriptor = "[I")
	public static final int[] anIntArray263 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "cc", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!kc", name = "ec", descriptor = "[I")
	public static final int[] anIntArray264 = new int[1600];

	@OriginalMember(owner = "client!kc", name = "fc", descriptor = "[I")
	public static final int[] anIntArray265 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "gc", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[12][4096];

	@OriginalMember(owner = "client!kc", name = "hc", descriptor = "[I")
	public static final int[] anIntArray266 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "ic", descriptor = "[I")
	public static final int[] anIntArray267 = new int[4096];

	@OriginalMember(owner = "client!kc", name = "kc", descriptor = "[I")
	public static final int[] anIntArray268 = Static65.anIntArray186;

	@OriginalMember(owner = "client!kc", name = "lc", descriptor = "[I")
	public static final int[] anIntArray269 = new int[10];

	@OriginalMember(owner = "client!kc", name = "mc", descriptor = "[I")
	public static final int[] anIntArray270 = Class3_Sub1_Sub4_Sub2.anIntArray188;

	@OriginalMember(owner = "client!kc", name = "nc", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)I")
	public static int method1386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)I")
	public static int method1395(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
