import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array8;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_17;

	@OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
	public static int anInt2420;

	@OriginalMember(owner = "client!re", name = "tb", descriptor = "I")
	public static int anInt2427;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
	public static int anInt2417 = 0;

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "[I")
	public static int[] anIntArray325 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!re", name = "qb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1368 = Static15.method178(" has logged in)3");

	@OriginalMember(owner = "client!re", name = "jb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1367 = aClass23_1368;

	@OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
	public static int anInt2422 = 0;

	@OriginalMember(owner = "client!re", name = "nb", descriptor = "[I")
	public static int[] anIntArray327 = new int[500];

	@OriginalMember(owner = "client!re", name = "sb", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public static void method1537() {
		aClass23_1367 = null;
		aClass55_Sub1_17 = null;
		aClass23_1368 = null;
		anIntArray327 = null;
		aClass1_Sub1_Sub6_Sub1Array8 = null;
		anIntArray325 = null;
		aBooleanArray10 = null;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public static void method1538() {
		Static80.anIntArray268 = null;
		Static26.anIntArray119 = null;
		Static105.aByteArrayArray7 = null;
		Static113.anIntArray410 = null;
		Static100.anIntArray348 = null;
		Static102.anIntArray355 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!rc;)[Ljava/lang/Object;")
	public static Object[] method1539(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(7) int local7 = arg0.method716();
		if (local7 == 0) {
			return null;
		}
		@Pc(14) Object[] local14 = new Object[local7];
		for (@Pc(24) int local24 = 0; local24 < local7; local24++) {
			@Pc(29) int local29 = arg0.method716();
			if (local29 == 0) {
				local14[local24] = Integer.valueOf(arg0.method692());
			} else if (local29 == 1) {
				local14[local24] = arg0.method683();
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)I")
	public static int method1540() {
		return 19;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)V")
	public static void method1541() {
		Static11.method114(false, 10, 0, null);
	}
}
