import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
	public static int anInt2190;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
	public static int anInt2185 = 0;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lclient!oo;")
	public static Class155 method1785(@OriginalArg(0) int arg0) {
		@Pc(10) Class155 local10 = (Class155) Static263.aClass103_52.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static104.aClass180_31.method4560(arg0, 36);
		local10 = new Class155();
		local10.anInt4681 = arg0;
		if (local22 != null) {
			local10.method4089(new Class7_Sub3(local22));
		}
		local10.method4088();
		Static263.aClass103_52.method2687(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
	public static void method1786() {
		Static282.aClass180_75.anInt5411 = 1;
		Static251.aClient4.method1005();
		Static71.aBoolean130 = true;
		Static196.aBoolean299 = true;
		Static147.aLong109 = 0L;
		Static339.aClass158_1.anInt4704 = 0;
		Static299.anInt5778 = 0;
		Static347.method5576();
		Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
		Static62.anInt1605 = 0;
		Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
		Static229.anInt4565 = 0;
		Static196.anInt3868 = -1;
		Static234.anInt4651 = -1;
		Static54.anInt1422 = -1;
		Static108.anInt1315 = 0;
		Static127.anInt2797 = -1;
		for (@Pc(4260) int local4260 = 0; local4260 < Static174.aClass50Array1.length; local4260++) {
			Static174.aClass50Array1[local4260] = null;
		}
		Static49.method1086(0);
		for (@Pc(4286) int local4286 = 0; local4286 < 100; local4286++) {
			Static121.aStringArray30[local4286] = null;
		}
		Static91.anInt5969 = (int) (Math.random() * 80.0D) - 40;
		Static218.anInt4347 = (int) (Math.random() * 120.0D) - 60;
		Static254.anInt4937 = (int) (Math.random() * 110.0D) - 55;
		Static235.anInt4675 = 0;
		Static127.anInt2799 = 0;
		Static302.anInt6436 = (int) (Math.random() * 100.0D) - 50;
		Static172.anInt2672 = 0;
		Static49.anInt1359 = (int) (Math.random() * 30.0D) - 20;
		Static253.aBoolean361 = false;
		Static351.aFloat80 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static32.method665();
		Static223.anInt4466 = 0;
		Static11.anInt3203 = 0;
		for (@Pc(4359) int local4359 = 0; local4359 < 2048; local4359++) {
			Static157.aClass22_Sub2_Sub1_Sub1Array1[local4359] = null;
			Static74.aClass7_Sub3Array1[local4359] = null;
		}
		for (@Pc(4375) int local4375 = 0; local4375 < 32768; local4375++) {
			Static69.aClass22_Sub2_Sub1_Sub2Array1[local4375] = null;
		}
		Static252.aClass22_Sub2_Sub1_Sub1_4 = Static157.aClass22_Sub2_Sub1_Sub1Array1[2047] = new Class22_Sub2_Sub1_Sub1();
		Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5115 = 2047;
		Static192.aClass74_29.method1803();
		Static338.aClass74_36.method1803();
		Static187.aClass191_4.method4865();
		Static185.aClass10_33.method156();
		Static79.aClass74_9 = new Class74();
		Static139.anInt3024 = 0;
		Static124.anInt2775 = 0;
		Static78.method5357();
		Static173.method3242();
		Static109.anInt60 = 0;
		Static42.anInt1100 = 0;
		Static52.anInt1396 = 0;
		Static136.anInt2916 = 0;
		Static121.anInt2750 = 0;
		Static42.anInt1095 = 0;
		Static198.anInt3898 = 0;
		Static318.anInt614 = 0;
		Static175.anInt3621 = 0;
		Static126.anInt2791 = 0;
		for (@Pc(4444) int local4444 = 0; local4444 < Static165.anIntArray464.length; local4444++) {
			if (!Static120.aBooleanArray17[local4444]) {
				Static165.anIntArray464[local4444] = -1;
			}
		}
		if (Static161.anInt3337 != -1) {
			Static94.method1901(Static161.anInt3337);
		}
		for (@Pc(4472) Class7_Sub17 local4472 = (Class7_Sub17) Static247.aClass10_40.method157(); local4472 != null; local4472 = (Class7_Sub17) Static247.aClass10_40.method155()) {
			if (!local4472.method5651()) {
				local4472 = (Class7_Sub17) Static247.aClass10_40.method157();
				if (local4472 == null) {
					break;
				}
			}
			Static89.method1858(true, false, local4472);
		}
		Static161.anInt3337 = -1;
		Static247.aClass10_40 = new Class10(8);
		Static75.method1502();
		Static165.aClass26_19 = null;
		Static144.aClass214_2.method5590(false, new int[5], -1, null, -1);
		for (@Pc(4521) int local4521 = 0; local4521 < 8; local4521++) {
			Static135.aStringArray31[local4521] = null;
			Static299.aBooleanArray28[local4521] = false;
			Static49.anIntArray204[local4521] = -1;
		}
		Static51.method1096();
		Static138.aBoolean227 = true;
		for (@Pc(4547) int local4547 = 0; local4547 < 100; local4547++) {
			Static276.aBooleanArray27[local4547] = true;
		}
		Static316.aString392 = null;
		Static129.anInt2833 = 0;
		Static275.aClass115Array1 = null;
		for (@Pc(4567) int local4567 = 0; local4567 < 6; local4567++) {
			Static224.aClass125Array1[local4567] = new Class125();
		}
		for (@Pc(4583) int local4583 = 0; local4583 < 25; local4583++) {
			Static204.anIntArray557[local4583] = 0;
			Static145.anIntArray414[local4583] = 0;
			Static212.anIntArray580[local4583] = 0;
		}
		Static198.method3548();
		Static34.aBoolean59 = false;
		Static168.anInt3502 = 0;
		Static13.aBoolean10 = true;
		Static275.aShortArray111 = Static69.aShortArray26 = Static200.aShortArray63 = Static280.aShortArray105 = new short[256];
		Static272.aString340 = Static272.aString341;
		Static213.method3777();
		Static316.method5130();
		Static282.aClass180_75.anInt5411 = 2;
	}
}
