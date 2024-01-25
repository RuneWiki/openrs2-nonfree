import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!co", name = "v", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_9 = new Class382(1, 2, 2, 0);

	@OriginalMember(owner = "client!co", name = "L", descriptor = "F")
	public static float aFloat12 = 1.0F;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_36 = new Class160(35, -1);

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
	public static void method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class14_Sub2_Sub9 local19 = Static499.method7527((long) arg0, 11);
		local19.method4004();
		local19.anInt4592 = arg2;
		local19.anInt4595 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)Z")
	public static boolean method1422(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
