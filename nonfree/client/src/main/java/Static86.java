import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array5;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
	public static final int[] anIntArray181 = new int[100];

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lclient!sf;")
	public static final Class90[] aClass90Array1 = new Class90[50];

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt1878 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!eh;II)Lclient!li;")
	public static Class2_Sub18 method1509(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method853(arg1);
		return local8 == null ? null : new Class2_Sub18(local8);
	}
}
