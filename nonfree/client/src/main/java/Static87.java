import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "Lclient!rk;")
	public static Class180 aClass180_80;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "Lclient!rk;")
	public static Class180 aClass180_81;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "Lclient!fp;")
	public static Class77 aClass77_9;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "[I")
	public static final int[] anIntArray719 = new int[13];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class2 method4767(@OriginalArg(1) int arg0) {
		@Pc(12) Class2 local12 = (Class2) Static52.aClass103_13.method2682((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static347.aClass180_98.method4560(arg0, 1);
		local12 = new Class2();
		local12.anInt4 = arg0;
		if (local22 != null) {
			local12.method10(new Class7_Sub3(local22));
		}
		local12.method11();
		if (local12.anInt14 == 2 && Static122.aClass10_19.method163((long) arg0) == null) {
			Static122.aClass10_19.method161((long) arg0, new Class7_Sub10(Static63.anInt5458));
			Static331.aClass2Array1[Static63.anInt5458++] = local12;
		}
		Static52.aClass103_13.method2687(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IJ)V")
	public static void method4770(@OriginalArg(1) long arg0) {
		if (Static331.aClass8Array5 != null) {
			if (Static118.anInt6324 == 1 || Static118.anInt6324 == 5) {
				Static138.method2804(arg0);
			} else if (Static118.anInt6324 == 2) {
				Static272.method4539();
			} else if (Static118.anInt6324 == 4) {
				Static253.method4300(arg0);
			} else {
				Static329.method5250();
			}
		}
		Static42.method899((long) Static212.anInt4234, Static128.aClass89_3);
		if (Static161.anInt3337 != -1) {
			Static71.method1393(Static161.anInt3337);
		}
		for (@Pc(54) int local54 = 0; local54 < Static43.anInt1148; local54++) {
			if (Static276.aBooleanArray27[local54]) {
				Static339.aBooleanArray30[local54] = true;
			}
			Static280.aBooleanArray21[local54] = Static276.aBooleanArray27[local54];
			Static276.aBooleanArray27[local54] = false;
		}
		Static286.anInt5635 = Static212.anInt4234;
		if (Static128.aClass89_3.method5393()) {
			Static164.aBoolean249 = true;
		}
		Static162.aClass26_17 = null;
		if (Static161.anInt3337 != -1) {
			Static43.anInt1148 = 0;
			Static118.method5339();
		}
		Static128.aClass89_3.method5425();
		Static11.method2945(Static128.aClass89_3);
		@Pc(109) int local109 = Static93.method1895();
		if (local109 == -1) {
			local109 = Static348.anInt6555;
		}
		Static291.method4774(local109);
		Static177.method3285(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973, Static168.anInt3508, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967, Static105.anInt6011);
		Static105.anInt6011 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)Lclient!tj;")
	public static Class7_Sub37 method4771() {
		if (Static306.aClass74_23 == null || Static67.aClass166_2 == null) {
			return null;
		}
		Static67.aClass166_2.method4261(Static306.aClass74_23);
		@Pc(18) Class7_Sub37 local18 = (Class7_Sub37) Static67.aClass166_2.method4263();
		if (local18 == null) {
			return null;
		} else {
			@Pc(32) Class155 local32 = Static84.method1785(local18.anInt5839);
			return local32 != null && local32.aBoolean347 && local32.method4084() ? local18 : Static200.method3574();
		}
	}
}
