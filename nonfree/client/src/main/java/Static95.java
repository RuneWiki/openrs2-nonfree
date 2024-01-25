import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public static void method1417() {
		Static386.aClass2_Sub8_Sub2_6.method3327();
		Static378.aClass171_98 = null;
		Static452.anInt951 = 1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!pb;Ljava/awt/Frame;)V")
	public static void method1419(@OriginalArg(1) Class194 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class136 local10 = arg0.method4399(arg1);
			while (local10.anInt3418 == 0) {
				Static167.method6157(10L);
			}
			if (local10.anInt3418 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static167.method6157(100L);
		}
	}
}
