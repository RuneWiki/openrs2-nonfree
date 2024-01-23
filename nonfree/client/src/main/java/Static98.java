import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
	public static int anInt2281;

	@OriginalMember(owner = "client!ji", name = "tb", descriptor = "I")
	public static int anInt2282;

	@OriginalMember(owner = "client!ji", name = "wb", descriptor = "I")
	public static int anInt2283;

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "Lclient!ji;")
	public static Class9_Sub2_Sub1 aClass9_Sub2_Sub1_1 = new Class9_Sub2_Sub1();

	@OriginalMember(owner = "client!ji", name = "Z", descriptor = "Lclient!ji;")
	public static Class9_Sub2_Sub1 aClass9_Sub2_Sub1_2 = new Class9_Sub2_Sub1();

	@OriginalMember(owner = "client!ji", name = "ab", descriptor = "[B")
	public static byte[] aByteArray29 = new byte[1];

	@OriginalMember(owner = "client!ji", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[4096];

	@OriginalMember(owner = "client!ji", name = "fb", descriptor = "[I")
	public static int[] anIntArray277 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "gb", descriptor = "[I")
	public static int[] anIntArray278 = new int[10];

	@OriginalMember(owner = "client!ji", name = "hb", descriptor = "[I")
	public static int[] anIntArray279 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "ib", descriptor = "[B")
	public static byte[] aByteArray30 = new byte[1];

	@OriginalMember(owner = "client!ji", name = "jb", descriptor = "[I")
	public static int[] anIntArray280 = new int[10];

	@OriginalMember(owner = "client!ji", name = "kb", descriptor = "[I")
	public static int[] anIntArray281 = new int[1600];

	@OriginalMember(owner = "client!ji", name = "lb", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[4096];

	@OriginalMember(owner = "client!ji", name = "mb", descriptor = "[I")
	public static int[] anIntArray282 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[1600][512];

	@OriginalMember(owner = "client!ji", name = "ob", descriptor = "[I")
	public static int[] anIntArray283 = new int[12];

	@OriginalMember(owner = "client!ji", name = "pb", descriptor = "[I")
	public static int[] anIntArray284 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "qb", descriptor = "[I")
	public static int[] anIntArray285 = new int[12];

	@OriginalMember(owner = "client!ji", name = "rb", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[12][4096];

	@OriginalMember(owner = "client!ji", name = "sb", descriptor = "[I")
	public static int[] anIntArray286 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "ub", descriptor = "[I")
	public static int[] anIntArray287 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "vb", descriptor = "[I")
	public static int[] anIntArray288 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "xb", descriptor = "[I")
	public static int[] anIntArray289 = new int[10];

	@OriginalMember(owner = "client!ji", name = "yb", descriptor = "[I")
	public static int[] anIntArray290 = new int[4096];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
	public static int method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I")
	public static int method1722(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
