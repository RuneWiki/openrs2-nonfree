import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "[[Lclient!ii;")
	public static Class47[][] aClass47ArrayArray1;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_621 = Static151.method2243("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ij", name = "F", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_622 = Static151.method2243("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ij", name = "I", descriptor = "Lclient!mb;")
	public static Class62 aClass62_623 = aClass62_622;

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
	public static int anInt1941 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIBII)V")
	public static void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static19.method345(arg0, Static55.anIntArrayArray8[arg1], arg3 - arg2, arg3 - -arg2);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg4;
		@Pc(26) int local26 = arg2 * arg2;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(38) int local38 = local26 << 1;
		@Pc(51) int local51 = local30 << 2;
		@Pc(55) int local55 = local26 << 2;
		@Pc(64) int local64 = local30 - (local34 - 1) * local38;
		@Pc(68) int local68 = local30 << 1;
		@Pc(76) int local76 = local68 * 3;
		@Pc(84) int local84 = local68 + (1 - local34) * local26;
		@Pc(92) int local92 = ((arg4 << 1) - 3) * local38;
		@Pc(98) int local98 = local51;
		@Pc(104) int local104 = (arg4 - 1) * local55;
		while (local22 > 0) {
			if (local84 < 0) {
				while (local84 < 0) {
					local20++;
					local84 += local76;
					local76 += local51;
					local64 += local98;
					local98 += local51;
				}
			}
			if (local64 < 0) {
				local64 += local98;
				local98 += local51;
				local84 += local76;
				local76 += local51;
				local20++;
			}
			local22--;
			local64 += -local92;
			@Pc(165) int local165 = arg1 - local22;
			local92 -= local55;
			@Pc(173) int local173 = arg1 + local22;
			local84 += -local104;
			@Pc(183) int local183 = arg3 + local20;
			local104 -= local55;
			@Pc(192) int local192 = arg3 - local20;
			Static19.method345(arg0, Static55.anIntArrayArray8[local165], local192, local183);
			Static19.method345(arg0, Static55.anIntArrayArray8[local173], local192, local183);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLclient!pb;I)[Lclient!rd;")
	public static Class42_Sub1[] method1269(@OriginalArg(0) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2) {
		return Static157.method2317(arg0, arg1, arg2) ? Static93.method1397() : null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIII)V")
	public static void method1270(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static154.anInt3307 = 0;
		Static15.anInt353 = arg0;
		Static153.anInt3279 = arg1;
		Static122.anInt2718 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!kd;)V")
	public static void method1271(@OriginalArg(1) Class2_Sub11 arg0) {
		if (Static154.aClass9_2 != null) {
			try {
				Static154.aClass9_2.method221(0L);
				Static154.aClass9_2.method228(24, arg0.anInt2235, arg0.aByteArray26);
			} catch (@Pc(21) Exception local21) {
			}
		}
		arg0.anInt2235 += 24;
	}
}
