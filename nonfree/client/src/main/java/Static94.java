import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "J")
	public static long aLong85;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public static int anInt2271;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!me;")
	public static Class5_Sub1_Sub11 aClass5_Sub1_Sub11_5;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt2274;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1102 = Static38.method736("null");

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1103 = Static38.method736("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1107 = Static38.method736("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1104 = aClass71_1107;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1105 = Static38.method736("wave2:");

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1106 = null;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public static int anInt2277 = 0;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1108 = aClass71_1105;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!me;B)Lclient!me;")
	public static Class5_Sub1_Sub11 method1566(@OriginalArg(0) Class5_Sub1_Sub11 arg0) {
		@Pc(11) int local11 = Static39.method747(Static23.method545(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local11; local22++) {
			arg0 = Static118.method1937(arg0.anInt1785);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!nb;B)V")
	public static void method1569(@OriginalArg(0) Class24 arg0) {
		Static21.aClass24_4 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILclient!nb;)Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 method1571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2) {
		return Static6.method156(arg2, arg0, arg1) ? Static89.method1409() : null;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public static void method1573() {
		aClass71_1107 = null;
		aClass71_1106 = null;
		aClass71_1105 = null;
		aClass71_1103 = null;
		aClass71_1104 = null;
		aClass71_1102 = null;
		aClass5_Sub1_Sub11_5 = null;
		aClass71_1108 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)I")
	public static int method1574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static59.aByteArrayArrayArray2[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static59.aByteArrayArrayArray2[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
