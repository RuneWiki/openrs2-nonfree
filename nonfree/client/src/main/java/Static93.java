import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_32 = new Class337(111, -1);

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_33 = new Class337(79, 7);

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	public static int anInt1896 = 1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIB)V")
	public static void method1563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static554.anInt9362 <= arg2 && Static62.anInt1300 >= arg2) {
			@Pc(24) int local24 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg1);
			@Pc(30) int local30 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg3);
			Static545.method7971(arg2, local24, local30, arg0);
		}
	}
}
