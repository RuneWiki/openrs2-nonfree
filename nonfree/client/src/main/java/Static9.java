import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_12 = new Class123(81, 2);

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_13 = new Class123(79, 1);

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
	public static int anInt82 = -60;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!bc;")
	public static Class3_Sub3 method92(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub3_Sub1");
			@Pc(15) Class3_Sub3 local15 = (Class3_Sub3) local6.getDeclaredConstructor().newInstance();
			local15.method2651(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class3_Sub3_Sub2 local26 = new Class3_Sub3_Sub2();
			local26.method2651(arg0);
			return local26;
		}
	}
}
