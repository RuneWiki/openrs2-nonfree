import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!rg;")
	public static Class27 aClass27_10;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public static int anInt1976 = -1;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
	public static int anInt1979 = 0;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
	public static int anInt1980 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)V")
	public static void method1559(@OriginalArg(1) int arg0) {
		Static8.anInt492 = -1;
		if (arg0 == 37) {
			Static20.aFloat51 = 3.0F;
		} else if (arg0 == 50) {
			Static20.aFloat51 = 4.0F;
		} else if (arg0 == 75) {
			Static20.aFloat51 = 6.0F;
		} else if (arg0 == 100) {
			Static20.aFloat51 = 8.0F;
		} else if (arg0 == 200) {
			Static20.aFloat51 = 16.0F;
		}
		Static8.anInt492 = -1;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!oj;Lclient!a;III)V")
	public static void method1561(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class188 local12;
		if (arg3 < Static176.anInt3742) {
			local12 = Static45.aClass188ArrayArrayArray5[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass1_Sub1_2 != null && local12.aClass1_Sub1_2.method6015()) {
				arg1.method6019(Static169.anInt5687, 0, true, local12.aClass1_Sub1_2, 0, arg0);
			}
		}
		if (arg4 < Static176.anInt3742) {
			local12 = Static45.aClass188ArrayArrayArray5[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub1_2 != null && local12.aClass1_Sub1_2.method6015()) {
				arg1.method6019(0, 0, true, local12.aClass1_Sub1_2, Static169.anInt5687, arg0);
			}
		}
		if (arg3 < Static176.anInt3742 && arg4 < Static285.anInt5263) {
			local12 = Static45.aClass188ArrayArrayArray5[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass1_Sub1_2 != null && local12.aClass1_Sub1_2.method6015()) {
				arg1.method6019(Static169.anInt5687, 0, true, local12.aClass1_Sub1_2, Static169.anInt5687, arg0);
			}
		}
		if (arg3 < Static176.anInt3742 && arg4 > 0) {
			local12 = Static45.aClass188ArrayArrayArray5[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass1_Sub1_2 != null && local12.aClass1_Sub1_2.method6015()) {
				arg1.method6019(Static169.anInt5687, 0, true, local12.aClass1_Sub1_2, -Static169.anInt5687, arg0);
			}
		}
	}
}
