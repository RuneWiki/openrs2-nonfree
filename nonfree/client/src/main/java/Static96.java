import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!le", name = "I", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array10;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "Lclient!ed;")
	private static Class23 aClass23_950 = Static169.method2903("wave:");

	@OriginalMember(owner = "client!le", name = "E", descriptor = "Lclient!ed;")
	public static Class23 aClass23_951 = Static169.method2903("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!le", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_952 = Static169.method2903(":clanreq:");

	@OriginalMember(owner = "client!le", name = "K", descriptor = "Lclient!ed;")
	public static Class23 aClass23_953 = aClass23_950;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!ed;")
	private static Class23 aClass23_957 = Static169.method2903("OFF");

	@OriginalMember(owner = "client!le", name = "O", descriptor = "Lclient!ed;")
	public static Class23 aClass23_954 = aClass23_957;

	@OriginalMember(owner = "client!le", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_955 = Static169.method2903("(U2");

	@OriginalMember(owner = "client!le", name = "S", descriptor = "[I")
	public static int[] anIntArray310 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!le", name = "T", descriptor = "Lclient!ed;")
	public static Class23 aClass23_956 = Static169.method2903("runes");

	@OriginalMember(owner = "client!le", name = "W", descriptor = "J")
	public static volatile long aLong78 = 0L;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "Lclient!ed;")
	public static Class23 aClass23_958 = Static169.method2903("null");

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "Lclient!ed;")
	public static Class23 aClass23_959 = aClass23_950;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
	public static void method1663() {
		Static104.anInt2660 = 0;
		Static14.anInt465 = 0;
		Static105.method1818();
		Static123.method2192();
		Static163.method2827();
		Static91.method1595();
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static14.anInt465; local28++) {
			local34 = Static42.anIntArray140[local28];
			if (Static26.anInt845 != Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local34].anInt1834) {
				Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local34] = null;
			}
		}
		if (Static103.anInt2645 != Static35.aClass1_Sub8_Sub1_2.anInt1357) {
			throw new RuntimeException("gpp1 pos:" + Static35.aClass1_Sub8_Sub1_2.anInt1357 + " psize:" + Static103.anInt2645);
		}
		for (local34 = 0; local34 < Static152.anInt3549; local34++) {
			if (Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local34]] == null) {
				throw new RuntimeException("gpp2 pos:" + local34 + " size:" + Static152.anInt3549);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
	public static void method1665() {
		Static82.aClass10_6 = new Class10(32);
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
	public static void method1666() {
		aClass23_954 = null;
		aClass23_950 = null;
		aClass23_955 = null;
		aClass23_952 = null;
		aClass23_953 = null;
		aClass23_951 = null;
		anIntArray310 = null;
		aClass23_957 = null;
		aClass23_959 = null;
		aClass23_958 = null;
		aClass23_956 = null;
		aClass23Array10 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method1668() {
		Static57.aClass79_8.method2659();
		Static181.aClass79_30.method2659();
	}
}
