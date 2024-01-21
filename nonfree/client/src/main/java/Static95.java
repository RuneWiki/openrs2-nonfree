import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_647 = Static81.method1507("Cancel");

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_648 = Static81.method1507("leuchten2:");

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array14 = new Class24[100];

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "Lclient!dj;")
	public static Class24 aClass24_649 = aClass24_647;

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_650 = Static81.method1507("Standort");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
	public static void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2_Sub6 local7 = Static41.method1050(arg0);
		@Pc(15) int local15 = local7.anInt1161;
		@Pc(18) int local18 = local7.anInt1160;
		@Pc(21) int local21 = local7.anInt1164;
		@Pc(27) int local27 = Class3.anIntArray410[local21 - local18];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local18;
		Static122.anIntArray213[local15] = ~local27 & Static122.anIntArray213[local15] | local27 & arg1 << local18;
	}
}
