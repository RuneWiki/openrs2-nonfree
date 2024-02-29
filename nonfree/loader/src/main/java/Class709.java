import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
final class Class709 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	static int anInt5918;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	static int anInt5919;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[C")
	private static char[] aCharArray14 = new char[64];

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Lloader!d;")
	static Class707 aClass707_9;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;I[BLloader!d;)V", line = 6)
	static final void method36611(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class707 arg3) {
		if (arg1 == 32) {
			((Hashtable) ((Class707_Sub1) arg3).anObject39).put(arg0, arg2);
			anInt5919++;
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!l;", line = 19)
	static final RuntimeException_Sub5 method36612(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		anInt5918++;
		@Pc(12) RuntimeException_Sub5 local12;
		if (!(arg0 instanceof RuntimeException_Sub5)) {
			local12 = new RuntimeException_Sub5(arg0, arg1);
			if (!Class707.aBoolean876) {
				return local12;
			}
		}
		local12 = (RuntimeException_Sub5) arg0;
		local12.aString250 = local12.aString250 + ' ' + arg1;
		return local12;
	}

	static {
		@Pc(25) int local25;
		for (local25 = 0; local25 < 26; local25++) {
			aCharArray14[local25] = (char) (local25 - -65);
		}
		for (local25 = 26; local25 < 52; local25++) {
			aCharArray14[local25] = (char) (local25 + -26 + 97);
		}
		for (local25 = 52; local25 < 62; local25++) {
			aCharArray14[local25] = (char) (48 - -local25 + -52);
		}
		aCharArray14[62] = '-';
		aCharArray14[63] = '_';
		@Pc(88) Class707_Sub1 local88 = new Class707_Sub1(100);
		((Class707_Sub1) local88).anObject39 = "crash";
		aClass707_9 = local88;
	}
}
