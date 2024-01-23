import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Connection lost.";

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString166 = null;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!ai;)V")
	public static void method2003(@OriginalArg(1) Class9_Sub1_Sub1 arg0) {
		@Pc(17) Class1_Sub28 local17 = (Class1_Sub28) Static32.aClass140_1.method4014(method2008(arg0.aString12));
		if (local17 == null) {
			return;
		}
		if (local17.aClass1_Sub4_Sub3_2 != null) {
			Static24.aClass1_Sub4_Sub4_1.method3081(local17.aClass1_Sub4_Sub3_2);
			local17.aClass1_Sub4_Sub3_2 = null;
		}
		local17.method4186();
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V")
	public static void method2004() {
		Static57.aClass79_6.method2487();
		Static170.aClass79_26.method2487();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Lclient!na;")
	public static Class89 method2006(@OriginalArg(0) int arg0) {
		@Pc(10) Class89 local10 = (Class89) Static13.aClass79_1.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static84.aClass51_29.method1874(Static249.method4054(arg0), Static227.method3784(arg0));
		local10 = new Class89();
		local10.anInt3642 = arg0;
		if (local24 != null) {
			local10.method2724(new Class1_Sub13(local24));
		}
		local10.method2725();
		if (local10.anInt3680 != -1) {
			local10.method2739(method2006(local10.anInt3680), method2006(local10.anInt3624));
		}
		if (local10.anInt3628 != -1) {
			local10.method2726(method2006(local10.anInt3628), method2006(local10.anInt3649));
		}
		if (!Static51.aBoolean83 && local10.aBoolean189) {
			local10.anInt3665 = 0;
			local10.aStringArray30 = Static38.aStringArray5;
			local10.aStringArray28 = Static2.aStringArray2;
			local10.aString235 = Static11.aString14;
			local10.aBoolean188 = false;
		}
		Static13.aClass79_1.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IC)Z")
	public static boolean method2007(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(BLjava/lang/String;)J")
	public static long method2008(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local4; local19++) {
			local10 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local10 += local29 - 64;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local10 += local29 + 1 - 97;
			} else if (local29 >= '0' && local29 <= '9') {
				local10 += local29 + 27 - 48;
			}
			if (local10 >= 177917621779460413L) {
				break;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}
}
