import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_21;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "[Lclient!wa;")
	public static Class2_Sub22[] aClass2_Sub22Array1;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static int anInt2002 = 0;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "Lclient!pe;")
	public static Class65 aClass65_844 = Static119.method1462("Hidden)2use");

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_847 = Static119.method1462("Password: ");

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "Lclient!pe;")
	public static Class65 aClass65_845 = aClass65_847;

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_848 = Static119.method1462("Loading textures )2 ");

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "Lclient!pe;")
	public static Class65 aClass65_846 = aClass65_848;

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "[Lclient!la;")
	public static Class46[] aClass46Array1 = new Class46[4];

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public static void method1494() {
		aClass65_844 = null;
		aClass65_847 = null;
		aClass56_Sub1_21 = null;
		aClass46Array1 = null;
		aClass2_Sub22Array1 = null;
		aClass65_846 = null;
		aClass65_845 = null;
		aClass65_848 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	public static void method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class2_Sub20 local11 = (Class2_Sub20) Static22.aClass40_6.method851((long) arg1);
		if (local11 == null) {
			local11 = new Class2_Sub20();
			Static22.aClass40_6.method849(local11, (long) arg1);
		}
		if (arg0 >= local11.anIntArray345.length) {
			@Pc(37) int[] local37 = new int[arg0 + 1];
			@Pc(42) int[] local42 = new int[arg0 + 1];
			for (@Pc(44) int local44 = 0; local44 < local11.anIntArray345.length; local44++) {
				local37[local44] = local11.anIntArray345[local44];
				local42[local44] = local11.anIntArray344[local44];
			}
			for (@Pc(69) int local69 = local11.anIntArray345.length; local69 < arg0; local69++) {
				local37[local69] = -1;
				local42[local69] = 0;
			}
			local11.anIntArray345 = local37;
			local11.anIntArray344 = local42;
		}
		local11.anIntArray345[arg0] = arg3;
		local11.anIntArray344[arg0] = arg2;
	}
}
