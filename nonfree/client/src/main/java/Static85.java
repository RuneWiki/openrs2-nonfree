import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "Lclient!sd;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
	public static int anInt1908;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	public static int anInt1910;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_66 = new Class217(32, 15);

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
	public static int anInt1913 = 2;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_67 = new Class217(6, 4);

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_68 = new Class106("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_68 = new Class217(17, 8);

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_58 = new Class21(20);

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
	public static final int anInt1914 = 52;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(III)V")
	public static void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static105.aClass155ArrayArrayArray3[0][arg1][arg2] != null && Static105.aClass155ArrayArrayArray3[0][arg1][arg2].aClass155_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static105.aClass155ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class155 local46 = Static105.aClass155ArrayArrayArray3[local22][arg1][arg2] = new Class155(local22, arg1, arg2);
				if (local20) {
					local46.aByte41++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ct;Lclient!ct;IZI)V")
	public static void method1807(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(4) int arg2) {
		Static20.aBoolean28 = true;
		Static339.aClass30_90 = arg0;
		Static171.aClass30_54 = arg1;
		Static93.anInt5013 = arg2;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Z")
	public static boolean method1808(@OriginalArg(0) int arg0) {
		Static254.aBoolean383 = true;
		Static235.anInt4759 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
