import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_49 = new Class251(35, 4);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)Z")
	public static boolean method1433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method1435(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 11);
		local9.method4001();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1436(@OriginalArg(1) Class144 arg0) {
		Static564.aClass272Array1 = new Class272[Static421.anIntArray369.length];
		for (@Pc(16) int local16 = 0; local16 < Static421.anIntArray369.length; local16++) {
			@Pc(21) int local21 = Static421.anIntArray369[local16];
			@Pc(26) Class350 local26 = Static63.method1038(local21, Static588.aClass310_115);
			@Pc(34) Class68 local34 = arg0.method6958(local26, Static697.method6468(Static33.aClass310_9, local21), true);
			Static564.aClass272Array1[local16] = new Class272(local34, local26);
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(II)Z")
	public static boolean method1437(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
