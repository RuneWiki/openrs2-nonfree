import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_41 = new Class119(6, -1);

	@OriginalMember(owner = "client!el", name = "g", descriptor = "[I")
	public static int[] anIntArray128 = new int[2];

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
	public static void method1682(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static138.method2174(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	public static void method1683(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 3);
		local8.method3244();
	}
}
