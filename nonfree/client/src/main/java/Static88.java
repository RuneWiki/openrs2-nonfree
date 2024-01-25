import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!es;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_74 = new Class103(30, 7);

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!ma;")
	public static final Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[128][128];

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method1422(@OriginalArg(1) Class1_Sub28 arg0) {
		if (arg0.aByteArray86.length - arg0.anInt6812 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5337();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray86.length - arg0.anInt6812 < 2) {
			return;
		}
		@Pc(42) int local42 = arg0.method5335();
		if (local42 * 6 > arg0.aByteArray86.length - arg0.anInt6812) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < local42; local60++) {
			@Pc(66) int local66 = arg0.method5335();
			@Pc(70) int local70 = arg0.method5355();
			if (Static352.anIntArray414.length > local66 && Static148.aBooleanArray9[local66] && (Static433.aClass138_1.method3186(local66).aChar1 != '1' || local70 >= -1 && local70 <= 1)) {
				Static352.anIntArray414[local66] = local70;
			}
		}
	}
}
