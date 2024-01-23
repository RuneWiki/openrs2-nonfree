import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	public static int anInt2040;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	public static int anInt2041;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	public static int anInt2044;

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!cg;II)Lclient!vm;")
	public static Class1_Sub2_Sub21 method1593(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(40) Class1_Sub2_Sub21 local40 = new Class1_Sub2_Sub21(arg1, arg0.method2629(), arg0.method2629(), arg0.method2643(), arg0.method2643(), arg0.method2690() == 1, arg0.method2690());
		@Pc(46) int local46 = arg0.method2690();
		for (@Pc(48) int local48 = 0; local48 < local46; local48++) {
			local40.aClass61_30.method1839(new Class1_Sub13(arg0.method2690(), arg0.method2690(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691(), arg0.method2691()));
		}
		local40.method4285();
		return local40;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method1595() {
		Static133.anIntArray266 = null;
		Static268.aByteArrayArray13 = null;
		Static289.anIntArray543 = null;
		Static31.anIntArray78 = null;
		Static268.anIntArray461 = null;
		Static44.anIntArray97 = null;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
	public static void method1598() {
		Static201.aClass135_22.method3317();
		Static47.aClass135_1.method3317();
	}
}
