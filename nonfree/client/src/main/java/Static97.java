import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!go", name = "N", descriptor = "Lclient!cf;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!go", name = "U", descriptor = "I")
	public static int anInt1989;

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "[I")
	public static int[] anIntArray171 = new int[1000];

	@OriginalMember(owner = "client!go", name = "T", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(II)Lclient!fa;")
	public static Class1_Sub2_Sub5 method1794(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub5 local6 = (Class1_Sub2_Sub5) Static245.aClass148_8.method3600((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = Static11.aClass121_9.method3115(0, arg0 & 0x7FFF);
		} else {
			local27 = Static301.aClass121_132.method3115(0, arg0);
		}
		local6 = new Class1_Sub2_Sub5();
		if (local27 != null) {
			local6.method1456(new Class1_Sub14(local27));
		}
		if (arg0 >= 32768) {
			local6.method1462();
		}
		Static245.aClass148_8.method3602(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)I")
	public static int method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = arg1 & 0xF;
		@Pc(26) int local26 = local3 < 8 ? arg0 : arg2;
		@Pc(45) int local45 = local3 < 4 ? arg2 : local3 == 12 || local3 == 14 ? arg0 : arg3;
		return ((local3 & 0x2) == 0 ? local45 : -local45) + ((local3 & 0x1) == 0 ? local26 : -local26);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V")
	public static void method1797(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static50.aString60 = arg0;
		Static85.aString102 = arg2;
		Static228.anInt4197 = arg1;
		if (Static50.aString60.equals("") || Static85.aString102.equals("")) {
			Static201.anInt3864 = 3;
		} else if (Static312.anInt5731 == -1) {
			Static234.anInt4282 = 0;
			Static201.anInt3864 = -3;
			Static287.anInt5145 = 0;
			Static35.anInt3965 = 1;
			@Pc(41) Class1_Sub14 local41 = new Class1_Sub14(128);
			local41.method1390(10);
			local41.method1387((int) (Math.random() * 9.9999999E7D));
			local41.method1374(Static124.method4681(Static50.aString60));
			local41.method1387((int) (Math.random() * 9.9999999E7D));
			local41.method1385(Static85.aString102);
			local41.method1387((int) (Math.random() * 9.9999999E7D));
			local41.method1399(Static207.aBigInteger2, Static85.aBigInteger1);
			Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
			Static127.aClass1_Sub14_Sub1_3.method1390(24);
			Static127.aClass1_Sub14_Sub1_3.method1390(local41.anInt1480 + 2);
			Static127.aClass1_Sub14_Sub1_3.method1338(549);
			Static127.aClass1_Sub14_Sub1_3.method1335(local41.anInt1480, local41.aByteArray17);
		} else {
			Static145.method2482();
		}
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public static void method1798() {
		for (@Pc(15) Class1_Sub2_Sub16 local15 = (Class1_Sub2_Sub16) Static225.aClass59_32.method1704(); local15 != null; local15 = (Class1_Sub2_Sub16) Static225.aClass59_32.method1701()) {
			@Pc(21) Class15_Sub4 local21 = local15.aClass15_Sub4_1;
			if (local21.anInt1088 != Static65.anInt1300 || local21.aBoolean59) {
				local15.method4779();
			} else if (Static313.anInt2966 >= local21.anInt1104) {
				local21.method1001(Static81.anInt1635);
				if (local21.aBoolean59) {
					local15.method4779();
				} else {
					Static95.method1737(local21.anInt1088, local21.anInt1092, local21.anInt1087, local21.anInt1085, 60, local21, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)I")
	public static int method1799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static233.method3608(arg0 - 1, arg1 - 1) + Static233.method3608(arg0 - 1, arg1 - -1) + Static233.method3608(arg0 + 1, arg1 - 1) + Static233.method3608(arg0 + 1, arg1 + 1);
		@Pc(72) int local72 = Static233.method3608(arg0, arg1 - 1) + Static233.method3608(arg0, arg1 + 1) + Static233.method3608(arg0 - 1, arg1) + Static233.method3608(arg0 + 1, arg1);
		@Pc(79) int local79 = Static233.method3608(arg0, arg1);
		return local79 / 4 + local37 / 16 + local72 / 8;
	}
}
