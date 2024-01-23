import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString113 = "yellow:";

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
	public static int anInt1922 = 0;

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	public static int anInt1928 = 0;

	@OriginalMember(owner = "client!gl", name = "W", descriptor = "[Lclient!ui;")
	public static Class1_Sub2_Sub22[] aClass1_Sub2_Sub22Array4 = new Class1_Sub2_Sub22[14];

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIII)V")
	public static void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class1_Sub2_Sub11 local10 = Static5.method35(arg2, 9);
		local10.method2866();
		local10.anInt3315 = arg0;
		local10.anInt3320 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIIIII)I")
	public static int method1733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(14) int local14 = arg5;
			arg5 = arg0;
			arg0 = local14;
		}
		@Pc(22) int local22 = arg4 & 0x3;
		if (local22 == 0) {
			return arg1;
		} else if (local22 == 1) {
			return arg2;
		} else if (local22 == 2) {
			return 8 - arg1 - arg5;
		} else {
			return 1 + 7 - arg0 - arg2;
		}
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)I")
	public static int method1734() {
		return 14;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ed;")
	public static RuntimeException_Sub1 method1735(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString72 = local12.aString72 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(B)V")
	public static void method1736() {
		Static299.method4551();
		Static304.method4587();
		Static114.method2034();
		Static181.method2986();
		Static263.method4152();
		Static175.method2944();
		Static55.method976();
		Static153.method2615();
		Static148.method2514();
		Static274.method4263();
		Static189.method3089();
		Static166.method2833();
		Static257.method4080();
		Static238.method3675();
		Static160.method2752();
		Static118.method2112();
		Static247.method3905();
		Static27.method451();
		Static56.method990();
		Static28.method465();
		Static105.method1206();
		Static244.aClass187_124.method4525();
		Static311.aClass187_157.method4525();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIILclient!io;IJZ)Z")
	public static boolean method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static52.method4723(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIIIIBI)V")
	public static void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) Class1_Sub32 local3 = new Class1_Sub32();
		local3.anInt5499 = arg6;
		local3.anInt5486 = arg1;
		local3.anInt5491 = arg4;
		local3.anInt5495 = arg2;
		local3.anInt5487 = arg11;
		local3.anInt5501 = arg3;
		local3.anInt5492 = arg8;
		local3.anInt5500 = arg10;
		local3.anInt5490 = arg0;
		local3.anInt5493 = arg5;
		local3.anInt5488 = arg7;
		local3.anInt5484 = arg9;
		Static125.aClass59_21.method1706(local3);
	}
}
