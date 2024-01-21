import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!g;")
	public static Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_887 = Static161.method2971("<col=c0ff00>");

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[Lclient!be;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array1 = new Class1_Sub2_Sub2_Sub1[4];

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_888 = Static161.method2971("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1992() {
		aClass23_1 = null;
		aClass13_887 = null;
		aClass1_Sub2_Sub2_Sub1Array1 = null;
		aClass13_888 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)J")
	public static long method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		return local7 == null || local7.aClass7_1 == null ? 0L : local7.aClass7_1.aLong33;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lclient!ch;")
	public static Class1_Sub2_Sub4 method1996(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub4 local15 = (Class1_Sub2_Sub4) Static166.aClass47_29.method1999((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static8.aClass4_9.method2243(16, arg0);
		local15 = new Class1_Sub2_Sub4();
		if (local25 != null) {
			local15.method769(new Class1_Sub8(local25));
		}
		Static166.aClass47_29.method1998(local15, (long) arg0);
		return local15;
	}
}
