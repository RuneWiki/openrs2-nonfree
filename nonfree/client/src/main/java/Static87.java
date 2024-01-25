import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString23 = "";

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public static int method1416(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method1417() {
		Static539.aClass88_1.method6345();
		Static427.aClass134_1.method6091();
		Static153.aClient1.method835();
		Static34.aCanvas15.setBackground(Color.black);
		Static571.anInt9575 = -1;
		Static539.aClass88_1 = Static126.method1921(Static34.aCanvas15);
		Static427.aClass134_1 = Static33.method469(Static34.aCanvas15);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!dga;B)Lclient!cg;")
	public static Class50 method1419(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method6027();
		return new Class50(local7);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;Lclient!ta;IZ)V")
	public static void method1420(@OriginalArg(0) String arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(26) int local26 = Static340.aClass146_8.method3169(250, arg0, null);
		@Pc(35) int local35 = Static340.aClass146_8.method3175(arg0, null, 250) * 13;
		Static176.aClass121_5.C(6, 6, local26 + 8, local35 - -8, -16777216, 0);
		Static176.aClass121_5.method7127(6, 6, local26 + 4 + 4, 4 + 4 + local35, -1, 0);
		arg1.method7881(null, 1, local35, local26, arg0, 0, 1, 0, null, null, 10, -1, -1, 10);
		Static41.method573(local35 + 4 + 4, 6, 6, local26 + 4 + 4);
		if (arg2) {
			try {
				Static176.aClass121_5.method7128();
			} catch (@Pc(125) Exception_Sub1 local125) {
			}
		}
	}
}
