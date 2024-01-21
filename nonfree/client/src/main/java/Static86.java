import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!r", name = "dc", descriptor = "I")
	public static int anInt2512;

	@OriginalMember(owner = "client!r", name = "lc", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!r", name = "mc", descriptor = "I")
	public static int anInt2515;

	@OriginalMember(owner = "client!r", name = "Fb", descriptor = "Lclient!r;")
	public static Class2_Sub1_Sub1_Sub6 aClass2_Sub1_Sub1_Sub6_2 = new Class2_Sub1_Sub1_Sub6();

	@OriginalMember(owner = "client!r", name = "Xb", descriptor = "Lclient!r;")
	public static Class2_Sub1_Sub1_Sub6 aClass2_Sub1_Sub1_Sub6_3 = new Class2_Sub1_Sub1_Sub6();

	@OriginalMember(owner = "client!r", name = "bc", descriptor = "[I")
	public static int[] anIntArray343 = new int[1];

	@OriginalMember(owner = "client!r", name = "ec", descriptor = "[I")
	public static int[] anIntArray345 = new int[10];

	@OriginalMember(owner = "client!r", name = "fc", descriptor = "[I")
	public static int[] anIntArray346 = new int[12];

	@OriginalMember(owner = "client!r", name = "gc", descriptor = "[I")
	public static int[] anIntArray347 = new int[10];

	@OriginalMember(owner = "client!r", name = "ic", descriptor = "I")
	public static int anInt2513 = 0;

	@OriginalMember(owner = "client!r", name = "jc", descriptor = "[I")
	public static int[] anIntArray349 = new int[1000];

	@OriginalMember(owner = "client!r", name = "kc", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[12][2000];

	@OriginalMember(owner = "client!r", name = "nc", descriptor = "[I")
	public static int[] anIntArray350 = new int[4096];

	@OriginalMember(owner = "client!r", name = "oc", descriptor = "[I")
	public static int[] anIntArray351 = new int[1];

	@OriginalMember(owner = "client!r", name = "pc", descriptor = "[I")
	public static int[] anIntArray352 = Class2_Sub1_Sub4_Sub1.anIntArray52;

	@OriginalMember(owner = "client!r", name = "qc", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[1600][512];

	@OriginalMember(owner = "client!r", name = "rc", descriptor = "I")
	public static int anInt2516 = 0;

	@OriginalMember(owner = "client!r", name = "sc", descriptor = "[I")
	public static int[] anIntArray353 = new int[2000];

	@OriginalMember(owner = "client!r", name = "tc", descriptor = "[I")
	public static int[] anIntArray354 = Class2_Sub1_Sub4_Sub1.anIntArray55;

	@OriginalMember(owner = "client!r", name = "uc", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[4096];

	@OriginalMember(owner = "client!r", name = "vc", descriptor = "[I")
	public static int[] anIntArray355 = new int[10];

	@OriginalMember(owner = "client!r", name = "wc", descriptor = "[I")
	public static int[] anIntArray356 = new int[4096];

	@OriginalMember(owner = "client!r", name = "xc", descriptor = "[I")
	public static int[] anIntArray357 = new int[1600];

	@OriginalMember(owner = "client!r", name = "yc", descriptor = "[I")
	public static int[] anIntArray358 = new int[4096];

	@OriginalMember(owner = "client!r", name = "zc", descriptor = "[I")
	public static int[] anIntArray359 = Static10.anIntArray54;

	@OriginalMember(owner = "client!r", name = "Ac", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!r", name = "Bc", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[4096];

	@OriginalMember(owner = "client!r", name = "Cc", descriptor = "[I")
	public static int[] anIntArray360 = new int[2000];

	@OriginalMember(owner = "client!r", name = "Dc", descriptor = "[I")
	public static int[] anIntArray361 = new int[4096];

	@OriginalMember(owner = "client!r", name = "Ec", descriptor = "[I")
	public static int[] anIntArray362 = new int[4096];

	@OriginalMember(owner = "client!r", name = "Fc", descriptor = "[I")
	public static int[] anIntArray363 = Class2_Sub1_Sub4_Sub1.anIntArray56;

	@OriginalMember(owner = "client!r", name = "Gc", descriptor = "[I")
	public static int[] anIntArray364 = new int[12];

	@OriginalMember(owner = "client!r", name = "Hc", descriptor = "[I")
	public static int[] anIntArray365 = new int[4096];

	@OriginalMember(owner = "client!r", name = "Ic", descriptor = "I")
	public static int anInt2517 = 0;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)I")
	public static int method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class2_Sub1_Sub1_Sub6.anIntArray348[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
	public static void method1542() {
		aClass2_Sub1_Sub1_Sub6_2 = null;
		anIntArray343 = null;
		aClass2_Sub1_Sub1_Sub6_3 = null;
		anIntArray351 = null;
		aBooleanArray24 = null;
		aBooleanArray23 = null;
		anIntArray361 = null;
		anIntArray350 = null;
		anIntArray358 = null;
		anIntArray365 = null;
		anIntArray356 = null;
		anIntArray362 = null;
		anIntArray357 = null;
		anIntArrayArray24 = null;
		anIntArray346 = null;
		anIntArrayArray23 = null;
		anIntArray353 = null;
		anIntArray360 = null;
		anIntArray364 = null;
		anIntArray345 = null;
		anIntArray347 = null;
		anIntArray355 = null;
		anIntArray349 = null;
		anIntArray354 = null;
		anIntArray363 = null;
		anIntArray359 = null;
		anIntArray352 = null;
		Class2_Sub1_Sub1_Sub6.anIntArray348 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!k;II)Lclient!r;")
	public static Class2_Sub1_Sub1_Sub6 method1543(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1150(0, arg1);
		return local5 == null ? null : new Class2_Sub1_Sub1_Sub6(local5);
	}
}
