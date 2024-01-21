import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "[B")
	public static byte[] aByteArray13;

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lclient!ab;")
	public static Class3 aClass3_7 = new Class3();

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1115 = Static34.method846("leuchten1:");

	@OriginalMember(owner = "client!sd", name = "tb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1116 = Static34.method846(" weitere Optionen");

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1117 = Static34.method846("(U(Y");

	@OriginalMember(owner = "client!sd", name = "wb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1118 = Static34.method846("title)3jpg");

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "[I")
	public static int[] anIntArray247 = new int[128];

	@OriginalMember(owner = "client!sd", name = "yb", descriptor = "I")
	public static int anInt2609 = 1;

	@OriginalMember(owner = "client!sd", name = "zb", descriptor = "I")
	public static int anInt2610 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
	public static void method1770() {
		for (@Pc(15) Class6_Sub2_Sub3_Sub2 local15 = (Class6_Sub2_Sub3_Sub2) Static104.aClass3_11.method31(); local15 != null; local15 = (Class6_Sub2_Sub3_Sub2) Static104.aClass3_11.method26()) {
			if (local15.anInt1266 != Static56.anInt1718 || local15.aBoolean56) {
				local15.method2083();
			} else if (local15.anInt1271 <= Static85.anInt2389) {
				local15.method827(Static45.anInt1477);
				if (local15.aBoolean56) {
					local15.method2083();
				} else {
					Static109.aClass34_1.method1037(local15.anInt1266, local15.anInt1264, local15.anInt1265, local15.anInt1273, 60, local15, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)I")
	public static int method1773() {
		@Pc(5) int local5 = Static112.method2073(Static56.anInt1718, Static94.anInt2650, Static61.anInt1876);
		return local5 - Static7.anInt291 >= 800 || (Static43.aByteArrayArrayArray8[Static56.anInt1718][Static94.anInt2650 >> 7][Static61.anInt1876 >> 7] & 0x4) == 0 ? 3 : Static56.anInt1718;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V")
	public static void method1774() {
		aClass55_1115 = null;
		aClass55_1117 = null;
		aByteArray13 = null;
		anIntArray247 = null;
		aClass55_1116 = null;
		aClass3_7 = null;
		aClass55_1118 = null;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
	public static void method1775() {
		try {
			@Pc(6) Graphics local6 = Static32.aCanvas1.getGraphics();
			Static21.aClass21_5.method1442(0, local6, 4);
			Static64.aClass21_16.method1442(0, local6, 357);
			Static109.aClass21_26.method1442(722, local6, 4);
			Static6.aClass21_2.method1442(743, local6, 205);
			Static74.aClass21_15.method1442(0, local6, 0);
			Static23.aClass21_6.method1442(516, local6, 4);
			Static65.aClass21_17.method1442(516, local6, 205);
			Static6.aClass21_1.method1442(496, local6, 357);
			Static86.aClass21_19.method1442(0, local6, 338);
		} catch (@Pc(67) Exception local67) {
			Static32.aCanvas1.repaint();
		}
	}
}
