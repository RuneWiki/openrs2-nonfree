import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!jf", name = "ub", descriptor = "Lclient!fb;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!jf", name = "rb", descriptor = "I")
	public static int anInt2109 = 0;

	@OriginalMember(owner = "client!jf", name = "tb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1258 = Static118.method2249("Ausw-=hlen");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1494(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static120.aClass53_1);
		arg0.removeFocusListener(Static120.aClass53_1);
		Static180.anInt3907 = -1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
	public static void method1495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg3) {
			Static206.method3277(arg1, arg2, arg3, arg0);
		} else if (arg2 - arg3 >= Static71.anInt1744 && arg3 + arg2 <= Static23.anInt685 && arg0 - arg4 >= Static206.anInt4385 && Static133.anInt3309 >= arg0 + arg4) {
			Static154.method2689(arg0, arg3, arg4, arg2, arg1);
		} else {
			Static114.method2107(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!sd;Z)[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] method1496(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		return Static68.method987(arg0, arg1) ? Static64.method1135() : null;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IBI)Z")
	public static boolean method1497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class1_Sub2_Sub13 local3 = Static5.method65(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local3.method1431(arg1);
	}
}
