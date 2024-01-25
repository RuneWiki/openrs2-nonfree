import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class328 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[I")
	public int[] anIntArray784 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt9496;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public final int anInt9495;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray55;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class328(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9496 = arg3;
		this.anInt9495 = arg4;
		this.aString86 = arg1;
		this.anIntArray784 = arg5;
		this.aString87 = arg0;
		this.aStringArray55 = arg2;
	}
}
