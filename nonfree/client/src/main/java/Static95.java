import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_774 = Static158.method3034("Too many connections from your address)3");

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_777 = Static158.method3034("");

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_775 = aClass60_777;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!ob;")
	public static Class60 aClass60_776 = aClass60_777;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!ob;")
	public static Class60 aClass60_778 = aClass60_777;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_779 = Static158.method3034("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_780 = aClass60_774;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!ob;")
	public static Class60 aClass60_781 = aClass60_777;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!ob;")
	public static Class60 aClass60_782 = aClass60_777;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_783 = Static158.method3034("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!ob;")
	public static Class60 aClass60_784 = aClass60_777;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	public static void method2243(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub15 local10 = (Class2_Sub15) Static88.aClass51_7.method2458((long) arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray391.length; local15++) {
				local10.anIntArray391[local15] = -1;
				local10.anIntArray393[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!aa;Lclient!aa;IIJ)V")
	public static void method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class74 local8 = new Class74();
		local8.aLong127 = arg8;
		local8.anInt3945 = arg1 * 128 + 64;
		local8.anInt3949 = arg2 * 128 + 64;
		local8.anInt3946 = arg3;
		local8.aClass2_Sub1_Sub1_10 = arg4;
		local8.aClass2_Sub1_Sub1_9 = arg5;
		local8.anInt3947 = arg6;
		local8.anInt3948 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static118.aClass2_Sub17ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static118.aClass2_Sub17ArrayArrayArray1[local42][arg1][arg2] = new Class2_Sub17(local42, arg1, arg2);
			}
		}
		Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass74_1 = local8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIILclient!og;I)V")
	public static void method2245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub3 arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19;
		if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local19 = arg5.method218();
				if (local19 == 0) {
					break;
				}
				if (local19 == 1) {
					arg5.method218();
					break;
				}
				if (local19 <= 49) {
					arg5.method218();
				}
			}
			return;
		}
		Static147.aByteArrayArrayArray36[arg3][arg1][arg2] = 0;
		while (true) {
			local19 = arg5.method218();
			if (local19 == 0) {
				if (arg3 == 0) {
					Static32.anIntArrayArrayArray4[0][arg1][arg2] = -Static10.method281(arg4 + arg2 + 556238, arg0 + 932731 - -arg1) * 8;
				} else {
					Static32.anIntArrayArrayArray4[arg3][arg1][arg2] = Static32.anIntArrayArrayArray4[arg3 - 1][arg1][arg2] - 240;
				}
				break;
			}
			if (local19 == 1) {
				@Pc(121) int local121 = arg5.method218();
				if (local121 == 1) {
					local121 = 0;
				}
				if (arg3 == 0) {
					Static32.anIntArrayArrayArray4[0][arg1][arg2] = -local121 * 8;
				} else {
					Static32.anIntArrayArrayArray4[arg3][arg1][arg2] = Static32.anIntArrayArrayArray4[arg3 - 1][arg1][arg2] - local121 * 8;
				}
				break;
			}
			if (local19 <= 49) {
				Static172.aByteArrayArrayArray39[arg3][arg1][arg2] = arg5.method227();
				Static159.aByteArrayArrayArray41[arg3][arg1][arg2] = (byte) ((local19 - 2) / 4);
				Static119.aByteArrayArrayArray32[arg3][arg1][arg2] = (byte) (arg6 + local19 - 2 & 0x3);
			} else if (local19 <= 81) {
				Static147.aByteArrayArrayArray36[arg3][arg1][arg2] = (byte) (local19 - 49);
			} else {
				Static107.aByteArrayArrayArray30[arg3][arg1][arg2] = (byte) (local19 - 81);
			}
		}
	}
}
