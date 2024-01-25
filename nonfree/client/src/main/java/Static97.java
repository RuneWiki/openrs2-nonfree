import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "[I")
	public static int[] anIntArray130;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Z")
	public static boolean aBoolean149;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!ts;")
	public static Class239 aClass239_3 = null;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	public static int anInt2205 = -1;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_7 = new Class44(50);

	@OriginalMember(owner = "client!er", name = "j", descriptor = "I")
	public static int anInt2208 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
	public static void method1808() {
		Static125.aClass44_12.method1352(50);
		aClass44_7.method1352(50);
		Static445.aClass44_59.method1352(50);
		Static51.aClass44_4.method1352(50);
		Static140.aClass44_14.method1352(50);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ts;III)V")
	public static void method1810(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static373.aClass239_11 = arg0;
		Static147.anInt2995 = arg1;
		Static181.anInt3576 = arg2;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method1811() {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static212.method3218(0, 15);
		local12.method3084();
	}
}
