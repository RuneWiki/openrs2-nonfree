import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!et;")
	public static Class3_Sub4_Sub8 aClass3_Sub4_Sub8_6;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIB)V")
	public static void method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= Static452.anInt7626 && arg3 <= Static82.anInt3956) {
			@Pc(15) int local15 = Static108.method1849(Static341.anInt5789, arg0, Static309.anInt5495);
			@Pc(21) int local21 = Static108.method1849(Static341.anInt5789, arg2, Static309.anInt5495);
			Static415.method5323(local15, arg3, arg1, local21);
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V")
	public static void method4803() {
		Static55.method1138();
		Static328.aClass23_5 = null;
		Static8.aClass23_7 = null;
		Static77.aClass163ArrayArray1 = null;
		Static347.aClass23_6 = null;
		Static166.aClass172_6 = null;
	}
}
