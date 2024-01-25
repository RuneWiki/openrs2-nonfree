import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "Lclient!o;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
	public static int anInt1452;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "[I")
	public static final int[] anIntArray104 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_4 = new Class220(8);

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_19 = new Class208(21, 8);

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_3 = new Class91("", 15);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!tq;)V")
	public static void method1337(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static422.anInt3434; local12++) {
			@Pc(18) int local18 = Static18.anIntArray38[local12];
			@Pc(22) Class11_Sub5_Sub2_Sub1 local22 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local18];
			@Pc(26) int local26 = arg0.method6138();
			if ((local26 & 0x1) != 0) {
				local26 += arg0.method6138() << 8;
			}
			if ((local26 & 0x8000) != 0) {
				local26 += arg0.method6138() << 16;
			}
			Static74.method1137(local18, local22, arg0, local26);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
	public static void method1338() {
		Static164.method2403(Static297.aClass208_70);
		for (@Pc(22) Class2_Sub9 local22 = (Class2_Sub9) Static394.aClass220_45.method5096(); local22 != null; local22 = (Class2_Sub9) Static394.aClass220_45.method5098()) {
			if (!local22.method6258()) {
				local22 = (Class2_Sub9) Static394.aClass220_45.method5096();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt1142 == 0) {
				Static343.method2399(true, local22, true);
			}
		}
		if (Static361.aClass93_17 != null) {
			Static383.method5263(Static361.aClass93_17);
			Static361.aClass93_17 = null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BII)I")
	public static int method1339(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = Class2_Sub2_Sub9.anIntArray80[(local5 ^ arg1[local7]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public static void method1340() {
		Static436.aClass41_18 = null;
		Static99.aClass41_4 = null;
		Static243.aClass41Array8 = null;
		Static191.aClass41_7 = null;
		aClass41_3 = null;
		Static300.aClass41_15 = null;
		Static340.aClass41_16 = null;
		Static134.aClass41_6 = null;
		Static211.aClass41_9 = null;
	}
}
