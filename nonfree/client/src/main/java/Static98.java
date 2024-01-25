import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString131;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!en;")
	public static Class59 aClass59_3;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_42;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt2184;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt2185;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array9;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "[S")
	public static short[] aShortArray18;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public static int anInt2181 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2008(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!ac;)V")
	public static void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		Static130.aClass3Array2[arg0] = arg1;
	}
}
