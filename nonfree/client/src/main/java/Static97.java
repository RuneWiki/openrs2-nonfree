import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
	public static int anInt2361;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!ol;")
	public static final Class182 aClass182_34 = new Class182("", 15);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!si;B)V")
	public static void method1842(@OriginalArg(0) Class2_Sub23 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static427.anInt7111; local3++) {
			@Pc(9) int local9 = arg0.method5479();
			@Pc(13) int local13 = arg0.method5500();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static204.aClass219_Sub1Array2[local9] != null) {
				Static204.aClass219_Sub1Array2[local9].anInt6535 = local13;
			}
		}
	}
}
