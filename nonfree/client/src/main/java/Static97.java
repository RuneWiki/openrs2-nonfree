import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 aClass2_Sub1_Sub7_Sub4_5;

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_789 = Static158.method3034("::autoshadow on");

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
	public static int anInt2845 = 0;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "[[B")
	public static final byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BIIZ)Lclient!ob;")
	public static Class60 method2262(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(28) int local28 = arg0 / 10;
		@Pc(30) int local30 = 1;
		while (local28 != 0) {
			local30++;
			local28 /= 10;
		}
		@Pc(41) int local41 = local30;
		if (arg0 < 0 || arg1) {
			local41 = local30 + 1;
		}
		@Pc(52) byte[] local52 = new byte[local41];
		if (arg0 < 0) {
			local52[0] = 45;
		} else if (arg1) {
			local52[0] = 43;
		}
		for (@Pc(79) int local79 = 0; local79 < local30; local79++) {
			@Pc(85) int local85 = arg0 % 10;
			arg0 /= 10;
			if (local85 < 0) {
				local85 = -local85;
			}
			if (local85 > 9) {
				local85 += 39;
			}
			local52[local41 - local79 - 1] = (byte) (local85 + 48);
		}
		@Pc(120) Class60 local120 = new Class60();
		local120.aByteArray39 = local52;
		local120.anInt3466 = local41;
		return local120;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BI)[B")
	public static byte[] method2263(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub3 local8 = new Class2_Sub3(arg0);
		@Pc(12) int local12 = local8.method218();
		@Pc(16) int local16 = local8.method206();
		if (local16 < 0 || Static53.anInt1690 != 0 && Static53.anInt1690 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(44) byte[] local44 = new byte[local16];
			local8.method228(local16, local44);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method206();
			if (local56 < 0 || Static53.anInt1690 != 0 && Static53.anInt1690 < local56) {
				throw new RuntimeException();
			}
			@Pc(76) byte[] local76 = new byte[local56];
			if (local12 == 1) {
				Static154.method2992(local76, local56, arg0, local16);
			} else {
				Static60.aClass95_1.method3581(local76, local8);
			}
			return local76;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BB)Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 method2264(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class2_Sub1_Sub7_Sub3_Sub1 local18 = new Class2_Sub1_Sub7_Sub3_Sub1(arg0, Static30.anIntArray96, Static30.anIntArray95, Static178.anIntArray468, Static103.anIntArray342, Static16.anIntArray43, Static197.aByteArrayArray10);
			Static81.method1910();
			return local18;
		}
	}
}
