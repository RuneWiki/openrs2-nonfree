import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!kf", name = "mb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_15 = new Class63(50);

	@OriginalMember(owner = "client!kf", name = "Gb", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!kf", name = "Nb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_16 = new Class63(30);

	@OriginalMember(owner = "client!kf", name = "Ob", descriptor = "I")
	public static int anInt2455 = 0;

	@OriginalMember(owner = "client!kf", name = "Pb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_761 = Static170.method3101(" )2>");

	@OriginalMember(owner = "client!kf", name = "Sb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_763 = Static170.method3101("yellow:");

	@OriginalMember(owner = "client!kf", name = "Qb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_762 = aClass28_763;

	@OriginalMember(owner = "client!kf", name = "Rb", descriptor = "[I")
	public static int[] anIntArray410 = new int[5];

	@OriginalMember(owner = "client!kf", name = "Tb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_764 = aClass28_763;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Z")
	public static boolean method1906() {
		return Static8.anInt1209 == 0 ? Static156.aClass3_Sub3_Sub2_2.method1908() : true;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)V")
	public static void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass55_1 = null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
	public static void method1922() {
		aClass63_16 = null;
		aClass28_761 = null;
		anIntArray394 = null;
		aClass28_764 = null;
		aClass28_763 = null;
		anIntArray410 = null;
		aClass63_15 = null;
		aClass28_762 = null;
	}
}
