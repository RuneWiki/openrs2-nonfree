import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
	public static boolean aBoolean10;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!mo;")
	public static Class143 aClass143_8;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!rm;")
	public static final Class178 aClass178_2 = new Class178(64);

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt209 = 0;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "[I")
	public static int[] anIntArray12 = new int[2];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V")
	public static void method221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(5, arg0);
		local8.method3540();
		local8.anInt3805 = arg1;
	}
}
