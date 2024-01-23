import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lclient!vf;")
	public static Class1_Sub26 aClass1_Sub26_2;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	public static int anInt1960 = 0;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	public static int anInt1961 = 127;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!sc;")
	public static Class107 aClass107_561 = Static231.method3737(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public static int anInt1965 = -1;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Z")
	public static boolean method1530() {
		@Pc(5) Class87 local5 = Static213.aClass87_1;
		synchronized (Static213.aClass87_1) {
			if (Static65.anInt1536 == Static179.anInt3928) {
				return false;
			} else {
				Static80.anInt1768 = Static89.anIntArray199[Static179.anInt3928];
				Static141.anInt3118 = Static152.anIntArray295[Static179.anInt3928];
				Static179.anInt3928 = Static179.anInt3928 + 1 & 0x7F;
				return true;
			}
		}
	}
}
