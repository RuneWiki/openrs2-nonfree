import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "Lclient!qf;")
	public static Class146 aClass146_6 = null;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString54 = "shake:";

	@OriginalMember(owner = "client!gg", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString55 = "glow3:";

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
	public static int anInt1607 = 0;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
	public static void method1295(@OriginalArg(1) int arg0) {
		if (!Static183.method3031(arg0)) {
			return;
		}
		@Pc(15) Class146[] local15 = Static313.aClass146ArrayArray1[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(29) Class146 local29 = local15[local17];
			if (local29 != null) {
				local29.anInt4388 = 0;
				local29.anInt4353 = 0;
				local29.anInt4408 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IC)Z")
	public static boolean method1296(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!sb;)V")
	public static void method1297(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(5) int local5 = arg0.method2648();
		Static60.aClass154Array1 = new Class154[local5];
		@Pc(20) int local20;
		for (local20 = 0; local20 < local5; local20++) {
			Static60.aClass154Array1[local20] = new Class154();
			Static60.aClass154Array1[local20].anInt4867 = arg0.method2648();
			Static60.aClass154Array1[local20].aString162 = arg0.method2634();
		}
		Static110.anInt2186 = arg0.method2648();
		Static138.anInt2725 = arg0.method2648();
		Static198.anInt3992 = arg0.method2648();
		Static219.aClass182_Sub1Array2 = new Class182_Sub1[Static138.anInt2725 + 1 - Static110.anInt2186];
		for (local20 = 0; local20 < Static198.anInt3992; local20++) {
			@Pc(79) int local79 = arg0.method2648();
			@Pc(87) Class182_Sub1 local87 = Static219.aClass182_Sub1Array2[local79] = new Class182_Sub1();
			local87.anInt5533 = arg0.method2595();
			local87.anInt5530 = arg0.method2647();
			local87.anInt5535 = local79 + Static110.anInt2186;
			local87.aString188 = arg0.method2634();
			local87.aString186 = arg0.method2634();
		}
		Static253.anInt4752 = arg0.method2647();
		Static156.aBoolean233 = true;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Lclient!gi;")
	public static Class1_Sub1_Sub10 method1298() {
		if (Static58.aClass5_11 == null) {
			return null;
		} else {
			Static260.aClass48_1.method1147(Static58.aClass5_11);
			@Pc(25) Class1_Sub1_Sub10 local25 = (Class1_Sub1_Sub10) Static260.aClass48_1.method1149();
			@Pc(30) Class81 local30 = Static50.method874(local25.anInt1638);
			return local30 != null && local30.aBoolean167 && local30.method1800() ? local25 : Static88.method1309();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!sb;)Lclient!vo;")
	public static Class12_Sub3 method1299(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class12_Sub3(arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2588(), arg0.method2595());
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)V")
	public static void method1300() {
		if (!Static91.aBoolean136) {
			return;
		}
		@Pc(17) Class146 local17 = Static300.method4492(Static81.anInt1490, Static10.anInt180);
		if (local17 != null && local17.anObjectArray30 != null) {
			@Pc(27) Class1_Sub29 local27 = new Class1_Sub29();
			local27.anObjectArray32 = local17.anObjectArray30;
			local27.aClass146_16 = local17;
			Static171.method2886(local27);
		}
		Static5.anInt69 = -1;
		Static91.aBoolean136 = false;
		Static237.method2927(local17);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method1301(@OriginalArg(0) String arg0) {
		@Pc(3) long local3 = 0L;
		@Pc(6) int local6 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local6; local13++) {
			local3 = (local3 << 5) + (long) arg0.charAt(local13) - local3;
		}
		return local3;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method1302(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(6) int local6 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(15) int local15 = 0; local15 < Static61.anInt1211; local15++) {
			@Pc(26) Class149 local26 = Static271.method4006(local15);
			if ((!arg1 || local26.aBoolean342) && local26.anInt4800 == -1 && local26.anInt4805 == -1 && local26.anInt4806 == 0 && local26.aString159.toLowerCase().indexOf(local4) != -1) {
				if (local6 >= 250) {
					Static93.aShortArray17 = null;
					Static151.anInt3099 = -1;
					return;
				}
				if (local13.length <= local6) {
					@Pc(74) short[] local74 = new short[local13.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local6; local76++) {
						local74[local76] = local13[local76];
					}
					local13 = local74;
				}
				local13[local6++] = (short) local15;
			}
		}
		Static151.anInt3099 = local6;
		Static93.aShortArray17 = local13;
		Static8.anInt142 = 0;
		@Pc(116) String[] local116 = new String[Static151.anInt3099];
		for (@Pc(118) int local118 = 0; local118 < Static151.anInt3099; local118++) {
			local116[local118] = Static271.method4006(local13[local118]).aString159;
		}
		Static76.method1203(Static93.aShortArray17, local116);
	}
}
