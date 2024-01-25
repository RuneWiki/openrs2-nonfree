import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "[Lclient!qg;")
	public static Class87[] aClass87Array5;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Lclient!ts;")
	public static Class239 aClass239_2 = null;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_103 = new Class123(28, 7);

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method1587() {
		Static375.method5606();
		Static47.aClass66_3 = null;
		Static30.aClass82_1 = null;
		Static418.aClass219ArrayArray1 = null;
		Static259.aClass82_4 = null;
		Static58.aClass82_3 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method1589(@OriginalArg(0) int arg0) {
		if (!Static88.method4151(arg0)) {
			return;
		}
		@Pc(14) Class239[] local14 = Static35.aClass239ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class239 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt6934 = 0;
				local26.anInt6929 = 1;
				local26.anInt6932 = 0;
			}
		}
	}
}
