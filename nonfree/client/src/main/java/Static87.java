import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt2049;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[Lclient!og;")
	public static Class86[] aClass86Array2;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_104 = new Class123(92, -1);

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_33 = new Class92(27, 1);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!ci;")
	public static final Class36 aClass36_3 = new Class36("runescape", 0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Lclient!ak;")
	public static Class10 method1590(@OriginalArg(1) int arg0) {
		@Pc(8) Class10[] local8 = Static6.method205();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (arg0 == local8[local15].anInt357) {
				return local8[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method1591() {
		Static350.method5233();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static209.aClass210Array2[local13].method4714();
		}
		Static245.method3818();
		Static225.method3368();
		System.gc();
	}
}
