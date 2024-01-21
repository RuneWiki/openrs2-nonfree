import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public static int anInt2043;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_8 = new Class53(64);

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_722 = Static151.method2243("null");

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_724 = Static151.method2243("Loading config )2 ");

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!mb;")
	public static Class62 aClass62_723 = aClass62_724;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_725 = Static151.method2243("AUS");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BZ)V")
	public static void method1391(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg0);
		local10.anInt2235 = arg0.length - 2;
		Static208.anInt4345 = local10.method1557();
		Static25.anIntArray57 = new int[Static208.anInt4345];
		Static86.anIntArray298 = new int[Static208.anInt4345];
		Static138.anIntArray256 = new int[Static208.anInt4345];
		Static8.aByteArrayArray1 = new byte[Static208.anInt4345][];
		Static19.anIntArray38 = new int[Static208.anInt4345];
		local10.anInt2235 = arg0.length - Static208.anInt4345 * 8 - 7;
		Static138.anInt2900 = local10.method1557();
		Static127.anInt2808 = local10.method1557();
		@Pc(62) int local62 = (local10.method1534() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static208.anInt4345; local64++) {
			Static19.anIntArray38[local64] = local10.method1557();
		}
		for (@Pc(82) int local82 = 0; local82 < Static208.anInt4345; local82++) {
			Static25.anIntArray57[local82] = local10.method1557();
		}
		for (@Pc(100) int local100 = 0; local100 < Static208.anInt4345; local100++) {
			Static86.anIntArray298[local100] = local10.method1557();
		}
		for (@Pc(118) int local118 = 0; local118 < Static208.anInt4345; local118++) {
			Static138.anIntArray256[local118] = local10.method1557();
		}
		local10.anInt2235 = arg0.length - Static208.anInt4345 * 8 - local62 * 3 - 4;
		Static108.anIntArray222 = new int[local62];
		for (@Pc(154) int local154 = 1; local154 < local62; local154++) {
			Static108.anIntArray222[local154] = local10.method1536();
			if (Static108.anIntArray222[local154] == 0) {
				Static108.anIntArray222[local154] = 1;
			}
		}
		local10.anInt2235 = 0;
		for (@Pc(190) int local190 = 0; local190 < Static208.anInt4345; local190++) {
			@Pc(198) int local198 = Static86.anIntArray298[local190];
			@Pc(202) int local202 = Static138.anIntArray256[local190];
			@Pc(206) int local206 = local202 * local198;
			@Pc(209) byte[] local209 = new byte[local206];
			Static8.aByteArrayArray1[local190] = local209;
			@Pc(217) int local217 = local10.method1534();
			@Pc(224) int local224;
			if (local217 == 0) {
				for (local224 = 0; local224 < local206; local224++) {
					local209[local224] = local10.method1552();
				}
			} else if (local217 == 1) {
				for (local224 = 0; local224 < local198; local224++) {
					for (@Pc(228) int local228 = 0; local228 < local202; local228++) {
						local209[local224 + local198 * local228] = local10.method1552();
					}
				}
			}
		}
	}
}
