import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!m")
final class Class639 {

	@OriginalMember(owner = "loader!m", name = "a", descriptor = "Lloader!j;")
	static Class636 aClass636_6;

	static {
		@Pc(4) Class636_Sub1 local4 = new Class636_Sub1(15);
		((Class636_Sub1) local4).anObject40 = "crash";
		aClass636_6 = local4;
	}

	@OriginalMember(owner = "loader!m", name = "z", descriptor = "(Ljava/lang/String;)[C")
	private static char[] method33926(@OriginalArg(0) String arg0) {
		@Pc(1) char[] local1 = arg0.toCharArray();
		if (local1.length < 2) {
			local1[0] = (char) (local1[0] ^ 0x7F);
		}
		return local1;
	}

	@OriginalMember(owner = "loader!m", name = "z", descriptor = "([C)Ljava/lang/String;")
	private static String method33927(@OriginalArg(0) char[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(0) char[] local0 = arg0;
		@Pc(3) int local3 = local2;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(10) char local10 = local0[local5];
			@Pc(15) byte local15;
			switch(local5 % 5) {
				case 0:
					local15 = 15;
					break;
				case 1:
					local15 = 67;
					break;
				case 2:
					local15 = 119;
					break;
				case 3:
					local15 = 32;
					break;
				default:
					local15 = 127;
			}
			local0[local5] = (char) (local10 ^ local15);
		}
		return (new String(local0)).intern();
	}
}
