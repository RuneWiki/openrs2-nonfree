import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ke", name = "Rb", descriptor = "Z")
	public static boolean aBoolean80;

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_640 = Static38.method685("Unexpected server response)3");

	@OriginalMember(owner = "client!ke", name = "Db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_636 = aClass6_640;

	@OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_638 = Static38.method685("Loaded textures");

	@OriginalMember(owner = "client!ke", name = "Eb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_637 = aClass6_638;

	@OriginalMember(owner = "client!ke", name = "Hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_639 = Static38.method685("<col=ffffff>");

	@OriginalMember(owner = "client!ke", name = "Sb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_641 = Static38.method685("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "(I)V")
	public static void method1450() {
		aClass6_637 = null;
		aClass6_639 = null;
		aClass6_636 = null;
		aClass6_638 = null;
		aClass6_640 = null;
		aClass6_641 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIZBLclient!mb;I)V")
	public static void method1453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) Class10_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(15) long local15 = (long) ((arg1 << 16) + arg5);
		@Pc(21) Class2_Sub3_Sub18 local21 = (Class2_Sub3_Sub18) Static158.aClass16_12.method479(local15);
		if (local21 != null) {
			return;
		}
		local21 = (Class2_Sub3_Sub18) Static153.aClass16_11.method479(local15);
		if (local21 != null) {
			return;
		}
		local21 = (Class2_Sub3_Sub18) Static86.aClass16_6.method479(local15);
		if (local21 == null) {
			if (!arg2) {
				local21 = (Class2_Sub3_Sub18) Static85.aClass16_5.method479(local15);
				if (local21 != null) {
					return;
				}
			}
			local21 = new Class2_Sub3_Sub18();
			local21.aByte9 = arg3;
			local21.anInt4039 = arg0;
			local21.aClass10_Sub1_19 = arg4;
			if (arg2) {
				Static158.aClass16_12.method480(local21, local15);
				Static77.anInt1912++;
			} else {
				Static36.aClass60_2.method1869(local21);
				Static86.aClass16_6.method480(local21, local15);
				Static89.anInt2267++;
			}
		} else if (arg2) {
			local21.method2725();
			Static158.aClass16_12.method480(local21, local15);
			Static77.anInt1912++;
			Static89.anInt2267--;
		}
	}
}
