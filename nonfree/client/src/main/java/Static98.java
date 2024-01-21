import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1383 = Static106.method1849("Choose Option");

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1381 = aClass66_1383;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1382 = Static106.method1849("sl_arrows");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean107 = true;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1384 = Static106.method1849("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1386 = Static106.method1849("Location");

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1385 = aClass66_1386;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
	public static int[] anIntArray419 = new int[500];

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1387 = Static106.method1849("compass");

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "J")
	public static long aLong105 = 0L;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!sc;IIBIILclient!sc;)V")
	public static void method1749(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5) {
		if (Static112.aBoolean113 || Static5.anInt228 >= 500) {
			return;
		}
		Static97.aClass66Array21[Static5.anInt228] = arg0;
		Static84.aClass66Array18[Static5.anInt228] = arg5;
		anIntArray419[Static5.anInt228] = arg1;
		Static33.anIntArray114[Static5.anInt228] = arg4;
		Static65.anIntArray311[Static5.anInt228] = arg3;
		Static53.anIntArray247[Static5.anInt228] = arg2;
		Static5.anInt228++;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!sc;)V")
	public static void method1751(@OriginalArg(1) Class66 arg0) {
		if (Static33.anInt850 >= 2) {
			if (arg0.method1843(Static41.aClass66_674)) {
				System.gc();
			}
			if (arg0.method1843(Static27.aClass66_449)) {
				Static36.method653();
			}
			if (arg0.method1843(Static52.aClass66_857)) {
				Static126.aBoolean119 = true;
			}
			if (arg0.method1843(Static4.aClass66_134)) {
				Static126.aBoolean119 = false;
			}
			if (arg0.method1843(Static19.aClass66_366)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static83.aClass13Array1[local42].anIntArrayArray11[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method1843(Static89.aClass66_1299) && Static126.anInt2891 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1829(Static25.aClass66_434)) {
				Static71.anInt2010 = arg0.method1831(12).method1808().method1840();
				Static103.method1791(0, null, Static41.method897(new Class66[] { Static4.aClass66_133, Static88.method1632(Static71.anInt2010) }));
			}
			if (arg0.method1843(Static118.aClass66_1591)) {
				Static3.aBoolean2 = true;
			}
		}
		Static127.aClass1_Sub12_Sub1_2.method1227(150);
		Static127.aClass1_Sub12_Sub1_2.method1197(arg0.method1847() - 1);
		Static127.aClass1_Sub12_Sub1_2.method1188(arg0.method1831(2));
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[Lclient!sc;)[Lclient!sc;")
	public static Class66[] method1752(@OriginalArg(1) Class66[] arg0) {
		@Pc(4) Class66[] local4 = new Class66[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static41.method897(new Class66[] { Static88.method1632(local6), Static48.aClass66_800 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static41.method897(new Class66[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	public static void method1757() {
		anIntArray419 = null;
		aString4 = null;
		aClass66_1384 = null;
		aClass66_1383 = null;
		aClass66_1381 = null;
		aClass66_1382 = null;
		aClass66_1385 = null;
		aClass66_1387 = null;
		aClass66_1386 = null;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 method1762() {
		@Pc(9) Class1_Sub1_Sub2_Sub1 local9 = new Class1_Sub1_Sub2_Sub1();
		local9.anInt285 = Static99.anIntArray181[0];
		local9.anInt287 = Static28.anIntArray105[0];
		@Pc(23) byte[] local23 = Static29.aByteArrayArray2[0];
		local9.anInt284 = anInt2486;
		local9.anInt283 = Static125.anIntArray493[0];
		local9.anInt288 = Static48.anInt1502;
		local9.anInt286 = Static14.anIntArray80[0];
		@Pc(53) int local53 = local9.anInt286 * local9.anInt283;
		local9.anIntArray44 = new int[local53];
		for (@Pc(59) int local59 = 0; local59 < local53; local59++) {
			local9.anIntArray44[local59] = Static16.anIntArray81[local23[local59] & 0xFF];
		}
		Static22.method509();
		return local9;
	}
}
