import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "Lclient!rp;")
	public static Class311 aClass311_1;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "Lclient!gq;")
	public static final Class149 aClass149_5 = new Class149();

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString26 = null;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	public static int anInt1451 = -1;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;B)Lclient!hv;")
	public static Class89 method1308(@OriginalArg(0) Component arg0) {
		return new Class89_Sub1(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 3);
		local9.method2687();
		local9.aString48 = arg1;
	}
}
