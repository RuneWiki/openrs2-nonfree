import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!na;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_14;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!kc;")
	public static Class11 aClass11_19;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_15;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!kc;")
	public static Class11 aClass11_20;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[[Lclient!bb;")
	public static Class2_Sub1_Sub2[][] aClass2_Sub1_Sub2ArrayArray1;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_14;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_826 = Static56.method1206(" @cya@");

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_827 = Static56.method1206("Loaded config");

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt2387 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public static int method1496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static34.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static34.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1497() {
		aClass11_Sub1_15 = null;
		aClass35_4 = null;
		aClass11_20 = null;
		aClass31_827 = null;
		aClass31_826 = null;
		aClass2_Sub1_Sub2ArrayArray1 = null;
		aLongArray5 = null;
		aClass2_Sub1_Sub3_Sub1_14 = null;
		aClass11_19 = null;
		aClass11_Sub1_14 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!lc;")
	public static Class31 method1498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static43.aClass31_577;
		} else if (local8 < -6) {
			return Static10.aClass31_135;
		} else if (local8 < -3) {
			return Static54.aClass31_643;
		} else if (local8 < 0) {
			return Static88.aClass31_823;
		} else if (local8 > 9) {
			return Static83.aClass31_808;
		} else if (local8 > 6) {
			return Static69.aClass31_772;
		} else if (local8 > 3) {
			return Static41.aClass31_569;
		} else if (local8 > 0) {
			return Static60.aClass31_724;
		} else {
			return Static99.aClass31_921;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Lclient!lc;")
	public static Class31 method1499(@OriginalArg(0) int arg0) {
		return Static17.method524(arg0);
	}
}
