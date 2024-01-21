import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Lclient!kc;")
	public static Class8_Sub12 aClass8_Sub12_1;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_2;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "[I")
	public static int[] anIntArray21;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!ic;")
	private static Class34 aClass34_114 = Static56.method816("Unable to find ");

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_115 = Static56.method816(": ");

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_116 = aClass34_114;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	public static int anInt189 = 1;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_117 = Static56.method816("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method98() {
		aClass14_Sub1_2 = null;
		aClass34_116 = null;
		aClass34_114 = null;
		aClass34_117 = null;
		aClass8_Sub12_1 = null;
		aClass34_115 = null;
		anIntArray21 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	public static void method99(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static16.anInt393 == 1) {
			Static127.aClass8_Sub1_Sub3_Sub3Array40[Static133.anInt3067 / 100].method1587(Static132.anInt2817 - 8, Static81.anInt1954 - 8);
		}
		if (Static16.anInt393 == 2) {
			Static127.aClass8_Sub1_Sub3_Sub3Array40[Static133.anInt3067 / 100 + 4].method1587(Static132.anInt2817 - 8, Static81.anInt1954 + -8);
		}
		Static96.method333();
		if (!Static1.aBoolean1) {
			return;
		}
		@Pc(47) int local47 = arg3 + 512 - 5;
		@Pc(51) int local51 = arg2 + 20;
		Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3.method1742(Static44.method669(new Class34[] { Static68.aClass34_776, Static44.method672(Static78.anInt1847) }), local47, local51, 16776960, -1);
		@Pc(75) Runtime local75 = Runtime.getRuntime();
		@Pc(77) int local77 = 16776960;
		@Pc(78) int local78 = local51 + 15;
		@Pc(88) int local88 = (int) ((local75.totalMemory() - local75.freeMemory()) / 1024L);
		if (local88 > 32768 && Static108.aBoolean98) {
			local77 = 16711680;
		}
		if (local88 > 65536 && !Static108.aBoolean98) {
			local77 = 16711680;
		}
		Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3.method1742(Static44.method669(new Class34[] { Static72.aClass34_814, Static44.method672(local88), Static107.aClass34_1150 }), local47, local78, local77, -1);
		local51 = local78 + 15;
	}
}
