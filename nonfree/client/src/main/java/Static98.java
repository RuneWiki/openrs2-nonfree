import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_7;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!kc;")
	public static Class11 aClass11_8;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_4;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_393 = Static56.method1206("null");

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
	public static int anInt1186 = 0;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_394 = Static56.method1206("M");

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
	public static int anInt1189 = -1;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "Lclient!fe;")
	public static Class17 aClass17_45 = new Class17(64);

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!lc;")
	public static Class31 aClass31_395 = Static56.method1206("You need to set*6nnew contact details)3");

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
	public static void method801() {
		Static10.aBoolean28 = false;
		Static107.aBoolean156 = false;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
	public static int method806(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static37.anIntArray226[arg0];
		@Pc(11) int local11 = (local3 * Static57.anInt2683 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	public static void method807() {
		aClass17_45 = null;
		aClass31_395 = null;
		anIntArray144 = null;
		aClass31_394 = null;
		Class1_Sub1.anIntArray143 = null;
		aClass2_Sub1_Sub3_Sub3_4 = null;
		aClass31_393 = null;
		aClass2_Sub1_Sub3_Sub1_7 = null;
		aClass11_8 = null;
	}
}
