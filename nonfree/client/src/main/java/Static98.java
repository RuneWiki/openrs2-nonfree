import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_17 = new Class99();

	@OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
	public static int anInt2245 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
	public static void method2074(@OriginalArg(0) int arg0) {
		Static523.anInt8857 = arg0;
		Static239.anInt4818 = 2;
		if (Static291.aString59 == null) {
			Static75.method1357(35);
		} else {
			@Pc(29) Class5_Sub3 local29 = new Class5_Sub3(Static18.method598(Static307.method5029(Static291.aString59)));
			@Pc(33) long local33 = local29.method4172();
			Static386.aLong114 = local29.method4172();
			Static257.method4354(true, "", Static193.method3234(local33));
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!hn;IIIII)V")
	public static void method2075(@OriginalArg(1) Class15_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static75.method1355(arg0.anInt8493, arg1, 0, arg0.aByte91, arg0.anInt8492, arg2, arg3);
	}
}
