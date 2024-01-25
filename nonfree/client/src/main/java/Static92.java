import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!et", name = "z", descriptor = "Lclient!oj;")
	public static Class48 aClass48_5;

	@OriginalMember(owner = "client!et", name = "A", descriptor = "I")
	public static int anInt1974;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_48 = new Class208(1, 2);

	@OriginalMember(owner = "client!et", name = "s", descriptor = "I")
	public static int anInt1971 = -1;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "Z")
	public static boolean aBoolean145 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!jq;")
	public static Class77 method1557(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class77_Sub1");
			@Pc(15) Class77 local15 = (Class77) local11.getDeclaredConstructor().newInstance();
			local15.method5040(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class77_Sub2 local26 = new Class77_Sub2();
			local26.method5040(arg0);
			return local26;
		}
	}
}
