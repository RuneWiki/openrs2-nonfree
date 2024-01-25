import java.util.Hashtable;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dg", name = "wd", descriptor = "[S")
	public static short[] aShortArray33;

	@OriginalMember(owner = "client!dg", name = "Ad", descriptor = "Lclient!kr;")
	public static Class171 aClass171_37;

	@OriginalMember(owner = "client!dg", name = "Nc", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dg", name = "xd", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!dg", name = "yd", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!dg", name = "zd", descriptor = "Lclient!im;")
	public static final Class140 aClass140_29 = new Class140(107, 8);

	@OriginalMember(owner = "client!dg", name = "Bd", descriptor = "[I")
	public static final int[] anIntArray185 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dg", name = "Cd", descriptor = "I")
	public static int anInt1783 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIII)V")
	public static void method1529(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(20) Class1_Sub18 local20 = (Class1_Sub18) Static92.aClass17_9.method738(local14);
		if (local20 == null) {
			local20 = new Class1_Sub18();
			Static92.aClass17_9.method737(local20, local14);
		}
		if (local20.anIntArray254.length <= arg3) {
			@Pc(49) int[] local49 = new int[arg3 + 1];
			@Pc(54) int[] local54 = new int[arg3 + 1];
			for (@Pc(56) int local56 = 0; local56 < local20.anIntArray254.length; local56++) {
				local49[local56] = local20.anIntArray254[local56];
				local54[local56] = local20.anIntArray255[local56];
			}
			for (@Pc(82) int local82 = local20.anIntArray254.length; local82 < arg3; local82++) {
				local49[local82] = -1;
				local54[local82] = 0;
			}
			local20.anIntArray254 = local49;
			local20.anIntArray255 = local54;
		}
		local20.anIntArray254[arg3] = arg0;
		local20.anIntArray255[arg3] = arg4;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(B)V")
	public static void method1539() {
		Static491.method6722(Static544.aClass1_Sub22_Sub1_1.anInt5450);
		@Pc(17) int local17 = (Static470.anInt7897 >> 3) + (Static522.anInt8770 >> 12);
		@Pc(25) int local25 = (Static516.anInt8682 >> 12) + (Static534.anInt9007 >> 3);
		Static501.anInt8491 = Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 = 0;
		Static63.aClass49_Sub2_Sub2_Sub1_1.method1540(8, 8);
		Static529.aByteArrayArray32 = new byte[18][];
		Static226.anIntArray440 = new int[18];
		Static9.anIntArray23 = new int[18];
		Static449.aByteArrayArray27 = new byte[18][];
		Static13.anIntArrayArray4 = new int[18][4];
		Static433.anIntArray716 = new int[18];
		Static381.aByteArrayArray20 = new byte[18][];
		Static227.aByteArrayArray10 = new byte[18][];
		Static356.anIntArray641 = new int[18];
		Static388.anIntArray681 = new int[18];
		Static453.anIntArray725 = new int[18];
		Static324.aByteArrayArray16 = new byte[18][];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(85) int local85 = (local17 - (Static459.anInt7799 >> 4)) / 8; local85 <= (local17 + (Static459.anInt7799 >> 4)) / 8; local85++) {
			for (local95 = (local25 - (Static482.anInt7990 >> 4)) / 8; local95 <= (local25 + (Static482.anInt7990 >> 4)) / 8; local95++) {
				@Pc(104) int local104 = (local85 << 8) + local95;
				Static9.anIntArray23[local76] = local104;
				Static433.anIntArray716[local76] = Static223.aClass171_77.method4338("m" + local85 + "_" + local95);
				Static388.anIntArray681[local76] = Static223.aClass171_77.method4338("l" + local85 + "_" + local95);
				Static226.anIntArray440[local76] = Static223.aClass171_77.method4338("n" + local85 + "_" + local95);
				Static453.anIntArray725[local76] = Static223.aClass171_77.method4338("um" + local85 + "_" + local95);
				Static356.anIntArray641[local76] = Static223.aClass171_77.method4338("ul" + local85 + "_" + local95);
				if (Static226.anIntArray440[local76] == -1) {
					Static433.anIntArray716[local76] = -1;
					Static388.anIntArray681[local76] = -1;
					Static453.anIntArray725[local76] = -1;
					Static356.anIntArray641[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static226.anIntArray440.length; local95++) {
			Static226.anIntArray440[local95] = -1;
			Static433.anIntArray716[local95] = -1;
			Static388.anIntArray681[local95] = -1;
			Static453.anIntArray725[local95] = -1;
			Static356.anIntArray641[local95] = -1;
		}
		@Pc(283) byte local283;
		if (Static268.anInt5100 == 1 || Static268.anInt5100 == 2) {
			local283 = 3;
		} else {
			local283 = 7;
		}
		Static329.method5062(local17, local25, local283, false);
	}
}
