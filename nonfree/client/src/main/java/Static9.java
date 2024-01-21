import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "mc", descriptor = "I")
	public static int anInt1876;

	@OriginalMember(owner = "client!bd", name = "oc", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!bd", name = "yc", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_18;

	@OriginalMember(owner = "client!bd", name = "xb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_24 = new Class34(500);

	@OriginalMember(owner = "client!bd", name = "qc", descriptor = "Lclient!v;")
	private static Class62 aClass62_816 = Static45.method753("Loaded textures");

	@OriginalMember(owner = "client!bd", name = "Nb", descriptor = "Lclient!v;")
	public static Class62 aClass62_811 = aClass62_816;

	@OriginalMember(owner = "client!bd", name = "Rb", descriptor = "Lclient!v;")
	public static Class62 aClass62_812 = Static45.method753("l");

	@OriginalMember(owner = "client!bd", name = "gc", descriptor = "Lclient!v;")
	public static Class62 aClass62_813 = Static45.method753("mod_icons");

	@OriginalMember(owner = "client!bd", name = "kc", descriptor = "Lclient!v;")
	public static Class62 aClass62_814 = Static45.method753("Angreifen");

	@OriginalMember(owner = "client!bd", name = "nc", descriptor = "Lclient!v;")
	public static Class62 aClass62_815 = Static45.method753("gleiten:");

	@OriginalMember(owner = "client!bd", name = "wc", descriptor = "I")
	public static final int anInt1883 = 3353893;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
	public static void method1149() {
		Static21.aClass34_9.method762();
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V")
	public static void method1152() {
		anIntArray198 = null;
		aClass3_Sub1_Sub1_Sub1_18 = null;
		aClass62_815 = null;
		aClass62_813 = null;
		aClass34_24 = null;
		aClass62_814 = null;
		aClass62_816 = null;
		aClass62_812 = null;
		aClass62_811 = null;
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V")
	public static void method1155() {
		@Pc(7) Class29 local7 = Static12.aClass29_1;
		synchronized (Static12.aClass29_1) {
			Static27.anInt824 = Static44.anInt1226;
			@Pc(22) int local22;
			if (Static14.anInt544 >= 0) {
				while (Static72.anInt1950 != Static14.anInt544) {
					local22 = Static71.anIntArray202[Static72.anInt1950];
					Static72.anInt1950 = Static72.anInt1950 + 1 & 0x7F;
					if (local22 < 0) {
						Static109.aBooleanArray13[~local22] = false;
					} else {
						Static109.aBooleanArray13[local22] = true;
					}
				}
			} else {
				for (local22 = 0; local22 < 112; local22++) {
					Static109.aBooleanArray13[local22] = false;
				}
				Static14.anInt544 = Static72.anInt1950;
			}
			Static44.anInt1226 = Static40.anInt1168;
		}
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "(I)V")
	public static void method1156() {
		if (Static55.aClass38_1 == null) {
			return;
		}
		if (Static30.anInt974 < 0) {
			if (Static22.anInt745 > 0) {
				Static22.anInt745--;
				if (Static22.anInt745 == 0) {
					if (Static10.aByteArray20 == null) {
						Static55.aClass38_1.method1586(256);
					} else {
						Static55.aClass38_1.method1586(Static59.anInt1620);
						Static30.anInt974 = Static59.anInt1620;
						Static55.aClass38_1.method1578(Static44.aBoolean71, Static59.anInt1620, Static10.aByteArray20);
						Static10.aByteArray20 = null;
					}
					Static68.anInt1892 = 0;
				}
			}
		} else if (Static22.anInt745 > 0) {
			Static68.anInt1892 += Static78.anInt2074;
			Static55.aClass38_1.method1584(Static30.anInt974, Static68.anInt1892);
			Static22.anInt745--;
			if (Static22.anInt745 == 0) {
				Static55.aClass38_1.method1581();
				Static22.anInt745 = 20;
				Static30.anInt974 = -1;
			}
		}
		Static55.aClass38_1.method1579();
	}
}
