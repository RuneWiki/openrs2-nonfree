import java.io.PrintStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
final class Class638 {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	static int anInt5630;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	static int anInt5631;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	static int anInt5632;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "[C")
	private static char[] aCharArray13 = new char[64];

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
	static final void method33923(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt5632++;
		@Pc(7) PrintStream local7 = System.out;
		@Pc(9) String local9 = arg1;
		if (arg0 >= 111) {
			for (@Pc(19) int local19 = arg1.indexOf("%0a"); local19 != -1; local19 = local9.indexOf("%0a", local19 + "\n".length())) {
				local9 = local9.substring(0, local19) + "\n" + local9.substring("%0a".length() + local19);
			}
			local7.println("Error: " + local9);
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Lloader!j;B)Lloader!b;", line = 33)
	static final ClassLoader_Sub1 method33924(@OriginalArg(0) Class636 arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 73) {
			aCharArray13 = null;
		}
		anInt5631++;
		return new ClassLoader_Sub1(arg0);
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!l;", line = 48)
	static final RuntimeException_Sub5 method33925(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		anInt5630++;
		@Pc(9) RuntimeException_Sub5 local9;
		if (arg0 instanceof RuntimeException_Sub5) {
			local9 = (RuntimeException_Sub5) arg0;
			local9.aString250 = local9.aString250 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub5(arg0, arg1);
		}
		return local9;
	}

	static {
		@Pc(37) int local37;
		for (local37 = 0; local37 < 26; local37++) {
			aCharArray13[local37] = (char) (local37 + 65);
		}
		for (local37 = 26; local37 < 52; local37++) {
			aCharArray13[local37] = (char) (97 - -local37 + -26);
		}
		for (local37 = 52; local37 < 62; local37++) {
			aCharArray13[local37] = (char) (local37 + -52 + 48);
		}
		aCharArray13[62] = '*';
		aCharArray13[63] = '-';
	}
}
