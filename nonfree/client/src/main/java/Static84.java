import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!rb", name = "Sb", descriptor = "I")
	public static int anInt2269;

	@OriginalMember(owner = "client!rb", name = "jc", descriptor = "I")
	public static int anInt2271;

	@OriginalMember(owner = "client!rb", name = "rc", descriptor = "I")
	public static int anInt2273;

	@OriginalMember(owner = "client!rb", name = "Jb", descriptor = "Lclient!rb;")
	public static Class10_Sub1_Sub5_Sub4 aClass10_Sub1_Sub5_Sub4_2 = new Class10_Sub1_Sub5_Sub4();

	@OriginalMember(owner = "client!rb", name = "Lb", descriptor = "Lclient!rb;")
	public static Class10_Sub1_Sub5_Sub4 aClass10_Sub1_Sub5_Sub4_3 = new Class10_Sub1_Sub5_Sub4();

	@OriginalMember(owner = "client!rb", name = "Mb", descriptor = "[I")
	public static int[] anIntArray268 = new int[1];

	@OriginalMember(owner = "client!rb", name = "Ob", descriptor = "[I")
	public static int[] anIntArray269 = new int[10];

	@OriginalMember(owner = "client!rb", name = "Pb", descriptor = "[I")
	public static int[] anIntArray270 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "Qb", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!rb", name = "Rb", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!rb", name = "Tb", descriptor = "[I")
	public static int[] anIntArray271 = new int[10];

	@OriginalMember(owner = "client!rb", name = "Ub", descriptor = "[I")
	public static int[] anIntArray272 = new int[10];

	@OriginalMember(owner = "client!rb", name = "Vb", descriptor = "[I")
	public static int[] anIntArray273 = new int[12];

	@OriginalMember(owner = "client!rb", name = "Wb", descriptor = "[I")
	public static int[] anIntArray274 = new int[1000];

	@OriginalMember(owner = "client!rb", name = "Xb", descriptor = "[I")
	public static int[] anIntArray275 = Class10_Sub1_Sub1_Sub3.anIntArray200;

	@OriginalMember(owner = "client!rb", name = "Yb", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[4096];

	@OriginalMember(owner = "client!rb", name = "Zb", descriptor = "[I")
	public static int[] anIntArray276 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "bc", descriptor = "[I")
	public static int[] anIntArray278 = new int[1500];

	@OriginalMember(owner = "client!rb", name = "cc", descriptor = "[I")
	public static int[] anIntArray279 = Static68.anIntArray205;

	@OriginalMember(owner = "client!rb", name = "dc", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[1500][512];

	@OriginalMember(owner = "client!rb", name = "ec", descriptor = "[I")
	public static int[] anIntArray280 = Class10_Sub1_Sub1_Sub3.anIntArray201;

	@OriginalMember(owner = "client!rb", name = "fc", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!rb", name = "gc", descriptor = "[I")
	public static int[] anIntArray281 = Class10_Sub1_Sub1_Sub3.anIntArray203;

	@OriginalMember(owner = "client!rb", name = "hc", descriptor = "[I")
	public static int[] anIntArray282 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "ic", descriptor = "I")
	public static int anInt2270 = 0;

	@OriginalMember(owner = "client!rb", name = "kc", descriptor = "[I")
	public static int[] anIntArray283 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "lc", descriptor = "[I")
	public static int[] anIntArray284 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "mc", descriptor = "I")
	public static int anInt2272 = 0;

	@OriginalMember(owner = "client!rb", name = "nc", descriptor = "[I")
	public static int[] anIntArray285 = new int[12];

	@OriginalMember(owner = "client!rb", name = "oc", descriptor = "[I")
	public static int[] anIntArray286 = new int[2000];

	@OriginalMember(owner = "client!rb", name = "pc", descriptor = "[I")
	public static int[] anIntArray287 = new int[4096];

	@OriginalMember(owner = "client!rb", name = "qc", descriptor = "[I")
	public static int[] anIntArray288 = new int[1];

	@OriginalMember(owner = "client!rb", name = "sc", descriptor = "[I")
	public static int[] anIntArray289 = new int[2000];

	@OriginalMember(owner = "client!rb", name = "tc", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[12][2000];

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)I")
	public static int method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class10_Sub1_Sub5_Sub4.anIntArray277[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "()V")
	public static void method1333() {
		aClass10_Sub1_Sub5_Sub4_2 = null;
		anIntArray268 = null;
		aClass10_Sub1_Sub5_Sub4_3 = null;
		anIntArray288 = null;
		aBooleanArray11 = null;
		aBooleanArray10 = null;
		anIntArray284 = null;
		anIntArray283 = null;
		anIntArray287 = null;
		anIntArray276 = null;
		anIntArray282 = null;
		anIntArray270 = null;
		anIntArray278 = null;
		anIntArrayArray19 = null;
		anIntArray285 = null;
		anIntArrayArray20 = null;
		anIntArray286 = null;
		anIntArray289 = null;
		anIntArray273 = null;
		anIntArray272 = null;
		anIntArray271 = null;
		anIntArray269 = null;
		anIntArray274 = null;
		anIntArray280 = null;
		anIntArray281 = null;
		anIntArray279 = null;
		anIntArray275 = null;
		Class10_Sub1_Sub5_Sub4.anIntArray277 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!he;II)Lclient!rb;")
	public static Class10_Sub1_Sub5_Sub4 method1335(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method203(arg1, 0);
		return local5 == null ? null : new Class10_Sub1_Sub5_Sub4(local5);
	}
}
