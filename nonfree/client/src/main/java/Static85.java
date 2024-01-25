import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!er", name = "P", descriptor = "I")
	public static int anInt1601 = 0;

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ZI)I")
	public static int method1709(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static22.method285();
		for (@Pc(25) Class2_Sub17 local25 = arg0 ? (Class2_Sub17) Static180.aClass41_19.method896() : (Class2_Sub17) Static180.aClass41_19.method904(); local25 != null; local25 = (Class2_Sub17) Static180.aClass41_19.method904()) {
			if ((local25.aLong74 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local25.aLong74 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local25.aLong219;
					Static181.anIntArray308[local50] = Static258.anIntArray417[local50];
					local25.method5723();
					return local50;
				}
				local25.method5723();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V")
	public static void method1710() {
		Static63.aClass107_8.method3012();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method1711(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt1829 != Static329.anInt6363) {
			return;
		}
		if (Static177.aClass1_Sub2_Sub3_Sub1_1.aString34 == null) {
			arg0.anInt1903 = 0;
			arg0.anInt1896 = 0;
			return;
		}
		arg0.anInt1907 = 150;
		arg0.anInt1887 = (int) (Math.sin((double) Static6.anInt91 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt1897 = 5;
		arg0.anInt1903 = Static217.anInt4819;
		arg0.anInt1896 = Static232.method4276(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34);
		arg0.anInt1906 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6899;
		arg0.anInt1899 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6942;
		arg0.anInt1880 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6901;
		arg0.anInt1838 = 0;
	}
}
