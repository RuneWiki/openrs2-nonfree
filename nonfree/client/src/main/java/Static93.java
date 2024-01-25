import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_30 = new Class244(81, 2);

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	public static int anInt1914 = -1;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_10 = new Class138();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!b;II)Lclient!qb;")
	public static Class190 method1548(@OriginalArg(1) Class20 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method253(0, arg1);
		return local14 == null ? null : new Class190(local14);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V")
	public static void method1549() {
		Static229.method3783(Static12.aClass244_4);
		for (@Pc(21) Class3_Sub22 local21 = (Class3_Sub22) Static29.aClass44_26.method950(); local21 != null; local21 = (Class3_Sub22) Static29.aClass44_26.method949()) {
			if (!local21.method5702()) {
				local21 = (Class3_Sub22) Static29.aClass44_26.method950();
				if (local21 == null) {
					break;
				}
			}
			if (local21.anInt3027 == 0) {
				Static53.method985(local21, true, true);
			}
		}
		if (Static53.aClass62_2 != null) {
			Static158.method2441(Static53.aClass62_2);
			Static53.aClass62_2 = null;
		}
	}
}
