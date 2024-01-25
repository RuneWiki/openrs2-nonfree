import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fi", name = "Ub", descriptor = "Lclient!bg;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!fi", name = "Vb", descriptor = "I")
	public static int anInt2007;

	@OriginalMember(owner = "client!fi", name = "Ob", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_33 = new Class93("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!fi", name = "Pb", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fi", name = "Qb", descriptor = "[I")
	public static final int[] anIntArray202 = new int[] { 0, 0, 8, 0, 6, 10, 0, 0, 6, 0, 0, 7, 3, 7, 0, 6, 0, 0, 0, 0, 0, 0, 0, 14, 3, 0, 2, 0, 0, 0, 12, 17, 0, 12, 0, -2, 6, 0, 4, 0, 5, 0, 6, 0, 0, 0, 6, 0, 8, -1, 6, -1, 0, 6, 0, -1, 0, 0, -2, -2, 1, -2, -1, 0, 0, 0, 0, 6, 0, -1, 0, 0, 0, -1, 0, 0, 0, 1, 2, 0, 0, 3, 2, -1, 8, -1, 0, 0, 0, 8, 0, 0, 12, 0, 0, 0, 0, 0, 0, 8, 10, -1, 4, 0, 20, 0, 0, 8, 0, 0, -2, 0, 5, 10, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 3, 0, 0, -1, 0, 1, 3, 0, 0, -2, 4, 0, 14, 8, 0, 0, 10, 0, 8, 0, 12, 11, 0, 0, 6, 0, -2, 0, 0, 0, 2, 0, 6, 8, 2, 0, 0, 2, -2, 0, 0, -1, 0, 0, 0, 0, 0, -2, 0, 9, 15, 0, 8, 0, 0, 0, 0, 0, 0, 0, 3, 0, -1, -2, 0, 12, 2, -1, 7, 0, 0, -1, 15, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -2, 5, 7, 3, 0, 28, -2, 0, 0, 0, 0, 0, -1, 0, 0, 3, 1, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 1, 0, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!fi", name = "Wb", descriptor = "Z")
	public static boolean aBoolean169 = true;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)I")
	public static int method2047(@OriginalArg(0) boolean arg0) {
		@Pc(16) long local16 = Static51.method1197();
		for (@Pc(28) Class2_Sub30 local28 = arg0 ? (Class2_Sub30) Static23.aClass199_2.method5747() : (Class2_Sub30) Static23.aClass199_2.method5753(); local28 != null; local28 = (Class2_Sub30) Static23.aClass199_2.method5753()) {
			if (local16 > (local28.aLong125 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local28.aLong125 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local28.aLong213;
					Static133.anIntArray238[local59] = Static147.anIntArray22[local59];
					local28.method5945();
					return local59;
				}
				local28.method5945();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V")
	public static void method2054(@OriginalArg(1) boolean arg0) {
		Static25.aBoolean123 = arg0;
		Static229.aBoolean220 = !Static257.method4680();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2055(@OriginalArg(0) String arg0) {
		@Pc(16) String local16 = Static101.method2255(Static10.method376(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	public static void method2057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(14, arg0);
		local8.method5537();
		local8.anInt6362 = arg1;
	}
}
