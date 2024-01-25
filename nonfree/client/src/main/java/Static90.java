import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	public static int anInt4331;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString252 = " is already on your ignore list.";

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "Z")
	public static boolean aBoolean316 = true;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "S")
	public static short aShort53 = 205;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	public static final int anInt4334 = 0;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "[I")
	public static final int[] anIntArray308 = new int[100];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public static void method3835() {
		@Pc(1) Class66 local1 = Static342.aClass66_108;
		synchronized (Static342.aClass66_108) {
			Static342.aClass66_108.method1944(5);
		}
		local1 = Static237.aClass66_81;
		synchronized (Static237.aClass66_81) {
			Static237.aClass66_81.method1944(5);
		}
		@Pc(40) Class109 local40 = Static250.aClass109_1;
		synchronized (Static250.aClass109_1) {
			Static250.aClass109_1.method2985();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Z")
	public static boolean method3837(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!ra;II)Lclient!gg;")
	public static Class5_Sub9_Sub8 method3838(@OriginalArg(0) int arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class5_Sub1 local14 = new Class5_Sub1(arg1.method4584(arg2, arg0));
		@Pc(44) Class5_Sub9_Sub8 local44 = new Class5_Sub9_Sub8(arg0, local14.method1840(), local14.method1840(), local14.method1826(), local14.method1826(), local14.method1832() == 1, local14.method1832());
		@Pc(48) int local48 = local14.method1832();
		for (@Pc(50) int local50 = 0; local50 < local48; local50++) {
			local44.aClass211_9.method5609(new Class5_Sub3(local14.method1832(), local14.method1845(), local14.method1845(), local14.method1845(), local14.method1845(), local14.method1845(), local14.method1845(), local14.method1845(), local14.method1845()));
		}
		local44.method2054();
		return local44;
	}
}
