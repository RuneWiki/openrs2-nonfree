import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1096 = Static56.method816("leuchten3:");

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1097 = Static56.method816("Please remove ");

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1098 = Static56.method816("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1099 = aClass34_1097;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1100 = null;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt2341 = 0;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1101 = aClass34_1097;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!lf;")
	public static Class48 aClass48_44 = new Class48(500);

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public static int anInt2344 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method1450() {
		aClass34_1100 = null;
		aClass48_44 = null;
		aClass34_1096 = null;
		aClass34_1101 = null;
		aClass34_1098 = null;
		aClass34_1099 = null;
		aClass34_1097 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!dd;III)Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 method1452(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static134.method2026(arg2, arg1, arg0) ? Static75.method1099() : null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BIII)Z")
	public static boolean method1453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = -1;
		@Pc(19) Class8_Sub20 local19 = new Class8_Sub20(arg0);
		label54: while (true) {
			@Pc(23) int local23 = local19.method1849();
			if (local23 == 0) {
				return local7;
			}
			@Pc(30) int local30 = 0;
			local14 += local23;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local19.method1849();
					if (local42 == 0) {
						continue label54;
					}
					local30 += local42 - 1;
					@Pc(74) int local74 = local30 >> 6 & 0x3F;
					@Pc(78) int local78 = local30 & 0x3F;
					@Pc(82) int local82 = local74 + arg1;
					@Pc(88) int local88 = local19.method1872() >> 2;
					@Pc(92) int local92 = arg2 + local78;
					if (local82 > 0 && local92 > 0 && local82 < 103 && local92 < 103) {
						@Pc(114) Class8_Sub1_Sub4 local114 = Static50.method752(local14);
						if (local88 != 22 || !Static108.aBoolean98 || local114.anInt414 != 0 || local114.anInt424 == 1 || local114.aBoolean20) {
							local36 = true;
							if (!local114.method271()) {
								local7 = false;
								Static36.anInt922++;
							}
						}
					}
				}
				local42 = local19.method1849();
				if (local42 == 0) {
					break;
				}
				local19.method1872();
			}
		}
	}
}
