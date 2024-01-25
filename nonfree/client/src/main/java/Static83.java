import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
	public static int anInt1555;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_58 = new Class157(51, 7);

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "Lclient!jk;")
	public static final Class2_Sub12_Sub2 aClass2_Sub12_Sub2_1 = new Class2_Sub12_Sub2(5000);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
	public static void method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class2_Sub9_Sub4 local13 = Static98.method1971(4, arg2);
		local13.method1801();
		local13.anInt1719 = arg3;
		local13.anInt1723 = arg0;
		local13.anInt1729 = arg1;
	}
}
