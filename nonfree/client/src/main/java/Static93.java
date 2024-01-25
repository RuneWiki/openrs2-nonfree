import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "Lclient!ph;")
	public static Class187 aClass187_133;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
	public static int anInt7577;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
	public static int anInt7570 = 0;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "J")
	public static long aLong265 = 0L;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "[I")
	public static final int[] anIntArray749 = new int[32];

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "[I")
	public static final int[] anIntArray750 = new int[4];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6042(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static310.method4308(Static128.aClass27_102);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg0));
			Static337.aClass10_Sub8_Sub2_2.method2465(arg0);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)I")
	public static int method6043(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
