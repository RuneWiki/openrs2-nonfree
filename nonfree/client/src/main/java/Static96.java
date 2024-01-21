import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!nd;")
	public static Class59 aClass59_17 = new Class59(64);

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "Lclient!ka;")
	public static Class1_Sub8 aClass1_Sub8_3 = new Class1_Sub8(new byte[5000]);

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
	public static int anInt2113 = 0;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "Lclient!tg;")
	private static Class81 aClass81_741 = Static120.method2057("Prepared visibility map");

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_740 = aClass81_741;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "Lclient!tg;")
	private static Class81 aClass81_742 = Static120.method2057("Loaded interfaces");

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_743 = Static120.method2057("rot:");

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
	public static volatile int anInt2114 = -1;

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_744 = aClass81_742;

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_745 = Static120.method2057("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)I")
	public static int method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub2_Sub2_Sub1.anIntArray33[arg0 * 1024 / arg3] >> 1;
		return (arg1 * (65536 - local21) >> 16) + (arg2 * local21 >> 16);
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
	public static void method1615() {
		aClass81_742 = null;
		aClass81_740 = null;
		aClass81_743 = null;
		aClass81_745 = null;
		aClass59_17 = null;
		aClass1_Sub8_3 = null;
		aClass81_744 = null;
		aClass81_741 = null;
	}
}
