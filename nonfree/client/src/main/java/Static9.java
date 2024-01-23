import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
	public static int anInt185;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
	public static int anInt188 = 0;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "[Lclient!dd;")
	public static Class31[] aClass31Array1 = new Class31[29];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cj;")
	public static RuntimeException_Sub1 method148(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString29 = local8.aString29 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)V")
	public static void method149() {
		Static15.aClass172_4.method4349(5);
		Static80.aClass172_13.method4349(5);
		Static92.aClass172_16.method4349(5);
	}
}
