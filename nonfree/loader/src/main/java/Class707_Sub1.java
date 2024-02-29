import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
class Class707_Sub1 extends Class707 {

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Lloader!d;")
	static Class707 aClass707_8;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[I")
	static int[] anIntArray548;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Ljava/lang/Object;")
	Object anObject39;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(I)V", line = 4)
	Class707_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	static {
		@Pc(4) Class707_Sub1 local4 = new Class707_Sub1(100);
		((Class707_Sub1) local4).anObject39 = "unsigned";
		aClass707_8 = local4;
		anIntArray548 = new int[128];
		@Pc(19) int local19;
		for (local19 = 0; local19 < anIntArray548.length; local19++) {
			anIntArray548[local19] = -1;
		}
		for (local19 = 65; local19 <= 90; local19++) {
			anIntArray548[local19] = local19 + -65;
		}
		for (local19 = 97; local19 <= 122; local19++) {
			anIntArray548[local19] = local19 + -71;
		}
		for (local19 = 48; local19 <= 57; local19++) {
			anIntArray548[local19] = local19 + -48 + 52;
		}
		anIntArray548[43] = 62;
		@Pc(82) int[] local82 = anIntArray548;
		local82[42] = 62;
		@Pc(88) int[] local88 = anIntArray548;
		anIntArray548[47] = 63;
		local88[45] = 63;
	}

	@OriginalMember(owner = "loader!a", name = "z", descriptor = "(Ljava/lang/String;)[C")
	private static char[] method36607(@OriginalArg(0) String arg0) {
		@Pc(1) char[] local1 = arg0.toCharArray();
		if (local1.length < 2) {
			local1[0] = (char) (local1[0] ^ 0x76);
		}
		return local1;
	}

	@OriginalMember(owner = "loader!a", name = "z", descriptor = "([C)Ljava/lang/String;")
	private static String method36608(@OriginalArg(0) char[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(0) char[] local0 = arg0;
		@Pc(3) int local3 = local2;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(10) char local10 = local0[local5];
			@Pc(15) byte local15;
			switch(local5 % 5) {
				case 0:
					local15 = 84;
					break;
				case 1:
					local15 = 25;
					break;
				case 2:
					local15 = 95;
					break;
				case 3:
					local15 = 56;
					break;
				default:
					local15 = 118;
			}
			local0[local5] = (char) (local10 ^ local15);
		}
		return (new String(local0)).intern();
	}
}
