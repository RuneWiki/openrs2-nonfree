import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static83 {

	@OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
	public static int anInt1783;

	@OriginalMember(owner = "client!hf", name = "mb", descriptor = "I")
	public static int anInt1784;

	@OriginalMember(owner = "client!hf", name = "tb", descriptor = "I")
	public static int anInt1785;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "Lclient!hf;")
	public static Class5_Sub3_Sub1 aClass5_Sub3_Sub1_1 = new Class5_Sub3_Sub1();

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "[B")
	public static byte[] aByteArray28 = new byte[1];

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "Lclient!hf;")
	public static Class5_Sub3_Sub1 aClass5_Sub3_Sub1_2 = new Class5_Sub3_Sub1();

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "[Z")
	public static boolean[] aBooleanArray54 = new boolean[4096];

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "[I")
	public static int[] anIntArray311 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "[I")
	public static int[] anIntArray312 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "[I")
	public static int[] anIntArray313 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "[I")
	public static int[] anIntArray314 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[12][4096];

	@OriginalMember(owner = "client!hf", name = "gb", descriptor = "[I")
	public static int[] anIntArray315 = new int[10];

	@OriginalMember(owner = "client!hf", name = "hb", descriptor = "[I")
	public static int[] anIntArray316 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "jb", descriptor = "[I")
	public static int[] anIntArray317 = new int[12];

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "[I")
	public static int[] anIntArray318 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "lb", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[1600][512];

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "[I")
	public static int[] anIntArray319 = new int[1600];

	@OriginalMember(owner = "client!hf", name = "ob", descriptor = "[Z")
	public static boolean[] aBooleanArray55 = new boolean[4096];

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "[I")
	public static int[] anIntArray320 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "qb", descriptor = "[I")
	public static int[] anIntArray321 = new int[10];

	@OriginalMember(owner = "client!hf", name = "rb", descriptor = "[I")
	public static int[] anIntArray322 = new int[4096];

	@OriginalMember(owner = "client!hf", name = "sb", descriptor = "[I")
	public static int[] anIntArray323 = new int[12];

	@OriginalMember(owner = "client!hf", name = "ub", descriptor = "[I")
	public static int[] anIntArray324 = new int[10];

	@OriginalMember(owner = "client!hf", name = "vb", descriptor = "[B")
	public static byte[] aByteArray29 = new byte[1];

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)I")
	public static int method1435(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
	public static int method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
