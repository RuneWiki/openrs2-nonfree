import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_2 = new Class223(32);

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public static int anInt216 = 999999;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject1 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!n;II)V")
	public static void method169(@OriginalArg(0) int arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(3) int arg2) {
		if (Static317.aClass225_54 != null || Static49.aBoolean36 || (arg1 == null || Static164.method2975(arg1) == null)) {
			return;
		}
		Static317.aClass225_54 = arg1;
		Static167.aClass225_16 = Static164.method2975(arg1);
		Static323.anInt6277 = arg0;
		Static453.anInt8515 = 0;
		Static255.anInt4672 = arg2;
		Static211.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIB)Lclient!eba;")
	public static Class4_Sub14 method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub14 local5 = null;
		if (arg1 == 0) {
			local5 = Static196.method3380(Static17.aClass159_1, Static120.aClass173_39);
		}
		if (arg1 == 1) {
			local5 = Static196.method3380(Static17.aClass159_1, Static519.aClass173_113);
		}
		local5.aClass4_Sub11_Sub1_3.method4957(Static584.aClass154_1.method3569(82) ? 1 : 0);
		local5.aClass4_Sub11_Sub1_3.method4902(arg0 + Static552.anInt9805);
		local5.aClass4_Sub11_Sub1_3.method4937(arg2 + Static254.anInt4667);
		Static8.anInt182 = arg2;
		Static582.anInt10107 = arg0;
		Static569.aBoolean704 = false;
		Static224.method3666();
		return local5;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method172(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static102.method5285(arg0, arg1, arg0.length - 1, 0);
	}
}
