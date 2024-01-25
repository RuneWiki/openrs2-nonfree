import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "[S")
	public static short[] aShortArray43;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_29 = new Class154(64);

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(ZI)I")
	public static int method1552(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)V")
	public static void method1553(@OriginalArg(0) int arg0) {
		Static94.anInt2087 = arg0;
		@Pc(7) Class154 local7 = Static36.aClass154_8;
		synchronized (Static36.aClass154_8) {
			Static36.aClass154_8.method4219();
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
	public static void method1554() {
		Static104.anInt6829 = 0;
		Static52.anInt1189 = 0;
		Static33.method525();
		Static306.method5195();
		Static54.method1001();
		Static260.method4432();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static52.anInt1189; local19++) {
			local25 = Static19.anIntArray539[local19];
			if (Static253.aClass2_Sub2_Sub1_Sub1Array1[local25].anInt6515 != Static342.anInt6706) {
				if (Static253.aClass2_Sub2_Sub1_Sub1Array1[local25].anInt730 > 0) {
					Static354.method4052(Static253.aClass2_Sub2_Sub1_Sub1Array1[local25]);
				}
				Static253.aClass2_Sub2_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static302.anInt6099 != Static200.aClass4_Sub7_Sub1_2.anInt2667) {
			throw new RuntimeException("gpp1 pos:" + Static200.aClass4_Sub7_Sub1_2.anInt2667 + " psize:" + Static302.anInt6099);
		}
		for (local25 = 0; local25 < Static156.anInt3506; local25++) {
			if (Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static156.anInt3506);
			}
		}
	}
}
