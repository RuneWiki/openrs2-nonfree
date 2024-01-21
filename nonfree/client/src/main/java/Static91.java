import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!la;")
	public static Class17 aClass17_28;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!v;")
	private static Class76 aClass76_953 = Static134.method2017("Login limit exceeded)3");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_949 = aClass76_953;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!v;")
	private static Class76 aClass76_954 = Static134.method2017("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_950 = aClass76_954;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_951 = Static134.method2017("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_952 = Static134.method2017("Ausw-=hlen");

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt2121 = -1;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!vf;")
	public static Class78 aClass78_9 = new Class78();

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_955 = Static134.method2017("nav");

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public static int anInt2123 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	public static int method1482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) long local14 = (long) (arg1 + (arg0 << 16));
		return Static121.aClass4_Sub4_Sub16_1 != null && local14 == Static121.aClass4_Sub4_Sub16_1.aLong99 ? Static30.aClass4_Sub10_4.anInt931 * 99 / (Static30.aClass4_Sub10_4.aByteArray17.length - Static121.aClass4_Sub4_Sub16_1.aByte8) + 1 : 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method1483() {
		aClass76_950 = null;
		aClass76_952 = null;
		aClass76_955 = null;
		aClass76_953 = null;
		aClass78_9 = null;
		aClass17_28 = null;
		aClass76_954 = null;
		aClass76_949 = null;
		aClass76_951 = null;
	}
}
