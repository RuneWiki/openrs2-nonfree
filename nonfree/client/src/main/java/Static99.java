import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!he", name = "O", descriptor = "[I")
	public static int[] anIntArray221;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!wf;")
	public static Class191 aClass191_6;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Lclient!sd;")
	public static Class1_Sub24 aClass1_Sub24_1 = new Class1_Sub24(0, 0);

	@OriginalMember(owner = "client!he", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString130 = "Allocating memory";

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!wf;ZI)V")
	public static void method1655(@OriginalArg(0) Class191 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt6155 == 0 ? arg0.anInt6088 : arg0.anInt6155;
		@Pc(30) int local30 = arg0.anInt6151 == 0 ? arg0.anInt6128 : arg0.anInt6151;
		Static116.method1871(arg1, arg0.anInt6134, local30, local12, Static34.aClass191ArrayArray1[arg0.anInt6134 >> 16]);
		if (arg0.aClass191Array2 != null) {
			Static116.method1871(arg1, arg0.anInt6134, local30, local12, arg0.aClass191Array2);
		}
		@Pc(64) Class1_Sub12 local64 = (Class1_Sub12) Static48.aClass186_5.method4570((long) arg0.anInt6134);
		if (local64 != null) {
			Static63.method1123(local64.anInt2208, local30, local12, arg1);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)Z")
	public static boolean method1656(@OriginalArg(0) int arg0) {
		if (Static103.aBooleanArray17[arg0]) {
			return true;
		} else if (Static130.aClass168_99.method4060(arg0)) {
			@Pc(24) int local24 = Static130.aClass168_99.method4068(arg0);
			if (local24 == 0) {
				Static103.aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static34.aClass191ArrayArray1[arg0] == null) {
				Static34.aClass191ArrayArray1[arg0] = new Class191[local24];
			}
			for (@Pc(56) int local56 = 0; local56 < local24; local56++) {
				if (Static34.aClass191ArrayArray1[arg0][local56] == null) {
					@Pc(71) byte[] local71 = Static130.aClass168_99.method4058(local56, arg0);
					if (local71 != null) {
						@Pc(83) Class191 local83 = Static34.aClass191ArrayArray1[arg0][local56] = new Class191();
						local83.anInt6134 = local56 + (arg0 << 16);
						if (local71[0] == -1) {
							local83.method4671(new Class1_Sub14(local71));
						} else {
							local83.method4668(new Class1_Sub14(local71));
						}
					}
				}
			}
			Static103.aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)I")
	public static int method1657(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
