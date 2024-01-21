import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_1174 = Static9.method266("leuchten2:");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_1175 = Static9.method266("<br>");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!ve;")
	public static Class80 aClass80_1 = new Class80();

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!id;")
	public static Class34 aClass34_1176 = Static9.method266("mapfunction");

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1177 = Static9.method266("null");

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!id;")
	private static Class34 aClass34_1178 = Static9.method266("Click to switch");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_1179 = aClass34_1178;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!id;")
	private static Class34 aClass34_1181 = Static9.method266("Username: ");

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_1180 = aClass34_1181;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1553() {
		aClass1_Sub1_Sub2_Sub2Array8 = null;
		anIntArray298 = null;
		aClass34_1175 = null;
		aClass34_1180 = null;
		aClass80_1 = null;
		aClass34_1179 = null;
		aClass34_1178 = null;
		aClass34_1176 = null;
		aClass34_1181 = null;
		aClass34_1177 = null;
		aClass34_1174 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[Lclient!id;)Lclient!id;")
	public static Class34 method1554(@OriginalArg(1) Class34[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static127.method1353(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ie;ILclient!ie;)I")
	public static int method1555(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class35 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1566(Static67.aClass34_838, Static120.aClass34_1469)) {
			local5++;
		}
		if (arg1.method1566(Static66.aClass34_821, Static120.aClass34_1469)) {
			local5++;
		}
		if (arg1.method1566(Static41.aClass34_552, Static120.aClass34_1469)) {
			local5++;
		}
		if (arg1.method1566(Static132.aClass34_1592, Static120.aClass34_1469)) {
			local5++;
		}
		if (arg1.method1566(Static95.aClass34_1202, Static120.aClass34_1469)) {
			local5++;
		}
		if (arg1.method1566(Static133.aClass34_1596, Static120.aClass34_1469)) {
			local5++;
		}
		arg1.method1566(Static100.aClass34_1252, Static120.aClass34_1469);
		arg1.method1566(Static118.aClass34_1436, Static120.aClass34_1469);
		arg1.method1566(Static14.aClass34_306, Static120.aClass34_1469);
		arg1.method1566(Static43.aClass34_594, Static120.aClass34_1469);
		arg1.method1566(Static84.aClass34_1103, Static120.aClass34_1469);
		return local5;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Z")
	public static boolean method1557(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIBZLclient!pa;)V")
	public static void method1558(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class35_Sub1 arg5) {
		@Pc(10) long local10 = (long) (arg0 + (arg3 << 16));
		@Pc(16) Class1_Sub1_Sub9 local16 = (Class1_Sub1_Sub9) Static37.aClass48_6.method1340(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub9) Static34.aClass48_4.method1340(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub9) Static29.aClass48_3.method1340(local10);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class1_Sub1_Sub9) Static96.aClass48_12.method1340(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub1_Sub9();
			local16.aClass35_Sub1_18 = arg5;
			local16.aByte8 = arg1;
			local16.anInt2130 = arg2;
			if (arg4) {
				Static37.aClass48_6.method1336(local10, local16);
				Static11.anInt487++;
			} else {
				aClass80_1.method1981(local16);
				Static29.aClass48_3.method1336(local10, local16);
				Static132.anInt3152++;
			}
		} else if (arg4) {
			local16.method2004();
			Static37.aClass48_6.method1336(local10, local16);
			Static11.anInt487++;
			Static132.anInt3152--;
		}
	}
}
