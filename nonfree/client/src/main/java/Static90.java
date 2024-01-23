import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[I")
	public static int[] anIntArray532 = new int[100];

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = new String[8];

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[250][];

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString152 = "green:";

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "[I")
	public static int[] anIntArray533 = new int[25];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!og;)Lclient!og;")
	public static Class127 method3585(@OriginalArg(1) Class127 arg0) {
		if (arg0.anInt3563 != -1) {
			return Static75.method1287(arg0.anInt3563);
		}
		@Pc(26) int local26 = arg0.anInt3574 >>> 16;
		@Pc(31) Class148 local31 = new Class148(Static67.aClass22_7);
		for (@Pc(36) Class1_Sub32 local36 = (Class1_Sub32) local31.method3854(); local36 != null; local36 = (Class1_Sub32) local31.method3856()) {
			if (local26 == local36.anInt5665) {
				return Static75.method1287((int) local36.aLong202);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
	public static void method3586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class1_Sub6 local6;
		for (local6 = (Class1_Sub6) Static261.aClass69_26.method1636(); local6 != null; local6 = (Class1_Sub6) Static261.aClass69_26.method1631()) {
			Static64.method1056(arg2, arg0, arg3, arg1, local6);
		}
		@Pc(41) byte local41;
		@Pc(46) Class79 local46;
		@Pc(140) int local140;
		for (local6 = (Class1_Sub6) Static196.aClass69_22.method1636(); local6 != null; local6 = (Class1_Sub6) Static196.aClass69_22.method1631()) {
			local41 = 1;
			local46 = local6.aClass6_Sub6_Sub1_1.method3503();
			if (local6.aClass6_Sub6_Sub1_1.anInt4544 == local46.anInt2197) {
				local41 = 0;
			} else if (local46.anInt2225 == local6.aClass6_Sub6_Sub1_1.anInt4544 || local46.anInt2207 == local6.aClass6_Sub6_Sub1_1.anInt4544 || local46.anInt2214 == local6.aClass6_Sub6_Sub1_1.anInt4544 || local46.anInt2199 == local6.aClass6_Sub6_Sub1_1.anInt4544) {
				local41 = 2;
			} else if (local6.aClass6_Sub6_Sub1_1.anInt4544 == local46.anInt2221 || local46.anInt2205 == local6.aClass6_Sub6_Sub1_1.anInt4544 || local46.anInt2215 == local6.aClass6_Sub6_Sub1_1.anInt4544 || local6.aClass6_Sub6_Sub1_1.anInt4544 == local46.anInt2196) {
				local41 = 3;
			}
			if (local6.anInt1036 != local41) {
				local140 = Static2.method57(local6.aClass6_Sub6_Sub1_1);
				if (local6.anInt1048 != local140) {
					if (local6.aClass1_Sub8_Sub1_1 != null) {
						Static28.aClass1_Sub8_Sub3_1.method2409(local6.aClass1_Sub8_Sub1_1);
						local6.aClass1_Sub8_Sub1_1 = null;
					}
					local6.anInt1048 = local140;
				}
				local6.anInt1036 = local41;
			}
			local6.anInt1045 = local6.aClass6_Sub6_Sub1_1.anInt4562;
			local6.anInt1031 = local6.aClass6_Sub6_Sub1_1.anInt4562 + local6.aClass6_Sub6_Sub1_1.method3509() * 64;
			local6.anInt1041 = local6.aClass6_Sub6_Sub1_1.anInt4569;
			local6.anInt1039 = local6.aClass6_Sub6_Sub1_1.anInt4569 + local6.aClass6_Sub6_Sub1_1.method3509() * 64;
			Static64.method1056(arg2, arg0, arg3, arg1, local6);
		}
		for (local6 = (Class1_Sub6) Static94.aClass22_10.method640(); local6 != null; local6 = (Class1_Sub6) Static94.aClass22_10.method637()) {
			local46 = local6.aClass6_Sub6_Sub2_2.method3503();
			local41 = 1;
			if (local6.aClass6_Sub6_Sub2_2.anInt4544 == local46.anInt2197) {
				local41 = 0;
			} else if (local46.anInt2225 == local6.aClass6_Sub6_Sub2_2.anInt4544 || local46.anInt2207 == local6.aClass6_Sub6_Sub2_2.anInt4544 || local6.aClass6_Sub6_Sub2_2.anInt4544 == local46.anInt2214 || local6.aClass6_Sub6_Sub2_2.anInt4544 == local46.anInt2199) {
				local41 = 2;
			} else if (local6.aClass6_Sub6_Sub2_2.anInt4544 == local46.anInt2221 || local46.anInt2205 == local6.aClass6_Sub6_Sub2_2.anInt4544 || local6.aClass6_Sub6_Sub2_2.anInt4544 == local46.anInt2215 || local46.anInt2196 == local6.aClass6_Sub6_Sub2_2.anInt4544) {
				local41 = 3;
			}
			if (local6.anInt1036 != local41) {
				local140 = Static184.method2764(local6.aClass6_Sub6_Sub2_2);
				if (local6.anInt1048 != local140) {
					if (local6.aClass1_Sub8_Sub1_1 != null) {
						Static28.aClass1_Sub8_Sub3_1.method2409(local6.aClass1_Sub8_Sub1_1);
						local6.aClass1_Sub8_Sub1_1 = null;
					}
					local6.anInt1048 = local140;
				}
				local6.anInt1036 = local41;
			}
			local6.anInt1045 = local6.aClass6_Sub6_Sub2_2.anInt4562;
			local6.anInt1031 = local6.aClass6_Sub6_Sub2_2.anInt4562 + local6.aClass6_Sub6_Sub2_2.method3509() * 64;
			local6.anInt1041 = local6.aClass6_Sub6_Sub2_2.anInt4569;
			local6.anInt1039 = local6.aClass6_Sub6_Sub2_2.anInt4569 + local6.aClass6_Sub6_Sub2_2.method3509() * 64;
			Static64.method1056(arg2, arg0, arg3, arg1, local6);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZZ)V")
	public static void method3587(@OriginalArg(0) boolean arg0) {
		Static39.method716();
		if (Static98.anInt1878 != 30 && Static98.anInt1878 != 25) {
			return;
		}
		Static3.anInt139++;
		if (Static3.anInt139 < 50 && !arg0) {
			return;
		}
		Static3.anInt139 = 0;
		if (!Static84.aBoolean122 && Static155.aClass73_3 != null) {
			Static270.aClass1_Sub18_Sub1_3.method3130(183);
			try {
				Static155.aClass73_3.method1685(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
			} catch (@Pc(61) IOException local61) {
				Static84.aBoolean122 = true;
			}
		}
		Static39.method716();
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
	public static int method3588() {
		return Static3.anInt141;
	}
}
