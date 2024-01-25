import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "Lclient!cc;")
	public static Class39 aClass39_1;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString37 = null;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_35 = new Class96("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	public static int anInt1882 = -1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method1519(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 3);
		local8.method32();
		local8.aString1 = arg1;
	}
}
