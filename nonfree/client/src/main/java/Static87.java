import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public static int anInt2019;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public static int anInt2020;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!sf;")
	public static Class157 aClass157_16 = new Class157(4);

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public static int anInt2021 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Lclient!gf;")
	public static Class60 method1546(@OriginalArg(1) int arg0) {
		@Pc(6) Class60 local6 = (Class60) Static220.aClass157_37.method4031((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static275.aClass42_94.method1256(Static26.method3696(arg0), Static308.method4663(arg0));
		local6 = new Class60();
		local6.anInt2257 = arg0;
		if (local24 != null) {
			local6.method1650(new Class2_Sub16(local24));
		}
		local6.method1642();
		if (local6.anInt2213 != -1) {
			local6.method1651(method1546(local6.anInt2213), method1546(local6.anInt2209));
		}
		if (local6.anInt2215 != -1) {
			local6.method1641(method1546(local6.anInt2225), method1546(local6.anInt2215));
		}
		if (!Static273.aBoolean361 && local6.aBoolean146) {
			local6.aStringArray16 = Static211.aStringArray32;
			local6.aBoolean147 = false;
			local6.aString81 = Static131.aString104;
			local6.anInt2256 = 0;
			local6.aStringArray17 = Static117.aStringArray22;
		}
		Static220.aClass157_37.method4026((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
	public static void method1547(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub8_Sub10 local16 = Static92.method1633(2, arg0);
		local16.method2043();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!oe;I)Lclient!pf;")
	public static Class13_Sub3 method1549(@OriginalArg(0) Class2_Sub16 arg0) {
		return new Class13_Sub3(arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2191(), arg0.method2166(), arg0.method2146());
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	public static void method1550() {
		Static98.anIntArray205 = Static260.method4090(0.4F);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZLclient!ek;Lclient!ek;)V")
	public static void method1551(@OriginalArg(2) Class42 arg0, @OriginalArg(3) Class42 arg1) {
		Static169.aBoolean248 = true;
		Static218.aClass42_68 = arg0;
		Static280.aClass42_100 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
	public static boolean method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static308.anIntArrayArrayArray16[arg0][arg1][arg2];
		if (local7 == -Static40.anInt989) {
			return false;
		} else if (local7 == Static40.anInt989) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static294.method4514(local22 + 1, Static9.anIntArrayArrayArray7[arg0][arg1][arg2], local26 + 1) && Static294.method4514(local22 + 128 - 1, Static9.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local26 + 1) && Static294.method4514(local22 + 128 - 1, Static9.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static294.method4514(local22 + 1, Static9.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static308.anIntArrayArrayArray16[arg0][arg1][arg2] = Static40.anInt989;
				return true;
			} else {
				Static308.anIntArrayArrayArray16[arg0][arg1][arg2] = -Static40.anInt989;
				return false;
			}
		}
	}
}
