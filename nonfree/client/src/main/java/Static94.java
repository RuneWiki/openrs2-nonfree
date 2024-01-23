import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_901 = Static64.method1101(")4u");

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Lclient!ia;")
	public static Class51 aClass51_902 = Static64.method1101("br");

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "Lclient!ia;")
	public static Class51 aClass51_903 = Static64.method1101("trans=");

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_904 = Static64.method1101(")4trans");

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "Lclient!ia;")
	public static Class51 aClass51_905 = Static64.method1101("shad=");

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "Lclient!ia;")
	public static Class51 aClass51_906 = Static64.method1101("shy");

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "Lclient!ia;")
	public static Class51 aClass51_907 = Static64.method1101("str");

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Lclient!ia;")
	public static Class51 aClass51_908 = Static64.method1101("gt");

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!ia;")
	public static Class51 aClass51_909 = Static64.method1101("str=");

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_910 = Static64.method1101("times");

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Lclient!ia;")
	public static Class51 aClass51_911 = Static64.method1101("copy");

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "Lclient!ia;")
	public static Class51 aClass51_912 = Static64.method1101("euro");

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_913 = Static64.method1101("img=");

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_914 = Static64.method1101("reg");

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_915 = Static64.method1101("lt");

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "Lclient!ia;")
	public static Class51 aClass51_916 = Static64.method1101("col=");

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_917 = Static64.method1101("u");

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_918 = Static64.method1101(")4str");

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_919 = Static64.method1101(")4col");

	@OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_920 = Static64.method1101("nbsp");

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lclient!ia;")
	public static Class51 aClass51_921 = Static64.method1101("shad");

	@OriginalMember(owner = "client!jb", name = "jb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_922 = Static64.method1101("u=");

	@OriginalMember(owner = "client!jb", name = "mb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_923 = Static64.method1101(")4shad");

	@OriginalMember(owner = "client!jb", name = "ob", descriptor = "Lclient!ia;")
	public static Class51 aClass51_924 = Static158.method2687(100);

	@OriginalMember(owner = "client!jb", name = "pb", descriptor = "I")
	public static int anInt2601 = 0;

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "I")
	public static int anInt2602 = -1;

	@OriginalMember(owner = "client!jb", name = "rb", descriptor = "I")
	public static int anInt2603 = 256;

	@OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!jb", name = "tb", descriptor = "I")
	public static int anInt2605 = 0;

	@OriginalMember(owner = "client!jb", name = "ub", descriptor = "I")
	public static int anInt2606 = -1;

	@OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
	public static int anInt2607 = -1;

	@OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
	public static int anInt2608 = 0;

	@OriginalMember(owner = "client!jb", name = "xb", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array17 = new Class51[100];

	@OriginalMember(owner = "client!jb", name = "yb", descriptor = "I")
	public static int anInt2609 = -1;

	@OriginalMember(owner = "client!jb", name = "zb", descriptor = "I")
	public static int anInt2610 = 256;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ia;)Lclient!ia;")
	public static Class51 method2018(@OriginalArg(0) Class51 arg0) {
		@Pc(3) int local3 = arg0.method1399();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray17[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class51 local28 = new Class51();
		local28.anInt1858 = local3 + local5;
		local28.aByteArray17 = new byte[local28.anInt1858];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray17[local42];
			if (local48 == 60) {
				local28.aByteArray17[local40++] = 60;
				local28.aByteArray17[local40++] = 108;
				local28.aByteArray17[local40++] = 116;
				local28.aByteArray17[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray17[local40++] = 60;
				local28.aByteArray17[local40++] = 103;
				local28.aByteArray17[local40++] = 116;
				local28.aByteArray17[local40++] = 62;
			} else {
				local28.aByteArray17[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2031(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(75) int local75 = local50[local58++] + local54[local62++];
			if (local75 < local37) {
				local37 = local75;
			}
		}
		return -local37;
	}
}
