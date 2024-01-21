import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!oe;")
	public static Class58 aClass58_36 = new Class58(32);

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!e;")
	public static Class16 aClass16_46 = new Class16(64);

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public static int anInt1345 = 0;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!u;")
	private static Class74 aClass74_939 = Static72.method1077("Create a free account");

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_940 = aClass74_939;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_941 = Static72.method1077("Handel)4Duell");

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Z")
	public static boolean aBoolean50 = false;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_942 = Static72.method1077("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_943 = Static72.method1077("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method924() {
		aClass74_942 = null;
		aClass74_939 = null;
		aClass74_941 = null;
		aClass74_940 = null;
		aClass58_36 = null;
		aClass16_46 = null;
		aClass74_943 = null;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public static void method926() {
		Static12.aClass2_Sub16_Sub2_1.method1798();
		Static62.aClass26_12 = null;
		Static9.anInt300 = 1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method927() {
		aClass58_36 = new Class58(32);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ta;")
	public static RuntimeException_Sub1 method928(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString5 = local8.aString5 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(III)Z")
	public static boolean method929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub2_Sub14 local7 = Static2.method19(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method1553(arg1);
	}
}
