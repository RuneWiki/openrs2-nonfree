import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	public static int anInt2109;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZZZ)V")
	public static void method2109(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			Static339.anInt2492--;
			if (Static339.anInt2492 == 0) {
				Static50.anIntArray75 = null;
			}
		}
		Static170.anInt3527--;
		if (Static170.anInt3527 == 0) {
			Static71.anIntArray514 = null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)I")
	public static int method2110(@OriginalArg(1) int arg0) {
		if (Static138.aClass159_3 != null) {
			Static138.aClass159_3.method4079();
			Static138.aClass159_3 = null;
		}
		Static48.anInt1218++;
		if (Static48.anInt1218 > 4) {
			Static187.anInt3857 = 0;
			Static48.anInt1218 = 0;
			return arg0;
		}
		Static187.anInt3857 = 0;
		if (Static164.anInt3456 == Static40.anInt978) {
			Static164.anInt3456 = Static214.anInt4285;
		} else {
			Static164.anInt3456 = Static40.anInt978;
		}
		return -1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public static void method2111() {
		Static41.anInt980 = 0;
		Static95.aClass18_9.method461();
		Static302.aBoolean409 = false;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lclient!lk;")
	public static Class128 method2112(@OriginalArg(1) int arg0) {
		@Pc(5) Class11 local5 = Static29.aClass11_105;
		@Pc(14) Class128 local14;
		synchronized (Static29.aClass11_105) {
			local14 = (Class128) Static29.aClass11_105.method209((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static157.aClass143_65.method3745(32, arg0);
		local14 = new Class128();
		if (local30 != null) {
			local14.method3501(new Class14_Sub4(local30));
		}
		local14.method3499();
		@Pc(55) Class11 local55 = Static29.aClass11_105;
		synchronized (Static29.aClass11_105) {
			Static29.aClass11_105.method219((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public static void method2113() {
		Static223.anInt5821 = 0;
		@Pc(18) int local18 = Static151.anInt3234 + (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7);
		@Pc(25) int local25 = Static251.anInt3170 + (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7);
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static223.anInt5821 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static223.anInt5821 = 1;
		}
		if (Static223.anInt5821 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static223.anInt5821 = 0;
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z")
	public static boolean method2115() {
		if (Static76.aBoolean124) {
			try {
				Static356.method171(Static105.aClass15_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(20) Throwable local20) {
			}
		}
		return false;
	}
}
