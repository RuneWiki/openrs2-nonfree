import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Lclient!np;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lclient!em;")
	public static final Class83 aClass83_44 = new Class83(89, 11);

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1361(@OriginalArg(0) String arg0) {
		if (Static272.aClass254Array1 != null) {
			@Pc(20) Class1_Sub9 local20 = Static123.method2194(Static469.aClass235_2, Static167.aClass208_38);
			local20.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(arg0));
			local20.aClass1_Sub3_Sub1_1.method7920(arg0);
			Static42.method746(local20);
		}
	}
}
