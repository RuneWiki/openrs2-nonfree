import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!i")
class Class707_Sub1_Sub1_Sub1 extends Class707_Sub1_Sub1 {

	@OriginalMember(owner = "loader!i", name = "j", descriptor = "I")
	static int anInt5915;

	@OriginalMember(owner = "loader!i", name = "i", descriptor = "Ljava/lang/Object;")
	Object anObject41;

	@OriginalMember(owner = "loader!i", name = "<init>", descriptor = "(I)V", line = 4)
	Class707_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "(Ljava/lang/String;II[B)I", line = 8)
	static final int method36610(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(1) boolean local1 = Class707.aBoolean876;
		anInt5915++;
		@Pc(7) int local7 = arg2;
		if (arg1 != -1) {
			return 17;
		}
		@Pc(20) int local20 = arg0 == null ? 0 : arg0.length();
		@Pc(22) int local22 = 0;
		@Pc(34) int var10000;
		@Pc(35) int var10001;
		while (true) {
			if (local22 < local20) {
				@Pc(31) int local31 = RuntimeException_Sub5.method36615(99, arg0.charAt(local22));
				var10000 = local22 + 1;
				var10001 = local20;
				if (local1) {
					break;
				}
				@Pc(51) int local51 = var10000 >= local20 ? -1 : RuntimeException_Sub5.method36615(122, arg0.charAt(local22 + 1));
				@Pc(69) int local69 = local20 <= local22 + 2 ? -1 : RuntimeException_Sub5.method36615(arg1 ^ -96, arg0.charAt(local22 + 2));
				@Pc(85) int local85 = local22 + 3 < local20 ? RuntimeException_Sub5.method36615(116, arg0.charAt(local22 + 3)) : -1;
				arg3[arg2++] = (byte) (local51 >>> 4 | local31 << 2);
				if (local69 != -1) {
					arg3[arg2++] = (byte) ((local51 & 0xF) << 4 | local69 >>> 2);
					if (local85 != -1 || local1) {
						arg3[arg2++] = (byte) ((local69 & 0x3) << 6 | local85);
						local22 += 4;
						if (!local1) {
							continue;
						}
					}
				}
			}
			var10000 = arg2;
			var10001 = -local7;
			break;
		}
		return var10000 + var10001;
	}
}
