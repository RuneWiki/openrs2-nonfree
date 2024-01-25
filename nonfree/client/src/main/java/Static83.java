import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_2 = new Class261("", 15);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_19 = new Class136(64);

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_10 = new Class361();

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V")
	public static void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class197 local3 = new Class197();
		local3.anInt5443 = arg1 >> Static339.anInt6128;
		local3.anInt5434 = arg2 >> Static339.anInt6128;
		local3.anInt5449 = arg3 >> Static339.anInt6128;
		local3.anInt5432 = arg4 >> Static339.anInt6128;
		local3.anInt5442 = arg0;
		local3.anInt5440 = arg1;
		local3.anInt5448 = arg2;
		local3.anInt5439 = arg3;
		local3.anInt5438 = arg4;
		local3.anInt5429 = arg5;
		local3.anInt5445 = arg6;
		Static185.aClass197Array1[Static478.anInt8127++] = local3;
	}
}
