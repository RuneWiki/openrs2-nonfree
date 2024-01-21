import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!cf;")
	public static Class16 aClass16_7;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt2230;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array16 = new Class39[1000];

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public static int anInt2227 = 0;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1121 = Static28.method504("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1122 = Static28.method504("null");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)[B")
	public static byte[] method1642(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local6];
		Static134.method1168(arg0, 0, local17, 0, local6);
		return local17;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIZ)Lclient!ja;")
	public static Class39 method1643(@OriginalArg(1) int arg0) {
		return Static40.method669(arg0, true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)I")
	public static int method1644(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!pd;Lclient!ja;Lclient!ja;I)[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] method1645(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class39 arg2) {
		@Pc(13) int local13 = arg0.method484(arg2);
		@Pc(19) int local19 = arg0.method475(arg1, local13);
		return Static67.method1164(local19, local13, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1646() {
		if (Static11.aClass65_1 != null) {
			@Pc(16) Class65 local16 = Static11.aClass65_1;
			synchronized (Static11.aClass65_1) {
				Static11.aClass65_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1647() {
		aClass39Array16 = null;
		aClass16_7 = null;
		aClass39_1122 = null;
		aClass39_1121 = null;
	}
}
