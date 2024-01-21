import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qa", name = "bd", descriptor = "Lclient!sa;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!qa", name = "md", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!qa", name = "zd", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_15;

	@OriginalMember(owner = "client!qa", name = "Bd", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!qa", name = "Pc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_921 = Static2.method59("(U(Y");

	@OriginalMember(owner = "client!qa", name = "dd", descriptor = "Lclient!wd;")
	private static Class80 aClass80_922 = Static2.method59("Error connecting to server)3");

	@OriginalMember(owner = "client!qa", name = "ed", descriptor = "Lclient!wd;")
	public static Class80 aClass80_923 = aClass80_922;

	@OriginalMember(owner = "client!qa", name = "kd", descriptor = "I")
	public static int anInt2398 = 0;

	@OriginalMember(owner = "client!qa", name = "rd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_925 = Static2.method59("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!qa", name = "xd", descriptor = "Lclient!of;")
	public static Class58 aClass58_12 = new Class58();

	@OriginalMember(owner = "client!qa", name = "Ad", descriptor = "I")
	public static int anInt2409 = 0;

	@OriginalMember(owner = "client!qa", name = "Cd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_926 = Static2.method59("backbase2");

	@OriginalMember(owner = "client!qa", name = "Dd", descriptor = "Lclient!wd;")
	public static Class80 aClass80_927 = Static2.method59("@cya@");

	@OriginalMember(owner = "client!qa", name = "Ed", descriptor = "I")
	public static int anInt2410 = 0;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(B)V")
	public static void method1442() {
		aClass80_925 = null;
		anIntArray314 = null;
		aClass58_12 = null;
		aClass64_1 = null;
		aClass80_923 = null;
		aByteArrayArrayArray5 = null;
		aClass11_Sub1_15 = null;
		aClass80_921 = null;
		aClass80_922 = null;
		aClass80_926 = null;
		aClass80_927 = null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Lclient!h;")
	public static Class2_Sub1_Sub8 method1443(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub1_Sub8 local8 = (Class2_Sub1_Sub8) Static61.aClass32_35.method887((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(29) byte[] local29 = Static16.aClass11_8.method383(arg0, 12);
		local8 = new Class2_Sub1_Sub8();
		if (local29 != null) {
			local8.method730(new Class2_Sub17(local29));
		}
		local8.method733();
		Static61.aClass32_35.method880(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[Lclient!wd;)Lclient!wd;")
	public static Class80 method1444(@OriginalArg(1) Class80[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static23.method478(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)Z")
	public static boolean method1446(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ce;ILclient!pb;)V")
	public static void method1447(@OriginalArg(1) Class11_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(14) byte[] local14 = null;
		@Pc(16) Class58 local16 = Static63.aClass58_8;
		synchronized (Static63.aClass58_8) {
			for (@Pc(23) Class2_Sub12 local23 = (Class2_Sub12) Static63.aClass58_8.method1285(); local23 != null; local23 = (Class2_Sub12) Static63.aClass58_8.method1281()) {
				if (local23.aLong91 == (long) arg1 && local23.aClass60_4 == arg2 && local23.anInt1981 == 0) {
					local14 = local23.aByteArray28;
					break;
				}
			}
		}
		if (local14 == null) {
			@Pc(73) byte[] local73 = arg2.method1326(arg1);
			arg0.method401(arg2, true, arg1, local73);
		} else {
			arg0.method401(arg2, true, arg1, local14);
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(II)Lclient!fa;")
	public static Class2_Sub1_Sub7 method1448(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub7 local12 = (Class2_Sub1_Sub7) Static85.aClass32_40.method887((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static4.aClass11_Sub1_1.method383(0, arg0);
		if (local22 == null) {
			return null;
		}
		@Pc(28) int local28 = 0;
		local12 = new Class2_Sub1_Sub7();
		@Pc(37) Class2_Sub17 local37 = new Class2_Sub17(local22);
		local37.anInt2799 = local37.aByteArray38.length - 12;
		@Pc(48) int local48 = local37.method1747();
		local12.anInt1170 = local37.method1783();
		local12.anInt1173 = local37.method1783();
		local12.anInt1171 = local37.method1783();
		local12.anInt1168 = local37.method1783();
		local12.aClass80Array7 = new Class80[local48];
		local37.anInt2799 = 0;
		local12.anIntArray145 = new int[local48];
		local12.anIntArray144 = new int[local48];
		while (local37.anInt2799 < local37.aByteArray38.length - 12) {
			@Pc(94) int local94 = local37.method1783();
			if (local94 == 3) {
				local12.aClass80Array7[local28] = local37.method1797();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray145[local28] = local37.method1780();
			} else {
				local12.anIntArray145[local28] = local37.method1747();
			}
			local12.anIntArray144[local28++] = local94;
		}
		Static85.aClass32_40.method880(local12, (long) arg0);
		return local12;
	}
}
