import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!me;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_3;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!wb;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_777 = Static187.method3089(")3");

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_778 = Static187.method3089("::fpsoff");

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public static int anInt1845 = 2;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "[I")
	public static final int[] anIntArray156 = new int[2000];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method1274() {
		@Pc(5) Object local5 = Static45.anObject1;
		synchronized (Static45.anObject1) {
			if (Static147.anInt2989 != 0) {
				Static147.anInt2989 = 1;
				try {
					Static45.anObject1.wait();
				} catch (@Pc(20) InterruptedException local20) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public static void method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt2380; local12++) {
			@Pc(18) Class16 local18 = local7.aClass16Array3[local12];
			if ((local18.aLong30 >> 29 & 0x3L) == 2L && local18.anInt536 == arg1 && local18.anInt540 == arg2) {
				Static172.method2715(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Lclient!re;")
	public static Class1_Sub3_Sub20 method1279(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub20 local10 = (Class1_Sub3_Sub20) Static101.aClass47_15.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static44.aClass3_24.method3265(Static192.method3137(arg0), Static160.method2509(arg0));
		local10 = new Class1_Sub3_Sub20();
		if (local24 != null) {
			local10.method2548(new Class1_Sub14(local24));
		}
		local10.method2549();
		Static101.aClass47_15.method1273((long) arg0, local10);
		return local10;
	}
}
