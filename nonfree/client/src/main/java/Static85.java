import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
	public static int[] anIntArray286;

	@OriginalMember(owner = "client!ig", name = "T", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "Lclient!fj;")
	public static Class1_Sub7 aClass1_Sub7_3;

	@OriginalMember(owner = "client!ig", name = "Y", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "Lclient!vi;")
	public static Class99 aClass99_5;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_996 = Static81.method1507("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ig", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_997 = Static81.method1507(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_999 = Static81.method1507("flash3:");

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "Lclient!dj;")
	public static Class24 aClass24_998 = aClass24_999;

	@OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!ig", name = "fb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1000 = Static81.method1507("");

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1001 = aClass24_999;

	@OriginalMember(owner = "client!ig", name = "mb", descriptor = "[Lclient!nf;")
	public static final Class69_Sub1[] aClass69_Sub1Array2 = new Class69_Sub1[256];

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)Z")
	public static boolean method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static148.anIntArrayArrayArray9[arg0][arg1][arg2];
		if (local7 == -Static164.anInt3660) {
			return false;
		} else if (local7 == Static164.anInt3660) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static52.method1042(local22 + 1, Static181.anIntArrayArrayArray10[arg0][arg1][arg2], local26 + 1) && Static52.method1042(local22 + 128 - 1, Static181.anIntArrayArrayArray10[arg0][arg1 + 1][arg2], local26 + 1) && Static52.method1042(local22 + 128 - 1, Static181.anIntArrayArrayArray10[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static52.method1042(local22 + 1, Static181.anIntArrayArrayArray10[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static148.anIntArrayArrayArray9[arg0][arg1][arg2] = Static164.anInt3660;
				return true;
			} else {
				Static148.anIntArrayArrayArray9[arg0][arg1][arg2] = -Static164.anInt3660;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)I")
	private static int method2620(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)Lclient!td;")
	public static Class1_Sub2_Sub22 method2622(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub22 local6 = (Class1_Sub2_Sub22) Static63.aClass86_20.method2816((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(32) byte[] local32 = Static119.aClass69_28.method2208(method2620(arg0), Static118.method2022(arg0));
		local6 = new Class1_Sub2_Sub22();
		if (local32 != null) {
			local6.method3078(new Class1_Sub7(local32));
		}
		local6.method3075();
		Static63.aClass86_20.method2821(local6, (long) arg0);
		return local6;
	}
}
