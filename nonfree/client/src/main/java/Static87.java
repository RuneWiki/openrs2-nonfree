import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "Lclient!bc;")
	public static Class1 aClass1_12;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
	public static int anInt1818;

	@OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
	public static int anInt1820;

	@OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
	public static int anInt1821;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "[Lclient!ob;")
	public static final Class3_Sub1_Sub5_Sub5[] aClass3_Sub1_Sub5_Sub5Array1 = new Class3_Sub1_Sub5_Sub5[4];

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_711 = Static120.method1824("Neuer Benutzer");

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_712 = Static120.method1824("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)V")
	public static void method1270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 2048 - arg0 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(26) int local26 = 2048 - arg4 & 0x7FF;
		@Pc(28) int local28 = arg3;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(49) int local49;
		if (local15 != 0) {
			local34 = Class3_Sub1_Sub4_Sub2.anIntArray188[local15];
			local38 = Class3_Sub1_Sub4_Sub2.anIntArray190[local15];
			local49 = local38 * 0 - local34 * arg3 >> 16;
			local28 = local34 * 0 + local38 * arg3 >> 16;
			local19 = local49;
		}
		if (local26 != 0) {
			local38 = Class3_Sub1_Sub4_Sub2.anIntArray190[local26];
			local34 = Class3_Sub1_Sub4_Sub2.anIntArray188[local26];
			local49 = local38 * 0 + local28 * local34 >> 16;
			local28 = local38 * local28 - local34 * 0 >> 16;
			local17 = local49;
		}
		Static149.anInt3350 = arg2 - local19;
		Static163.anInt3648 = arg4;
		Static165.anInt3680 = arg0;
		Static86.anInt1786 = arg5 - local28;
		Static56.anInt1216 = arg1 - local17;
	}
}
