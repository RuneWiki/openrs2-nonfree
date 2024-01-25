import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dca", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "Lclient!oaa;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!dca", name = "v", descriptor = "Lclient!or;")
	public static Class260 aClass260_7 = null;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!or;BLclient!or;)V")
	public static void method1726(@OriginalArg(0) Class260 arg0, @OriginalArg(2) Class260 arg1) {
		@Pc(12) Class3_Sub34 local12 = Static172.method3123(Static163.aClass375_1, Static587.aClass218_140);
		local12.aClass3_Sub25_Sub1_2.method8588(arg0.anInt6930);
		local12.aClass3_Sub25_Sub1_2.method8597(arg1.anInt6964);
		local12.aClass3_Sub25_Sub1_2.method8634(arg1.anInt6930);
		local12.aClass3_Sub25_Sub1_2.method8649(arg0.anInt6985);
		local12.aClass3_Sub25_Sub1_2.method8616(arg0.anInt6964);
		local12.aClass3_Sub25_Sub1_2.method8596(arg1.anInt6985);
		Static441.method6275(local12);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/Object;Lclient!qn;I)V")
	public static void method1728(@OriginalArg(0) Object arg0, @OriginalArg(1) Class291 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static373.method5403(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(42) Exception local42) {
		}
	}
}
