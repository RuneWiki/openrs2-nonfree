import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "Lclient!mq;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	public static int anInt1669;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Lclient!jd;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_21 = new Class341(48, -1);

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "Lclient!in;")
	public static final Class169 aClass169_49 = new Class169(35, 6);

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "Lclient!bw;")
	public static final Class42 aClass42_1 = new Class42(16);

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
	public static int anInt1670 = 0;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "[I")
	public static final int[] anIntArray83 = new int[3];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1580(@OriginalArg(1) String arg0) {
		return Static413.method6771(sw.class, arg0);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!td;Z)V")
	public static void method1582(@OriginalArg(0) Class2_Sub1_Sub19 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method9377();
		for (@Pc(15) Class2_Sub1_Sub19 local15 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local15 != null; local15 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
			if (Static307.method5031(local15.method8591(), arg0.method8591())) {
				Static653.method9593(local15, arg0);
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static112.aClass279_6.method7292(arg0);
		}
	}
}
