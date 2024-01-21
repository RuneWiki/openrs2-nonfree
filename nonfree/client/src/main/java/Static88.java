import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "Lclient!w;")
	public static Class61 aClass61_4;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_6;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public static final int anInt2350 = 50;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "[I")
	public static int[] anIntArray329 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
	public static int[] anIntArray330 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_818 = Static56.method1206("titlebox");

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_819 = Static56.method1206("as it was used to break our rules");

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	public static int[] anIntArray331 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!lc;")
	public static Class31 aClass31_820 = Static56.method1206("Error connecting to server)3");

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
	public static int anInt2361 = 0;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "[I")
	public static int[] anIntArray332 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "Lclient!lc;")
	public static Class31 aClass31_821 = Static56.method1206("Mem:");

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "Lclient!lc;")
	public static Class31 aClass31_822 = Static56.method1206("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "Lclient!lc;")
	public static Class31 aClass31_823 = Static56.method1206("@or1@");

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "Lclient!lc;")
	public static Class31 aClass31_824 = Static56.method1206("(X");

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "[I")
	public static int[] anIntArray333 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!lc;")
	public static Class31 aClass31_825 = Static56.method1206("*6n");

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "[I")
	public static int[] anIntArray334 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
	public static int anInt2370 = 255;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "[I")
	public static int[] anIntArray335 = new int[anInt2350];

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array10 = new Class31[anInt2350];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method1488(@OriginalArg(0) int arg0) {
		if (Static57.anInt2684 == 0) {
			if (Static83.anInt2318 >= 0) {
				Static83.anInt2318 = arg0;
				Static87.aClass1_1.method1046(arg0, 0);
			}
		} else if (Static83.aByteArray21 != null) {
			Static45.anInt1601 = arg0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!qd;Ljava/awt/Component;)Lclient!f;")
	public static Class2_Sub8_Sub1 method1489(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Component arg1) {
		Static49.method1698(arg0, arg1);
		@Pc(16) Class2_Sub8_Sub1 local16 = new Class2_Sub8_Sub1();
		Static85.method1566(local16);
		return local16;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1490() {
		if (Static62.anInt2116 == 2) {
			Static77.method1426(Static31.anInt1272 * 2, (Static65.anInt2167 - Static25.anInt1103 << 7) + Static20.anInt1976, (-Static47.anInt1730 + Static43.anInt1588 << 7) + Static103.anInt2762);
			if (Static31.anInt1271 > -1 && Static49.anInt2694 % 20 < 10) {
				Static39.aClass2_Sub1_Sub3_Sub2Array4[0].method469(Static31.anInt1271 - 12, Static10.anInt372 - 28);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1491() {
		aClass31_822 = null;
		aClass31_819 = null;
		anIntArray334 = null;
		anIntArray335 = null;
		aClass31_823 = null;
		aClass31_818 = null;
		aClass2_Sub1_Sub3_Sub3_6 = null;
		aClass31_821 = null;
		anIntArray329 = null;
		anIntArray331 = null;
		aClass61_4 = null;
		aClass31_820 = null;
		aClass31_824 = null;
		aClass31_825 = null;
		anIntArray332 = null;
		aClass31Array10 = null;
		anIntArray330 = null;
		anIntArray333 = null;
	}
}
