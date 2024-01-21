import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
	public static int anInt416;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "[I")
	public static int[] anIntArray15 = new int[32768];

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public static int anInt399 = -1;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "Lclient!tg;")
	private static Class81 aClass81_150 = Static120.method2057("World");

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "Lclient!tg;")
	public static Class81 aClass81_151 = aClass81_150;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_152 = aClass81_150;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
	public static void method315() {
		anIntArray15 = null;
		aClass81_152 = null;
		aClass81_151 = null;
		aClass81_150 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!vb;ILclient!vb;)V")
	public static void method324(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class82 arg1) {
		Static12.aClass82_73 = arg1;
		Static68.aClass82_28 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)V")
	public static void method349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static104.aClass1_Sub8_Sub1_2.method366(213);
		Static104.aClass1_Sub8_Sub1_2.method333(arg1);
		Static104.aClass1_Sub8_Sub1_2.method318(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(Z)V")
	public static void method360() {
		Static17.aClass59_3.method1967();
		Static30.aClass59_5.method1967();
	}
}
