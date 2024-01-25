import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "Lclient!em;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
	public static int anInt2090;

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "Lclient!ju;")
	public static Class2_Sub22 aClass2_Sub22_2;

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_45 = new Class209("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "Lclient!di;")
	public static final Class54 aClass54_27 = new Class54(12, 3);

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_34 = new Class265(18, 12);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method1683() {
		@Pc(15) Class99 local15 = null;
		try {
			@Pc(20) Class138 local20 = Static43.aClass59_5.method1355("2");
			while (local20.anInt3723 == 0) {
				Static81.method1477(1L);
			}
			if (local20.anInt3723 == 1) {
				local15 = (Class99) local20.anObject7;
				@Pc(45) byte[] local45 = new byte[(int) local15.method2256()];
				@Pc(59) int local59;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local59) {
					local59 = local15.method2255(local47, local45.length - local47, local45);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static245.method5120(new Class2_Sub23(local45));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local15 != null) {
				local15.method2257();
			}
		} catch (@Pc(95) Exception local95) {
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z")
	public static boolean method1686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static359.method4894(arg1, arg0) || Static330.method4569(arg0, arg1);
	}
}
