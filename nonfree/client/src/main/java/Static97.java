import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public static int anInt2135;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_19;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!qe;")
	private static Class78 aClass78_469 = Static199.method3560("Walk here");

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_468 = aClass78_469;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
	public static int[] anIntArray376 = new int[256];

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Z")
	public static boolean aBoolean78 = true;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!wc;")
	public static Class110 aClass110_10 = new Class110(64);

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!qe;")
	private static Class78 aClass78_470 = Static199.method3560("Created gameworld");

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public static int anInt2140 = 0;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_471 = aClass78_470;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1684() {
		@Pc(17) int local17 = Static159.aClass44_50.method1364();
		if (local17 == 0) {
			return;
		}
		Static161.aClass2_Sub23_Sub1_5.method2155(103);
		@Pc(30) int local30 = 0;
		Static161.aClass2_Sub23_Sub1_5.method2132(0);
		@Pc(37) int local37 = Static161.aClass2_Sub23_Sub1_5.anInt2703;
		@Pc(42) Class2_Sub7 local42 = (Class2_Sub7) Static159.aClass44_50.method1365();
		Static161.aClass2_Sub23_Sub1_5.method2117(local42.anInt534);
		@Pc(50) int local50 = local42.anInt534;
		@Pc(90) Class2_Sub7 local90;
		while ((local90 = (Class2_Sub7) Static159.aClass44_50.method1365()) != null) {
			if (local30 < 255 && local50 + 1 == local90.anInt534) {
				local30++;
			} else {
				Static161.aClass2_Sub23_Sub1_5.method2132(local30);
				Static161.aClass2_Sub23_Sub1_5.method2117(local90.anInt534);
				local30 = 0;
			}
			local50 = local90.anInt534;
		}
		Static161.aClass2_Sub23_Sub1_5.method2132(local30);
		Static161.aClass2_Sub23_Sub1_5.method2093(Static161.aClass2_Sub23_Sub1_5.anInt2703 - local37);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1685() {
		if (Static60.anIntArray168 != null && Static157.anIntArray603 != null) {
			return;
		}
		Static60.anIntArray168 = new int[256];
		Static157.anIntArray603 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static60.anIntArray168[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static157.anIntArray603[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Z")
	public static boolean method1686(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class78 method1687(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static19.method268(arg0) : Static177.aClass78_715;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Z")
	public static boolean method1688(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(18) int local18 = Static79.aShortArray53[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		return local18 == 1007;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII[Lclient!qe;)Lclient!qe;")
	public static Class78 method1689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78[] arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			if (arg2[arg1 + local14] == null) {
				arg2[arg1 + local14] = Static209.aClass78_678;
			}
			local5 += arg2[local14 + arg1].anInt3831;
		}
		@Pc(47) int local47 = 0;
		@Pc(50) byte[] local50 = new byte[local5];
		@Pc(59) Class78 local59;
		for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
			local59 = arg2[local52 + arg1];
			Static231.method2214(local59.aByteArray48, 0, local50, local47, local59.anInt3831);
			local47 += local59.anInt3831;
		}
		local59 = new Class78();
		local59.anInt3831 = local5;
		local59.aByteArray48 = local50;
		return local59;
	}
}
