import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!te", name = "wb", descriptor = "Lclient!pb;")
	public static Class40 aClass40_37;

	@OriginalMember(owner = "client!te", name = "tc", descriptor = "Lclient!cb;")
	public static Class6_Sub2_Sub3_Sub1_Sub1 aClass6_Sub2_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!te", name = "fd", descriptor = "Lclient!fc;")
	public static Class21 aClass21_20;

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "Z")
	public static volatile boolean aBoolean132 = false;

	@OriginalMember(owner = "client!te", name = "Wc", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1225 = Static34.method846("Enter name of player to delete from list");

	@OriginalMember(owner = "client!te", name = "Yb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1219 = aClass55_1225;

	@OriginalMember(owner = "client!te", name = "sc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1221 = Static34.method846("Die Verbindung konnte");

	@OriginalMember(owner = "client!te", name = "Rc", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1224 = Static34.method846(":  ");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)I")
	public static int method1891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static24.method697(arg1 - 1, arg0 + -1) + Static24.method697(arg1 + 1, arg0 + -1) + Static24.method697(arg1 - 1, arg0 + 1) + Static24.method697(arg1 + 1, arg0 + 1);
		@Pc(79) int local79 = Static24.method697(arg1 - 1, arg0) + Static24.method697(arg1 + 1, arg0) + Static24.method697(arg1, arg0 + -1) + Static24.method697(arg1, arg0 + 1);
		@Pc(84) int local84 = Static24.method697(arg1, arg0);
		return local84 / 4 + local49 / 16 + local79 / 8;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	public static void method1892() {
		aClass55_1219 = null;
		aClass21_20 = null;
		aClass55_1225 = null;
		aClass40_37 = null;
		aClass6_Sub2_Sub3_Sub1_Sub1_1 = null;
		aClass55_1224 = null;
		aClass55_1221 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lclient!te;")
	public static Class6_Sub2_Sub14 method1897(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static9.aClass6_Sub2_Sub14ArrayArray1[local7] == null || Static9.aClass6_Sub2_Sub14ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static22.method654(local7);
			if (!local25) {
				return null;
			}
		}
		return Static9.aClass6_Sub2_Sub14ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!kb;[Lclient!sb;[BI)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class57[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Class6_Sub1 local6 = new Class6_Sub1(arg3);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(20) int local20 = local6.method1465();
			if (local20 == 0) {
				return;
			}
			local8 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local6.method1465();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local6.method1495();
				@Pc(65) int local65 = arg4 + local53;
				@Pc(69) int local69 = local61 >> 2;
				@Pc(73) int local73 = arg0 + local47;
				@Pc(77) int local77 = local61 & 0x3;
				if (local65 > 0 && local73 > 0 && local65 < 103 && local73 < 103) {
					@Pc(92) Class57 local92 = null;
					@Pc(94) int local94 = local57;
					if ((Static43.aByteArrayArrayArray8[1][local65][local73] & 0x2) == 2) {
						local94 = local57 - 1;
					}
					if (local94 >= 0) {
						local92 = arg2[local94];
					}
					Static4.method1618(local69, arg1, local65, local8, local77, local92, local73, local57);
				}
			}
		}
	}
}
