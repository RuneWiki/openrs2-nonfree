import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "Lclient!vb;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "[I")
	public static final int[] anIntArray126 = new int[50];

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_6 = new Class14();

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
	public static int anInt1642 = 0;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "[I")
	public static final int[] anIntArray127 = new int[13];

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray3 = new int[2][][];

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "[I")
	public static final int[] anIntArray128 = new int[14];

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
	public static void method1384() {
		for (@Pc(10) Class1_Sub2_Sub9 local10 = (Class1_Sub2_Sub9) Static35.aClass14_2.method302(); local10 != null; local10 = (Class1_Sub2_Sub9) Static35.aClass14_2.method313()) {
			@Pc(15) Class10_Sub1_Sub5 local15 = local10.aClass10_Sub1_Sub5_1;
			if (Static127.anInt2487 != local15.aByte73 || local15.aBoolean554) {
				local10.method5796();
				local15.method5838();
			} else if (local15.anInt6750 <= Static282.anInt3516) {
				local15.method5839(Static41.anInt1126);
				if (local15.aBoolean554) {
					local10.method5796();
				} else {
					Static189.method5292(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)Lclient!ba;")
	public static Class17 method1386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class17 local7 = new Class17();
		local7.anInt383 = arg1 + 5 + 1;
		local7.anInt365 = -1;
		local7.anInt370 = -1;
		local7.anInt360 = arg0 + 6;
		local7.anIntArrayArray5 = new int[local7.anInt383][local7.anInt360];
		local7.method333();
		return local7;
	}
}
