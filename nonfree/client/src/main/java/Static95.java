import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
	public static final int[] anIntArray195 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Lclient!im;")
	public static final Class140 aClass140_31 = new Class140(26, 5);

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_27 = new Class306("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBI)V")
	public static void method1650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static381.aClass232_6.method5432(Static179.aClass306_39.method7165(Static179.anInt3168));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub24 local18 = (Class1_Sub24) Static248.aClass37_30.method977(); local18 != null; local18 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			local24 = Static138.method2265(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static16.anInt415 * 16 + 21;
		@Pc(50) int local50 = arg1 - local13 / 2;
		if (Static83.anInt1567 < local50 + local13) {
			local50 = Static83.anInt1567 - local13;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(74) int local74 = arg0;
		if (Static350.anInt6255 < local24 + arg0) {
			local74 = Static350.anInt6255 - local24;
		}
		Static13.anInt305 = local50;
		if (local74 < 0) {
			local74 = 0;
		}
		Static541.anInt9145 = local13;
		Static260.anInt5040 = Static16.anInt415 * 16 + (Static541.aBoolean640 ? 26 : 22);
		Static188.anInt3359 = local74;
		Static15.aBoolean16 = true;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
	public static void method1651(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub11 local15 = Static541.method7520(10, arg0);
		local15.method4945();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZI)Z")
	public static boolean method1652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static389.method5894(arg1, arg0) | (arg1 & 0x70000) != 0 || Static499.method6935(arg0, arg1);
	}
}
