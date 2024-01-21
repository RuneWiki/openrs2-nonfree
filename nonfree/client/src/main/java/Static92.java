import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	public static int anInt2689;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_15 = new Class25(64);

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!rf;")
	private static Class70 aClass70_878 = Static49.method1293("Welcome to RuneScape");

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_879 = Static49.method1293("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_880 = aClass70_878;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
	public static int[] anIntArray254 = new int[100];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BB)V")
	public static void method1989(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class1_Sub9 local6 = new Class1_Sub9(arg0);
		local6.anInt1592 = arg0.length - 2;
		Static21.anInt587 = local6.method1280();
		Static95.anIntArray257 = new int[Static21.anInt587];
		Static53.anIntArray173 = new int[Static21.anInt587];
		Static119.anIntArray319 = new int[Static21.anInt587];
		Static101.anIntArray272 = new int[Static21.anInt587];
		Static179.aByteArrayArray10 = new byte[Static21.anInt587][];
		local6.anInt1592 = arg0.length - Static21.anInt587 * 8 - 7;
		Static74.anInt2262 = local6.method1280();
		Static182.anInt4532 = local6.method1280();
		@Pc(68) int local68 = (local6.method1234() & 0xFF) + 1;
		for (@Pc(70) int local70 = 0; local70 < Static21.anInt587; local70++) {
			Static95.anIntArray257[local70] = local6.method1280();
		}
		for (@Pc(88) int local88 = 0; local88 < Static21.anInt587; local88++) {
			Static119.anIntArray319[local88] = local6.method1280();
		}
		for (@Pc(102) int local102 = 0; local102 < Static21.anInt587; local102++) {
			Static101.anIntArray272[local102] = local6.method1280();
		}
		for (@Pc(120) int local120 = 0; local120 < Static21.anInt587; local120++) {
			Static53.anIntArray173[local120] = local6.method1280();
		}
		local6.anInt1592 = arg0.length - Static21.anInt587 * 8 - (local68 - 1) * 3 - 7;
		Static150.anIntArray375 = new int[local68];
		for (@Pc(158) int local158 = 1; local158 < local68; local158++) {
			Static150.anIntArray375[local158] = local6.method1230();
			if (Static150.anIntArray375[local158] == 0) {
				Static150.anIntArray375[local158] = 1;
			}
		}
		local6.anInt1592 = 0;
		for (@Pc(187) int local187 = 0; local187 < Static21.anInt587; local187++) {
			@Pc(193) int local193 = Static53.anIntArray173[local187];
			@Pc(197) int local197 = Static101.anIntArray272[local187];
			@Pc(201) int local201 = local197 * local193;
			@Pc(204) byte[] local204 = new byte[local201];
			Static179.aByteArrayArray10[local187] = local204;
			@Pc(212) int local212 = local6.method1234();
			@Pc(219) int local219;
			if (local212 == 0) {
				for (local219 = 0; local219 < local201; local219++) {
					local204[local219] = local6.method1243();
				}
			} else if (local212 == 1) {
				for (local219 = 0; local219 < local197; local219++) {
					for (@Pc(223) int local223 = 0; local223 < local193; local223++) {
						local204[local219 + local223 * local197] = local6.method1243();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!u;Lclient!u;ZLclient!ne;B)V")
	public static void method1990(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub2_Sub1 arg3) {
		Static101.aClass76_83 = arg0;
		Static174.aClass76_133 = arg1;
		Static162.aBoolean163 = arg2;
		Static149.anInt4001 = Static174.aClass76_133.method3306(10);
		Static117.aClass1_Sub1_Sub1_Sub2_Sub1_4 = arg3;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1991() {
		aClass70_879 = null;
		aClass70_878 = null;
		anIntArrayArrayArray7 = null;
		aClass70_880 = null;
		aClass25_15 = null;
		anIntArray254 = null;
	}
}
