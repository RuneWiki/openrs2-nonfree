import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ew", name = "A", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "Z")
	public static final boolean aBoolean149 = false;

	@OriginalMember(owner = "client!ew", name = "Q", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_13 = new Class142();

	@OriginalMember(owner = "client!ew", name = "U", descriptor = "[I")
	public static final int[] anIntArray97 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1591(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static305.method4200(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static342.anInt6234; local29++) {
			@Pc(35) String local35 = Static396.aStringArray40[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static305.method4200(local35);
			if (local35 != null && local35.equals(local24)) {
				Static342.anInt6234--;
				for (@Pc(59) int local59 = local29; local59 < Static342.anInt6234; local59++) {
					Static396.aStringArray40[local59] = Static396.aStringArray40[local59 + 1];
					Static16.aStringArray3[local59] = Static16.aStringArray3[local59 + 1];
					Static435.anIntArray445[local59] = Static435.anIntArray445[local59 + 1];
					Static72.aStringArray13[local59] = Static72.aStringArray13[local59 + 1];
					Static309.anIntArray397[local59] = Static309.anIntArray397[local59 + 1];
					Static136.aBooleanArray10[local59] = Static136.aBooleanArray10[local59 + 1];
				}
				Static238.anInt4203 = Static270.anInt2350;
				Static224.method3272(Static284.aClass254_99);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(arg0));
				Static201.aClass1_Sub14_Sub2_2.method4512(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IZIIIZFI)[I")
	public static int[] method1593(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub2_Sub36 local10 = new Class1_Sub2_Sub36();
		local10.anInt7042 = 8;
		local10.aBoolean589 = true;
		local10.anInt7046 = 8;
		local10.anInt7040 = (int) (arg0 * 4096.0F);
		local10.anInt7038 = 4;
		local10.anInt7045 = 35;
		local10.method5864();
		Static316.method4366(2048, 1);
		local10.method5430(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!ir;)V")
	public static void method1594(@OriginalArg(1) Class47_Sub1_Sub5 arg0) {
		if (arg0 instanceof Class47_Sub1_Sub5_Sub1) {
			@Pc(24) Class47_Sub1_Sub5_Sub1 local24 = (Class47_Sub1_Sub5_Sub1) arg0;
			if (local24.aClass196_1 != null) {
				Static37.method3518(Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 != local24.aByte97, local24);
			}
		} else if (arg0 instanceof Class47_Sub1_Sub5_Sub2) {
			@Pc(8) Class47_Sub1_Sub5_Sub2 local8 = (Class47_Sub1_Sub5_Sub2) arg0;
			Static64.method970(local8.aByte97 != Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, local8);
		}
	}
}
