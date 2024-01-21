import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Z")
	public static boolean aBoolean85;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt2022 = 0;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Lclient!tf;")
	public static Class81 aClass81_7 = new Class81();

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "[J")
	public static long[] aLongArray12 = new long[200];

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	public static int anInt2050 = 0;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_980 = Static32.method683("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public static void method1647() {
		for (@Pc(8) Class2_Sub16 local8 = (Class2_Sub16) Static132.aClass81_10.method2682(); local8 != null; local8 = (Class2_Sub16) Static132.aClass81_10.method2686()) {
			if (local8.aClass2_Sub14_Sub1_2 != null) {
				Static128.aClass2_Sub14_Sub4_2.method2592(local8.aClass2_Sub14_Sub1_2);
				local8.aClass2_Sub14_Sub1_2 = null;
			}
			if (local8.aClass2_Sub14_Sub1_1 != null) {
				Static128.aClass2_Sub14_Sub4_2.method2592(local8.aClass2_Sub14_Sub1_1);
				local8.aClass2_Sub14_Sub1_1 = null;
			}
		}
		Static132.aClass81_10.method2689();
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V")
	public static void method1663() {
		aClass81_7 = null;
		aClass49_980 = null;
		anIntArray205 = null;
		aLongArray12 = null;
	}
}
