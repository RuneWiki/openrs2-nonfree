import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!kg", name = "Gb", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!kg", name = "Ib", descriptor = "Lclient!je;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!kg", name = "Mb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_868 = Static51.method932("Clientscript error in: ");

	@OriginalMember(owner = "client!kg", name = "Pb", descriptor = "[I")
	public static int[] anIntArray223 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!kg", name = "Rb", descriptor = "I")
	public static int anInt2091 = -1;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "(I)V")
	public static void method1493() {
		anIntArray223 = null;
		aString1 = null;
		aClass10_868 = null;
	}

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "(I)V")
	public static void method1497() {
		if (Static156.aClass84_1 != null) {
			@Pc(7) Class84 local7 = Static156.aClass84_1;
			synchronized (Static156.aClass84_1) {
				Static156.aClass84_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!cd;Lclient!cd;BLclient!kh;)[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] method1499(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(13) int local13 = arg2.method1026(arg0);
		@Pc(19) int local19 = arg2.method1020(local13, arg1);
		return Static108.method1730(arg2, local13, local19);
	}
}
