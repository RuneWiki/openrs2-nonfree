import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "Lclient!ts;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "S")
	public static short aShort37 = 1;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
	public static int anInt1810 = -1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method1899(@OriginalArg(0) Class191 arg0) {
		Static105.aClass191_69 = arg0;
		Static282.anInt5704 = Static105.aClass191_69.method5443(4);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)Lclient!sr;")
	public static Class186 method1900(@OriginalArg(0) int arg0) {
		@Pc(5) Class119 local5 = Static282.aClass119_171;
		@Pc(14) Class186 local14;
		synchronized (Static282.aClass119_171) {
			local14 = (Class186) Static282.aClass119_171.method3311((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static23.aClass191_14.method5459(Static325.method5706(arg0), Static335.method5805(arg0));
		local14 = new Class186();
		local14.anInt5943 = arg0;
		if (local34 != null) {
			local14.method5214(new Class2_Sub10(local34));
		}
		local14.method5213();
		@Pc(63) Class119 local63 = Static282.aClass119_171;
		synchronized (Static282.aClass119_171) {
			Static282.aClass119_171.method3308(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
	public static void method1901() {
		Static74.aClass2_Sub10_Sub1_2.method2049(94);
		Static74.aClass2_Sub10_Sub1_2.method4430(0);
	}
}
