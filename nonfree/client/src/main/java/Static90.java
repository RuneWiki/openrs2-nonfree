import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public static int anInt1706;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[Lclient!qr;")
	public static final Class12_Sub1_Sub2_Sub2[] aClass12_Sub1_Sub2_Sub2Array1 = new Class12_Sub1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "[I")
	public static final int[] anIntArray225 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt1710 = 0;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
	public static void method1536() {
		Static48.aClass71_15 = null;
		Static142.aBoolean242 = false;
		Static48.anInt940 = 2;
		Static35.anInt745 = 1;
		Static261.anInt4643 = 0;
		Static328.anInt5775 = -1;
		Static238.anInt4359 = -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method1538() {
		Static291.aClass214_29.method5068();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
	public static void method1540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub1_Sub2 local13 = Static323.method4982(arg2, 4);
		local13.method410();
		local13.anInt343 = arg1;
		local13.anInt341 = arg3;
		local13.anInt348 = arg0;
	}
}
