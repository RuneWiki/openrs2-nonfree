import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public static int anInt1680;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "Lclient!cl;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Lclient!si;")
	public static Class3_Sub5 method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass3_Sub5_1 == null ? null : local7.aClass3_Sub5_1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZI)V")
	public static void method1567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static8.aClass173_Sub1_1.anInt4406 != 0 && arg2 != 0 && Static117.anInt2050 < 50 && arg0 != -1) {
			Static127.aClass197Array1[Static117.anInt2050++] = new Class197((byte) 2, arg0, arg2, arg1, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method1568() {
		@Pc(5) Class220 local5 = Static131.aClass220_15;
		synchronized (Static131.aClass220_15) {
			Static131.aClass220_15.method4999();
		}
	}
}
